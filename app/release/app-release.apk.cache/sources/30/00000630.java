package o000O000;

import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class OooOo implements o0ooOOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOO0 f4829OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Inflater f4830OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f4831OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f4832OooO0Oo;

    public OooOo(o0OoOo0 o0oooo0, Inflater inflater) {
        this.f4829OooO00o = o0oooo0;
        this.f4830OooO0O0 = inflater;
    }

    @Override // o000O000.o0ooOOo
    public final o0Oo0oo OooO00o() {
        return this.f4829OooO00o.OooO00o();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c A[SYNTHETIC] */
    @Override // o000O000.o0ooOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooO0o0(o000O000.OooOO0 r10, long r11) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o000O000.OooOo.OooO0o0(o000O000.OooOO0, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4832OooO0Oo) {
            return;
        }
        this.f4830OooO0O0.end();
        this.f4832OooO0Oo = true;
        this.f4829OooO00o.close();
    }
}