package com.woman.beautylive.ui.root;

import android.support.annotation.NonNull;

import com.woman.beautylive.R;
import com.woman.beautylive.commom.basic.BasicActivity;
import com.woman.beautylive.databinding.ActivityMainBinding;
import com.woman.beautylive.ui.fragment.MainFragment;

import de.greenrobot.event.EventBus;

public class MainActivity extends BasicActivity<ActivityMainBinding> {
    public static final String TAG = "MainActivity";

    @NonNull
    @Override
    protected void createViewBinding() {
        loadRootFragment(R.id.contentPanel, new MainFragment());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

}


