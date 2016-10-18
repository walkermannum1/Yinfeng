package com.example.user.yinfeng.ui.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.baidu.mapapi.map.BaiduMapOptions;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.SupportMapFragment;
import com.example.user.yinfeng.R;

/**
 * Created by user on 2016/10/18.
 */

public class FragmentMap extends FragmentActivity {
    SupportMapFragment map;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_qixing);
        MapStatus.Builder builder = new MapStatus.Builder();
        BaiduMapOptions bo = new BaiduMapOptions().mapStatus(builder.build()).compassEnabled(false).zoomControlsEnabled(false);
        map = SupportMapFragment.newInstance(bo);
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.bmapView, map, "map").commit();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }


}
