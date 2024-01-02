package o0000Oo;

import java.util.ArrayList;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o00Ooo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ArrayList f4290OooO00o = new ArrayList(20);

    public final void OooO00o(String str, String str2) {
        OooO00o.OooOoo0(str, "name");
        OooO00o.OooOoo0(str2, "value");
        ArrayList arrayList = this.f4290OooO00o;
        arrayList.add(str);
        arrayList.add(o0000Oo0.OooOOOO.o00O0oOo(str2).toString());
    }

    public final oo000o OooO0O0() {
        return new oo000o((String[]) this.f4290OooO00o.toArray(new String[0]));
    }

    public final void OooO0OO(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4290OooO00o;
            if (i >= arrayList.size()) {
                return;
            }
            if (o0000Oo0.OooOOOO.oo0o0O0(str, (String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }
}