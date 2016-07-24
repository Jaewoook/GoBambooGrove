package me.jaewook.bamboogrove.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import me.jaewook.bamboogrove.tab.MyBambooFragment;

/**
 * Created by Jaewook on 2016-07-22.
 */
public class ContentAdapter extends FragmentPagerAdapter {


    private MyBambooFragment myBambooFragment;

    public ContentAdapter(FragmentManager fm) {
        super(fm);
        myBambooFragment = new MyBambooFragment();
    }

    @Override
    public Fragment getItem(int position) {
        Fragment target = null;
        switch (position) {
            case 0:
                target = myBambooFragment;
                break;
        }
        return target;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
