package o0000Oo;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class o00000 implements Closeable {

    /* renamed from: OooO  reason: collision with root package name */
    public final o00000 f4237OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final androidx.appcompat.widget.o0OOO0o f4238OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0O0O00 f4239OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final String f4240OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f4241OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final oo000o f4242OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final o00Oo0 f4243OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final o00000O f4244OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final o00000 f4245OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final o00000 f4246OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final long f4247OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final long f4248OooOO0o;
    public final o0000o0o.o00000OO OooOOO0;

    public o00000(androidx.appcompat.widget.o0OOO0o o0ooo0o, o0O0O00 o0o0o00, String str, int i, o00Oo0 o00oo0, oo000o oo000oVar, o00000O o00000o, o00000 o00000Var, o00000 o00000Var2, o00000 o00000Var3, long j, long j2, o0000o0o.o00000OO o00000oo2) {
        this.f4238OooO00o = o0ooo0o;
        this.f4239OooO0O0 = o0o0o00;
        this.f4240OooO0OO = str;
        this.f4241OooO0Oo = i;
        this.f4243OooO0o0 = o00oo0;
        this.f4242OooO0o = oo000oVar;
        this.f4244OooO0oO = o00000o;
        this.f4245OooO0oo = o00000Var;
        this.f4237OooO = o00000Var2;
        this.f4246OooOO0 = o00000Var3;
        this.f4247OooOO0O = j;
        this.f4248OooOO0o = j2;
        this.OooOOO0 = o00000oo2;
    }

    public static String OooOo(o00000 o00000Var, String str) {
        o00000Var.getClass();
        String OooO0o2 = o00000Var.f4242OooO0o.OooO0o(str);
        if (OooO0o2 == null) {
            return null;
        }
        return OooO0o2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o00000O o00000o = this.f4244OooO0oO;
        if (o00000o == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        o00000o.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f4239OooO0O0 + ", code=" + this.f4241OooO0Oo + ", message=" + this.f4240OooO0OO + ", url=" + ((o0ooOOo) this.f4238OooO00o.f2519OooO0O0) + '}';
    }
}