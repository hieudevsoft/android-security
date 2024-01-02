package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class o000OO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final LinkedHashMap f3089OooO00o = new LinkedHashMap();

    public final void OooO00o() {
        for (o0000O0 o0000o02 : this.f3089OooO00o.values()) {
            HashMap hashMap = o0000o02.f3080OooO00o;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object obj : o0000o02.f3080OooO00o.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            LinkedHashSet linkedHashSet = o0000o02.f3081OooO0O0;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    for (Closeable closeable : o0000o02.f3081OooO0O0) {
                        if (closeable instanceof Closeable) {
                            try {
                                closeable.close();
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    }
                }
            }
            o0000o02.OooO00o();
        }
        this.f3089OooO00o.clear();
    }
}