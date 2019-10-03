package com.github.yingvickycao.autils.base;

import android.app.TaskStackBuilder;

import com.github.yingvickycao.autils.mock.SFMock;
import com.github.yingvickycao.autils.R;

public class ThemeBaseFragment extends BaseFragment {

    protected void setLightTheme() {
        boolean isRedTheme = SFMock.getInstance().isRedTheme();
        if (isRedTheme) {
            return;
        }
        SFMock.getInstance().useRedTheme(true);

        applyTheme();
    }

    protected void setDarkTheme() {
        boolean isRedTheme = SFMock.getInstance().isRedTheme();
        if (!isRedTheme) {
            return;
        }
        SFMock.getInstance().useRedTheme(false);

        applyTheme();
    }

    protected void applyTheme() {
        getActivity().finish();
        TaskStackBuilder.create(getActivity()).addNextIntent(getActivity().getIntent()).startActivities();
    }

    protected void setTheme() {
        boolean isLightTheme = SFMock.getInstance().isRedTheme();
        if (isLightTheme) {
            getActivity().setTheme(R.style.AppTheme_Light);
        } else {
            getActivity().setTheme(R.style.AppTheme_Dark);
        }
    }
}
