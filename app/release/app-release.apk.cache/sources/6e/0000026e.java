package androidx.activity;

import androidx.fragment.app.o00000;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o0OoOo0 extends o000OO.OooOO0 implements o0000O0O.OooOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1967OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f1968OooO0O0;

    public /* synthetic */ o0OoOo0(o0Oo0oo o0oo0oo, int i) {
        this.f1967OooO00o = i;
        this.f1968OooO0O0 = o0oo0oo;
    }

    @Override // o0000O0O.OooOo
    public final /* bridge */ /* synthetic */ Object OooO0O0(Object obj) {
        o00000oo.o00Ooo o00ooo2 = o00000oo.o00Ooo.f4105OooO00o;
        switch (this.f1967OooO00o) {
            case 0:
                OooO0OO((OooO0O0) obj);
                return o00ooo2;
            default:
                OooO0OO((OooO0O0) obj);
                return o00ooo2;
        }
    }

    public final void OooO0OO(OooO0O0 oooO0O0) {
        int i = this.f1967OooO00o;
        Object obj = null;
        o0Oo0oo o0oo0oo = this.f1968OooO0O0;
        switch (i) {
            case 0:
                o0000O00.OooO00o.OooOoo0(oooO0O0, "backEvent");
                o0000.OooOOO oooOOO = o0oo0oo.f1961OooO0O0;
                oooOOO.getClass();
                ListIterator listIterator = oooOOO.listIterator(oooOOO.f3963OooO0OO);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((o00000) previous).f2815OooO00o) {
                            obj = previous;
                        }
                    }
                }
                o0oo0oo.f1962OooO0OO = (o00000) obj;
                return;
            default:
                o0000O00.OooO00o.OooOoo0(oooO0O0, "backEvent");
                o0000.OooOOO oooOOO2 = o0oo0oo.f1961OooO0O0;
                oooOOO2.getClass();
                ListIterator listIterator2 = oooOOO2.listIterator(oooOOO2.f3963OooO0OO);
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        Object previous2 = listIterator2.previous();
                        if (((o00000) previous2).f2815OooO00o) {
                            obj = previous2;
                        }
                    }
                }
                o00000 o00000Var = (o00000) obj;
                return;
        }
    }
}