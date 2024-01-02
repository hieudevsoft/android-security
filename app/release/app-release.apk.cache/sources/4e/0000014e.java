package OooOooo;

import OooOO0.OooOOOO;
import android.view.View;
import android.view.autofill.AutofillId;
import hieubui.eup.android_app_security.R;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class o00OO0O0 {
    public static void OooO(View view, AutofillId autofillId) {
        view.setAutofillId(autofillId);
    }

    public static void OooO00o(View view, o00OOO0 o00ooo0) {
        OooOOOO oooOOOO = (OooOOOO) view.getTag(R.id.tag_unhandled_key_listeners);
        if (oooOOOO == null) {
            oooOOOO = new OooOOOO();
            view.setTag(R.id.tag_unhandled_key_listeners, oooOOOO);
        }
        Objects.requireNonNull(o00ooo0);
        View.OnUnhandledKeyEventListener o00oo00o = new o00OO00O();
        oooOOOO.put(o00ooo0, o00oo00o);
        view.addOnUnhandledKeyEventListener(o00oo00o);
    }

    public static CharSequence OooO0O0(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean OooO0OO(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean OooO0Oo(View view) {
        return view.isScreenReaderFocusable();
    }

    public static <T> T OooO0o(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void OooO0o0(View view, o00OOO0 o00ooo0) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        OooOOOO oooOOOO = (OooOOOO) view.getTag(R.id.tag_unhandled_key_listeners);
        if (oooOOOO != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) oooOOOO.getOrDefault(o00ooo0, null)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static void OooO0oO(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void OooO0oo(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void OooOO0(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}