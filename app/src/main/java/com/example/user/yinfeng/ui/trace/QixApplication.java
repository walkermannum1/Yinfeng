package com.example.user.yinfeng.ui.trace;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.trace.LBSTraceClient;
import com.baidu.trace.LocationMode;
import com.baidu.trace.Trace;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;

import java.lang.ref.WeakReference;

/**
 * Created by user on 2016/10/17.
 */

public class QixApplication extends Application {

    private Context mContext = null;

    private Trace trace = null;

    private LBSTraceClient client = null;

    private int serviceId = 125468;

    private String entityName = "迎风";

    private int traceType = 2;

    private MapView bmapView = null;

    private BaiduMap mBaiduMap = null;

    private QixHandler mHandler = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        SDKInitializer.initialize(this);
        client = new LBSTraceClient(mContext);
        trace = new Trace(mContext, serviceId, entityName, traceType);
        client.setLocationMode(LocationMode.High_Accuracy);
        mHandler = new QixHandler(this);
    }

    public void initBmap(MapView bmapView) {
        this.bmapView = bmapView;
        this.mBaiduMap = bmapView.getMap();
        this.bmapView.showZoomControls(false);
    }

    static class QixHandler extends Handler {
        WeakReference<QixApplication> qixApp;
        QixHandler(QixApplication qixApplication) {
            qixApp = new WeakReference<QixApplication>(qixApplication);
        }

        @Override
        public void handleMessage(Message msg) {
            Toast.makeText(qixApp.get().mContext, (String) msg.obj, Toast.LENGTH_SHORT).show();
        }
    }

    public Context getContext() {
        return mContext;
    }

    public Trace getTrace() {
        return trace;
    }

    public LBSTraceClient getClient() {
        return client;
    }

    public int getServiceId() {
        return serviceId;
    }

    public String getEntityName() {
        return entityName;
    }

    public MapView getBmapView() {
        return bmapView;
    }

    public BaiduMap getBaiduMap() {
        return mBaiduMap;
    }

    public QixHandler getHandler() {
        return mHandler;
    }

}
