package androidx.fragment.app;

import OooOooo.o0o0Oo;
import OooOooo.oo0o0O0;
import OooOooo.oo0oOO0;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class o000O {
    public static void OooO0Oo(View view, List list) {
        boolean z;
        boolean z2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (list.get(i) == view) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        if (oo0oOO0.OooOO0O(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            if (list.get(i4) == childAt) {
                                z2 = true;
                                break;
                            }
                            i4++;
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (!z2 && oo0oOO0.OooOO0O(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static void OooO0oO(View view, Rect rect) {
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        if (!oo0o0O0.OooO0O0(view)) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        int[] iArr = new int[2];
        view.getRootView().getLocationOnScreen(iArr);
        rectF.offset(iArr[0], iArr[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public static boolean OooO0oo(List list) {
        return list == null || list.isEmpty();
    }

    public static ArrayList OooOO0O(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            arrayList2.add(oo0oOO0.OooOO0O(view));
            oo0oOO0.OooOo0O(view, null);
        }
        return arrayList2;
    }

    public static void OooOOo0(ViewGroup viewGroup, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, OooOO0.OooO0O0 oooO0O0) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            String OooOO0O2 = oo0oOO0.OooOO0O(view);
            arrayList4.add(OooOO0O2);
            if (OooOO0O2 != null) {
                oo0oOO0.OooOo0O(view, null);
                String str = (String) oooO0O0.getOrDefault(OooOO0O2, null);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        oo0oOO0.OooOo0O((View) arrayList2.get(i2), OooOO0O2);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        OooOooo.o00O000o.OooO00o(viewGroup, new o000O0O0(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract Object OooO(Object obj, Object obj2, Object obj3);

    public abstract void OooO00o(View view, Object obj);

    public abstract void OooO0O0(Object obj, ArrayList arrayList);

    public abstract void OooO0OO(ViewGroup viewGroup, Object obj);

    public abstract Object OooO0o(Object obj);

    public abstract boolean OooO0o0(Object obj);

    public abstract Object OooOO0(Object obj, Object obj2, Object obj3);

    public abstract void OooOO0o(Object obj, View view, ArrayList arrayList);

    public abstract void OooOOO(View view, Object obj);

    public abstract void OooOOO0(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void OooOOOO(Object obj, Rect rect);

    public void OooOOOo(Object obj, Runnable runnable) {
        runnable.run();
    }

    public abstract void OooOOo(Object obj, View view, ArrayList arrayList);

    public abstract void OooOOoo(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object OooOo00(Object obj);
}