package com.yunxian.android.opengl.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.yunxian.android.framework.BundlePlatform;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.hello_triangle).setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        final int id = v.getId();
        if (id == R.id.hello_triangle) {
            BundlePlatform.route(this, "chapter01/hellotriangle");
        }
    }
}