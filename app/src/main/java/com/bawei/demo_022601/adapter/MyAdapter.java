package com.bawei.demo_022601.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.demo_022601.R;
import com.bawei.demo_022601.acitivity.HomePageActicity;
import com.bawei.demo_022601.bean.ListBean;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * @ProjectName: Demo_022601
 * @Package: com.bawei.demo_022601.adapter
 * @ClassName: MyAdapter
 * @Description: (java类作用描述)
 * @Author: 李聪聪
 * @CreateDate: 2020/2/26 22:09
 */
public class MyAdapter extends BaseAdapter {
    private final Context context;
    private final List<ListBean.ResultBean.RxxpBean.CommodityListBean> commodityList;

    public MyAdapter(Context context, List<ListBean.ResultBean.RxxpBean.CommodityListBean> commodityList) {

        this.context = context;
        this.commodityList = commodityList;
    }

    @Override
    public int getCount() {
        return commodityList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHodel hodel = null;
        if (convertView == null){
            convertView = View.inflate(context, R.layout.item, null);
            hodel = new ViewHodel();
            hodel.iv = convertView.findViewById(R.id.iv);
            hodel.tv1 = convertView.findViewById(R.id.tv_text);
            hodel.tv2 = convertView.findViewById(R.id.tv_price);
            convertView.setTag(hodel);
        }else {
            hodel = (ViewHodel) convertView.getTag();
        }
        hodel.tv1.setText(commodityList.get(position).getCommodityName());
        hodel.tv2.setText(commodityList.get(position).getPrice()+"");
        Glide.with(context).load(commodityList.get(position).getMasterPic()).into(hodel.iv);
        return convertView;
    }
    private class ViewHodel{
        ImageView iv;
        TextView tv1;
        TextView tv2;
    }
}
