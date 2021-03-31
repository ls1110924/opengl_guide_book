package com.yunxian.android.opengl.app;

import androidx.multidex.MultiDexApplication;

import com.yunxian.android.common.util.YxConfig;
import com.yunxian.android.common.util.YxContext;
import com.yunxian.android.framework.BundleConfig;
import com.yunxian.android.framework.BundlePlatform;

/**
 * @author A Shuai
 * @email ls1110924@gmail.com
 * @date 2021/3/24 21:34
 */
public class MyApplication extends MultiDexApplication {

    public static volatile boolean sInit = false;

    @Override
    public void onCreate() {
        super.onCreate();

        YxConfig yxConfig = new YxConfig()
                .setContext(this)
                .setMode(BuildConfig.DEBUG ? 1 : 2)
                .setScheme("yun")
                .setStrict(BuildConfig.DEBUG)
                .setBuildType(BuildConfig.BUILD_TYPE)
                .setFlavor("")
                .setVersionName(BuildConfig.VERSION_NAME)
                .setVersionCode(BuildConfig.VERSION_CODE)
                .appendWeaklyConfig("xxx", "yyy");
        YxContext.init(yxConfig);

        BundleConfig config = new BundleConfig.Builder()
                .setCanLog(BuildConfig.DEBUG)
                .setContext(this)
                .setDebug(BuildConfig.DEBUG)
                .setUseProxy(true)
                .setDefaultScheme("yun")
                .build();

        BundlePlatform.init(config);
        try {
            BundlePlatform.startBundle("bundles_config.json");
            sInit = true;
        } catch (Exception e) {
            sInit = false;
        }
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
