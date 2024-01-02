package o00000O0;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class OooOo {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final Logger f4042OooO0OO = Logger.getLogger(OooOo.class.getName());

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final ArrayList f4043OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final OooOo f4044OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final OooOo f4045OooO0o0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Oooo000 f4046OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final List f4047OooO0O0 = f4043OooO0Oo;

    static {
        boolean z;
        try {
            Class.forName("android.app.Application", false, null);
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f4042OooO0OO.info(String.format("Provider %s not available", str));
                }
            }
            f4043OooO0Oo = arrayList;
        } else {
            f4043OooO0Oo = new ArrayList();
        }
        f4045OooO0o0 = new OooOo(new o0ooOO0.OooOOO0(5));
        f4044OooO0o = new OooOo(new o0ooOO0.OooOOO0(9));
    }

    public OooOo(o0ooOO0.OooOOO0 oooOOO0) {
        this.f4046OooO00o = oooOOO0;
    }

    public final Object OooO00o(String str) {
        Iterator it = this.f4047OooO0O0.iterator();
        Exception exc = null;
        while (true) {
            boolean hasNext = it.hasNext();
            Oooo000 oooo000 = this.f4046OooO00o;
            if (!hasNext) {
                return ((o0ooOO0.OooOOO0) oooo000).OooO0oo(str, null);
            }
            try {
                return ((o0ooOO0.OooOOO0) oooo000).OooO0oo(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
    }
}