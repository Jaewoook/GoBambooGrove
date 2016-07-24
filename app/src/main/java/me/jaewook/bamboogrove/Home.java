package me.jaewook.bamboogrove;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import me.jaewook.bamboogrove.core.base.BaseActivity;

public class Home extends BaseActivity implements View.OnClickListener {


    private static final int LAYOUT_RESOURCE = R.layout.activity_home;

    private TabLayout tabContainer;
    private ViewPager content;
    private ImageView emptyView;

    private FloatingActionButton fab;

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
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab:
                startActivity(new Intent(Home.this, WritePost.class));
                break;
        }
    }
}
