package o000oOoO;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class o000OOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o000OO f5026OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f5027OooO0O0 = Integer.MIN_VALUE;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Rect f5028OooO0OO = new Rect();

    public o000OOo(o000OO o000oo) {
        this.f5026OooO00o = o000oo;
    }

    public static o0O0O00 OooO00o(o000OO o000oo, int i) {
        if (i != 0) {
            if (i == 1) {
                return new o0O0O00(o000oo, 1);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new o0O0O00(o000oo, 0);
    }

    public abstract int OooO();

    public abstract int OooO0O0(View view);

    public abstract int OooO0OO(View view);

    public abstract int OooO0Oo(View view);

    public abstract int OooO0o();

    public abstract int OooO0o0();

    public abstract int OooO0oO();

    public abstract int OooO0oo();

    public abstract int OooOO0(View view);

    public abstract int OooOO0O(View view);

    public abstract void OooOO0o(int i);
}