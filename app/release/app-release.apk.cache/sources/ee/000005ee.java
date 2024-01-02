package o0000oOO;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o000000 extends o0000o0O.o0Oo0oo {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ int f4630OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ o000000O f4631OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final /* synthetic */ long f4632OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(String str, o000000O o000000o2, int i, long j) {
        super(str, true);
        this.f4631OooO0o0 = o000000o2;
        this.f4630OooO0o = i;
        this.f4632OooO0oO = j;
    }

    @Override // o0000o0O.o0Oo0oo
    public final long OooO00o() {
        o000000O o000000o2 = this.f4631OooO0o0;
        try {
            o000000o2.f4658OooOoO0.OooOooO(this.f4630OooO0o, this.f4632OooO0oO);
            return -1L;
        } catch (IOException e) {
            o000000o2.OooOoO0(e);
            return -1L;
        }
    }
}