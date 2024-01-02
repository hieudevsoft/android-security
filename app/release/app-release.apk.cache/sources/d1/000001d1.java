package Oooo0oO;

import android.text.Editable;
import androidx.emoji2.text.o0OO00O;

/* loaded from: classes.dex */
public final class o0O00o0 extends Editable.Factory {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final Object f1501OooO00o = new Object();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static volatile o0O00o0 f1502OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static Class f1503OooO0OO;

    public o0O00o0() {
        try {
            f1503OooO0OO = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, o0O00o0.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f1503OooO0OO;
        if (cls != null) {
            return new o0OO00O(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}