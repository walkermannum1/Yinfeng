package com.example.user.yinfeng.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

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
}
