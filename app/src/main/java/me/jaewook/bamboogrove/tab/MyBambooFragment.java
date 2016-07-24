package me.jaewook.bamboogrove.tab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.jaewook.bamboogrove.R;
import me.jaewook.bamboogrove.core.base.BaseFragment;
import me.jaewook.bamboogrove.data.MyPostData;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyBambooFragment extends BaseFragment implements MyPostData.DataUpdateCallback {


    private static final int LAYOUT_RESOURCE = R.layout.fragment_my_bamboo;

    private RecyclerView postList;
    private LinearLayoutManager llManager;

    private MyPostData myPostData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setLayoutResource(LAYOUT_RESOURCE);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    protected void init() {
        llManager = new LinearLayoutManager(getContext());
        myPostData = MyPostData.getInstance();
        myPostData.addDataUpdateCallback(this);
    }

    @Override
    protected void initView() {
        postList = (RecyclerView) findViewById(R.id.post_list);
        postList.setLayoutManager(llManager);
        postList.setAdapter(myPostData.getAdapter());

        updateData();
    }

    void updateData() {

    }

    @Override
    public void onUpdated() {

    }

    @Override
    public void onError() {

    }
}
