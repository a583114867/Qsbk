package com.zzq.qsbk.status;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.MultiItemTypeAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;
import com.zhy.adapter.recyclerview.wrapper.LoadMoreWrapper;
import com.zzq.qsbk.R;
import com.zzq.qsbk.base.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 朱志强 on 2017/4/20.
 */

public class StatusFragment extends BaseFragment<StatusPresenter> implements MultiItemTypeAdapter.OnItemClickListener, LoadMoreWrapper.OnLoadMoreListener {
    private static String TAG;

    @BindView(R.id.recyclerView)
    private RecyclerView recyclerView;

    private CommonAdapter<Object> adapter;
    private ArrayList<Object> mData=new ArrayList<>();

    public static StatusFragment newInstance(String tag) {
        Bundle args = new Bundle();
        StatusFragment fragment = new StatusFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=View.inflate(getActivity(), R.layout.fragment_status,null);
        ButterKnife.bind(this,rootView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new CommonAdapter<Object>(getActivity(),R.layout.activity_main,mData) {
            @Override
            protected void convert(ViewHolder holder, Object o, int position) {

            }
        };
        adapter.setOnItemClickListener(this);
        LoadMoreWrapper moreWrapper = new LoadMoreWrapper(this.adapter);
        moreWrapper.setOnLoadMoreListener(this);
        recyclerView.setAdapter(moreWrapper);
        mPresenter.refresh();
        return rootView;
    }

    @Override
    public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position) {
        return false;
    }

    @Override
    public void onLoadMoreRequested() {
        mPresenter.loadNext();
    }
}
