package me.jaewook.bamboogrove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import me.jaewook.bamboogrove.core.base.BaseActivity;
import me.jaewook.bamboogrove.net.req.PostService;
import me.jaewook.bamboogrove.pref.SessionPref;

public class WritePost extends BaseActivity {


    private static final int LAYOUT_RESOURCE = R.layout.activity_write_post;

    private EditText article;
    private Button submit;

    private PostService.Post postService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setLayoutResource(LAYOUT_RESOURCE);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void init() {
        postService = PostService.getInstance();
    }

    @Override
    protected void initView() {
        submit = (Button) findViewById(R.id.submit);
        article = (EditText) findViewById(R.id.article);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postService.uploadPost(,SessionPref.getInstance(WritePost.this).getAccessToken(),
                        article.getText().toString(),
                        category)
            }
        });
    }
}
