package com.bawei.demo_022601.acitivity;

import android.content.Intent;
import android.widget.TextView;

import com.bawei.demo_022601.R;
import com.bawei.demo_022601.base.BaseActivity;
import com.bawei.demo_022601.base.BasePresenter;
import com.bawei.demo_022601.contract.IHomePageContract;
import com.bawei.demo_022601.presenter.HomePagePresenter;

import java.util.List;

/**
 * @ProjectName: Demo_022601
 * @Package: com.bawei.demo_022601.acitivity
 * @ClassName: NewAcitivity
 * @Description: (java类作用描述)
 * @Author: 李聪聪
 * @CreateDate: 2020/2/27 17:02
 */
public class NewAcitivity extends BaseActivity implements IHomePageContract.IView {

    private TextView tv;

    @Override
    protected int getLayout() {
        return R.layout.activity_new;
    }

    @Override
    protected BasePresenter initPresenter() {
        return new HomePagePresenter(this);
    }

    @Override
    protected void initView() {
        tv = findViewById(R.id.tv_word);
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        String word = intent.getStringExtra("word");
        tv.setText(word);

    }

    @Override
    public void onGetBannerSuccee(List list) {

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
