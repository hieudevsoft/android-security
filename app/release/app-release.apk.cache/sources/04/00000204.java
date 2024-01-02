package OoooOoo;

import OooOooo.o0o0Oo;
import OooOooo.oo0o0O0;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0OOO0OO extends oO00000 {

    /* renamed from: OooOo  reason: collision with root package name */
    public static final String[] f1610OooOo = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: OooOoO  reason: collision with root package name */
    public static final o0OO0oO0 f1611OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public static final o0OO0oO0 f1612OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public static final o0OO0oO0 f1613OooOoOO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public static final o0OO0oO0 f1614OooOoo;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public static final o0OO0oO0 f1615OooOoo0;

    static {
        new o0OO0o();
        f1612OooOoO0 = new o0OO0oO0(PointF.class, "topLeft", 0);
        f1611OooOoO = new o0OO0oO0(PointF.class, "bottomRight", 1);
        f1613OooOoOO = new o0OO0oO0(PointF.class, "bottomRight", 2);
        f1615OooOoo0 = new o0OO0oO0(PointF.class, "topLeft", 3);
        f1614OooOoo = new o0OO0oO0(PointF.class, "position", 4);
    }

    @Override // OoooOoo.oO00000
    public final void OooO0Oo(oO000O0O oo000o0o) {
        Oooo00o(oo000o0o);
    }

    @Override // OoooOoo.oO00000
    public final void OooO0oO(oO000O0O oo000o0o) {
        Oooo00o(oo000o0o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    @Override // OoooOoo.oO00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator OooOO0O(android.view.ViewGroup r19, OoooOoo.oO000O0O r20, OoooOoo.oO000O0O r21) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOoo.o0OOO0OO.OooOO0O(android.view.ViewGroup, OoooOoo.oO000O0O, OoooOoo.oO000O0O):android.animation.Animator");
    }

    @Override // OoooOoo.oO00000
    public final String[] OooOOOo() {
        return f1610OooOo;
    }

    public final void Oooo00o(oO000O0O oo000o0o) {
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        View view = oo000o0o.f1669OooO0O0;
        if (oo0o0O0.OooO0OO(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = oo000o0o.f1668OooO00o;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }
}