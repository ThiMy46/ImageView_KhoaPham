package com.example.daoth.imageview_khoapham;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout manhinh;
    Button btn;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //background
        manhinh=(LinearLayout)findViewById(R.id.ManHinh);
        manhinh.setBackgroundResource(R.drawable.abc);
        //load image
        btn=(Button)findViewById(R.id.btnShown);
        image=(ImageView)findViewById(R.id.imageV);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.abc);
            }
        });
    }
}
