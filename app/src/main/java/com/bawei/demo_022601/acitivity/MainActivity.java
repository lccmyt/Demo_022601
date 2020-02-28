package com.bawei.demo_022601.acitivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bawei.demo_022601.R;
import com.bawei.demo_022601.base.BaseActivity;
import com.bawei.demo_022601.base.BasePresenter;
import com.bawei.demo_022601.contract.IHomePageContract;
import com.bawei.demo_022601.presenter.HomePagePresenter;
import com.bawei.demo_022601.utils.NetUtils;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends BaseActivity implements IHomePageContract.IView {
    private Button bt_login;
    private TextView tv_register;
    private TextView tv_phone;
    private TextView tv_pwd;
    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePresenter initPresenter() {
        return new HomePagePresenter(this);
    }

    @Override
    protected void initView() {
        bt_login = findViewById(R.id.bt_login);
        tv_register = findViewById(R.id.tv_register);
        tv_phone = findViewById(R.id.tv_phone);
        tv_pwd = findViewById(R.id.tv_pwd);
    }

    @Override
    protected void initData() {
        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BasePresenter presenter = getPresenter();
                if (presenter != null && presenter instanceof HomePagePresenter){
                    String phone = tv_phone.getText().toString();
                    String pwd = tv_pwd.getText().toString();
                    HashMap<String, String> map = new HashMap<>();
                    map.put("phone", phone);
                    map.put("pwd", pwd);
                    ((HomePagePresenter)presenter).doLogin("http://mobile.bwstudent.com/small/user/v1/login",map);
                }
            }
        });
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
        Intent intent = new Intent(MainActivity.this, HomePageActicity.class);
        startActivity(intent);
    }

    @Override
    public void doLoginFailure(String str) {

    }
}
