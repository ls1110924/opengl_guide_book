package com.yunxian.android.opengl.chapter06.example08;

import androidx.annotation.Nullable;

import com.alibaba.fastjson.JSONObject;
import com.yunxian.android.framework.bundle.BundleActivator;

/**
 * @author A Shuai
 * @email ls1110924@gmail.com
 * @date 2021/3/30 22:46
 */
public class Example08Activator extends BundleActivator {

    @Override
    protected String bundleFileName() {
        return "bundle_chapter06_example08_config.json";
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
