package zou.dahua.density;

import android.app.Application;

import zou.dahua.densitylib.Density;

/**
 * 入口
 * Created by Deep on 2018/6/29 0029.
 */

public class CoreApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //记住，这个值需要自己根据UI图计算的哦，可不要直接抄
        Density.setDensity(this, 360);
    }
}
