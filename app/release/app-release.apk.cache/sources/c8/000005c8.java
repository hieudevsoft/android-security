package o0000o0;

import OooOoo.o0ooOOo;
import java.util.ArrayList;
import o0000O00.OooO00o;
import o0000Oo.OooOO0;
import o0000Oo.OooOOOO;
import o0000Oo.o00000;
import o0000Oo.o000000O;
import o0000Oo.o00000O;
import o0000Oo.o0O0O00;
import o0000Oo.o0OOO0o;
import o0000Oo.oo000o;
import o0000OoO.OooOO0O;
import o0000o0o.o0000O0;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public final class OooO0O0 implements o0OOO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final /* synthetic */ int f4451OooO00o = 0;

    static {
        new OooOOOO(14, 0);
    }

    @Override // o0000Oo.o0OOO0o
    public final o00000 OooO00o(o0000o.OooOOOO oooOOOO) {
        o0000O0 o0000o02;
        String str;
        boolean z;
        oo000o oo000oVar;
        boolean z2;
        String str2;
        boolean z3;
        System.currentTimeMillis();
        androidx.appcompat.widget.o0OOO0o o0ooo0o = oooOOOO.f4444OooO0o0;
        OooO00o.OooOoo0(o0ooo0o, "request");
        OooO0OO oooO0OO = new OooO0OO(o0ooo0o, null);
        OooOO0 oooOO0 = (OooOO0) o0ooo0o.f2524OooO0oO;
        if (oooOO0 == null) {
            int i = OooOO0.f4179OooOOO;
            oooOO0 = OooOOO0.OooOOoo((oo000o) o0ooo0o.f2521OooO0Oo);
            o0ooo0o.f2524OooO0oO = oooOO0;
        }
        if (oooOO0.f4189OooOO0) {
            oooO0OO = new OooO0OO(null, null);
        }
        o0000O0 o0000o03 = oooOOOO.f4439OooO00o;
        if (o0000o03 instanceof o0000O0) {
            o0000o02 = o0000o03;
        } else {
            o0000o02 = null;
        }
        if (o0000o02 != null) {
            o0ooOOo o0ooooo = o0000o02.f4525OooO0o0;
        }
        androidx.appcompat.widget.o0OOO0o o0ooo0o2 = oooO0OO.f4452OooO00o;
        o00000 o00000Var = oooO0OO.f4453OooO0O0;
        if (o0ooo0o2 == null && o00000Var == null) {
            o000000O o000000o2 = new o000000O();
            o000000o2.f4254OooO00o = o0ooo0o;
            o000000o2.f4255OooO0O0 = o0O0O00.f4300OooO0OO;
            o000000o2.f4256OooO0OO = 504;
            o000000o2.f4257OooO0Oo = "Unsatisfiable Request (only-if-cached)";
            o000000o2.f4260OooO0oO = OooOO0O.f4405OooO0OO;
            o000000o2.f4263OooOO0O = -1L;
            o000000o2.f4264OooOO0o = System.currentTimeMillis();
            o00000 OooO00o2 = o000000o2.OooO00o();
            OooO00o.OooOoo0(o0000o03, "call");
            return OooO00o2;
        } else if (o0ooo0o2 == null) {
            OooO00o.OooOo(o00000Var);
            o000000O o000000o3 = new o000000O(o00000Var);
            o00000 OooO0O02 = OooOOOO.OooO0O0(o00000Var);
            o000000O.OooO0O0("cacheResponse", OooO0O02);
            o000000o3.f4253OooO = OooO0O02;
            o00000 OooO00o3 = o000000o3.OooO00o();
            OooO00o.OooOoo0(o0000o03, "call");
            return OooO00o3;
        } else {
            if (o00000Var != null) {
                OooO00o.OooOoo0(o0000o03, "call");
            }
            o00000 OooO0O03 = oooOOOO.OooO0O0(o0ooo0o2);
            String str3 = "networkResponse";
            if (o00000Var == null) {
                str = "networkResponse";
            } else {
                if (OooO0O03.f4241OooO0Oo == 304) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str = "networkResponse";
                    o00000O o00000o = o00000Var.f4244OooO0oO;
                    if (o00000o != null) {
                        OooOO0O.OooO0OO(o00000o);
                    }
                } else {
                    o000000O o000000o4 = new o000000O(o00000Var);
                    ArrayList arrayList = new ArrayList(20);
                    oo000o oo000oVar2 = o00000Var.f4242OooO0o;
                    int length = oo000oVar2.f4353OooO00o.length / 2;
                    int i2 = 0;
                    while (true) {
                        oo000oVar = OooO0O03.f4242OooO0o;
                        if (i2 >= length) {
                            break;
                        }
                        String OooO0oO2 = oo000oVar2.OooO0oO(i2);
                        int i3 = length;
                        String OooO2 = oo000oVar2.OooO(i2);
                        oo000o oo000oVar3 = oo000oVar2;
                        if (o0000Oo0.OooOOOO.oo0o0O0("Warning", OooO0oO2)) {
                            str2 = str3;
                            if (o0000Oo0.OooOOOO.o00O0o(OooO2, "1", false)) {
                                i2++;
                                length = i3;
                                oo000oVar2 = oo000oVar3;
                                str3 = str2;
                            }
                        } else {
                            str2 = str3;
                        }
                        if (!o0000Oo0.OooOOOO.oo0o0O0("Content-Length", OooO0oO2) && !o0000Oo0.OooOOOO.oo0o0O0("Content-Encoding", OooO0oO2) && !o0000Oo0.OooOOOO.oo0o0O0("Content-Type", OooO0oO2)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3 || !OooOOOO.OooOOO(OooO0oO2) || oo000oVar.OooO0o(OooO0oO2) == null) {
                            OooO00o.OooOoo0(OooO0oO2, "name");
                            OooO00o.OooOoo0(OooO2, "value");
                            arrayList.add(OooO0oO2);
                            arrayList.add(o0000Oo0.OooOOOO.o00O0oOo(OooO2).toString());
                        }
                        i2++;
                        length = i3;
                        oo000oVar2 = oo000oVar3;
                        str3 = str2;
                    }
                    String str4 = str3;
                    int length2 = oo000oVar.f4353OooO00o.length / 2;
                    for (int i4 = 0; i4 < length2; i4++) {
                        String OooO0oO3 = oo000oVar.OooO0oO(i4);
                        if (!o0000Oo0.OooOOOO.oo0o0O0("Content-Length", OooO0oO3) && !o0000Oo0.OooOOOO.oo0o0O0("Content-Encoding", OooO0oO3) && !o0000Oo0.OooOOOO.oo0o0O0("Content-Type", OooO0oO3)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z2 && OooOOOO.OooOOO(OooO0oO3)) {
                            String OooO3 = oo000oVar.OooO(i4);
                            OooO00o.OooOoo0(OooO0oO3, "name");
                            OooO00o.OooOoo0(OooO3, "value");
                            arrayList.add(OooO0oO3);
                            arrayList.add(o0000Oo0.OooOOOO.o00O0oOo(OooO3).toString());
                        }
                    }
                    o000000o4.f4258OooO0o = new oo000o((String[]) arrayList.toArray(new String[0])).OooO0oo();
                    o000000o4.f4263OooOO0O = OooO0O03.f4247OooOO0O;
                    o000000o4.f4264OooOO0o = OooO0O03.f4248OooOO0o;
                    o00000 OooO0O04 = OooOOOO.OooO0O0(o00000Var);
                    o000000O.OooO0O0("cacheResponse", OooO0O04);
                    o000000o4.f4253OooO = OooO0O04;
                    o00000 OooO0O05 = OooOOOO.OooO0O0(OooO0O03);
                    o000000O.OooO0O0(str4, OooO0O05);
                    o000000o4.f4261OooO0oo = OooO0O05;
                    o000000o4.OooO00o();
                    o00000O o00000o2 = OooO0O03.f4244OooO0oO;
                    OooO00o.OooOo(o00000o2);
                    o00000o2.close();
                    OooO00o.OooOo(null);
                    throw null;
                }
            }
            o000000O o000000o5 = new o000000O(OooO0O03);
            o00000 OooO0O06 = OooOOOO.OooO0O0(o00000Var);
            o000000O.OooO0O0("cacheResponse", OooO0O06);
            o000000o5.f4253OooO = OooO0O06;
            o00000 OooO0O07 = OooOOOO.OooO0O0(OooO0O03);
            o000000O.OooO0O0(str, OooO0O07);
            o000000o5.f4261OooO0oo = OooO0O07;
            return o000000o5.OooO00o();
        }
    }
}