package OooOo;

import OooO0Oo.o0000OO0;
import android.content.res.Resources;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class OooOO0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o0000OO0 f1116OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final OooOO0.OooO f1117OooO0O0;

    static {
        boolean z;
        o0000OO0 oooOOO0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            oooOOO0 = new OooOo();
        } else if (i >= 28) {
            oooOOO0 = new OooOo00();
        } else if (i >= 26) {
            oooOOO0 = new OooOOOO();
        } else {
            if (OooOOO.f1121OooO0o0 != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                oooOOO0 = new OooOOO();
            } else {
                oooOOO0 = new OooOOO0();
            }
        }
        f1116OooO00o = oooOOO0;
        f1117OooO0O0 = new OooOO0.OooO(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r3.equals(r4) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface OooO00o(android.content.Context r15, OooOo0o.o0OO00O r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, OooO0O0.OooO0O0 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOo.OooOO0O.OooO00o(android.content.Context, OooOo0o.o0OO00O, android.content.res.Resources, int, java.lang.String, int, int, OooO0O0.OooO0O0, boolean):android.graphics.Typeface");
    }

    public static String OooO0O0(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}