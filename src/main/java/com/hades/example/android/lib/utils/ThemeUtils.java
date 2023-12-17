package com.hades.example.android.lib.utils;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.widget.TextView;

import androidx.annotation.DimenRes;

public class ThemeUtils {
    /**
     * @param context
     * @param attrResId e.g. R.attr.color1
     * @return e.g. Light: <item name="color1">@android:color/holo_red_light</item> Dark : <item name="color1">@android:color/holo_orange_dark</item>
     */
    public static int getResourceIdByAttrId(Context context, int attrResId) {
        TypedValue tv = new TypedValue();
        context.getTheme().resolveAttribute(attrResId, tv, true);
        return tv.resourceId;
    }

    /**
     * @param context
     * @param attrResId e.g. android.R.attr.actionBarSize (TYPE_DIMENSION)
     * @return e.g. dp
     */
    public static int getDataInValueIdByAttrId(Context context, int attrResId) {
        TypedValue tv = new TypedValue();
        context.getTheme().resolveAttribute(attrResId, tv, true);
        return tv.data;
    }

    /**
     * 将颜色整数转换为十六进制字符串
     *
     * @param color 0xAARRGGBB -> #RRGGBB
     *              (1) 0x80FF0000 -> #ff0000
     *              (2) 0xFF00FF00 -> #00ff00
     * @return
     */
    public static String convertIntColorToSting_RGB(int color) {
        return String.format("#%06x", (0xFFFFFF & color));
    }

    /**
     * 将颜色整数转换为十六进制字符串
     *
     * @param color (1) 0x80FF0000 -> #80ff0000
     *              (2) 0xFF00FF00 -> #ff00ff00
     * @return
     */
    public static String convertIntColorToSting_ARGB(int color) {
        return ("#" + Integer.toHexString(color));
    }

    /**
     * @param color (1) #80ff0000 -> 0x80FF0000
     *              (2) #ff00ff00 -> 0xFF00FF00
     * @return
     */
    public static int convertStringColorToInt(String color) {
        return Color.parseColor(color);
    }

    /**
     * setTextSize(textView,R.dimen.text_size_30,context)
     *
     * @param textView
     * @param testSize text size dimen resource
     */
    public static void setTextSize(TextView textView, @DimenRes int testSize, Context context) {
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.getResources().getDimensionPixelSize(testSize));
    }

    /**
     * setTextSizeUnitPx(textView,getResources().getDimensionPixelSize(R.dimen.text_size_30))
     *
     * @param textView
     * @param size     px size
     */
    public static void setTextSizeUnitPx(TextView textView, float size) {
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, size);
    }

    /**
     * setTextSizeUnitSp(textView,30);
     *
     * @param textView
     * @param size     sp size
     */
    public static void setTextSizeUnitSp(TextView textView, float size) {
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, size);
    }
}
