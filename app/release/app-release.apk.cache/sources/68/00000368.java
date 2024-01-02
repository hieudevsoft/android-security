package androidx.fragment.app;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o000O0o implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2922OooO00o = 2;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f2923OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f2924OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ Object f2925OooO0Oo;

    public o000O0o(OooOOO oooOOO, ArrayList arrayList, o00O0000 o00o0000) {
        this.f2925OooO0Oo = oooOOO;
        this.f2923OooO0O0 = arrayList;
        this.f2924OooO0OO = o00o0000;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2922OooO00o;
        Object obj = this.f2925OooO0Oo;
        Object obj2 = this.f2924OooO0OO;
        Object obj3 = this.f2923OooO0O0;
        switch (i) {
            case 0:
                ((o000000O) obj3).OooO0OO((o00Oo0) obj2, (OooOoOO.o000000) obj);
                return;
            case 1:
                ((o000000O) obj3).OooO0OO((o00Oo0) obj2, (OooOoOO.o000000) obj);
                return;
            default:
                List list = (List) obj3;
                o00O0000 o00o0000 = (o00O0000) obj2;
                if (list.contains(o00o0000)) {
                    list.remove(o00o0000);
                    ((OooOOO) obj).getClass();
                    o00o0000.f2941OooO00o.OooO00o(o00o0000.f2943OooO0OO.f2979OooOooo);
                    return;
                }
                return;
        }
    }
}