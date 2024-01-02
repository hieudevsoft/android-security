package OooOooo;

import OooOoo.o00Ooo;
import Oooo000.OooOOO;
import Oooo000.OooOOOO;
import Oooo000.OooOo00;
import Oooo000.o000oOoO;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import hieubui.eup.android_app_security.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0000O0O extends View.AccessibilityDelegate {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0000O f1273OooO00o;

    public o0000O0O(o0000O o0000o2) {
        this.f1273OooO00o = o0000o2;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1273OooO00o.OooO00o(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        OooO0Oo.o0000OO0 OooO0O02 = this.f1273OooO00o.OooO0O0(view);
        if (OooO0O02 != null) {
            return (AccessibilityNodeProvider) OooO0O02.f183OooO0O0;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1273OooO00o.OooO0OO(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        ClickableSpan[] clickableSpanArr;
        int i;
        o000oOoO o000oooo = new o000oOoO(accessibilityNodeInfo);
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        int i2 = 0;
        Boolean bool = (Boolean) new o00O00o0(R.id.tag_screen_reader_focusable, 0).OooO0O0(view);
        boolean z2 = true;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            o00Ooo.OooOOo(accessibilityNodeInfo, z);
        } else {
            o000oooo.OooO0oo(1, z);
        }
        Boolean bool2 = (Boolean) new o00O00o0(R.id.tag_accessibility_heading, 3).OooO0O0(view);
        z2 = (bool2 == null || !bool2.booleanValue()) ? false : false;
        if (i3 >= 28) {
            o00Ooo.OooOo0o(accessibilityNodeInfo, z2);
        } else {
            o000oooo.OooO0oo(2, z2);
        }
        CharSequence OooO0Oo2 = o0o0Oo.OooO0Oo(view);
        if (i3 >= 28) {
            o00Ooo.OooOOo0(accessibilityNodeInfo, OooO0Oo2);
        } else {
            OooOOOO.OooO0OO(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", OooO0Oo2);
        }
        CharSequence charSequence = (CharSequence) new o00O00o0(R.id.tag_state_description, 64, 30, 2).OooO0O0(view);
        if (i3 >= 30) {
            OooOo00.OooO0OO(accessibilityNodeInfo, charSequence);
        } else {
            OooOOOO.OooO0OO(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f1273OooO00o.OooO0Oo(view, o000oooo);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i3 < 26) {
            OooOOOO.OooO0OO(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            OooOOOO.OooO0OO(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            OooOOOO.OooO0OO(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            OooOOOO.OooO0OO(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    if (((WeakReference) sparseArray.valueAt(i4)).get() == null) {
                        arrayList.add(Integer.valueOf(i4));
                    }
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    sparseArray.remove(((Integer) arrayList.get(i5)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                OooOOOO.OooO0OO(o000oooo.f1437OooO00o).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i6 = 0;
                while (i6 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i6];
                    int i7 = i2;
                    while (true) {
                        if (i7 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                                i = sparseArray2.keyAt(i7);
                                break;
                            }
                            i7++;
                        } else {
                            i = o000oOoO.f1436OooO0Oo;
                            o000oOoO.f1436OooO0Oo = i + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i, new WeakReference(clickableSpanArr[i6]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i6];
                    Spanned spanned = (Spanned) text;
                    o000oooo.OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    o000oooo.OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    o000oooo.OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    o000oooo.OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    i6++;
                    i2 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            o000oooo.OooO0O0((OooOOO) list.get(i8));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1273OooO00o.OooO0o0(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1273OooO00o.OooO0o(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f1273OooO00o.OooO0oO(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f1273OooO00o.OooO0oo(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f1273OooO00o.OooO(view, accessibilityEvent);
    }
}