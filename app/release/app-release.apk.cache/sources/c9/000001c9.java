package Oooo0o0;

import android.graphics.Rect;
import java.util.Comparator;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public final class Oooo000 implements Comparator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Rect f1463OooO00o = new Rect();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Rect f1464OooO0O0 = new Rect();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final boolean f1465OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final OooOOO0 f1466OooO0Oo;

    public Oooo000(boolean z, OooOOO0 oooOOO0) {
        this.f1465OooO0OO = z;
        this.f1466OooO0Oo = oooOOO0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f1466OooO0Oo.getClass();
        Rect rect = this.f1463OooO00o;
        ((Oooo000.o000oOoO) obj).OooO0o(rect);
        Rect rect2 = this.f1464OooO0O0;
        ((Oooo000.o000oOoO) obj2).OooO0o(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.f1465OooO0OO;
        if (i3 < i4) {
            if (!z) {
                return -1;
            }
            return 1;
        } else if (i3 > i4) {
            if (z) {
                return -1;
            }
            return 1;
        } else {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                if (!z) {
                    return -1;
                }
                return 1;
            } else if (i7 > i8) {
                if (z) {
                    return -1;
                }
                return 1;
            } else {
                return 0;
            }
        }
    }
}