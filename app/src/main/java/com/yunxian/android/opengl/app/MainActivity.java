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
        findViewById(R.id.example06_03).setOnClickListener(this::onClick);
        findViewById(R.id.example06_06).setOnClickListener(this::onClick);
        findViewById(R.id.example06_vbo).setOnClickListener(this::onClick);
        findViewById(R.id.example06_vao).setOnClickListener(this::onClick);
        findViewById(R.id.example06_08).setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        final int id = v.getId();
        if (id == R.id.hello_triangle) {
            BundlePlatform.route(this, "chapter01/hellotriangle");
        } else if (id == R.id.example06_03) {
            BundlePlatform.route(this, "chapter06/example03");
        } else if (id == R.id.example06_06) {
            BundlePlatform.route(this, "chapter06/example06");
        } else if (id == R.id.example06_vbo) {
            BundlePlatform.route(this, "chapter06/vbo");
        } else if (id == R.id.example06_vao) {
            BundlePlatform.route(this, "chapter06/vao");
        } else if (id == R.id.example06_08) {
            BundlePlatform.route(this, "chapter06/example08");
        }
    }
}