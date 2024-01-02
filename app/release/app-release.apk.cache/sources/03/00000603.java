package o0000oOO;

import java.io.IOException;
import o0000O00.OooO00o;
import o000OO.OooOOO0;

/* loaded from: classes.dex */
public final class o0OOO0o extends o0000o0O.o0Oo0oo {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ boolean f4739OooO0o = false;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f4740OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final /* synthetic */ o0000O f4741OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(String str, o0Oo0oo o0oo0oo, o0000O o0000o2) {
        super(str, true);
        this.f4740OooO0o0 = o0oo0oo;
        this.f4741OooO0oO = o0000o2;
    }

    @Override // o0000o0O.o0Oo0oo
    public final long OooO00o() {
        int i;
        boolean z;
        long OooO00o2;
        int i2;
        o0000oo[] o0000ooVarArr;
        o0Oo0oo o0oo0oo = this.f4740OooO0o0;
        boolean z2 = this.f4739OooO0o;
        o0000O o0000o2 = this.f4741OooO0oO;
        o0oo0oo.getClass();
        OooO00o.OooOoo0(o0000o2, "settings");
        OooOOO0 oooOOO0 = new OooOOO0();
        o000000O o000000o2 = o0oo0oo.f4743OooO0O0;
        synchronized (o000000o2.f4658OooOoO0) {
            synchronized (o000000o2) {
                o0000O o0000o3 = o000000o2.f4651OooOOoo;
                if (!z2) {
                    o0000O o0000o4 = new o0000O();
                    OooO00o.OooOoo0(o0000o3, "other");
                    int i3 = 0;
                    while (true) {
                        boolean z3 = true;
                        if (i3 >= 10) {
                            break;
                        }
                        if (((1 << i3) & o0000o3.f4673OooO00o) == 0) {
                            z3 = false;
                        }
                        if (z3) {
                            o0000o4.OooO0O0(i3, o0000o3.f4674OooO0O0[i3]);
                        }
                        i3++;
                    }
                    for (int i4 = 0; i4 < 10; i4++) {
                        if (((1 << i4) & o0000o2.f4673OooO00o) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            o0000o4.OooO0O0(i4, o0000o2.f4674OooO0O0[i4]);
                        }
                    }
                    o0000o2 = o0000o4;
                }
                oooOOO0.f4875OooO00o = o0000o2;
                OooO00o2 = o0000o2.OooO00o() - o0000o3.OooO00o();
                i2 = (OooO00o2 > 0L ? 1 : (OooO00o2 == 0L ? 0 : -1));
                if (i2 != 0 && !o000000o2.f4637OooO0OO.isEmpty()) {
                    o0000ooVarArr = (o0000oo[]) o000000o2.f4637OooO0OO.values().toArray(new o0000oo[0]);
                    o0000O o0000o5 = oooOOO0.f4875OooO00o;
                    OooO00o.OooOoo0(o0000o5, "<set-?>");
                    o000000o2.f4651OooOOoo = o0000o5;
                    o000000o2.f4644OooOO0O.OooO0OO(new o00oO0o(o000000o2.f4638OooO0Oo + " onSettings", o000000o2, oooOOO0, 0), 0L);
                }
                o0000ooVarArr = null;
                o0000O o0000o52 = oooOOO0.f4875OooO00o;
                OooO00o.OooOoo0(o0000o52, "<set-?>");
                o000000o2.f4651OooOOoo = o0000o52;
                o000000o2.f4644OooOO0O.OooO0OO(new o00oO0o(o000000o2.f4638OooO0Oo + " onSettings", o000000o2, oooOOO0, 0), 0L);
            }
            try {
                o000000o2.f4658OooOoO0.OooOo(oooOOO0.f4875OooO00o);
            } catch (IOException e) {
                o000000o2.OooOoO0(e);
            }
        }
        if (o0000ooVarArr != null) {
            for (o0000oo o0000ooVar : o0000ooVarArr) {
                synchronized (o0000ooVar) {
                    o0000ooVar.f4695OooO0o += OooO00o2;
                    if (i2 > 0) {
                        o0000ooVar.notifyAll();
                    }
                }
            }
            return -1L;
        }
        return -1L;
    }
}