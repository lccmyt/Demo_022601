package com.bawei.demo_022601.contract;

import com.bawei.demo_022601.base.IBaseView;

import java.util.HashMap;
import java.util.List;

/**
 * @ProjectName: Demo_022601
 * @Package: com.bawei.demo_022601.contract
 * @ClassName: IHomePageContract
 * @Description: (java类作用描述)
 * @Author: 李聪聪
 * @CreateDate: 2020/2/26 20:53
 */
public interface IHomePageContract {
    interface IView extends IBaseView{
        void onGetBannerSuccee(List list);
        void onGetBannerFailure(String str);

        void onGetListSuccess(String str);
        void onGetListFailure(String str);

        void doLoginSuccess(String str);
        void doLoginFailure(String str);
    }

    interface IPresenter{
        void getBanner(String str);
        void getList(String url);

        void doLogin(String url, HashMap<String, String> map);
    }

    interface IModel{
        void getBanner(String url,getBannerCallBack callBack);
        void getList(String url,getListCallBack callBack);
        void doLogin(String url,HashMap<String,String> map,doLoginCallBack callBack);

        interface getBannerCallBack{
            void onSuccess(List list);
            void onFailure(String str);
        }
        interface getListCallBack{
            void onSuccess(String str);
            void onFailure(String str);
        }
        interface doLoginCallBack{
            void onSuccess(String str);
            void onFailure(String str);
        }

    }
}
