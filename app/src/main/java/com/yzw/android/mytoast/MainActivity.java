package com.yzw.android.mytoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mSimpleToast;
    private Button mImageToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSimpleToast=(Button) findViewById(R.id.simple_toast);
        mImageToast=(Button) findViewById(R.id.image_toast);
        mSimpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showSimpleToast(MainActivity.this,"普通的Toast信息");
            }
        });

        mImageToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=new ImageView(MainActivity.this);
                imageView.setImageResource(R.mipmap.ic_launcher);
                LinearLayout ll=new LinearLayout(MainActivity.this);
                ll.addView(imageView);
                TextView textView=new TextView(MainActivity.this);
                textView.setText("带图片的Toast信息");
                ll.addView(textView);
                ToastUtils.showImageToast(MainActivity.this,ll);
            }
        });


    }
}
