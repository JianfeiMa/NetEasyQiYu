package com.example.neteasyqiyu;

import android.app.Application;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;

import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.api.StatusBarNotificationConfig;
import com.qiyukf.unicorn.api.Unicorn;
import com.qiyukf.unicorn.api.UnicornImageLoader;
import com.qiyukf.unicorn.api.YSFOptions;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Unicorn.init(this, "227750f4b7dc6233e1d5bc5108b831f3", options(), new UnicornImageLoader() {
            @Nullable
            @Override
            public Bitmap loadImageSync(String uri, int width, int height) {
                return null;
            }

            @Override
            public void loadImage(String uri, int width, int height, ImageLoaderListener listener) {

            }
        });
    }

    private YSFOptions options() {
        YSFOptions ysfOptions = new YSFOptions();
        ysfOptions.statusBarNotificationConfig = new StatusBarNotificationConfig();
        return  ysfOptions;
    }
}
