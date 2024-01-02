package OooO0oo;

import OooO0O0.OooO0O0;

/* loaded from: classes.dex */
public final class o00OOO0 extends OooO0O0 {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static volatile o00OOO0 f496OooO0O0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0o0Oo f497OooO00o = new o0o0Oo();

    public static o00OOO0 OooOOo0() {
        if (f496OooO0O0 != null) {
            return f496OooO0O0;
        }
        synchronized (o00OOO0.class) {
            if (f496OooO0O0 == null) {
                f496OooO0O0 = new o00OOO0();
            }
        }
        return f496OooO0O0;
    }

    public final boolean OooOOo() {
        return this.f497OooO00o.OooOOo0();
    }
}