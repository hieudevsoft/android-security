package o0000oOO;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o000OOo extends o0000o0O.o0Oo0oo {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ long f4704OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ o000000O f4705OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(String str, o000000O o000000o2, long j) {
        super(str, true);
        this.f4705OooO0o0 = o000000o2;
        this.f4704OooO0o = j;
    }

    @Override // o0000o0O.o0Oo0oo
    public final long OooO00o() {
        o000000O o000000o2;
        boolean z;
        synchronized (this.f4705OooO0o0) {
            o000000o2 = this.f4705OooO0o0;
            long j = o000000o2.f4646OooOOO;
            long j2 = o000000o2.OooOOO0;
            if (j < j2) {
                z = true;
            } else {
                o000000o2.OooOOO0 = j2 + 1;
                z = false;
            }
        }
        if (z) {
            o000000o2.OooOoO0(null);
            return -1L;
        }
        try {
            o000000o2.f4658OooOoO0.OooOoo0(1, 0, false);
        } catch (IOException e) {
            o000000o2.OooOoO0(e);
        }
        return this.f4704OooO0o;
    }
}