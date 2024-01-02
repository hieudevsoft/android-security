package o0000Oo;

import java.util.ArrayList;
import java.util.Arrays;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class OooOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final boolean f4196OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public String[] f4197OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public String[] f4198OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f4199OooO0Oo;

    public OooOo() {
        this.f4196OooO00o = true;
    }

    public final Oooo000 OooO00o() {
        return new Oooo000(this.f4196OooO00o, this.f4199OooO0Oo, this.f4197OooO0O0, this.f4198OooO0OO);
    }

    public final void OooO0O0(String... strArr) {
        OooO00o.OooOoo0(strArr, "cipherSuites");
        if (!this.f4196OooO00o) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        this.f4197OooO0O0 = (String[]) strArr.clone();
    }

    public final void OooO0OO(OooOo00... oooOo00Arr) {
        OooO00o.OooOoo0(oooOo00Arr, "cipherSuites");
        if (this.f4196OooO00o) {
            ArrayList arrayList = new ArrayList(oooOo00Arr.length);
            for (OooOo00 oooOo00 : oooOo00Arr) {
                arrayList.add(oooOo00.f4218OooO00o);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            OooO0O0((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public final void OooO0Oo() {
        if (!this.f4196OooO00o) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }
        this.f4199OooO0Oo = true;
    }

    public final void OooO0o(o0000Ooo... o0000oooArr) {
        if (this.f4196OooO00o) {
            ArrayList arrayList = new ArrayList(o0000oooArr.length);
            for (o0000Ooo o0000ooo : o0000oooArr) {
                arrayList.add(o0000ooo.f4278OooO00o);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            OooO0o0((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public final void OooO0o0(String... strArr) {
        OooO00o.OooOoo0(strArr, "tlsVersions");
        if (!this.f4196OooO00o) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        this.f4198OooO0OO = (String[]) strArr.clone();
    }

    public OooOo(Oooo000 oooo000) {
        this.f4196OooO00o = oooo000.f4233OooO00o;
        this.f4197OooO0O0 = oooo000.f4235OooO0OO;
        this.f4198OooO0OO = oooo000.f4236OooO0Oo;
        this.f4199OooO0Oo = oooo000.f4234OooO0O0;
    }
}