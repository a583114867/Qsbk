package com.zzq.qsbk.base;

import android.support.v4.app.Fragment;

/**
 * Created by 朱志强 on 2017/4/20.
 */

public abstract class BaseFragment<T extends BasePresenter> extends Fragment {

   protected T mPresenter;


    public void setPresenter(T presenter){
        mPresenter=presenter;
    }

    @Override
    public void onPause() {
        super.onPause();
        if(mPresenter!=null){
            mPresenter.unsubscribe();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if(mPresenter!=null){
            mPresenter.subscribe();
        }
    }
}
