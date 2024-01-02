package OooOO0;

import OooO0oO.o000O0O0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class OooOO0 implements Iterator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f524OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f525OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f526OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f527OooO0Oo = false;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ o000O0O0 f528OooO0o0;

    public OooOO0(o000O0O0 o000o0o0, int i) {
        this.f528OooO0o0 = o000o0o0;
        this.f524OooO00o = i;
        this.f525OooO0O0 = o000o0o0.OooO0o();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f526OooO0OO < this.f525OooO0O0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object OooO0Oo2 = this.f528OooO0o0.OooO0Oo(this.f526OooO0OO, this.f524OooO00o);
            this.f526OooO0OO++;
            this.f527OooO0Oo = true;
            return OooO0Oo2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f527OooO0Oo) {
            throw new IllegalStateException();
        }
        int i = this.f526OooO0OO - 1;
        this.f526OooO0OO = i;
        this.f525OooO0O0--;
        this.f527OooO0Oo = false;
        this.f528OooO0o0.OooOO0(i);
    }
}