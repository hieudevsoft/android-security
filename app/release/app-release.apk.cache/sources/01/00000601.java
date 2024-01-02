package o0000oOO;

import java.io.IOException;
import java.util.List;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o0O0O00 extends o0000o0O.o0Oo0oo {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ o000000O f4731OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ int f4732OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final /* synthetic */ int f4733OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final /* synthetic */ Object f4734OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0O0O00(String str, o000000O o000000o2, int i, Object obj, int i2) {
        super(str, true);
        this.f4732OooO0o0 = i2;
        this.f4731OooO0o = o000000o2;
        this.f4733OooO0oO = i;
        this.f4734OooO0oo = obj;
    }

    @Override // o0000o0O.o0Oo0oo
    public final long OooO00o() {
        switch (this.f4732OooO0o0) {
            case 0:
                this.f4731OooO0o.f4645OooOO0o.getClass();
                OooO00o.OooOoo0((OooOo) this.f4734OooO0oo, "errorCode");
                synchronized (this.f4731OooO0o) {
                    this.f4731OooO0o.f4659OooOoOO.remove(Integer.valueOf(this.f4733OooO0oO));
                }
                return -1L;
            case 1:
                o000000O o000000o2 = this.f4731OooO0o;
                try {
                    int i = this.f4733OooO0oO;
                    OooOo oooOo = (OooOo) this.f4734OooO0oo;
                    o000000o2.getClass();
                    OooO00o.OooOoo0(oooOo, "statusCode");
                    o000000o2.f4658OooOoO0.OooOoo(i, oooOo);
                } catch (IOException e) {
                    o000000o2.OooOoO0(e);
                }
                return -1L;
            default:
                this.f4731OooO0o.f4645OooOO0o.getClass();
                OooO00o.OooOoo0((List) this.f4734OooO0oo, "requestHeaders");
                try {
                    this.f4731OooO0o.f4658OooOoO0.OooOoo(this.f4733OooO0oO, OooOo.CANCEL);
                    synchronized (this.f4731OooO0o) {
                        this.f4731OooO0o.f4659OooOoOO.remove(Integer.valueOf(this.f4733OooO0oO));
                    }
                } catch (IOException unused) {
                }
                return -1L;
        }
    }
}