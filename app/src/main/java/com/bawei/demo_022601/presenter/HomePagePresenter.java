package com.bawei.demo_022601.presenter;

import com.bawei.demo_022601.base.BasePresenter;
import com.bawei.demo_022601.base.IBaseView;
import com.bawei.demo_022601.contract.IHomePageContract;
import com.bawei.demo_022601.model.HomePageModel;

import java.util.HashMap;
import java.util.List;

/**
 * @ProjectName: Demo_022601
 * @Package: com.bawei.demo_022601.presenter
 * @ClassName: HomePagePresenter
 * @Description: (java类作用描述)
 * @Author: 李聪聪
 * @CreateDate: 2020/2/26 21:04
 */
public class HomePagePresenter extends BasePresenter implements IHomePageContract.IPresenter {

    private HomePageModel homePageModel;

    public HomePagePresenter(IBaseView iBaseView) {
        super(iBaseView);
    }

    @Override
    protected void initModel() {
        homePageModel = new HomePageModel();
    }


    @Override
    public void getBanner(String str) {
        homePageModel.getBanner(str, new IHomePageContract.IModel.getBannerCallBack() {
            @Override
            public void onSuccess(List list) {
                IBaseView view = getView();
                if (view instanceof IHomePageContract.IView){
                    ((IHomePageContract.IView)view).onGetBannerSuccee(list);
                }
            }

            @Override
            public void onFailure(String str) {

            }
        });
    }

    @Override
    public void getList(String url) {
        homePageModel.getList(url, new IHomePageContract.IModel.getListCallBack() {
            @Override
            public void onSuccess(String str) {
                IBaseView view = getView();
                if (view instanceof IHomePageContract.IView){
                    ((IHomePageContract.IView)view).onGetListSuccess(str);
                }
            }

            @Override
            public void onFailure(String str) {
                IBaseView view = getView();
                if (view instanceof IHomePageContract.IView){
                    ((IHomePageContract.IView)view).onGetListFailure(str);
                }
            }
        });
    }

    @Override
    public void doLogin(String url, HashMap<String, String> map) {
        homePageModel.doLogin(url, map, new IHomePageContract.IModel.doLoginCallBack() {
            @Override
            public void onSuccess(String str) {
                IBaseView view = getView();
                if (view instanceof IHomePageContract.IView){
                    ((IHomePageContract.IView)view).doLoginSuccess(str);
                }
            }

            @Override
            public void onFailure(String str) {
                IBaseView view = getView();
                if (view instanceof IHomePageContract.IView){
                    ((IHomePageContract.IView)view).doLoginFailure(str);
                }
            }
        });
    }
}
