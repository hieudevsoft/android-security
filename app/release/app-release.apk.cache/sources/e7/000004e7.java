package o0000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class OooO0OO implements Iterator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f3956OooO00o = 0;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f3957OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Object f3958OooO0OO;

    public OooO0OO(OooOO0 oooOO0) {
        this.f3958OooO0OO = oooOO0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f3956OooO00o;
        Object obj = this.f3958OooO0OO;
        switch (i) {
            case 0:
                if (this.f3957OooO0O0 < ((OooOO0) obj).OooO0o()) {
                    return true;
                }
                return false;
            case 1:
                if (this.f3957OooO0O0 < ((Object[]) obj).length) {
                    return true;
                }
                return false;
        }
        while (this.f3957OooO0O0 > 0) {
            Iterator it = (Iterator) obj;
            if (it.hasNext()) {
                it.next();
                this.f3957OooO0O0--;
            } else {
                return ((Iterator) obj).hasNext();
            }
        }
        return ((Iterator) obj).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3956OooO00o;
        Object obj = this.f3958OooO0OO;
        switch (i) {
            case 0:
                if (hasNext()) {
                    int i2 = this.f3957OooO0O0;
                    this.f3957OooO0O0 = i2 + 1;
                    return ((OooOO0) obj).get(i2);
                }
                throw new NoSuchElementException();
            case 1:
                try {
                    int i3 = this.f3957OooO0O0;
                    this.f3957OooO0O0 = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f3957OooO0O0--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
        while (this.f3957OooO0O0 > 0) {
            Iterator it = (Iterator) obj;
            if (it.hasNext()) {
                it.next();
                this.f3957OooO0O0--;
            } else {
                return ((Iterator) obj).next();
            }
        }
        return ((Iterator) obj).next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3956OooO00o) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public OooO0OO(o0000OOo.OooO0OO oooO0OO) {
        this.f3958OooO0OO = oooO0OO.f4165OooO00o.iterator();
        this.f3957OooO0O0 = oooO0OO.f4166OooO0O0;
    }

    public OooO0OO(Object[] objArr) {
        o0000O00.OooO00o.OooOoo0(objArr, "array");
        this.f3958OooO0OO = objArr;
    }
}