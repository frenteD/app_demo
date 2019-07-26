package com.example.content;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Video> videoList=new ArrayList<>();
    ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initVideos();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        VideoAdapter adapter=new VideoAdapter(videoList);
        recyclerView.setAdapter(adapter);

        Button takePhoto=(Button)findViewById(R.id.button);//拍照按钮
        takePhoto.setOnClickListener(new View.OnClickListener(){//注册监听器
            public void onClick(View v){

            }
        });

        //给“录制我的回答”按钮注册点击事件
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,answerActivity.class);
                startActivity(intent);
;            }
        });
    }

    private void initVideos(){
        for(int i=0;i<2;i++){
            Video frente1=new Video("frente", R.drawable.pic1);
            videoList.add(frente1);
            Video frente2=new Video("frente", R.drawable.pic1);
            videoList.add(frente2);
            Video frente3=new Video("frente", R.drawable.pic1);
            videoList.add(frente3);
            Video frente4=new Video("frente", R.drawable.pic1);
            videoList.add(frente4);
            Video frente5=new Video("frente", R.drawable.pic1);
            videoList.add(frente5);
            Video frente6=new Video("frente", R.drawable.pic1);
            videoList.add(frente6);
            Video frente7=new Video("frente", R.drawable.pic1);
            videoList.add(frente7);
            Video frente8=new Video("frente", R.drawable.pic1);
            videoList.add(frente8);
        }
    }

}
