package androidx.activity;

import androidx.fragment.app.o00000;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o00O0O extends o000OO.OooOO0 implements o0000O0O.OooO00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1953OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f1954OooO0O0;

    public /* synthetic */ o00O0O(o0Oo0oo o0oo0oo, int i) {
        this.f1953OooO00o = i;
        this.f1954OooO0O0 = o0oo0oo;
    }

    @Override // o0000O0O.OooO00o
    public final /* bridge */ /* synthetic */ Object OooO00o() {
        o00000oo.o00Ooo o00ooo2 = o00000oo.o00Ooo.f4105OooO00o;
        switch (this.f1953OooO00o) {
            case 0:
                OooO0OO();
                return o00ooo2;
            case 1:
                OooO0OO();
                return o00ooo2;
            default:
                OooO0OO();
                return o00ooo2;
        }
    }

    public final void OooO0OO() {
        Object obj;
        int i = this.f1953OooO00o;
        o0Oo0oo o0oo0oo = this.f1954OooO0O0;
        switch (i) {
            case 0:
                o0oo0oo.OooO0O0();
                return;
            case 1:
                o0000.OooOOO oooOOO = o0oo0oo.f1961OooO0O0;
                oooOOO.getClass();
                ListIterator listIterator = oooOOO.listIterator(oooOOO.f3963OooO0OO);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((o00000) obj).f2815OooO00o) {
                        }
                    } else {
                        obj = null;
                    }
                }
                o00000 o00000Var = (o00000) obj;
                o0oo0oo.f1962OooO0OO = null;
                return;
            default:
                o0oo0oo.OooO0O0();
                return;
        }
    }
}