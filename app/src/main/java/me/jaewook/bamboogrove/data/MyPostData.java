package me.jaewook.bamboogrove.data;

import java.util.ArrayList;

import me.jaewook.bamboogrove.adapter.MyPostAdapter;

/**
 * Created by Jaewook on 2016-07-22.
 */
public class MyPostData {

    public static interface DataUpdateCallback {
        void onUpdated();
        void onError();
    }

    private static MyPostData instance;

    private MyPostAdapter adapter;
    private ArrayList<DataUpdateCallback> updateCallbacks;

    public static MyPostData getInstance() {
        return instance != null ? instance :new MyPostData();
    }

    private MyPostData() {
        updateCallbacks = new ArrayList<>();
        adapter = new MyPostAdapter();
        instance = this;
    }

    public void addDataUpdateCallback(DataUpdateCallback callback) {
        updateCallbacks.add(callback);
    }

    public MyPostAdapter getAdapter() {
        return adapter;
    }


}
