package com.example.user.yinfeng.ui.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.example.user.yinfeng.R;
import com.example.user.yinfeng.ui.fragment.AnquanFragment;
import com.example.user.yinfeng.ui.fragment.HuodongFragment;
import com.example.user.yinfeng.ui.fragment.MineFragment;
import com.example.user.yinfeng.ui.fragment.QixingFragment;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener {
    private ArrayList<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_maina);
        BottomNavigationBar bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        bottomNavigationBar.addItem(new BottomNavigationItem(R.drawable.qix, "骑行").setActiveColorResource(R.color.bottom_bg))
                           .addItem(new BottomNavigationItem(R.drawable.hd, "活动").setActiveColorResource(R.color.topbar_bg))
                           .addItem(new BottomNavigationItem(R.drawable.wod, "我的").setActiveColorResource(R.color.bottom_bg))
                           .addItem(new BottomNavigationItem(R.drawable.anq, "安全").setActiveColorResource(R.color.topbar_bg))
                           .setFirstSelectedPosition(0).initialise();
    }

    private void setDefaultFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.top_bar, QixingFragment.newInstance("Qixing"));
        transaction.commit();
    }

    private ArrayList<Fragment> getFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(QixingFragment.newInstance("Qixing"));
        fragments.add(HuodongFragment.newInstance("HD"));
        fragments.add(MineFragment.newInstance("Mine"));
        fragments.add(AnquanFragment.newInstance("safe"));
        return fragments;
    }

    @Override
    public void onTabSelected(int position) {
        if (fragments != null) {
            if (position < fragments.size()) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Fragment fragment = fragments.get(position);
                if (fragment.isAdded()) {
                    ft.replace(R.id.top_bar, fragment);
                } else {
                    ft.add(R.id.top_bar, fragment);
                }
                ft.commitAllowingStateLoss();
            }
        }
    }

    @Override
    public void onTabUnselected(int position) {
        if (fragments != null) {
            if (position < fragments.size()) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Fragment fragment = fragments.get(position);
                ft.remove(fragment);
                ft.commitAllowingStateLoss();
            }
        }
    }

    @Override
    public void onTabReselected(int position) {

    }
}
