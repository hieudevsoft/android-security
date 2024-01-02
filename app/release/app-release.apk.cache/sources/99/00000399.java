package androidx.lifecycle;

import hieubui.eup.android_app_security.MainActivity;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class o0000 extends o000OO.OooOO0 implements o0000O0O.OooO00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f3066OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f3067OooO0O0;

    public /* synthetic */ o0000(int i, Object obj) {
        this.f3066OooO00o = i;
        this.f3067OooO0O0 = obj;
    }

    @Override // o0000O0O.OooO00o
    public final Object OooO00o() {
        int i = this.f3066OooO00o;
        Object obj = this.f3067OooO0O0;
        switch (i) {
            case 0:
                o0000O o0000o2 = (o0000O) obj;
                o0000O00.OooO00o.OooOoo0(o0000o2, "<this>");
                ArrayList arrayList = new ArrayList();
                o000OO.OooOOO.f4874OooO00o.getClass();
                Class OooO00o2 = new o000OO.OooO0O0(o0000oo.class).OooO00o();
                o0000O00.OooO00o.OooOoO0(OooO00o2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                arrayList.add(new OoooO00.OooOO0(OooO00o2));
                OoooO00.OooOO0[] oooOO0Arr = (OoooO00.OooOO0[]) arrayList.toArray(new OoooO00.OooOO0[0]);
                return (o0000oo) new androidx.activity.result.OooO0o(o0000o2, new OoooO00.OooO0o((OoooO00.OooOO0[]) Arrays.copyOf(oooOO0Arr, oooOO0Arr.length))).OooO0oo(o0000oo.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
            case 1:
                return new o00000oO.OooO((MainActivity) obj);
            case 2:
                return OooO0OO();
            case 3:
                return OooO0OO();
            default:
                return OooO0OO();
        }
    }

    public final List OooO0OO() {
        int i = this.f3066OooO00o;
        Object obj = this.f3067OooO0O0;
        switch (i) {
            case 2:
                return (List) obj;
            case 3:
                try {
                    return (List) ((o0000O0O.OooO00o) obj).OooO00o();
                } catch (SSLPeerUnverifiedException unused) {
                    return o0000.o0OoOo0.f3970OooO00o;
                }
            default:
                o0000Oo.o00Oo0 o00oo0 = ((o0000o0o.o000OO) obj).f4555OooO0o0;
                o0000O00.OooO00o.OooOo(o00oo0);
                List<Certificate> OooO00o2 = o00oo0.OooO00o();
                ArrayList arrayList = new ArrayList(o0000.OooOOOO.o00O0O0o(OooO00o2));
                for (Certificate certificate : OooO00o2) {
                    o0000O00.OooO00o.OooOoO0(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
        }
    }
}