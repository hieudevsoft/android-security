package o0000;

import java.util.AbstractList;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class OooOO0O extends AbstractList implements List {
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooOOO oooOOO = (OooOOO) this;
        o0ooOO0.OooOOO0.OooO0OO(i, oooOOO.f3963OooO0OO);
        if (i == o0000O00.OooO00o.o0O0O00(oooOOO)) {
            if (!oooOOO.isEmpty()) {
                int OooOO02 = oooOOO.OooOO0(o0000O00.OooO00o.o0O0O00(oooOOO) + oooOOO.f3961OooO00o);
                Object[] objArr = oooOOO.f3962OooO0O0;
                Object obj = objArr[OooOO02];
                objArr[OooOO02] = null;
                oooOOO.f3963OooO0OO--;
                return obj;
            }
            throw new NoSuchElementException("ArrayDeque is empty.");
        } else if (i == 0) {
            if (!oooOOO.isEmpty()) {
                Object[] objArr2 = oooOOO.f3962OooO0O0;
                int i2 = oooOOO.f3961OooO00o;
                Object obj2 = objArr2[i2];
                objArr2[i2] = null;
                oooOOO.f3961OooO00o = oooOOO.OooO(i2);
                oooOOO.f3963OooO0OO--;
                return obj2;
            }
            throw new NoSuchElementException("ArrayDeque is empty.");
        } else {
            int OooOO03 = oooOOO.OooOO0(oooOOO.f3961OooO00o + i);
            Object[] objArr3 = oooOOO.f3962OooO0O0;
            Object obj3 = objArr3[OooOO03];
            if (i < (oooOOO.f3963OooO0OO >> 1)) {
                int i3 = oooOOO.f3961OooO00o;
                if (OooOO03 >= i3) {
                    OooOOOO.oo0o0O0(objArr3, objArr3, i3 + 1, i3, OooOO03);
                } else {
                    OooOOOO.oo0o0O0(objArr3, objArr3, 1, 0, OooOO03);
                    Object[] objArr4 = oooOOO.f3962OooO0O0;
                    objArr4[0] = objArr4[objArr4.length - 1];
                    int i4 = oooOOO.f3961OooO00o;
                    OooOOOO.oo0o0O0(objArr4, objArr4, i4 + 1, i4, objArr4.length - 1);
                }
                Object[] objArr5 = oooOOO.f3962OooO0O0;
                int i5 = oooOOO.f3961OooO00o;
                objArr5[i5] = null;
                oooOOO.f3961OooO00o = oooOOO.OooO(i5);
            } else {
                int OooOO04 = oooOOO.OooOO0(o0000O00.OooO00o.o0O0O00(oooOOO) + oooOOO.f3961OooO00o);
                Object[] objArr6 = oooOOO.f3962OooO0O0;
                int i6 = OooOO03 + 1;
                if (OooOO03 <= OooOO04) {
                    OooOOOO.oo0o0O0(objArr6, objArr6, OooOO03, i6, OooOO04 + 1);
                } else {
                    OooOOOO.oo0o0O0(objArr6, objArr6, OooOO03, i6, objArr6.length);
                    Object[] objArr7 = oooOOO.f3962OooO0O0;
                    objArr7[objArr7.length - 1] = objArr7[0];
                    OooOOOO.oo0o0O0(objArr7, objArr7, 0, 1, OooOO04 + 1);
                }
                oooOOO.f3962OooO0O0[OooOO04] = null;
            }
            oooOOO.f3963OooO0OO--;
            return obj3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((OooOOO) this).f3963OooO0OO;
    }
}