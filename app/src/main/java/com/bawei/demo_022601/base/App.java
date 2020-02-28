package com.bawei.demo_022601.base;

import android.app.Application;
import android.content.Context;

/**
 * @ProjectName: Demo_022601
 * @Package: com.bawei.demo_022601.base
 * @ClassName: App
 * @Description: (java类作用描述)
 * @Author: 李聪聪
 * @CreateDate: 2020/2/26 20:14
 */
public class App extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
    public static Context getAppContext(){
        return mContext;
    }
}
