package com.bawei.demo_022601.utils;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bawei.demo_022601.base.App;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: Demo_022601
 * @Package: com.bawei.demo_022601.utils
 * @ClassName: VolleyUtils
 * @Description: (java类作用描述)
 * @Author: 李聪聪
 * @CreateDate: 2020/2/26 16:30
 */
public class VolleyUtils {

    private final RequestQueue requestQueue;

    private VolleyUtils(){
        requestQueue = Volley.newRequestQueue(App.getAppContext());
    }

    private static class SingleInstance{
        private static final VolleyUtils INSTANCE = new VolleyUtils();
    }

    public static VolleyUtils SingleInstance(){
        return SingleInstance.INSTANCE;
    }
    public interface CallBack{
        void onSuccess(String json);
        void onFailure(String msg);
    }
    public void doGet(String url, final CallBack callBack){
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        callBack.onSuccess(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                        callBack.onFailure(error.getMessage());
            }
        });
        requestQueue.add(stringRequest);
    }

    public void doPost(String url, final HashMap<String,String> map, final CallBack callBack){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        callBack.onSuccess(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callBack.onFailure(error.getMessage());
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return map;
            }
        };
        requestQueue.add(stringRequest);
    }
}
