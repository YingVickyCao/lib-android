package com.hades.example.android.lib.utils;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;

public class CustomViewTools {
    public static void printTypedArray(String tag, TypedArray typedArray) {
        if (null == typedArray) {
            Log.d(tag, "printTypedArray: typedArray = null");
            return;
        }
        Log.d(tag, "printTypedArray,typedArray.getIndexCount()=" + typedArray.getIndexCount());
        for (int i = 0; i < typedArray.getIndexCount(); i++) {
            int index = typedArray.getIndex(i);
            Log.e(tag, "printTypedArray ,index=" + index);
        }
    }

    public static void printAttributeSet(String tag, AttributeSet attrs) {
        if (null == attrs) {
            Log.d(tag, "printAttributeSet, AttributeSet is null.");
            return;
        }

        int attributeCount = attrs.getAttributeCount();
        Log.i(tag, "printAttributeSet,当前属性个数为：" + attributeCount);
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = attrs.getAttributeName(i);

//            if (attributeName.equals("theme_mode")) {
//                String attributeValue = attrs.getAttributeValue(i);
//                Log.d(tag, String.format("printAttributeSet,当前属性索引为：%d,索引名为：%s", i, attributeName) + ",当前属性值为：：" + attributeValue);
//            } else {
//                Log.d(tag, String.format("printAttributeSet, 当前属性索引为：%d,索引名为：%s", i, attributeName));
//            }
            String attributeValue = attrs.getAttributeValue(i);
            Log.d(tag, String.format("printAttributeSet,当前属性索引为：%d,索引名为：%s", i, attributeName) + ",当前属性值为：：" + attributeValue);
        }
    }

    public static String getValueFromAttributeSet(String tag, AttributeSet attrs) {
        if (null == attrs) {
            return null;
        }
        int attributeCount = attrs.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = attrs.getAttributeName(i);
            String attributeValue = attrs.getAttributeValue(i);
            if (attributeName.equals("theme_mode")) {
                return attributeValue;
            }
        }
        return null;
    }
}
