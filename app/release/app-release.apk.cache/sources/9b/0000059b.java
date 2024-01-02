package o0000Oo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import o0000O00.OooO0O0;

/* loaded from: classes.dex */
public final class Oooo000 {

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final Oooo000 f4231OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final Oooo000 f4232OooO0o0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final boolean f4233OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final boolean f4234OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final String[] f4235OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final String[] f4236OooO0Oo;

    static {
        OooOo00 oooOo00 = OooOo00.f4214OooOOo;
        OooOo00 oooOo002 = OooOo00.f4216OooOOoo;
        OooOo00 oooOo003 = OooOo00.f4217OooOo00;
        OooOo00 oooOo004 = OooOo00.f4210OooOO0o;
        OooOo00 oooOo005 = OooOo00.f4211OooOOO;
        OooOo00 oooOo006 = OooOo00.OooOOO0;
        OooOo00 oooOo007 = OooOo00.f4212OooOOOO;
        OooOo00 oooOo008 = OooOo00.f4215OooOOo0;
        OooOo00 oooOo009 = OooOo00.f4213OooOOOo;
        OooOo00[] oooOo00Arr = {oooOo00, oooOo002, oooOo003, oooOo004, oooOo005, oooOo006, oooOo007, oooOo008, oooOo009, OooOo00.f4208OooOO0, OooOo00.f4209OooOO0O, OooOo00.f4207OooO0oo, OooOo00.f4200OooO, OooOo00.f4204OooO0o, OooOo00.f4206OooO0oO, OooOo00.f4205OooO0o0};
        OooOo oooOo = new OooOo();
        oooOo.OooO0OO((OooOo00[]) Arrays.copyOf(new OooOo00[]{oooOo00, oooOo002, oooOo003, oooOo004, oooOo005, oooOo006, oooOo007, oooOo008, oooOo009}, 9));
        o0000Ooo o0000ooo = o0000Ooo.f4272OooO0O0;
        o0000Ooo o0000ooo2 = o0000Ooo.f4273OooO0OO;
        oooOo.OooO0o(o0000ooo, o0000ooo2);
        oooOo.OooO0Oo();
        oooOo.OooO00o();
        OooOo oooOo2 = new OooOo();
        oooOo2.OooO0OO((OooOo00[]) Arrays.copyOf(oooOo00Arr, 16));
        oooOo2.OooO0o(o0000ooo, o0000ooo2);
        oooOo2.OooO0Oo();
        f4232OooO0o0 = oooOo2.OooO00o();
        OooOo oooOo3 = new OooOo();
        oooOo3.OooO0OO((OooOo00[]) Arrays.copyOf(oooOo00Arr, 16));
        oooOo3.OooO0o(o0000ooo, o0000ooo2, o0000Ooo.f4274OooO0Oo, o0000Ooo.f4276OooO0o0);
        oooOo3.OooO0Oo();
        oooOo3.OooO00o();
        f4231OooO0o = new Oooo000(false, false, null, null);
    }

    public Oooo000(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f4233OooO00o = z;
        this.f4234OooO0O0 = z2;
        this.f4235OooO0OO = strArr;
        this.f4236OooO0Oo = strArr2;
    }

    public final List OooO00o() {
        String[] strArr = this.f4235OooO0OO;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(OooOo00.f4201OooO0O0.OooO0oo(str));
            }
            return o0000.Oooo0.o00O0o00(arrayList);
        }
        return null;
    }

    public final boolean OooO0O0(SSLSocket sSLSocket) {
        if (this.f4233OooO00o) {
            String[] strArr = this.f4236OooO0Oo;
            if (strArr == null || o0000OoO.OooOO0O.OooO(strArr, sSLSocket.getEnabledProtocols(), OooO0O0.f4154OooO00o)) {
                String[] strArr2 = this.f4235OooO0OO;
                return strArr2 == null || o0000OoO.OooOO0O.OooO(strArr2, sSLSocket.getEnabledCipherSuites(), OooOo00.f4202OooO0OO);
            }
            return false;
        }
        return false;
    }

    public final List OooO0OO() {
        String[] strArr = this.f4236OooO0Oo;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(OooOOOO.OooO(str));
            }
            return o0000.Oooo0.o00O0o00(arrayList);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Oooo000) {
            if (obj == this) {
                return true;
            }
            Oooo000 oooo000 = (Oooo000) obj;
            boolean z = oooo000.f4233OooO00o;
            boolean z2 = this.f4233OooO00o;
            if (z2 != z) {
                return false;
            }
            return !z2 || (Arrays.equals(this.f4235OooO0OO, oooo000.f4235OooO0OO) && Arrays.equals(this.f4236OooO0Oo, oooo000.f4236OooO0Oo) && this.f4234OooO0O0 == oooo000.f4234OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4233OooO00o) {
            String[] strArr = this.f4235OooO0OO;
            int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
            String[] strArr2 = this.f4236OooO0Oo;
            return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f4234OooO0O0 ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (this.f4233OooO00o) {
            return "ConnectionSpec(cipherSuites=" + Objects.toString(OooO00o(), "[all enabled]") + ", tlsVersions=" + Objects.toString(OooO0OO(), "[all enabled]") + ", supportsTlsExtensions=" + this.f4234OooO0O0 + ')';
        }
        return "ConnectionSpec()";
    }
}