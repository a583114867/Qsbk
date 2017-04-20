package com.zzq.qsbk;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zzq.qsbk.base.BaseActivity;

import java.util.ArrayList;

import butterknife.BindView;

public class MainActivity extends BaseActivity {


    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tab)
    ViewPager mTabPager;
    @BindView(R.id.content)
    ViewPager mContentPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setSupportActionBar(mToolbar);

        final String[] tabs=getResources().getStringArray(R.array.tab_items);
        final ArrayList<View> tabViews=new ArrayList<>(tabs.length);
        for(String item:tabs){
            TextView tab=new TextView(this);
            tab.setGravity(Gravity.CENTER);
            tab.setText(item);
            tabViews.add(tab);
        }
        mTabPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return tabs.length;
            }

            @Override
            public float getPageWidth(int position) {
                return 1.0f/4;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view==object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                container.addView(tabViews.get(position));
                return tabViews.get(position);
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView(tabViews.get(position));
            }
        });


        mContentPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return null;
            }

            @Override
            public int getCount() {
                return 0;
            }
        });
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }
}
