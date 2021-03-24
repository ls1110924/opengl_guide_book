package com.yunxian.android.opengl.chapter01.triangle;

import androidx.annotation.Nullable;

import com.alibaba.fastjson.JSONObject;
import com.yunxian.android.framework.bundle.BundleActivator;

/**
 * @author A Shuai
 * @email ls1110924@gmail.com
 * @date 2021/3/24 21:33
 */
public class HelloTriangleActivator extends BundleActivator {

    @Override
    protected String bundleFileName() {
        return "bundle_chapter01_hellotriangle_config.json";
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
