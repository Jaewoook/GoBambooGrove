package me.jaewook.bamboogrove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.jaewook.bamboogrove.core.base.BaseActivity;

public class Post extends BaseActivity {


    private static final int LAYOUT_RESOURCE = R.layout.activity_post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setLayoutResource(LAYOUT_RESOURCE);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void init() {

    }

    @Override
    protected void initView() {

    }
}
