package o0000oOO;

import java.io.IOException;
import o0000O00.OooO00o;
import o000O000.OooOO0;

/* loaded from: classes.dex */
public final class o0OO00O extends o0000o0O.o0Oo0oo {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ int f4735OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ o000000O f4736OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final /* synthetic */ OooOO0 f4737OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final /* synthetic */ int f4738OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(String str, o000000O o000000o2, int i, OooOO0 oooOO0, int i2, boolean z) {
        super(str, true);
        this.f4736OooO0o0 = o000000o2;
        this.f4735OooO0o = i;
        this.f4737OooO0oO = oooOO0;
        this.f4738OooO0oo = i2;
    }

    @Override // o0000o0O.o0Oo0oo
    public final long OooO00o() {
        try {
            OooOoo.o0ooOOo o0ooooo = this.f4736OooO0o0.f4645OooOO0o;
            OooOO0 oooOO0 = this.f4737OooO0oO;
            int i = this.f4738OooO0oo;
            o0ooooo.getClass();
            OooO00o.OooOoo0(oooOO0, "source");
            oooOO0.OooOOO(i);
            this.f4736OooO0o0.f4658OooOoO0.OooOoo(this.f4735OooO0o, OooOo.CANCEL);
            synchronized (this.f4736OooO0o0) {
                this.f4736OooO0o0.f4659OooOoOO.remove(Integer.valueOf(this.f4735OooO0o));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}