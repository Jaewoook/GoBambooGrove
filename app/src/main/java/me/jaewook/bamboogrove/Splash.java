package me.jaewook.bamboogrove;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.jaewook.bamboogrove.core.base.BaseActivity;

public class Splash extends BaseActivity {


    private static final int LAYOUT_RESOURCE_ID = R.layout.activity_splash;

    private Handler splashHandler;
    private Runnable splash = new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(Splash.this, Login.class));
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setLayoutResource(LAYOUT_RESOURCE_ID);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void init() {
        splashHandler = new Handler();
        splashHandler.postDelayed(splash, 2000);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        splashHandler.removeCallbacks(splash);
    }
}
