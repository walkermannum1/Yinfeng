package com.example.user.yinfeng.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.yinfeng.R;

/**
 * Created by user on 2016/10/13.
 */

public class HuodongFragment extends Fragment{
    public static HuodongFragment newInstance(String string) {

        Bundle args = new Bundle();

        HuodongFragment fragment = new HuodongFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public HuodongFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_huodong, container, false);
        Bundle bundle = getArguments();
        return view;
    }
}
