package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class o000O000 {
    public static void OooO00o(Object obj) {
        OooO0O0.OooO00o.OooO0oO(obj);
        throw null;
    }

    public static void OooO0O0(Object obj, Object obj2) {
        o000 o000Var = (o000) obj;
        OooO0O0.OooO00o.OooO0oO(obj2);
        if (!o000Var.isEmpty()) {
            Iterator it = o000Var.entrySet().iterator();
            if (!it.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static boolean OooO0OO(Object obj) {
        return !((o000) obj).f3649OooO00o;
    }

    public static o000 OooO0Oo(Object obj, Object obj2) {
        o000 o000Var = (o000) obj;
        o000 o000Var2 = (o000) obj2;
        if (!o000Var2.isEmpty()) {
            if (!o000Var.f3649OooO00o) {
                if (o000Var.isEmpty()) {
                    o000Var = new o000();
                } else {
                    o000Var = new o000(o000Var);
                }
            }
            o000Var.OooO0O0();
            if (!o000Var2.isEmpty()) {
                o000Var.putAll(o000Var2);
            }
        }
        return o000Var;
    }

    public static o000 OooO0o0() {
        o000 o000Var = o000.f3648OooO0O0;
        if (o000Var.isEmpty()) {
            return new o000();
        }
        return new o000(o000Var);
    }
}