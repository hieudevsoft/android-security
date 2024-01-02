package androidx.appcompat.widget;

import android.transition.Transition;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class o0O00o0 {
    public static void OooO00o(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void OooO0O0(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}