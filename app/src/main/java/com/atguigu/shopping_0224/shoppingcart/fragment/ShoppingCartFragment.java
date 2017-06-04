package com.atguigu.shopping_0224.shoppingcart.fragment;

import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.atguigu.shopping_0224.base.BaseFragment;

/**
 * 作者：田学伟 on 2017/6/2 19:44
 * QQ：93226539
 * 作用：购物车Fragment
 */

public class ShoppingCartFragment extends BaseFragment {
    private TextView textView;

    @Override
    public View initView() {
        textView = new TextView(mContext);
        textView.setTextSize(20);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        return textView;
    }

    /**
     * 1.把数据绑定到控件上的时候，重新该方法
     * 2.联网请求，把得到的数据绑定到视图上
     */
    @Override
    public void initData() {
        super.initData();

        Log.e("TAG", "购物车的数据被初始化了...");
        textView.setText("购物车内容");
    }
}