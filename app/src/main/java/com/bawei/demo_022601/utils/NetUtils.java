package com.bawei.demo_022601.utils;

import android.os.Handler;
import android.util.Log;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ProjectName: Demo_022601
 * @Package: com.bawei.demo_022601.utils
 * @ClassName: NetUtils
 * @Description: (java类作用描述)
 * @Author: 李聪聪
 * @CreateDate: 2020/2/26 16:37
 */
public class NetUtils {
    private static NetUtils netUtils = new NetUtils();
    private NetUtils(){

    }
    public static NetUtils getInstance(){
        return netUtils;
    }

    private Handler handler = new Handler();

    public interface CallBack{
        void onSuccess(String json);
        void onFailure(String msg);
    }
    public void getList(final String path, final CallBack callBack){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL(path);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("GET");
                    int responseCode = conn.getResponseCode();
                    Log.i("xxx", responseCode+"");
                    if (conn.getResponseCode() == 200){
                        InputStream inputStream = conn.getInputStream();
                        int len = 0;
                        byte[] bt = new byte[1024];
                        final StringBuilder sb = new StringBuilder();
                        while((len = inputStream.read(bt)) != -1){
                            sb.append(new String(bt, 0, len));
                        }
                        Log.i("xxx", sb.toString());
                        inputStream.close();
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                callBack.onSuccess(sb.toString());
                            }
                        });
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
