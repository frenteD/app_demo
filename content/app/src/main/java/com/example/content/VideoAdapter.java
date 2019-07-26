package com.example.content;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder>{
    private List<Video> mVideoList;

    static class ViewHolder extends RecyclerView.ViewHolder{//定义一个静态的内部类
        View videoView;
        ImageView videoImage;//两个属性：图片、名字
        TextView videoName;

        public ViewHolder(View view){//构造函数
            super(view);//利用父类的构造函数，将view面板作为参数
            videoView=view;
            videoImage=(ImageView)view.findViewById(R.id.video_image);//给两个数据成员赋值
            videoName=(TextView)view.findViewById(R.id.name);
        }
    }

    public VideoAdapter(List<Video> videoList){//构造函数，参数为Fruit类的动态数组
        mVideoList=videoList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){//重载函数，用来创建ViewHolder实例
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.video_item,parent,false);//在传递过来的上下文对象中加入fruit_item布局，然后用view另存
        final ViewHolder holder=new ViewHolder(view);
        holder.videoView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int position=holder.getAdapterPosition();
                Video video=mVideoList.get(position);
                Toast.makeText(v.getContext(),"you clicked view "+video.getImageId(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.videoImage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){//给图片注册监听器
                Intent intent=new Intent(v.getContext(),answerActivity.class);
                v.getContext().startActivity(intent);
            }
        });
        return holder;
    }

    public void onBindViewHolder(ViewHolder holder,int position){//重载函数，用来赋值
        Video video=mVideoList.get(position);//获取给定次序的fruit对象
        holder.videoImage.setImageResource(video.getImageId());//设置ViewHolder对象的属性
        holder.videoName.setText(video.getUserame());
    }

    public int getItemCount(){
        return mVideoList.size();
    }
}
