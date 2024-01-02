package o0000oOO;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import o0000O00.OooO00o;
import o000O000.OooOOO;

/* loaded from: classes.dex */
public abstract class o0OoOo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final Oooo000[] f4744OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final Map f4745OooO0O0;

    static {
        Oooo000 oooo000 = new Oooo000(Oooo000.f4607OooO, "");
        OooOOO oooOOO = Oooo000.f4609OooO0o;
        Oooo000 oooo0002 = new Oooo000(oooOOO, "GET");
        Oooo000 oooo0003 = new Oooo000(oooOOO, "POST");
        OooOOO oooOOO2 = Oooo000.f4611OooO0oO;
        Oooo000 oooo0004 = new Oooo000(oooOOO2, "/");
        Oooo000 oooo0005 = new Oooo000(oooOOO2, "/index.html");
        OooOOO oooOOO3 = Oooo000.f4612OooO0oo;
        Oooo000 oooo0006 = new Oooo000(oooOOO3, "http");
        Oooo000 oooo0007 = new Oooo000(oooOOO3, "https");
        OooOOO oooOOO4 = Oooo000.f4610OooO0o0;
        Oooo000[] oooo000Arr = {oooo000, oooo0002, oooo0003, oooo0004, oooo0005, oooo0006, oooo0007, new Oooo000(oooOOO4, "200"), new Oooo000(oooOOO4, "204"), new Oooo000(oooOOO4, "206"), new Oooo000(oooOOO4, "304"), new Oooo000(oooOOO4, "400"), new Oooo000(oooOOO4, "404"), new Oooo000(oooOOO4, "500"), new Oooo000("accept-charset", ""), new Oooo000("accept-encoding", "gzip, deflate"), new Oooo000("accept-language", ""), new Oooo000("accept-ranges", ""), new Oooo000("accept", ""), new Oooo000("access-control-allow-origin", ""), new Oooo000("age", ""), new Oooo000("allow", ""), new Oooo000("authorization", ""), new Oooo000("cache-control", ""), new Oooo000("content-disposition", ""), new Oooo000("content-encoding", ""), new Oooo000("content-language", ""), new Oooo000("content-length", ""), new Oooo000("content-location", ""), new Oooo000("content-range", ""), new Oooo000("content-type", ""), new Oooo000("cookie", ""), new Oooo000("date", ""), new Oooo000("etag", ""), new Oooo000("expect", ""), new Oooo000("expires", ""), new Oooo000("from", ""), new Oooo000("host", ""), new Oooo000("if-match", ""), new Oooo000("if-modified-since", ""), new Oooo000("if-none-match", ""), new Oooo000("if-range", ""), new Oooo000("if-unmodified-since", ""), new Oooo000("last-modified", ""), new Oooo000("link", ""), new Oooo000("location", ""), new Oooo000("max-forwards", ""), new Oooo000("proxy-authenticate", ""), new Oooo000("proxy-authorization", ""), new Oooo000("range", ""), new Oooo000("referer", ""), new Oooo000("refresh", ""), new Oooo000("retry-after", ""), new Oooo000("server", ""), new Oooo000("set-cookie", ""), new Oooo000("strict-transport-security", ""), new Oooo000("transfer-encoding", ""), new Oooo000("user-agent", ""), new Oooo000("vary", ""), new Oooo000("via", ""), new Oooo000("www-authenticate", "")};
        f4744OooO00o = oooo000Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(oooo000Arr[i].f4613OooO00o)) {
                linkedHashMap.put(oooo000Arr[i].f4613OooO00o, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        OooO00o.OooOoOO(unmodifiableMap, "unmodifiableMap(result)");
        f4745OooO0O0 = unmodifiableMap;
    }

    public static void OooO00o(OooOOO oooOOO) {
        boolean z;
        OooO00o.OooOoo0(oooOOO, "name");
        int OooO0OO2 = oooOOO.OooO0OO();
        for (int i = 0; i < OooO0OO2; i++) {
            byte OooO0o2 = oooOOO.OooO0o(i);
            if (65 <= OooO0o2 && OooO0o2 < 91) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(oooOOO.OooOO0()));
            }
        }
    }
}