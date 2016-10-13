package com.example.user.yinfeng.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by user on 2016/10/13.
 */

public class AnquanFragment extends Fragment {
    public static AnquanFragment newInstance(String s) {

        Bundle args = new Bundle();

        AnquanFragment fragment = new AnquanFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
