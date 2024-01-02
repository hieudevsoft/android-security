package o0000oo0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import o0000O00.OooO00o;
import o0000oOO.o00O0O;

/* loaded from: classes.dex */
public abstract class o0ooOOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final CopyOnWriteArraySet f4803OooO00o = new CopyOnWriteArraySet();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final Map f4804OooO0O0;

    static {
        String str;
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = o0000Oo.oo0o0Oo.class.getPackage();
        if (r2 != null) {
            str = r2.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        linkedHashMap.put(o0000Oo.oo0o0Oo.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(o00O0O.class.getName(), "okhttp.Http2");
        linkedHashMap.put(o0000o0O.o000000.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size != 0) {
            if (size != 1) {
                map = new LinkedHashMap(linkedHashMap);
            } else {
                map = OooO00o.o000oooo(linkedHashMap);
            }
        } else {
            map = o0000.o00O0O.f3968OooO00o;
        }
        f4804OooO0O0 = map;
    }
}