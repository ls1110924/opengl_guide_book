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
        findViewById(R.id.example08_01).setOnClickListener(this::onClick);
        findViewById(R.id.example09_01).setOnClickListener(this::onClick);
        findViewById(R.id.example09_02).setOnClickListener(this::onClick);
        findViewById(R.id.example09_texturewrap).setOnClickListener(this::onClick);
        findViewById(R.id.example09_04).setOnClickListener(this::onClick);
        findViewById(R.id.example10_01).setOnClickListener(this::onClick);
        findViewById(R.id.example14_05).setOnClickListener(this::onClick);
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
        } else if (id == R.id.example08_01) {
            BundlePlatform.route(this, "chapter08/example01");
        } else if (id == R.id.example09_01) {
            BundlePlatform.route(this, "chapter09/example01");
        } else if (id == R.id.example09_02) {
            BundlePlatform.route(this, "chapter09/example02");
        } else if (id == R.id.example09_texturewrap) {
            BundlePlatform.route(this, "chapter09/texturewrap");
        } else if (id == R.id.example09_04) {
            BundlePlatform.route(this, "chapter09/example04");
        } else if (id == R.id.example10_01) {
            BundlePlatform.route(this, "chapter10/example01");
        } else if (id == R.id.example14_05) {
            BundlePlatform.route(this, "chapter14/example05");
        }
    }
}