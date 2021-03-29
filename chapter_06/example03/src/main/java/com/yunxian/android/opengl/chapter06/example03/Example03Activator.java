package com.yunxian.android.opengl.chapter06.example03;

import androidx.annotation.Nullable;

import com.alibaba.fastjson.JSONObject;
import com.yunxian.android.framework.bundle.BundleActivator;

/**
 * @author A Shuai
 * @email ls1110924@gmail.com
 * @date 2021/3/29 22:37
 */
public class Example03Activator extends BundleActivator {

    @Override
    protected String bundleFileName() {
        return "bundle_chapter06_example03_config.json";
    }

    @Override
    protected void selfStart(@Nullable JSONObject extraJObj) {

    }

    @Override
    protected void onLazyStart() {

    }

    @Override
    protected void selfStop() {

    }
}
