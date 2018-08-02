package com.jianzou.batianxia;

import android.content.Context;
import android.util.TypedValue;

public class DisplayUtils
{
    public static int dp2px(Context c, float dp)
    {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, c.getResources().getDisplayMetrics());
    }
}
