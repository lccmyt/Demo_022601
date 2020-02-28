package com.bawei.demo_022601.acitivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.bawei.demo_022601.R;
import com.bawei.demo_022601.adapter.PzshAdapter;
import com.bawei.demo_022601.base.BaseActivity;
import com.bawei.demo_022601.base.BasePresenter;
import com.bawei.demo_022601.bean.ShenghuoListBean;
import com.bawei.demo_022601.contract.IHomePageContract;
import com.bawei.demo_022601.presenter.HomePagePresenter;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.stx.xhb.xbanner.XBanner;

import java.util.List;

/**
 * @ProjectName: Demo_022601
 * @Package: com.bawei.demo_022601.acitivity
 * @ClassName: ShenghuoActivity
 * @Description: (java类作用描述)
 * @Author: 李聪聪
 * @CreateDate: 2020/2/27 16:36
 */
public class ShenghuoActivity extends BaseActivity implements IHomePageContract.IView {

    private XBanner xBanner;
    private GridView gv;
    private List<ShenghuoListBean.ResultBean.PzshBean.CommodityListBeanX> commodityList;

    @Override
    protected int getLayout() {
        return R.layout.activity_shenghuo;
    }

    @Override
    protected BasePresenter initPresenter() {
        return new HomePagePresenter(this);
    }

    @Override
    protected void initView() {
        xBanner = findViewById(R.id.shenghuo_banner);
        gv = findViewById(R.id.gv);
    }

    @Override
    protected void initData() {
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ShenghuoActivity.this, NewAcitivity.class);
                intent.putExtra("word", commodityList.get(position).getCommodityName());
                startActivity(intent);
            }
        });
        BasePresenter presenter = getPresenter();
        if (presenter !=null && presenter instanceof HomePagePresenter){
            ((HomePagePresenter)presenter).getBanner("http://mobile.bwstudent.com/small/commodity/v1/bannerShow");
            ((HomePagePresenter)presenter).getList("http://mobile.bwstudent.com/small/commodity/v1/commodityList");
        }
    }

    @Override
    public void onGetBannerSuccee(final List list) {
        xBanner.setBannerData(list);
        xBanner.loadImage(new XBanner.XBannerAdapter() {
            @Override
            public void loadBanner(XBanner banner, Object model, View view, int position) {
                Glide.with(ShenghuoActivity.this).load(list.get(position)).into((ImageView) view);
            }
        });
    }

    @Override
    public void onGetBannerFailure(String str) {

    }

    @Override
    public void onGetListSuccess(String str) {
        Log.i("xxx", str);
        commodityList = new Gson().fromJson(str, ShenghuoListBean.class).getResult().getPzsh().getCommodityList();
        PzshAdapter pzshAdapter = new PzshAdapter(ShenghuoActivity.this, commodityList);
        gv.setAdapter(pzshAdapter);
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
