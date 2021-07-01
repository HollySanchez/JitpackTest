package com.mai.jitpacktest;

import android.content.Context;
import android.util.Log;

import com.bun.miitmdid.core.MdidSdkHelper;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.bun.miitmdid.interfaces.IdSupplier;

public class LibB {
    public void init(Context context) {
        Log.d("test", "LibB.init");
        try {
            MdidSdkHelper.InitSdk(context, true, new IIdentifierListener() {
                @Override
                public void OnSupport(boolean b, IdSupplier idSupplier) {
                    if (b && idSupplier != null) {
                        Log.e("LibB", "oaid:" + idSupplier.getOAID());
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
