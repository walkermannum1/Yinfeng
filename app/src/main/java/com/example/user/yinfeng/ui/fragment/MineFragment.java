package com.example.user.yinfeng.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by user on 2016/10/13.
 */

public class MineFragment extends Fragment {
    public static MineFragment newInstance(String string) {

        Bundle args = new Bundle();

        MineFragment fragment = new MineFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
