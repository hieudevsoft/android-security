package com.google.gson.internal.bind;

import com.google.gson.OooOOOO;
import com.google.gson.internal.Oooo0;
import com.google.gson.o00oO0o;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import com.google.gson.o0ooOOo;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o0000Ooo.OooOOO;
import o0000Ooo.OooOOO0;

/* loaded from: classes.dex */
public final class ObjectTypeAdapter extends o0OOO0o {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final o0Oo0oo f3843OooO0OO = new o0Oo0oo() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1

        /* renamed from: OooO00o  reason: collision with root package name */
        public final /* synthetic */ o0ooOOo f3846OooO00o = o00oO0o.f3939OooO00o;

        @Override // com.google.gson.o0Oo0oo
        public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00000o0.o00oO0o o00oo0o) {
            if (o00oo0o.f4065OooO00o == Object.class) {
                return new ObjectTypeAdapter(oooOOOO, this.f3846OooO00o);
            }
            return null;
        }
    };

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOOO f3844OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0ooOOo f3845OooO0O0;

    public ObjectTypeAdapter(OooOOOO oooOOOO, o0ooOOo o0ooooo) {
        this.f3844OooO00o = oooOOOO;
        this.f3845OooO0O0 = o0ooooo;
    }

    public static Serializable OooO0o0(OooOOO0 oooOOO0, int i) {
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 != 2) {
                    return null;
                }
                oooOOO0.OooOoO0();
                return new Oooo0(true);
            }
            oooOOO0.OooOo();
            return new ArrayList();
        }
        throw null;
    }

    @Override // com.google.gson.o0OOO0o
    public final Object OooO0O0(OooOOO0 oooOOO0) {
        int OoooO0O2 = oooOOO0.OoooO0O();
        Object OooO0o02 = OooO0o0(oooOOO0, OoooO0O2);
        if (OooO0o02 == null) {
            return OooO0Oo(oooOOO0, OoooO0O2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (oooOOO0.Oooo000()) {
                String Oooo0o2 = OooO0o02 instanceof Map ? oooOOO0.Oooo0o() : null;
                int OoooO0O3 = oooOOO0.OoooO0O();
                Serializable OooO0o03 = OooO0o0(oooOOO0, OoooO0O3);
                boolean z = OooO0o03 != null;
                Serializable OooO0Oo2 = OooO0o03 == null ? OooO0Oo(oooOOO0, OoooO0O3) : OooO0o03;
                if (OooO0o02 instanceof List) {
                    ((List) OooO0o02).add(OooO0Oo2);
                } else {
                    ((Map) OooO0o02).put(Oooo0o2, OooO0Oo2);
                }
                if (z) {
                    arrayDeque.addLast(OooO0o02);
                    OooO0o02 = OooO0Oo2;
                }
            } else {
                if (OooO0o02 instanceof List) {
                    oooOOO0.OooOoo0();
                } else {
                    oooOOO0.OooOoo();
                }
                if (arrayDeque.isEmpty()) {
                    return OooO0o02;
                }
                OooO0o02 = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.o0OOO0o
    public final void OooO0OO(OooOOO oooOOO, Object obj) {
        if (obj == null) {
            oooOOO.Oooo000();
            return;
        }
        Class<?> cls = obj.getClass();
        OooOOOO oooOOOO = this.f3844OooO00o;
        oooOOOO.getClass();
        o0OOO0o OooO0OO2 = oooOOOO.OooO0OO(new o00000o0.o00oO0o(cls));
        if (OooO0OO2 instanceof ObjectTypeAdapter) {
            oooOOO.OooOoO();
            oooOOO.OooOoo();
            return;
        }
        OooO0OO2.OooO0OO(oooOOO, obj);
    }

    public final Serializable OooO0Oo(OooOOO0 oooOOO0, int i) {
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 5) {
                if (i2 != 6) {
                    if (i2 != 7) {
                        if (i2 == 8) {
                            oooOOO0.Oooo0oo();
                            return null;
                        }
                        throw new IllegalStateException("Unexpected token: ".concat(OooO0O0.OooO00o.OooOO0(i)));
                    }
                    return Boolean.valueOf(oooOOO0.Oooo0());
                }
                return this.f3845OooO0O0.OooO00o(oooOOO0);
            }
            return oooOOO0.OoooO00();
        }
        throw null;
    }
}