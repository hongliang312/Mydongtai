package com.example.mydongtai;

import android.util.Log;

/**
 * Created by 知足 on 2018/1/30.
 */

public class L {

    private static final String sTag = "WallPaper";

    public static void d(String msg, Object... params) {

        Log.d(sTag, String.format(msg, params));

    }

}
