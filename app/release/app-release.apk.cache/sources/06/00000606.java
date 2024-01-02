package o0000oOO;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o0ooOOo extends o0000o0O.o0Oo0oo {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ int f4746OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ o000000O f4747OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final /* synthetic */ int f4748OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(String str, o000000O o000000o2, int i, int i2) {
        super(str, true);
        this.f4747OooO0o0 = o000000o2;
        this.f4746OooO0o = i;
        this.f4748OooO0oO = i2;
    }

    @Override // o0000o0O.o0Oo0oo
    public final long OooO00o() {
        int i = this.f4746OooO0o;
        int i2 = this.f4748OooO0oO;
        o000000O o000000o2 = this.f4747OooO0o0;
        o000000o2.getClass();
        try {
            o000000o2.f4658OooOoO0.OooOoo0(i, i2, true);
            return -1L;
        } catch (IOException e) {
            o000000o2.OooOoO0(e);
            return -1L;
        }
    }
}