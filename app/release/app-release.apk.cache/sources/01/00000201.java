package OoooOoo;

import OooOooo.o00O0O0O;
import OooOooo.o00O0OO0;
import OooOooo.o0o0Oo;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import o00000.o000;

/* loaded from: classes.dex */
public final class o0OO0oO0 extends Property {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1600OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0OO0oO0(Class cls, String str, int i) {
        super(cls, str);
        this.f1600OooO00o = i;
    }

    public final Float OooO00o(View view) {
        switch (this.f1600OooO00o) {
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return Float.valueOf(oO0Ooooo.f1692OooO00o.OooOoOO(view));
            case 6:
            default:
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                return Float.valueOf(o00O0O0O.OooO0o0(view));
            case 7:
                return Float.valueOf(view.getLayoutParams().width);
            case 8:
                return Float.valueOf(view.getLayoutParams().height);
            case 9:
                WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
                return Float.valueOf(o00O0O0O.OooO0o(view));
        }
    }

    public final void OooO0O0(o0OOO0 o0ooo0, PointF pointF) {
        switch (this.f1600OooO00o) {
            case 0:
                o0ooo0.getClass();
                o0ooo0.f1601OooO00o = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                o0ooo0.f1602OooO0O0 = round;
                int i = o0ooo0.f1605OooO0o + 1;
                o0ooo0.f1605OooO0o = i;
                if (i == o0ooo0.f1607OooO0oO) {
                    oO0Ooooo.OooO00o(o0ooo0.f1606OooO0o0, o0ooo0.f1601OooO00o, round, o0ooo0.f1603OooO0OO, o0ooo0.f1604OooO0Oo);
                    o0ooo0.f1605OooO0o = 0;
                    o0ooo0.f1607OooO0oO = 0;
                    return;
                }
                return;
            default:
                o0ooo0.getClass();
                o0ooo0.f1603OooO0OO = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                o0ooo0.f1604OooO0Oo = round2;
                int i2 = o0ooo0.f1607OooO0oO + 1;
                o0ooo0.f1607OooO0oO = i2;
                if (o0ooo0.f1605OooO0o == i2) {
                    oO0Ooooo.OooO00o(o0ooo0.f1606OooO0o0, o0ooo0.f1601OooO00o, o0ooo0.f1602OooO0O0, o0ooo0.f1603OooO0OO, round2);
                    o0ooo0.f1605OooO0o = 0;
                    o0ooo0.f1607OooO0oO = 0;
                    return;
                }
                return;
        }
    }

    public final void OooO0OO(View view, PointF pointF) {
        switch (this.f1600OooO00o) {
            case 2:
                oO0Ooooo.OooO00o(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                return;
            case 3:
                oO0Ooooo.OooO00o(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                return;
            default:
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                oO0Ooooo.OooO00o(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
                return;
        }
    }

    public final void OooO0Oo(View view, Float f) {
        switch (this.f1600OooO00o) {
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                oO0Ooooo.f1692OooO00o.OooOoo0(view, f.floatValue());
                return;
            case 6:
            default:
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                o00O0O0O.OooOO0O(view, o00O0O0O.OooO0o(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
                return;
            case 7:
                view.getLayoutParams().width = f.intValue();
                view.requestLayout();
                return;
            case 8:
                view.getLayoutParams().height = f.intValue();
                view.requestLayout();
                return;
            case 9:
                int intValue = f.intValue();
                int paddingTop = view.getPaddingTop();
                WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
                o00O0O0O.OooOO0O(view, intValue, paddingTop, o00O0O0O.OooO0o0(view), view.getPaddingBottom());
                return;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f1600OooO00o) {
            case 0:
                o0OOO0 o0ooo0 = (o0OOO0) obj;
                return null;
            case 1:
                o0OOO0 o0ooo02 = (o0OOO0) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case 3:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return OooO00o((View) obj);
            case 6:
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                return o00O0OO0.OooO00o((View) obj);
            case 7:
                return OooO00o((View) obj);
            case 8:
                return OooO00o((View) obj);
            case 9:
                return OooO00o((View) obj);
            default:
                return OooO00o((View) obj);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f1600OooO00o) {
            case 0:
                OooO0O0((o0OOO0) obj, (PointF) obj2);
                return;
            case 1:
                OooO0O0((o0OOO0) obj, (PointF) obj2);
                return;
            case 2:
                OooO0OO((View) obj, (PointF) obj2);
                return;
            case 3:
                OooO0OO((View) obj, (PointF) obj2);
                return;
            case 4:
                OooO0OO((View) obj, (PointF) obj2);
                return;
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                OooO0Oo((View) obj, (Float) obj2);
                return;
            case 6:
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                o00O0OO0.OooO0OO((View) obj, (Rect) obj2);
                return;
            case 7:
                OooO0Oo((View) obj, (Float) obj2);
                return;
            case 8:
                OooO0Oo((View) obj, (Float) obj2);
                return;
            case 9:
                OooO0Oo((View) obj, (Float) obj2);
                return;
            default:
                OooO0Oo((View) obj, (Float) obj2);
                return;
        }
    }
}