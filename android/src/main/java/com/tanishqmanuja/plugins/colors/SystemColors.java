package com.tanishqmanuja.plugins.colors;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;

import androidx.core.content.ContextCompat;

public class SystemColors {
    public String NO_RESOURCE_ID_ERROR = "NO_RES_ID_FOUND";
    private String intColorToHexString(int color) {
        return String.format("#%06X", (0xFFFFFF & color));
    }
    public String getResourceColor(Context ctx, String colorId) {
        @SuppressLint("DiscouragedApi")
        int resourceId = ctx.getResources().getIdentifier(colorId, "color", "android");

        if (resourceId == 0){
            return this.NO_RESOURCE_ID_ERROR;
        }

        int color = ContextCompat.getColor(ctx, resourceId);
        return intColorToHexString(color);
    }
}