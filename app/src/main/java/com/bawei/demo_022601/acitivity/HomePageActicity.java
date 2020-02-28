package com.bawei.demo_022601.acitivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.bawei.demo_022601.R;
import com.bawei.demo_022601.adapter.MyAdapter;
import com.bawei.demo_022601.base.BaseActivity;
import com.bawei.demo_022601.base.BasePresenter;
import com.bawei.demo_022601.bean.ListBean;
import com.bawei.demo_022601.contract.IHomePageContract;
import com.bawei.demo_022601.presenter.HomePagePresenter;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.stx.xhb.xbanner.XBanner;
import com.stx.xhb.xbanner.entity.SimpleBannerInfo;

import java.util.List;

/**
 * @ProjectName: Demo_022601
 * @Package: com.bawei.demo_022601.acitivity
 * @ClassName: HomePageActicity
 * @Description: (java类作用描述)
 * @Author: 李聪聪
 * @CreateDate: 2020/2/26 21:27
 */
public class HomePageActicity extends BaseActivity implements IHomePageContract.IView {

    private XBanner xbanner;
    private ListView lv;

    @Override
    protected int getLayout() {
        return R.layout.activity_homepage;
    }
    @Override
    protected BasePresenter initPresenter() {
        return new HomePagePresenter(this);
    }

    @Override
    protected void initView() {
        xbanner = findViewById(R.id.xbanner);
        lv = findViewById(R.id.lv);
    }

    @Override
    protected void initData() {
        BasePresenter presenter = getPresenter();
        if (presenter != null && presenter instanceof HomePagePresenter){
            ((HomePagePresenter)presenter).getBanner("http://mobile.bwstudent.com/small/commodity/v1/bannerShow");
            ((HomePagePresenter)presenter).getList("http://mobile.bwstudent.com/small/commodity/v1/commodityList");
        }
    }



    @Override
    public void onGetBannerSuccee(final List list) {
        xbanner.setBannerData(list);
        xbanner.loadImage(new XBanner.XBannerAdapter() {
            @Override
            public void loadBanner(XBanner banner, Object model, View view, int position) {
                Glide.with(HomePageActicity.this).load(list.get(position)).into((ImageView) view);
            }
        });
    }

    @Override
    public void onGetBannerFailure(String str) {

    }

    @Override
    public void onGetListSuccess(String str) {
        List<ListBean.ResultBean.RxxpBean.CommodityListBean> commodityList = new Gson().fromJson(str, ListBean.class).getResult().getRxxp().getCommodityList();
        MyAdapter myAdapter = new MyAdapter(HomePageActicity.this,commodityList);
        lv.setAdapter(myAdapter);
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
