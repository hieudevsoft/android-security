package o0OO00O;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class OooOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final CopyOnWriteArrayList f5304OooO00o = new CopyOnWriteArrayList();

    public static OooO OooO00o(String str) {
        boolean z;
        Iterator it = f5304OooO00o.iterator();
        while (it.hasNext()) {
            OooO oooO = (OooO) it.next();
            o000000.OooO0o oooO0o = (o000000.OooO0o) oooO;
            synchronized (oooO0o) {
                String str2 = oooO0o.f4011OooO00o;
                z = true;
                if ((str2 == null || !str2.equals(str)) && (oooO0o.f4011OooO00o != null || !str.toLowerCase(Locale.US).startsWith("android-keystore://"))) {
                    z = false;
                }
            }
            if (z) {
                return oooO;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}