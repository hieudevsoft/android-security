package o0000o0o;

import OooOoo.o0ooOOo;
import java.io.IOException;
import o0000O00.OooO00o;
import o0000o.OooOOO0;
import o000O000.o0OoOo0;

/* loaded from: classes.dex */
public final class o00000OO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0000O0 f4507OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0ooOOo f4508OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o0000Ooo f4509OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final OooOOO0 f4510OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f4511OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f4512OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final o000OO f4513OooO0oO;

    public o00000OO(o0000O0 o0000o02, o0ooOOo o0ooooo, o0000Ooo o0000ooo, OooOOO0 oooOOO0) {
        OooO00o.OooOoo0(o0ooooo, "eventListener");
        this.f4507OooO00o = o0000o02;
        this.f4508OooO0O0 = o0ooooo;
        this.f4509OooO0OO = o0000ooo;
        this.f4510OooO0Oo = oooOOO0;
        this.f4513OooO0oO = oooOOO0.OooO0oo();
    }

    public final IOException OooO00o(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            OooO0Oo(iOException);
        }
        o0ooOOo o0ooooo = this.f4508OooO0O0;
        o0000O0 o0000o02 = this.f4507OooO00o;
        if (z2) {
            o0ooooo.getClass();
            if (iOException != null) {
                OooO00o.OooOoo0(o0000o02, "call");
            } else {
                OooO00o.OooOoo0(o0000o02, "call");
            }
        }
        if (z) {
            if (iOException != null) {
                o0ooooo.getClass();
                OooO00o.OooOoo0(o0000o02, "call");
            } else {
                o0ooooo.getClass();
                OooO00o.OooOoo0(o0000o02, "call");
            }
        }
        return o0000o02.OooO0oo(this, z2, z, iOException);
    }

    public final o0000Oo.o00000O0 OooO0O0(o0000Oo.o00000 o00000Var) {
        OooOOO0 oooOOO0 = this.f4510OooO0Oo;
        try {
            String OooOo2 = o0000Oo.o00000.OooOo(o00000Var, "Content-Type");
            long OooO00o2 = oooOOO0.OooO00o(o00000Var);
            return new o0000Oo.o00000O0(OooOo2, OooO00o2, new o0OoOo0(new o00000O(this, oooOOO0.OooO0Oo(o00000Var), OooO00o2)));
        } catch (IOException e) {
            this.f4508OooO0O0.getClass();
            OooO00o.OooOoo0(this.f4507OooO00o, "call");
            OooO0Oo(e);
            throw e;
        }
    }

    public final o0000Oo.o000000O OooO0OO(boolean z) {
        try {
            o0000Oo.o000000O OooO0o02 = this.f4510OooO0Oo.OooO0o0(z);
            if (OooO0o02 != null) {
                OooO0o02.OooOOO0 = this;
            }
            return OooO0o02;
        } catch (IOException e) {
            this.f4508OooO0O0.getClass();
            OooO00o.OooOoo0(this.f4507OooO00o, "call");
            OooO0Oo(e);
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r6 > 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0Oo(java.io.IOException r6) {
        /*
            r5 = this;
            r0 = 1
            r5.f4511OooO0o = r0
            o0000o0o.o0000Ooo r1 = r5.f4509OooO0OO
            r1.OooO0OO(r6)
            o0000o.OooOOO0 r1 = r5.f4510OooO0Oo
            o0000o0o.o000OO r1 = r1.OooO0oo()
            o0000o0o.o0000O0 r2 = r5.f4507OooO00o
            monitor-enter(r1)
            java.lang.String r3 = "call"
            o0000O00.OooO00o.OooOoo0(r2, r3)     // Catch: java.lang.Throwable -> L5b
            boolean r3 = r6 instanceof o0000oOO.o0000OO0     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L3a
            r3 = r6
            o0000oOO.o0000OO0 r3 = (o0000oOO.o0000OO0) r3     // Catch: java.lang.Throwable -> L5b
            o0000oOO.OooOo r3 = r3.f4685OooO00o     // Catch: java.lang.Throwable -> L5b
            o0000oOO.OooOo r4 = o0000oOO.OooOo.REFUSED_STREAM     // Catch: java.lang.Throwable -> L5b
            if (r3 != r4) goto L2d
            int r6 = r1.f4561OooOOO     // Catch: java.lang.Throwable -> L5b
            int r6 = r6 + r0
            r1.f4561OooOOO = r6     // Catch: java.lang.Throwable -> L5b
            if (r6 <= r0) goto L59
        L2a:
            r1.f4558OooOO0 = r0     // Catch: java.lang.Throwable -> L5b
            goto L54
        L2d:
            o0000oOO.o0000OO0 r6 = (o0000oOO.o0000OO0) r6     // Catch: java.lang.Throwable -> L5b
            o0000oOO.OooOo r6 = r6.f4685OooO00o     // Catch: java.lang.Throwable -> L5b
            o0000oOO.OooOo r3 = o0000oOO.OooOo.CANCEL     // Catch: java.lang.Throwable -> L5b
            if (r6 != r3) goto L2a
            boolean r6 = r2.f4533OooOOOo     // Catch: java.lang.Throwable -> L5b
            if (r6 != 0) goto L59
            goto L2a
        L3a:
            o0000oOO.o000000O r3 = r1.f4556OooO0oO     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L40
            r3 = r0
            goto L41
        L40:
            r3 = 0
        L41:
            if (r3 == 0) goto L47
            boolean r3 = r6 instanceof o0000oOO.OooOo00     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L59
        L47:
            r1.f4558OooOO0 = r0     // Catch: java.lang.Throwable -> L5b
            int r3 = r1.OooOOO0     // Catch: java.lang.Throwable -> L5b
            if (r3 != 0) goto L59
            o0000Oo.oo0o0Oo r2 = r2.f4520OooO00o     // Catch: java.lang.Throwable -> L5b
            o0000Oo.o00000OO r3 = r1.f4551OooO0O0     // Catch: java.lang.Throwable -> L5b
            o0000o0o.o000OO.OooO0Oo(r2, r3, r6)     // Catch: java.lang.Throwable -> L5b
        L54:
            int r6 = r1.f4560OooOO0o     // Catch: java.lang.Throwable -> L5b
            int r6 = r6 + r0
            r1.f4560OooOO0o = r6     // Catch: java.lang.Throwable -> L5b
        L59:
            monitor-exit(r1)
            return
        L5b:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000o0o.o00000OO.OooO0Oo(java.io.IOException):void");
    }
}