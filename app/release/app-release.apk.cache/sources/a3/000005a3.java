package o0000Oo;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o000OOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public o0ooOOo f4279OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public String f4280OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o00Ooo f4281OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public o000000 f4282OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final LinkedHashMap f4283OooO0o0;

    public o000OOo() {
        this.f4283OooO0o0 = new LinkedHashMap();
        this.f4280OooO0O0 = "GET";
        this.f4281OooO0OO = new o00Ooo();
    }

    public final androidx.appcompat.widget.o0OOO0o OooO00o() {
        Map unmodifiableMap;
        o0ooOOo o0ooooo = this.f4279OooO00o;
        if (o0ooooo != null) {
            String str = this.f4280OooO0O0;
            oo000o OooO0O02 = this.f4281OooO0OO.OooO0O0();
            o000000 o000000Var = this.f4282OooO0Oo;
            byte[] bArr = o0000OoO.OooOO0O.f4403OooO00o;
            LinkedHashMap linkedHashMap = this.f4283OooO0o0;
            OooO00o.OooOoo0(linkedHashMap, "<this>");
            if (linkedHashMap.isEmpty()) {
                unmodifiableMap = o0000.o00O0O.f3968OooO00o;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                OooO00o.OooOoOO(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new androidx.appcompat.widget.o0OOO0o(o0ooooo, str, OooO0O02, o000000Var, unmodifiableMap);
        }
        throw new IllegalStateException("url == null".toString());
    }

    public final void OooO0O0(String str, String str2) {
        OooO00o.OooOoo0(str2, "value");
        o00Ooo o00ooo2 = this.f4281OooO0OO;
        o00ooo2.getClass();
        OooOOOO.OooO0Oo(str);
        OooOOOO.OooO0o0(str2, str);
        o00ooo2.OooO0OO(str);
        o00ooo2.OooO00o(str, str2);
    }

    public final void OooO0OO(String str, o000000 o000000Var) {
        boolean z;
        boolean z2 = false;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (o000000Var == null) {
                if (OooO00o.OooOOO0(str, "POST") || OooO00o.OooOOO0(str, "PUT") || OooO00o.OooOOO0(str, "PATCH") || OooO00o.OooOOO0(str, "PROPPATCH") || OooO00o.OooOOO0(str, "REPORT")) {
                    z2 = true;
                }
                if (!(!z2)) {
                    throw new IllegalArgumentException(OooO0O0.OooO00o.OooO0Oo("method ", str, " must have a request body.").toString());
                }
            } else if (!com.google.gson.internal.OooO0o.OooOOOo(str)) {
                throw new IllegalArgumentException(OooO0O0.OooO00o.OooO0Oo("method ", str, " must not have a request body.").toString());
            }
            this.f4280OooO0O0 = str;
            this.f4282OooO0Oo = o000000Var;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true".toString());
    }

    public final void OooO0Oo(String str) {
        String substring;
        String str2;
        if (o0000Oo0.OooOOOO.o00O0o(str, "ws:", true)) {
            substring = str.substring(3);
            OooO00o.OooOoOO(substring, "this as java.lang.String).substring(startIndex)");
            str2 = "http:";
        } else {
            if (o0000Oo0.OooOOOO.o00O0o(str, "wss:", true)) {
                substring = str.substring(4);
                OooO00o.OooOoOO(substring, "this as java.lang.String).substring(startIndex)");
                str2 = "https:";
            }
            char[] cArr = o0ooOOo.f4343OooOO0;
            OooO00o.OooOoo0(str, "<this>");
            o00oO0o o00oo0o = new o00oO0o();
            o00oo0o.OooO0OO(null, str);
            this.f4279OooO00o = o00oo0o.OooO00o();
        }
        str = str2.concat(substring);
        char[] cArr2 = o0ooOOo.f4343OooOO0;
        OooO00o.OooOoo0(str, "<this>");
        o00oO0o o00oo0o2 = new o00oO0o();
        o00oo0o2.OooO0OO(null, str);
        this.f4279OooO00o = o00oo0o2.OooO00o();
    }

    public o000OOo(androidx.appcompat.widget.o0OOO0o o0ooo0o) {
        LinkedHashMap linkedHashMap;
        this.f4283OooO0o0 = new LinkedHashMap();
        this.f4279OooO00o = (o0ooOOo) o0ooo0o.f2519OooO0O0;
        this.f4280OooO0O0 = (String) o0ooo0o.f2520OooO0OO;
        this.f4282OooO0Oo = (o000000) o0ooo0o.f2523OooO0o0;
        Map map = (Map) o0ooo0o.f2522OooO0o;
        if (map.isEmpty()) {
            linkedHashMap = new LinkedHashMap();
        } else {
            OooO00o.OooOoo0(map, "<this>");
            linkedHashMap = new LinkedHashMap(map);
        }
        this.f4283OooO0o0 = linkedHashMap;
        this.f4281OooO0OO = ((oo000o) o0ooo0o.f2521OooO0Oo).OooO0oo();
    }
}