package com.bawei.demo_022601.acitivity;

import com.bawei.demo_022601.R;
import com.bawei.demo_022601.base.BaseActivity;
import com.bawei.demo_022601.base.BasePresenter;
import com.bawei.demo_022601.contract.IHomePageContract;
import com.bawei.demo_022601.presenter.HomePagePresenter;

import java.util.List;

/**
 * @ProjectName: Demo_022601
 * @Package: com.bawei.demo_022601.acitivity
 * @ClassName: RegisterActivity
 * @Description: (java类作用描述)
 * @Author: 李聪聪
 * @CreateDate: 2020/2/26 21:21
 */
public class RegisterActivity extends BaseActivity implements IHomePageContract.IView {
    @Override
    protected int getLayout() {
        return R.layout.acitivity_register;
    }
    @Override
    protected BasePresenter initPresenter() {
        return new HomePagePresenter(this);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }



    @Override
    public void onGetBannerSuccee(List str) {

    }

    @Override
    public void onGetBannerFailure(String str) {

    }

    @Override
    public void onGetListSuccess(String str) {

    }

    @Override
    public void onGetListFailure(String str) {

    }

    @Override
    public void doLoginSuccess(String str) {

    }

    @Override
    public void doLoginFailure(String str) {

    }
}
