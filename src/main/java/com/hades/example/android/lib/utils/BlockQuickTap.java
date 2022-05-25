package com.hades.example.android.lib.utils;

import androidx.annotation.IdRes;

public class BlockQuickTap {

    private static String lastBtnId = "";
    private static long lastClickTsOfBtn;
    public static long MIN_CLICK_DELAY_MS_OF_BTN = 200;

    public static long MIN_TIME_INTERVAL_OF_TO_SHOW_DIALOG = 500;

    public static boolean isUserFastOperation() {
        return isUserFastOperation(-1, MIN_CLICK_DELAY_MS_OF_BTN);
    }

    public static boolean isUserFastOperation(@IdRes int btnId) {
        return isUserFastOperation(btnId, MIN_CLICK_DELAY_MS_OF_BTN);
    }

    public static boolean isUserFastOperation(@IdRes int btnId, long clickDurationMs) {
        return isUserFastOperation(String.valueOf(btnId), clickDurationMs);
    }

    public static boolean isUserFastOperation(String uniqueKey, long clickDurationMs) {
        long current = System.currentTimeMillis();
        long duration = current - lastClickTsOfBtn;
        if ((lastBtnId.equalsIgnoreCase(uniqueKey)) && (0 < duration) && (duration < clickDurationMs)) {
            return true;
        }
        lastBtnId = String.valueOf(uniqueKey);
        lastClickTsOfBtn = current;
        return false;
    }
}