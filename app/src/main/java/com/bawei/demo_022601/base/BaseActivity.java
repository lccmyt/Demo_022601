package com.bawei.demo_022601.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @ProjectName: Demo_022601
 * @Package: com.bawei.demo_022601.base
 * @ClassName: BaseActivity
 * @Description: (java类作用描述)
 * @Author: 李聪聪
 * @CreateDate: 2020/2/26 20:19
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IBaseView {


    private P p;

    public P getPresenter(){
        return p;
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        p = initPresenter();
        initView();
        initData();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (p != null){
            p.detachView();
            p = null;
        }
    }
    protected abstract int getLayout();

    protected abstract P initPresenter();

    protected abstract void initView();

    protected abstract void initData();


}
