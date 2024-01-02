package OooOooo;

import Oooo0.o00oO0o;
import Oooo000.OooOOO;
import Oooo000.o000OOo;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import hieubui.eup.android_app_security.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class o0o0Oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static WeakHashMap f1363OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static Field f1364OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static boolean f1365OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final int[] f1366OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final oo00o f1367OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final o00O00OO f1368OooO0o0;

    static {
        new AtomicInteger(1);
        f1363OooO00o = null;
        f1365OooO0OO = false;
        f1366OooO0Oo = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f1368OooO0o0 = new o00O00OO();
        f1367OooO0o = new oo00o();
    }

    public static void OooO(View view, int i) {
        ArrayList OooO0o02 = OooO0o0(view);
        for (int i2 = 0; i2 < OooO0o02.size(); i2++) {
            if (((OooOOO) OooO0o02.get(i2)).OooO00o() == i) {
                OooO0o02.remove(i2);
                return;
            }
        }
    }

    public static o0 OooO00o(View view) {
        if (f1363OooO00o == null) {
            f1363OooO00o = new WeakHashMap();
        }
        o0 o0Var = (o0) f1363OooO00o.get(view);
        if (o0Var == null) {
            o0 o0Var2 = new o0(view);
            f1363OooO00o.put(view, o0Var2);
            return o0Var2;
        }
        return o0Var;
    }

    public static boolean OooO0O0(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = o00OOO0O.f1302OooO0Oo;
        o00OOO0O o00ooo0o = (o00OOO0O) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (o00ooo0o == null) {
            o00ooo0o = new o00OOO0O();
            view.setTag(R.id.tag_unhandled_key_event_manager, o00ooo0o);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = o00ooo0o.f1303OooO00o;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = o00OOO0O.f1302OooO0Oo;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (o00ooo0o.f1303OooO00o == null) {
                        o00ooo0o.f1303OooO00o = new WeakHashMap();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList arrayList3 = o00OOO0O.f1302OooO0Oo;
                        View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            o00ooo0o.f1303OooO00o.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                o00ooo0o.f1303OooO00o.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View OooO00o2 = o00ooo0o.OooO00o(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (OooO00o2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (o00ooo0o.f1304OooO0O0 == null) {
                    o00ooo0o.f1304OooO0O0 = new SparseArray();
                }
                o00ooo0o.f1304OooO0O0.put(keyCode, new WeakReference(OooO00o2));
            }
        }
        if (OooO00o2 == null) {
            return false;
        }
        return true;
    }

    public static View.AccessibilityDelegate OooO0OO(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return o00OO0OO.OooO00o(view);
        }
        if (f1365OooO0OO) {
            return null;
        }
        if (f1364OooO0O0 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1364OooO0O0 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1365OooO0OO = true;
                return null;
            }
        }
        Object obj = f1364OooO0O0.get(view);
        if (!(obj instanceof View.AccessibilityDelegate)) {
            return null;
        }
        return (View.AccessibilityDelegate) obj;
    }

    public static CharSequence OooO0Oo(View view) {
        return (CharSequence) new o00O00o0(R.id.tag_accessibility_pane_title, 8, 28, 1).OooO0O0(view);
    }

    public static String[] OooO0o(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o00OO.OooO00o(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static ArrayList OooO0o0(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void OooO0oO(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (OooO0Oo(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 32;
        if (oo0o0O0.OooO00o(view) == 0 && !z) {
            if (i == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                oo0o0O0.OooO0oO(obtain, i);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(OooO0Oo(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    oo0o0O0.OooO0o0(view.getParent(), view, view, i);
                    return;
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass();
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z) {
            i2 = 2048;
        }
        obtain2.setEventType(i2);
        oo0o0O0.OooO0oO(obtain2, i);
        if (z) {
            obtain2.getText().add(OooO0Oo(view));
            if (o00O0O0.OooO0OO(view) == 0) {
                o00O0O0.OooOOoo(view, 1);
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static o000O00 OooO0oo(View view, o000O00 o000o00) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(o000o00);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o00OO.OooO0O0(view, o000o00);
        }
        o00oOoo o00oooo = (o00oOoo) view.getTag(R.id.tag_on_receive_content_listener);
        o00O000 o00o000 = f1368OooO0o0;
        if (o00oooo != null) {
            o000O00 OooO00o2 = ((o00oO0o) o00oooo).OooO00o(view, o000o00);
            if (OooO00o2 == null) {
                return null;
            }
            if (view instanceof o00O000) {
                o00o000 = (o00O000) view;
            }
            return o00o000.OooO00o(OooO00o2);
        }
        if (view instanceof o00O000) {
            o00o000 = (o00O000) view;
        }
        return o00o000.OooO00o(o000o00);
    }

    public static void OooOO0(View view, OooOOO oooOOO, o000OOo o000ooo) {
        o0000O o0000o2;
        OooOOO oooOOO2 = new OooOOO(null, oooOOO.f1432OooO0O0, null, o000ooo, oooOOO.f1433OooO0OO);
        View.AccessibilityDelegate OooO0OO2 = OooO0OO(view);
        if (OooO0OO2 == null) {
            o0000o2 = null;
        } else if (OooO0OO2 instanceof o0000O0O) {
            o0000o2 = ((o0000O0O) OooO0OO2).f1273OooO00o;
        } else {
            o0000o2 = new o0000O(OooO0OO2);
        }
        if (o0000o2 == null) {
            o0000o2 = new o0000O();
        }
        OooOO0o(view, o0000o2);
        OooO(view, oooOOO2.OooO00o());
        OooO0o0(view).add(oooOOO2);
        OooO0oO(view, 0);
    }

    public static void OooOO0O(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            o00OO0OO.OooO0Oo(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void OooOO0o(View view, o0000O o0000o2) {
        o0000O0O o0000o0o2;
        if (o0000o2 == null && (OooO0OO(view) instanceof o0000O0O)) {
            o0000o2 = new o0000O();
        }
        if (o00O0O0.OooO0OO(view) == 0) {
            o00O0O0.OooOOoo(view, 1);
        }
        if (o0000o2 == null) {
            o0000o0o2 = null;
        } else {
            o0000o0o2 = o0000o2.f1272OooO0O0;
        }
        view.setAccessibilityDelegate(o0000o0o2);
    }

    public static void OooOOO0(View view, CharSequence charSequence) {
        boolean z = true;
        new o00O00o0(R.id.tag_accessibility_pane_title, 8, 28, 1).OooO0OO(view, charSequence);
        oo00o oo00oVar = f1367OooO0o;
        if (charSequence != null) {
            oo00oVar.f1377OooO00o.put(view, Boolean.valueOf((view.isShown() && view.getWindowVisibility() == 0) ? false : false));
            view.addOnAttachStateChangeListener(oo00oVar);
            if (oo0o0O0.OooO0O0(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(oo00oVar);
                return;
            }
            return;
        }
        oo00oVar.f1377OooO00o.remove(view);
        view.removeOnAttachStateChangeListener(oo00oVar);
        o00O0O0.OooOOOO(view.getViewTreeObserver(), oo00oVar);
    }
}