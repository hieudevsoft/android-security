package OooOoo0;

import OooOO0.OooOOOO;
import androidx.appcompat.widget.o0O0O00;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o00000O implements OooOooO.o0000O00 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1247OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f1248OooO0O0;

    public /* synthetic */ o00000O(int i, Object obj) {
        this.f1247OooO00o = i;
        this.f1248OooO0O0 = obj;
    }

    public final void OooO00o(o00000OO o00000oo2) {
        switch (this.f1247OooO00o) {
            case 0:
                if (o00000oo2 == null) {
                    o00000oo2 = new o00000OO(-3);
                }
                ((o0O0O00) this.f1248OooO0O0).OooO0oO(o00000oo2);
                return;
            default:
                synchronized (o0000Ooo.f1259OooO0OO) {
                    OooOOOO oooOOOO = o0000Ooo.f1260OooO0Oo;
                    ArrayList arrayList = (ArrayList) oooOOOO.getOrDefault((String) this.f1248OooO0O0, null);
                    if (arrayList != null) {
                        oooOOOO.remove((String) this.f1248OooO0O0);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((o00000O) ((OooOooO.o0000O00) arrayList.get(i))).OooO0O0(o00000oo2);
                        }
                        return;
                    }
                    return;
                }
        }
    }

    public final /* bridge */ /* synthetic */ void OooO0O0(Object obj) {
        switch (this.f1247OooO00o) {
            case 0:
                OooO00o((o00000OO) obj);
                return;
            default:
                OooO00o((o00000OO) obj);
                return;
        }
    }
}