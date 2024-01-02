package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class o00O00o0 {
    public abstract void OooO00o(StaticLayout.Builder builder, TextView textView);

    public boolean OooO0O0(TextView textView) {
        Object obj = Boolean.FALSE;
        try {
            obj = oo00o.OooO0Oo("getHorizontallyScrolling").invoke(textView, new Object[0]);
        } catch (Exception unused) {
        }
        return ((Boolean) obj).booleanValue();
    }
}