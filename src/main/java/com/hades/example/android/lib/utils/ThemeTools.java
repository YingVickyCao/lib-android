package com.hades.example.android.lib.utils;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;

import androidx.annotation.NonNull;

import java.util.HashMap;
import java.util.Map;

public class ThemeTools {
    public static void printTypedArray(String tag, TypedArray typedArray) {
        if (null == typedArray) {
            Log.d(tag, "printTypedArray: typedArray = null");
            return;
        }
        Log.d(tag, "printTypedArray,typedArray.getIndexCount()=" + typedArray.getIndexCount());
        for (int i = 0; i < typedArray.getIndexCount(); i++) {
            int index = typedArray.getIndex(i);
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(index, typedValue);
            Log.e(tag, "printTypedArray ,index=" + index + ",type=" + typedArray.getType(index) + "," + typedValue.data);
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

    public static void getValuesFromAttributeSet(AttributeSet attrs, @NonNull Map<String, String> target) {
        if (null == attrs) {
            return;
        }
        int attributeCount = attrs.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = attrs.getAttributeName(i);
            String attributeValue = attrs.getAttributeValue(i);
            if (target.containsKey(attributeName)) {
                target.put(attributeName, attributeValue);
            }
        }
    }
}
