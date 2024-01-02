package androidx.fragment.app;

import OooOooo.o0o0Oo;
import OooOooo.o0oOO;
import OooOooo.oo0oOO0;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class OooOOO extends o00O000 {
    public static void OooO(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (o0oOO.OooO0O0(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(viewGroup);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    OooO(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void OooOO0(OooOO0.OooO0O0 oooO0O0, View view) {
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        String OooOO0O2 = oo0oOO0.OooOO0O(view);
        if (OooOO0O2 != null) {
            oooO0O0.put(OooOO0O2, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    OooOO0(oooO0O0, childAt);
                }
            }
        }
    }

    public static void OooOO0O(OooOO0.OooO0O0 oooO0O0, Collection collection) {
        Iterator it = ((OooOO0.OooOO0O) oooO0O0.entrySet()).iterator();
        while (it.hasNext()) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            if (!collection.contains(oo0oOO0.OooOO0O((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x05ed, code lost:
        if (androidx.fragment.app.o0000oo.OooOooo(2) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x05f7, code lost:
        if (androidx.fragment.app.o0000oo.OooOooo(2) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x05f9, code lost:
        java.util.Objects.toString(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x05fc, code lost:
        r4.OooO0O0();
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0506  */
    @Override // androidx.fragment.app.o00O000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0(java.util.ArrayList r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 1625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.OooOOO.OooO0O0(java.util.ArrayList, boolean):void");
    }
}