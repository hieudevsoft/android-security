package androidx.fragment.app;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o0000O0O extends androidx.lifecycle.o0000O0 {

    /* renamed from: OooO  reason: collision with root package name */
    public static final o0000oOO.o00000OO f2849OooO = new o0000oOO.o00000OO(0);

    /* renamed from: OooO0o  reason: collision with root package name */
    public final boolean f2852OooO0o;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final HashMap f2850OooO0OO = new HashMap();

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final HashMap f2851OooO0Oo = new HashMap();

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final HashMap f2853OooO0o0 = new HashMap();

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f2854OooO0oO = false;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f2855OooO0oo = false;

    public o0000O0O(boolean z) {
        this.f2852OooO0o = z;
    }

    @Override // androidx.lifecycle.o0000O0
    public final void OooO00o() {
        if (o0000oo.OooOooo(3)) {
            toString();
        }
        this.f2854OooO0oO = true;
    }

    public final void OooO0O0(o00Oo0 o00oo0) {
        if (this.f2855OooO0oo) {
            o0000oo.OooOooo(2);
            return;
        }
        if ((this.f2850OooO0OO.remove(o00oo0.f2956OooO0o0) != null) && o0000oo.OooOooo(2)) {
            o00oo0.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0000O0O.class != obj.getClass()) {
            return false;
        }
        o0000O0O o0000o0o2 = (o0000O0O) obj;
        return this.f2850OooO0OO.equals(o0000o0o2.f2850OooO0OO) && this.f2851OooO0Oo.equals(o0000o0o2.f2851OooO0Oo) && this.f2853OooO0o0.equals(o0000o0o2.f2853OooO0o0);
    }

    public final int hashCode() {
        int hashCode = this.f2851OooO0Oo.hashCode();
        return this.f2853OooO0o0.hashCode() + ((hashCode + (this.f2850OooO0OO.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f2850OooO0OO.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f2851OooO0Oo.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f2853OooO0o0.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}