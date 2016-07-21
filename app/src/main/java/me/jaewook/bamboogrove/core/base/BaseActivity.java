package me.jaewook.bamboogrove.core.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jaewook on 2016-07-21.
 */
public abstract class BaseActivity extends AppCompatActivity {


    private int layoutRes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if(layoutRes <= 0) {
            throw new RuntimeException("You MUST set your layout XML for this Activity");
        }
        super.onCreate(savedInstanceState);
        init();
        setContentView(layoutRes);
        initView();
        initMeni();
    }

    protected abstract void init();
    protected abstract void initView();
    protected abstract void initMeni();

    public void setLayoutResource(int layoutId) {
        layoutRes = layoutId;
    }
}
