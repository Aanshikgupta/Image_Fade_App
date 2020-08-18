package com.example.imagefade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    boolean viewi=true;

    public void image1click(View view) {
        ImageView im1 = (ImageView)findViewById(R.id.imageView1);
        ImageView im2 = (ImageView)findViewById(R.id.imageView2);
        if(viewi) {
            viewi=!viewi;
            im1.animate().alpha(0).setDuration(2000);
            im2.animate().alpha(1).setDuration(2000);
        }
        else
        {
            viewi=!viewi;
            im1.animate().alpha(1).setDuration(2000);
            im2.animate().alpha(0).setDuration(2000);
        }

    }


}