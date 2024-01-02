package OoooOoo;

import OooO0O0.OooO00o;
import OooOO0.OooO0O0;
import OooOooo.o0o0Oo;
import OooOooo.oo0o0O0;
import android.view.ViewGroup;
import hieubui.eup.android_app_security.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class oO0000Oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o0OO0o00 f1661OooO00o = new o0OO0o00();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final ThreadLocal f1662OooO0O0 = new ThreadLocal();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final ArrayList f1663OooO0OO = new ArrayList();

    public static void OooO00o(ViewGroup viewGroup, oO00000 oo00000) {
        ArrayList arrayList = f1663OooO0OO;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            if (oo0o0O0.OooO0OO(viewGroup)) {
                arrayList.add(viewGroup);
                if (oo00000 == null) {
                    oo00000 = f1661OooO00o;
                }
                oO00000 clone = oo00000.clone();
                ArrayList arrayList2 = (ArrayList) OooO0O0().getOrDefault(viewGroup, null);
                if (arrayList2 != null && arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((oO00000) it.next()).OooOo0(viewGroup);
                    }
                }
                if (clone != null) {
                    clone.OooO0oo(viewGroup, true);
                }
                OooO00o.OooO0oO(viewGroup.getTag(R.id.transition_current_scene));
                viewGroup.setTag(R.id.transition_current_scene, null);
                if (clone != null) {
                    oO0000O oo0000o = new oO0000O(viewGroup, clone);
                    viewGroup.addOnAttachStateChangeListener(oo0000o);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(oo0000o);
                }
            }
        }
    }

    public static OooO0O0 OooO0O0() {
        OooO0O0 oooO0O0;
        ThreadLocal threadLocal = f1662OooO0O0;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference == null || (oooO0O0 = (OooO0O0) weakReference.get()) == null) {
            OooO0O0 oooO0O02 = new OooO0O0();
            threadLocal.set(new WeakReference(oooO0O02));
            return oooO0O02;
        }
        return oooO0O0;
    }
}