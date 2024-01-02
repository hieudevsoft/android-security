package Oooo000;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class o000oOoO {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static int f1436OooO0Oo;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final AccessibilityNodeInfo f1437OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f1438OooO0O0 = -1;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f1439OooO0OO = -1;

    public o000oOoO(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1437OooO00o = accessibilityNodeInfo;
    }

    public static String OooO0Oo(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908382:
                        return "ACTION_SCROLL_IN_DIRECTION";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i) {
                                            case 16908372:
                                                return "ACTION_IME_ENTER";
                                            case 16908373:
                                                return "ACTION_DRAG_START";
                                            case 16908374:
                                                return "ACTION_DRAG_DROP";
                                            case 16908375:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public final void OooO(Oooo0 oooo0) {
        this.f1437OooO00o.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) oooo0.f1435OooO00o);
    }

    public final void OooO00o(int i) {
        this.f1437OooO00o.addAction(i);
    }

    public final void OooO0O0(OooOOO oooOOO) {
        this.f1437OooO00o.addAction((AccessibilityNodeInfo.AccessibilityAction) oooOOO.f1431OooO00o);
    }

    public final ArrayList OooO0OO(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1437OooO00o;
        ArrayList<Integer> integerArrayList = OooOOOO.OooO0OO(accessibilityNodeInfo).getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            OooOOOO.OooO0OO(accessibilityNodeInfo).putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public final void OooO0o(Rect rect) {
        this.f1437OooO00o.getBoundsInParent(rect);
    }

    public final boolean OooO0o0(int i) {
        Bundle OooO0OO2 = OooOOOO.OooO0OO(this.f1437OooO00o);
        if (OooO0OO2 == null || (OooO0OO2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) != i) {
            return false;
        }
        return true;
    }

    public final CharSequence OooO0oO() {
        boolean z = !OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1437OooO00o;
        if (z) {
            ArrayList OooO0OO2 = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList OooO0OO3 = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList OooO0OO4 = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList OooO0OO5 = OooO0OO("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i = 0; i < OooO0OO2.size(); i++) {
                spannableString.setSpan(new OooO00o(((Integer) OooO0OO5.get(i)).intValue(), this, OooOOOO.OooO0OO(accessibilityNodeInfo).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) OooO0OO2.get(i)).intValue(), ((Integer) OooO0OO3.get(i)).intValue(), ((Integer) OooO0OO4.get(i)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    public final void OooO0oo(int i, boolean z) {
        Bundle OooO0OO2 = OooOOOO.OooO0OO(this.f1437OooO00o);
        if (OooO0OO2 != null) {
            int i2 = OooO0OO2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            OooO0OO2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final void OooOO0(String str) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1437OooO00o;
        if (i >= 26) {
            OooO0Oo.o0Oo0oo.OooO0o(accessibilityNodeInfo, str);
        } else {
            OooOOOO.OooO0OO(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void OooOO0O(CharSequence charSequence) {
        this.f1437OooO00o.setText(charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof o000oOoO)) {
            o000oOoO o000oooo = (o000oOoO) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = o000oooo.f1437OooO00o;
            AccessibilityNodeInfo accessibilityNodeInfo2 = this.f1437OooO00o;
            if (accessibilityNodeInfo2 == null) {
                if (accessibilityNodeInfo != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
                return false;
            }
            return this.f1439OooO0OO == o000oooo.f1439OooO0OO && this.f1438OooO0O0 == o000oooo.f1438OooO0O0;
        }
        return false;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1437OooO00o;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public final String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String string;
        CharSequence charSequence3;
        boolean OooO0o02;
        boolean OooO0o03;
        ?? emptyList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        OooO0o(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1437OooO00o;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            Oooo000.OooO00o(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) OooOOOO.OooO0OO(accessibilityNodeInfo).getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(OooO0oO());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        if (i >= 30) {
            charSequence = OooOo00.OooO0O0(accessibilityNodeInfo);
        } else {
            charSequence = OooOOOO.OooO0OO(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        sb.append(charSequence);
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; tooltipText: ");
        if (i >= 28) {
            charSequence2 = OooOoo.o00Ooo.OooOOOO(accessibilityNodeInfo);
        } else {
            charSequence2 = OooOOOO.OooO0OO(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        sb.append(charSequence2);
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (i >= 33) {
            string = OooOo.OooO0oO(accessibilityNodeInfo);
        } else {
            string = OooOOOO.OooO0OO(accessibilityNodeInfo).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(string);
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        if (i >= 34) {
            charSequence3 = Oooo000.OooO0O0(accessibilityNodeInfo);
        } else {
            charSequence3 = OooOOOO.OooO0OO(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb.append(charSequence3);
        sb.append("; granularScrollingSupported: ");
        sb.append(OooO0o0(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        if (i >= 33) {
            OooO0o02 = OooOo.OooO0oo(accessibilityNodeInfo);
        } else {
            OooO0o02 = OooO0o0(8388608);
        }
        sb.append(OooO0o02);
        sb.append("; accessibilityDataSensitive: ");
        if (i >= 34) {
            OooO0o03 = Oooo000.OooO0o0(accessibilityNodeInfo);
        } else {
            OooO0o03 = OooO0o0(64);
        }
        sb.append(OooO0o03);
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i2 = 0; i2 < size; i2++) {
                emptyList.add(new OooOOO(actionList.get(i2), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i3 = 0; i3 < emptyList.size(); i3++) {
            OooOOO oooOOO = (OooOOO) emptyList.get(i3);
            String OooO0Oo2 = OooO0Oo(oooOOO.OooO00o());
            if (OooO0Oo2.equals("ACTION_UNKNOWN")) {
                Object obj = oooOOO.f1431OooO00o;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    OooO0Oo2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb.append(OooO0Oo2);
            if (i3 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public o000oOoO(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        this.f1437OooO00o = accessibilityNodeInfo;
    }
}