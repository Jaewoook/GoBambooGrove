package me.jaewook.bamboogrove.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jaewook on 2016-07-22.
 */
public class MyPostAdapter extends RecyclerView.Adapter<MyPostAdapter.MyPost> {


    @Override
    public MyPost onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyPost holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyPost extends RecyclerView.ViewHolder {
        public MyPost(View itemView) {
            super(itemView);
        }
    }
}
