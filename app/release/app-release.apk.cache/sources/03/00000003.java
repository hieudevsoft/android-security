package OooO;

import java.util.Map;

/* loaded from: classes.dex */
public final class OooO0OO implements Map.Entry {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f4OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f5OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public OooO0OO f6OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public OooO0OO f7OooO0Oo;

    public OooO0OO(Object obj, Object obj2) {
        this.f4OooO00o = obj;
        this.f5OooO0O0 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooO0OO) {
            OooO0OO oooO0OO = (OooO0OO) obj;
            return this.f4OooO00o.equals(oooO0OO.f4OooO00o) && this.f5OooO0O0.equals(oooO0OO.f5OooO0O0);
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4OooO00o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5OooO0O0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f4OooO00o.hashCode() ^ this.f5OooO0O0.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f4OooO00o + "=" + this.f5OooO0O0;
    }
}