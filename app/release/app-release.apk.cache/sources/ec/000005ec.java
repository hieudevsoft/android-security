package o0000oOO;

import o0000OoO.OooOO0O;
import o000O000.OooOO0;

/* loaded from: classes.dex */
public final class o0000 implements o000O000.o0ooOOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final long f4616OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f4617OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final OooOO0 f4618OooO0OO = new OooOO0();

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final OooOO0 f4619OooO0Oo = new OooOO0();

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ o0000oo f4620OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f4621OooO0o0;

    public o0000(o0000oo o0000ooVar, long j, boolean z) {
        this.f4620OooO0o = o0000ooVar;
        this.f4616OooO00o = j;
        this.f4617OooO0O0 = z;
    }

    @Override // o000O000.o0ooOOo
    public final o000O000.o0Oo0oo OooO00o() {
        return this.f4620OooO0o.f4700OooOO0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0094 A[LOOP:0: B:7:0x0018->B:50:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0097 A[SYNTHETIC] */
    @Override // o000O000.o0ooOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooO0o0(o000O000.OooOO0 r17, long r18) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000oOO.o0000.OooO0o0(o000O000.OooOO0, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        o0000oo o0000ooVar = this.f4620OooO0o;
        synchronized (o0000ooVar) {
            this.f4621OooO0o0 = true;
            OooOO0 oooOO0 = this.f4619OooO0Oo;
            j = oooOO0.f4823OooO0O0;
            oooOO0.OooOOO(j);
            o0000ooVar.notifyAll();
        }
        if (j > 0) {
            byte[] bArr = OooOO0O.f4403OooO00o;
            this.f4620OooO0o.f4692OooO0O0.OooOoo(j);
        }
        this.f4620OooO0o.OooO00o();
    }
}