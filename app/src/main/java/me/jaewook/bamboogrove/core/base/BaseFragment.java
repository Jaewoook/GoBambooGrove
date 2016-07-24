package me.jaewook.bamboogrove.core.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jaewook on 2016-07-21.
 */
public abstract class BaseFragment extends Fragment {


    private int layoutRes;
    private View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        if(layoutRes <= 0) {
            throw new RuntimeException("you MUST set your layout xml for this fragment!");
        }
        init();
        rootView = inflater.inflate(layoutRes, container, false);
        initView();
        return rootView;
    }

    protected abstract void init();
    protected abstract void initView();

    public void setLayoutResource(int resId) {
        layoutRes = resId;
    }

    public View findViewById(int viewId) {
        return rootView.findViewById(viewId);
    }
}
