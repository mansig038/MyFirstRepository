package com.mansi.imageglideex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img1=findViewById(R.id.img1);
        ImageView img2=findViewById(R.id.img2);

        String[] myUrl={"https://i1.wp.com/thefreshimages.com/wp-content/uploads/2017/12/Lord-Shiva.jpg?ssl=1",
                "https://www.pexels.com/photo/daylight-environment-forest-idyllic-459225/"};

        Glide.with(this).load(myUrl[0]).into(img1);
        Glide.with(this).load(myUrl[1]).into(img2);

    }
}
