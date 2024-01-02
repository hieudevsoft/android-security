package androidx.fragment.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o000000O implements androidx.activity.result.OooO0OO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2821OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o0000oo f2822OooO0O0;

    public /* synthetic */ o000000O(o0000oo o0000ooVar, int i) {
        this.f2821OooO00o = i;
        this.f2822OooO0O0 = o0000ooVar;
    }

    public final void OooO00o(androidx.activity.result.OooO0O0 oooO0O0) {
        o00Oo0 OooO0OO2;
        o00Oo0 OooO0OO3;
        int i = this.f2821OooO00o;
        o0000oo o0000ooVar = this.f2822OooO0O0;
        switch (i) {
            case 0:
                o0000Ooo o0000ooo = (o0000Ooo) o0000ooVar.f2887OooOoO0.pollFirst();
                if (o0000ooo != null && (OooO0OO3 = o0000ooVar.f2866OooO0OO.OooO0OO(o0000ooo.f2861OooO00o)) != null) {
                    int i2 = oooO0O0.f1978OooO00o;
                    if (o0000oo.OooOooo(2)) {
                        OooO0OO3.toString();
                        Objects.toString(oooO0O0.f1979OooO0O0);
                        return;
                    }
                    return;
                }
                return;
            default:
                o0000Ooo o0000ooo2 = (o0000Ooo) o0000ooVar.f2887OooOoO0.pollFirst();
                if (o0000ooo2 != null && (OooO0OO2 = o0000ooVar.f2866OooO0OO.OooO0OO(o0000ooo2.f2861OooO00o)) != null) {
                    int i3 = oooO0O0.f1978OooO00o;
                    if (o0000oo.OooOooo(2)) {
                        OooO0OO2.toString();
                        Objects.toString(oooO0O0.f1979OooO0O0);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void OooO0O0(Object obj) {
        int i;
        switch (this.f2821OooO00o) {
            case 0:
                OooO00o((androidx.activity.result.OooO0O0) obj);
                return;
            case 1:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (((Boolean) arrayList.get(i2)).booleanValue()) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    iArr[i2] = i;
                }
                o0000oo o0000ooVar = this.f2822OooO0O0;
                o0000Ooo o0000ooo = (o0000Ooo) o0000ooVar.f2887OooOoO0.pollFirst();
                if (o0000ooo != null) {
                    o0000ooVar.f2866OooO0OO.OooO0OO(o0000ooo.f2861OooO00o);
                    return;
                }
                return;
            default:
                OooO00o((androidx.activity.result.OooO0O0) obj);
                return;
        }
    }

    public final void OooO0OO(o00Oo0 o00oo0, OooOoOO.o000000 o000000Var) {
        boolean z;
        synchronized (o000000Var) {
            z = o000000Var.f1202OooO00o;
        }
        if (!z) {
            o0000oo o0000ooVar = this.f2822OooO0O0;
            Map map = o0000ooVar.f2873OooOO0O;
            HashSet hashSet = (HashSet) map.get(o00oo0);
            if (hashSet != null && hashSet.remove(o000000Var) && hashSet.isEmpty()) {
                map.remove(o00oo0);
                if (o00oo0.f2951OooO00o < 5) {
                    o00oo0.OooOoOO();
                    o0000ooVar.OooOOO0.OooOOOO(false);
                    o00oo0.f2978OooOooO = null;
                    o00oo0.f2979OooOooo = null;
                    o00oo0.f2989Oooo0oO = null;
                    o00oo0.f2990Oooo0oo.OooO0o0(null);
                    o00oo0.f2962OooOOO = false;
                    o0000ooVar.Oooo0(o0000ooVar.f2876OooOOOO, o00oo0);
                }
            }
        }
    }

    public final void OooO0Oo(o00Oo0 o00oo0, OooOoOO.o000000 o000000Var) {
        Map map = this.f2822OooO0O0.f2873OooOO0O;
        if (map.get(o00oo0) == null) {
            map.put(o00oo0, new HashSet());
        }
        ((HashSet) map.get(o00oo0)).add(o000000Var);
    }
}