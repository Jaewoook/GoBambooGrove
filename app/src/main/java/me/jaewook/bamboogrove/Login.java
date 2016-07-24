package me.jaewook.bamboogrove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.FacebookSdk;

import me.jaewook.bamboogrove.core.base.BaseActivity;

public class Login extends BaseActivity {


    private static final int LAYOUT_RESOURCE_ID = R.layout.activity_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setLayoutResource(LAYOUT_RESOURCE_ID);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void init() {
    }

    @Override
    protected void initView() {
        findViewById(R.id.pass).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Home.class));
            }
        });
    }
}
