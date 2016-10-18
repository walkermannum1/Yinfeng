package com.example.user.yinfeng.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;
import com.example.user.yinfeng.R;
import com.example.user.yinfeng.ui.trace.QixApplication;

/**
 * Created by user on 2016/10/11.
 */

public class QixingFragment extends Fragment{
    private QixApplication qixApp = null;

    public QixingFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qixing, container, false);
        qixApp = (QixApplication) getActivity().getApplicationContext();
        init(view);
        return view;
    }

    private void init(View view) {
        SDKInitializer.initialize(qixApp);
        qixApp.initBmap((MapView) view.findViewById(R.id.bmapView));
    }

    public static final QixingFragment newInstance(QixApplication qixApp) {

        QixingFragment fragment = new QixingFragment();
        fragment.qixApp = qixApp;
        return fragment;
    }
}
