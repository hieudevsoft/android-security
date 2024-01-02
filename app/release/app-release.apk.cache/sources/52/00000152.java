package OooOooo;

import OooO0O0.OooO00o;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import hieubui.eup.android_app_security.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o00OOO0O {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final ArrayList f1302OooO0Oo = new ArrayList();

    /* renamed from: OooO00o  reason: collision with root package name */
    public WeakHashMap f1303OooO00o = null;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public SparseArray f1304OooO0O0 = null;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public WeakReference f1305OooO0OO = null;

    public static void OooO0O0(View view) {
        int size;
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return;
        }
        OooO00o.OooO0oO(arrayList.get(size));
        throw null;
    }

    public final View OooO00o(View view) {
        View OooO00o2;
        WeakHashMap weakHashMap = this.f1303OooO00o;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                    OooO00o2 = OooO00o(viewGroup.getChildAt(childCount));
                }
            } while (OooO00o2 == null);
            return OooO00o2;
        }
        OooO0O0(view);
        return null;
    }
}