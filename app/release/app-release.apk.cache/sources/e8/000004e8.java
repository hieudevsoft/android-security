package o0000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class OooO0o extends OooO0OO implements ListIterator {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ OooOO0 f3959OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(OooOO0 oooOO0, int i) {
        super(oooOO0);
        this.f3959OooO0Oo = oooOO0;
        o0ooOO0.OooOOO0.OooO0Oo(i, oooOO0.OooO0o());
        this.f3957OooO0O0 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f3957OooO0O0 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3957OooO0O0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f3957OooO0O0 - 1;
            this.f3957OooO0O0 = i;
            return this.f3959OooO0Oo.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3957OooO0O0 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}