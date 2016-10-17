package com.example.user.yinfeng.ui.trace;

import android.app.Application;
import android.content.Context;

import com.baidu.trace.LBSTraceClient;
import com.baidu.trace.Trace;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;

/**
 * Created by user on 2016/10/17.
 */

public class QixApplication extends Application {

    private Context mContext = null;

    private Trace mTrace = null;

    private LBSTraceClient mClient = null;

    private int ServiceId = 125468;

    private String entityName = "迎风";

    private int traceType = 2;

    private MapView bmapView = null;

    private BaiduMap mBaiduMap = null;

}
