package Oooo0oO;

import android.widget.EditText;

/* loaded from: classes.dex */
public final class o0oOO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f1507OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f1508OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Object f1509OooO0OO;

    public o0oOO() {
        this.f1509OooO0OO = new o0oOO[256];
        this.f1507OooO00o = 0;
        this.f1508OooO0O0 = 0;
    }

    public o0oOO(int i, int i2) {
        this.f1509OooO0OO = null;
        this.f1507OooO00o = i;
        int i3 = i2 & 7;
        this.f1508OooO0O0 = i3 == 0 ? 8 : i3;
    }

    public o0oOO(EditText editText) {
        this.f1507OooO00o = Integer.MAX_VALUE;
        this.f1508OooO0O0 = 0;
        if (editText == null) {
            throw new NullPointerException("editText cannot be null");
        }
        this.f1509OooO0OO = new o00Oo00(editText);
    }
}