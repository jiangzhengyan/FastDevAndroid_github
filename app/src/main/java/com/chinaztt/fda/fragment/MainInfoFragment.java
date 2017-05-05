package com.chinaztt.fda.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chinaztt.fda.adapter.base.FixedPagerAdapter;
import com.chinaztt.fda.ui.R;
import com.chinaztt.fda.viewpagerindicator.TabPageIndicator;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

/**
 * 当前类注释:主Fragment承载类,上面会放置若干个Fragment类
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fda.fragment
 * 作者：jzy on 15/11/16 13:44
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
@EFragment(R.layout.main_info_layout)
public class MainInfoFragment  extends Fragment implements ViewPager.OnPageChangeListener{
    @ViewById
    ViewPager info_viewpager;
    @ViewById
    TabPageIndicator id_indicator;
    private List<Fragment> fragments;
    private FixedPagerAdapter mPagerAdater;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @AfterViews
    public void initDatas(){
        fragments=new ArrayList<>();
        fragments.add(new OneFragment());
        fragments.add(new TwoFragment());
        fragments.add(new ThreeFragment());
        fragments.add(new FourFragment());

        mPagerAdater=new FixedPagerAdapter(getChildFragmentManager());
        mPagerAdater.setFragments(fragments);
        info_viewpager.setAdapter(mPagerAdater);
        id_indicator.setViewPager(info_viewpager,0);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        int index=position+1;
        Log.d("zttjiangqq","当前为第"+index+"页...");
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
