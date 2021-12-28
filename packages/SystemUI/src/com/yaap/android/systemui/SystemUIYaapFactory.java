package com.yaap.android.systemui;

import android.content.Context;

import com.yaap.android.systemui.dagger.DaggerGlobalRootComponentYaap;
import com.yaap.android.systemui.dagger.GlobalRootComponentYaap;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;

public class SystemUIYaapFactory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerGlobalRootComponentYaap.builder()
                .context(context)
                .build();
    }
}
