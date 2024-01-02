package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class OooO00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final HashMap f3048OooO00o = new HashMap();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Map f3049OooO0O0;

    public OooO00o(HashMap hashMap) {
        this.f3049OooO0O0 = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            OooOo oooOo = (OooOo) entry.getValue();
            List list = (List) this.f3048OooO00o.get(oooOo);
            if (list == null) {
                list = new ArrayList();
                this.f3048OooO00o.put(oooOo, list);
            }
            list.add((OooO0O0) entry.getKey());
        }
    }

    public static void OooO00o(List list, o00Ooo o00ooo2, OooOo oooOo, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                OooO0O0 oooO0O0 = (OooO0O0) list.get(size);
                oooO0O0.getClass();
                try {
                    int i = oooO0O0.f3050OooO00o;
                    Method method = oooO0O0.f3051OooO0O0;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                method.invoke(obj, o00ooo2, oooOo);
                            }
                        } else {
                            method.invoke(obj, o00ooo2);
                        }
                    } else {
                        method.invoke(obj, new Object[0]);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}