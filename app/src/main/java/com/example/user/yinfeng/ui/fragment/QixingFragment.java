package com.example.user.yinfeng.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by user on 2016/10/11.
 */

public class QixingFragment extends Fragment{
    public static QixingFragment newInstance(String string) {
        
        Bundle args = new Bundle();
        
        QixingFragment fragment = new QixingFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
