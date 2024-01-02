package androidx.appcompat.widget;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public abstract class o0000O0O {
    public static void OooO00o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}