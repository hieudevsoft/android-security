package OooOooo;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o000OO00 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public ViewParent f1282OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public ViewParent f1283OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final View f1284OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f1285OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int[] f1286OooO0o0;

    public o000OO00(View view) {
        this.f1284OooO0OO = view;
    }

    public final boolean OooO00o(float f, float f2, boolean z) {
        ViewParent OooO0o2;
        if (!this.f1285OooO0Oo || (OooO0o2 = OooO0o(0)) == null) {
            return false;
        }
        try {
            return o0O00o0.OooO00o(OooO0o2, this.f1284OooO0OO, f, f2, z);
        } catch (AbstractMethodError unused) {
            Objects.toString(OooO0o2);
            return false;
        }
    }

    public final boolean OooO0O0(float f, float f2) {
        ViewParent OooO0o2;
        if (!this.f1285OooO0Oo || (OooO0o2 = OooO0o(0)) == null) {
            return false;
        }
        try {
            return o0O00o0.OooO0O0(OooO0o2, this.f1284OooO0OO, f, f2);
        } catch (AbstractMethodError unused) {
            Objects.toString(OooO0o2);
            return false;
        }
    }

    public final boolean OooO0OO(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent OooO0o2;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f1285OooO0Oo || (OooO0o2 = OooO0o(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f1284OooO0OO;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f1286OooO0o0 == null) {
                this.f1286OooO0o0 = new int[2];
            }
            iArr3 = this.f1286OooO0o0;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f1284OooO0OO;
        if (OooO0o2 instanceof o000OOo0) {
            ((o000OOo0) OooO0o2).OooO0o0(view2, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                o0O00o0.OooO0OO(OooO0o2, view2, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(OooO0o2);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final void OooO0Oo(int i, int i2, int i3, int[] iArr) {
        OooO0o0(0, i, 0, i2, null, i3, iArr);
    }

    public final ViewParent OooO0o(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.f1283OooO0O0;
        }
        return this.f1282OooO00o;
    }

    public final boolean OooO0o0(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent OooO0o2;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f1285OooO0Oo || (OooO0o2 = OooO0o(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f1284OooO0OO;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f1286OooO0o0 == null) {
                this.f1286OooO0o0 = new int[2];
            }
            int[] iArr4 = this.f1286OooO0o0;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f1284OooO0OO;
        if (OooO0o2 instanceof o00) {
            ((o00) OooO0o2).OooO0O0(view2, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (OooO0o2 instanceof o000OOo0) {
                ((o000OOo0) OooO0o2).OooO0OO(view2, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    o0O00o0.OooO0Oo(OooO0o2, view2, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    Objects.toString(OooO0o2);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final boolean OooO0oO(int i, int i2) {
        boolean z;
        boolean OooO0o2;
        if (OooO0o(i2) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (this.f1285OooO0Oo) {
            View view = this.f1284OooO0OO;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof o000OOo0;
                if (z2) {
                    OooO0o2 = ((o000OOo0) parent).OooO0o(view2, view, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            OooO0o2 = o0O00o0.OooO0o(parent, view2, view, i);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                        }
                    }
                    OooO0o2 = false;
                }
                if (OooO0o2) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            this.f1283OooO0O0 = parent;
                        }
                    } else {
                        this.f1282OooO00o = parent;
                    }
                    if (z2) {
                        ((o000OOo0) parent).OooO00o(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            o0O00o0.OooO0o0(parent, view2, view, i);
                        } catch (AbstractMethodError unused2) {
                            Objects.toString(parent);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final void OooO0oo(int i) {
        ViewParent OooO0o2 = OooO0o(i);
        if (OooO0o2 != null) {
            boolean z = OooO0o2 instanceof o000OOo0;
            View view = this.f1284OooO0OO;
            if (z) {
                ((o000OOo0) OooO0o2).OooO0Oo(view, i);
            } else if (i == 0) {
                try {
                    o0O00o0.OooO0oO(OooO0o2, view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(OooO0o2);
                }
            }
            if (i != 0) {
                if (i == 1) {
                    this.f1283OooO0O0 = null;
                    return;
                }
                return;
            }
            this.f1282OooO00o = null;
        }
    }
}