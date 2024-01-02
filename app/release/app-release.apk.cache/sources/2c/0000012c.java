package OooOooo;

import OooO0O0.OooO00o;
import Oooo000.OooOOO;
import Oooo000.o000OOo;
import Oooo000.o000oOoO;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import hieubui.eup.android_app_security.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class o0000O {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final View.AccessibilityDelegate f1270OooO0OO = new View.AccessibilityDelegate();

    /* renamed from: OooO00o  reason: collision with root package name */
    public final View.AccessibilityDelegate f1271OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0000O0O f1272OooO0O0;

    public o0000O() {
        this(f1270OooO0OO);
    }

    public void OooO(View view, AccessibilityEvent accessibilityEvent) {
        this.f1271OooO00o.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean OooO00o(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1271OooO00o.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public OooO0Oo.o0000OO0 OooO0O0(View view) {
        AccessibilityNodeProvider OooO00o2 = o000OO.OooO00o(this.f1271OooO00o, view);
        if (OooO00o2 != null) {
            return new OooO0Oo.o0000OO0(14, OooO00o2);
        }
        return null;
    }

    public void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        this.f1271OooO00o.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void OooO0Oo(View view, o000oOoO o000oooo) {
        this.f1271OooO00o.onInitializeAccessibilityNodeInfo(view, o000oooo.f1437OooO00o);
    }

    public boolean OooO0o(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1271OooO00o.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void OooO0o0(View view, AccessibilityEvent accessibilityEvent) {
        this.f1271OooO00o.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean OooO0oO(View view, int i, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z;
        WeakReference weakReference;
        boolean z2;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i2 >= list.size()) {
                break;
            }
            OooOOO oooOOO = (OooOOO) list.get(i2);
            if (oooOOO.OooO00o() == i) {
                o000OOo o000ooo = oooOOO.f1434OooO0Oo;
                if (o000ooo != null) {
                    Class cls = oooOOO.f1433OooO0OO;
                    if (cls != null) {
                        try {
                            OooO00o.OooO0oO(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            throw null;
                        } catch (Exception unused) {
                            z = o000ooo.OooO0o(view);
                        }
                    }
                    z = o000ooo.OooO0o(view);
                }
            } else {
                i2++;
            }
        }
        z = false;
        if (!z) {
            z = o000OO.OooO0O0(this.f1271OooO00o, view, i, bundle);
        }
        if (!z && i == R.id.accessibility_action_clickable_span && bundle != null) {
            int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    CharSequence text = view.createAccessibilityNodeInfo().getText();
                    if (text instanceof Spanned) {
                        clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    }
                    for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                        if (clickableSpan.equals(clickableSpanArr[i4])) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    clickableSpan.onClick(view);
                    z3 = true;
                }
            }
            return z3;
        }
        return z;
    }

    public void OooO0oo(View view, int i) {
        this.f1271OooO00o.sendAccessibilityEvent(view, i);
    }

    public o0000O(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1271OooO00o = accessibilityDelegate;
        this.f1272OooO0O0 = new o0000O0O(this);
    }
}