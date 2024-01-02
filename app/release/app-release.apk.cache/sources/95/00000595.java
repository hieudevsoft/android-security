package o0000Oo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class OooOOO {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final OooOOO f4192OooO0OO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Set f4193OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final com.google.gson.internal.OooO0o f4194OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    static {
        ArrayList arrayList = new ArrayList();
        o0000.o00Oo0 o00oo0 = o0000.o00Oo0.f3969OooO00o;
        int size = arrayList.size();
        o0000.o00Oo0 o00oo02 = o00oo0;
        if (size != 0) {
            if (size != 1) {
                ?? linkedHashSet = new LinkedHashSet(OooO00o.o0000o0o(arrayList.size()));
                o0000.Oooo0.o00O0Ooo(arrayList, linkedHashSet);
                o00oo02 = linkedHashSet;
            } else {
                ?? singleton = Collections.singleton(arrayList.get(0));
                OooO00o.OooOoOO(singleton, "singleton(element)");
                o00oo02 = singleton;
            }
        }
        f4192OooO0OO = new OooOOO(o00oo02, null);
    }

    public OooOOO(Set set, com.google.gson.internal.OooO0o oooO0o) {
        OooO00o.OooOoo0(set, "pins");
        this.f4193OooO00o = set;
        this.f4194OooO0O0 = oooO0o;
    }

    public final OooOOO OooO00o(com.google.gson.internal.OooO0o oooO0o) {
        return OooO00o.OooOOO0(this.f4194OooO0O0, oooO0o) ? this : new OooOOO(this.f4193OooO00o, oooO0o);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooOOO) {
            OooOOO oooOOO = (OooOOO) obj;
            if (OooO00o.OooOOO0(oooOOO.f4193OooO00o, this.f4193OooO00o) && OooO00o.OooOOO0(oooOOO.f4194OooO0O0, this.f4194OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f4193OooO00o.hashCode() + 1517) * 41;
        com.google.gson.internal.OooO0o oooO0o = this.f4194OooO0O0;
        return hashCode + (oooO0o != null ? oooO0o.hashCode() : 0);
    }
}