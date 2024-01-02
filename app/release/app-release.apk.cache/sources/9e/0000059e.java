package o0000Oo;

import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o000000O {

    /* renamed from: OooO  reason: collision with root package name */
    public o00000 f4253OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public androidx.appcompat.widget.o0OOO0o f4254OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public o0O0O00 f4255OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f4256OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public String f4257OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public o00Ooo f4258OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public o00Oo0 f4259OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public o00000O f4260OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public o00000 f4261OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public o00000 f4262OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public long f4263OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public long f4264OooOO0o;
    public o0000o0o.o00000OO OooOOO0;

    public o000000O() {
        this.f4256OooO0OO = -1;
        this.f4258OooO0o = new o00Ooo();
    }

    public static void OooO0O0(String str, o00000 o00000Var) {
        if (o00000Var != null) {
            if (!(o00000Var.f4244OooO0oO == null)) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (!(o00000Var.f4245OooO0oo == null)) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (!(o00000Var.f4237OooO == null)) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (!(o00000Var.f4246OooOO0 == null)) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final o00000 OooO00o() {
        int i = this.f4256OooO0OO;
        if (i >= 0) {
            androidx.appcompat.widget.o0OOO0o o0ooo0o = this.f4254OooO00o;
            if (o0ooo0o != null) {
                o0O0O00 o0o0o00 = this.f4255OooO0O0;
                if (o0o0o00 != null) {
                    String str = this.f4257OooO0Oo;
                    if (str != null) {
                        return new o00000(o0ooo0o, o0o0o00, str, i, this.f4259OooO0o0, this.f4258OooO0o.OooO0O0(), this.f4260OooO0oO, this.f4261OooO0oo, this.f4253OooO, this.f4262OooOO0, this.f4263OooOO0O, this.f4264OooOO0o, this.OooOOO0);
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }
        throw new IllegalStateException(("code < 0: " + this.f4256OooO0OO).toString());
    }

    public o000000O(o00000 o00000Var) {
        OooO00o.OooOoo0(o00000Var, "response");
        this.f4254OooO00o = o00000Var.f4238OooO00o;
        this.f4255OooO0O0 = o00000Var.f4239OooO0O0;
        this.f4256OooO0OO = o00000Var.f4241OooO0Oo;
        this.f4257OooO0Oo = o00000Var.f4240OooO0OO;
        this.f4259OooO0o0 = o00000Var.f4243OooO0o0;
        this.f4258OooO0o = o00000Var.f4242OooO0o.OooO0oo();
        this.f4260OooO0oO = o00000Var.f4244OooO0oO;
        this.f4261OooO0oo = o00000Var.f4245OooO0oo;
        this.f4253OooO = o00000Var.f4237OooO;
        this.f4262OooOO0 = o00000Var.f4246OooOO0;
        this.f4263OooOO0O = o00000Var.f4247OooOO0O;
        this.f4264OooOO0o = o00000Var.f4248OooOO0o;
        this.OooOOO0 = o00000Var.OooOOO0;
    }
}