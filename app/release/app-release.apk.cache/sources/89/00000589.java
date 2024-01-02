package o0000OO;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class OooO0O0 implements Iterator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f4159OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f4160OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f4161OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f4162OooO0Oo;

    public OooO0O0(int i, int i2, int i3) {
        this.f4159OooO00o = i3;
        this.f4160OooO0O0 = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f4161OooO0OO = z;
        this.f4162OooO0Oo = z ? i : i2;
    }

    @Override // java.util.Iterator
    /* renamed from: OooO00o */
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(OooO0O0());
    }

    public final int OooO0O0() {
        int i = this.f4162OooO0Oo;
        if (i != this.f4160OooO0O0) {
            this.f4162OooO0Oo = this.f4159OooO00o + i;
        } else if (!this.f4161OooO0OO) {
            throw new NoSuchElementException();
        } else {
            this.f4161OooO0OO = false;
        }
        return i;
    }

    public final void OooO0OO() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4161OooO0OO;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        OooO0OO();
        throw null;
    }
}