package o0000oO0;

import java.util.ArrayList;
import o0000O00.OooO00o;
import o0000Oo.oo000o;
import o0000Oo0.OooOOOO;
import o000O000.OooOOO0;

/* loaded from: classes.dex */
public final class OooOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOO0 f4566OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public long f4567OooO0O0 = 262144;

    public OooOo(OooOOO0 oooOOO0) {
        this.f4566OooO00o = oooOOO0;
    }

    public final oo000o OooO00o() {
        boolean z;
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String OooOO0o2 = this.f4566OooO00o.OooOO0o(this.f4567OooO0O0);
            this.f4567OooO0O0 -= OooOO0o2.length();
            if (OooOO0o2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int o00O0OOo = OooOOOO.o00O0OOo(OooOO0o2, ':', 1, false, 4);
                if (o00O0OOo != -1) {
                    String substring = OooOO0o2.substring(0, o00O0OOo);
                    OooO00o.OooOoOO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    OooOO0o2 = OooOO0o2.substring(o00O0OOo + 1);
                    OooO00o.OooOoOO(OooOO0o2, "this as java.lang.String).substring(startIndex)");
                    arrayList.add(substring);
                } else {
                    if (OooOO0o2.charAt(0) == ':') {
                        OooOO0o2 = OooOO0o2.substring(1);
                        OooO00o.OooOoOO(OooOO0o2, "this as java.lang.String).substring(startIndex)");
                    }
                    arrayList.add("");
                }
                arrayList.add(OooOOOO.o00O0oOo(OooOO0o2).toString());
            } else {
                return new oo000o((String[]) arrayList.toArray(new String[0]));
            }
        }
    }
}