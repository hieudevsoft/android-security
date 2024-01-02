package OooOO0;

import OooO0oO.o000O0O0;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class OooOOO0 implements Iterator, Map.Entry {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f532OooO00o;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ o000O0O0 f535OooO0Oo;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f534OooO0OO = false;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f533OooO0O0 = -1;

    public OooOOO0(o000O0O0 o000o0o0) {
        this.f535OooO0Oo = o000o0o0;
        this.f532OooO00o = o000o0o0.OooO0o() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.f534OooO0OO) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f533OooO0O0;
            o000O0O0 o000o0o0 = this.f535OooO0Oo;
            Object OooO0Oo2 = o000o0o0.OooO0Oo(i, 0);
            if (key != OooO0Oo2 && (key == null || !key.equals(OooO0Oo2))) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            Object value = entry.getValue();
            Object OooO0Oo3 = o000o0o0.OooO0Oo(this.f533OooO0O0, 1);
            if (value != OooO0Oo3 && (value == null || !value.equals(OooO0Oo3))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f534OooO0OO) {
            return this.f535OooO0Oo.OooO0Oo(this.f533OooO0O0, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f534OooO0OO) {
            return this.f535OooO0Oo.OooO0Oo(this.f533OooO0O0, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f533OooO0O0 < this.f532OooO00o;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (this.f534OooO0OO) {
            int i = this.f533OooO0O0;
            o000O0O0 o000o0o0 = this.f535OooO0Oo;
            Object OooO0Oo2 = o000o0o0.OooO0Oo(i, 0);
            Object OooO0Oo3 = o000o0o0.OooO0Oo(this.f533OooO0O0, 1);
            return (OooO0Oo2 == null ? 0 : OooO0Oo2.hashCode()) ^ (OooO0Oo3 != null ? OooO0Oo3.hashCode() : 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f533OooO0O0++;
            this.f534OooO0OO = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f534OooO0OO) {
            throw new IllegalStateException();
        }
        this.f535OooO0Oo.OooOO0(this.f533OooO0O0);
        this.f533OooO0O0--;
        this.f532OooO00o--;
        this.f534OooO0OO = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f534OooO0OO) {
            return this.f535OooO0Oo.OooOO0O(this.f533OooO0O0, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}