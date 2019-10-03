package com.github.yingvickycao.autils.mock;

public class SFMock {

    private static SFMock mInstance;

    private boolean mIsRedTheme;

    public static SFMock getInstance() {
        if (null == mInstance){
            mInstance  = new SFMock();
        }
        return mInstance;
    }
    public boolean isRedTheme() {
        return mIsRedTheme;
    }

    public void useRedTheme(boolean isRedTheme) {
        this.mIsRedTheme = isRedTheme;
    }
}
