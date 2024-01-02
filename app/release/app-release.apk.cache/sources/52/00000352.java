package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class o000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ArrayList f2812OooO00o = new ArrayList();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final HashMap f2813OooO0O0 = new HashMap();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o0000O0O f2814OooO0OO;

    public final void OooO00o(o00Oo0 o00oo0) {
        if (this.f2812OooO00o.contains(o00oo0)) {
            throw new IllegalStateException("Fragment already added: " + o00oo0);
        }
        synchronized (this.f2812OooO00o) {
            this.f2812OooO00o.add(o00oo0);
        }
        o00oo0.f2960OooOO0O = true;
    }

    public final o00Oo0 OooO0O0(String str) {
        o0000OO0 o0000oo02 = (o0000OO0) this.f2813OooO0O0.get(str);
        if (o0000oo02 != null) {
            return o0000oo02.f2858OooO0OO;
        }
        return null;
    }

    public final o00Oo0 OooO0OO(String str) {
        for (o0000OO0 o0000oo02 : this.f2813OooO0O0.values()) {
            if (o0000oo02 != null) {
                o00Oo0 o00oo0 = o0000oo02.f2858OooO0OO;
                if (!str.equals(o00oo0.f2956OooO0o0)) {
                    o00oo0 = o00oo0.f2970OooOo00.f2866OooO0OO.OooO0OO(str);
                }
                if (o00oo0 != null) {
                    return o00oo0;
                }
            }
        }
        return null;
    }

    public final ArrayList OooO0Oo() {
        ArrayList arrayList = new ArrayList();
        for (o0000OO0 o0000oo02 : this.f2813OooO0O0.values()) {
            if (o0000oo02 != null) {
                arrayList.add(o0000oo02);
            }
        }
        return arrayList;
    }

    public final List OooO0o() {
        ArrayList arrayList;
        if (this.f2812OooO00o.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2812OooO00o) {
            arrayList = new ArrayList(this.f2812OooO00o);
        }
        return arrayList;
    }

    public final ArrayList OooO0o0() {
        ArrayList arrayList = new ArrayList();
        for (o0000OO0 o0000oo02 : this.f2813OooO0O0.values()) {
            arrayList.add(o0000oo02 != null ? o0000oo02.f2858OooO0OO : null);
        }
        return arrayList;
    }

    public final void OooO0oO(o0000OO0 o0000oo02) {
        boolean z;
        o00Oo0 o00oo0 = o0000oo02.f2858OooO0OO;
        String str = o00oo0.f2956OooO0o0;
        HashMap hashMap = this.f2813OooO0O0;
        if (hashMap.get(str) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        hashMap.put(o00oo0.f2956OooO0o0, o0000oo02);
        if (o0000oo.OooOooo(2)) {
            o00oo0.toString();
        }
    }

    public final void OooO0oo(o0000OO0 o0000oo02) {
        o00Oo0 o00oo0 = o0000oo02.f2858OooO0OO;
        if (o00oo0.f2975OooOoOO) {
            this.f2814OooO0OO.OooO0O0(o00oo0);
        }
        if (((o0000OO0) this.f2813OooO0O0.put(o00oo0.f2956OooO0o0, null)) != null && o0000oo.OooOooo(2)) {
            o00oo0.toString();
        }
    }
}