package com.bawei.demo_022601.model;

import com.bawei.demo_022601.bean.BannerBean;
import com.bawei.demo_022601.bean.ShenghuoBean;
import com.bawei.demo_022601.contract.IHomePageContract;
import com.bawei.demo_022601.utils.VolleyUtils;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ProjectName: Demo_022601
 * @Package: com.bawei.demo_022601.model
 * @ClassName: HomePageModel
 * @Description: (java类作用描述)
 * @Author: 李聪聪
 * @CreateDate: 2020/2/26 21:01
 */
public class HomePageModel implements IHomePageContract.IModel {
    private List<String> BannerList = new ArrayList<>();
    @Override
    public void getBanner(String url, final getBannerCallBack callBack) {
        VolleyUtils.SingleInstance().doGet(url, new VolleyUtils.CallBack() {
            @Override
            public void onSuccess(String json) {
                List<BannerBean.ResultBean> result = new Gson().fromJson(json, BannerBean.class).getResult();
                for (int i = 0 ; i < result.size();i++){
                    String imageUrl = result.get(i).getImageUrl();
                    BannerList.add(imageUrl);
                }
                callBack.onSuccess(BannerList);

            }

            @Override
            public void onFailure(String msg) {

            }
        });
    }

    @Override
    public void getList(String url, final getListCallBack callBack) {
            VolleyUtils.SingleInstance().doGet(url, new VolleyUtils.CallBack() {
                @Override
                public void onSuccess(String json) {
                    callBack.onSuccess(json);
                }

                @Override
                public void onFailure(String msg) {

                }
            });
    }

    @Override
    public void doLogin(String url, HashMap<String,String> map, final doLoginCallBack callBack) {
        VolleyUtils.SingleInstance().doPost(url, map, new VolleyUtils.CallBack() {
            @Override
            public void onSuccess(String json) {
                callBack.onSuccess(json);
            }

            @Override
            public void onFailure(String msg) {
                callBack.onFailure(msg);
            }
        });
    }
}
