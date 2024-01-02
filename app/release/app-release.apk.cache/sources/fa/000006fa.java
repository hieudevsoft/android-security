package ooOO;

import OooO0Oo.o0000OO0;
import OooOooo.o0000O;
import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import Oooo000.OooOOO;
import Oooo000.oo000o;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public final class o000oOoO extends o0000O {

    /* renamed from: OooOOOO  reason: collision with root package name */
    public static final Rect f5637OooOOOO = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: OooOOOo  reason: collision with root package name */
    public static final OooOOO0 f5638OooOOOo = new OooOOO0(7, (Object) null);

    /* renamed from: OooOOo0  reason: collision with root package name */
    public static final OooOOO0 f5639OooOOo0 = new OooOOO0(8, (Object) null);

    /* renamed from: OooO  reason: collision with root package name */
    public final View f5640OooO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final AccessibilityManager f5645OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public Oooo0o0.OooOo f5646OooOO0;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final /* synthetic */ Chip f5649OooOOO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Rect f5641OooO0Oo = new Rect();

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final Rect f5643OooO0o0 = new Rect();

    /* renamed from: OooO0o  reason: collision with root package name */
    public final Rect f5642OooO0o = new Rect();

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final int[] f5644OooO0oO = new int[2];

    /* renamed from: OooOO0O  reason: collision with root package name */
    public int f5647OooOO0O = Integer.MIN_VALUE;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f5648OooOO0o = Integer.MIN_VALUE;
    public int OooOOO0 = Integer.MIN_VALUE;

    public o000oOoO(Chip chip, Chip chip2) {
        this.f5649OooOOO = chip;
        if (chip2 != null) {
            this.f5640OooO = chip2;
            this.f5645OooO0oo = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
            chip2.setFocusable(true);
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            if (o00O0O0.OooO0OO(chip2) == 0) {
                o00O0O0.OooOOoo(chip2, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // OooOooo.o0000O
    public final o0000OO0 OooO0O0(View view) {
        if (this.f5646OooOO0 == null) {
            this.f5646OooOO0 = new Oooo0o0.OooOo(this);
        }
        return this.f5646OooOO0;
    }

    @Override // OooOooo.o0000O
    public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        super.OooO0OO(view, accessibilityEvent);
    }

    @Override // OooOooo.o0000O
    public final void OooO0Oo(View view, Oooo000.o000oOoO o000oooo) {
        boolean z;
        View.AccessibilityDelegate accessibilityDelegate = this.f1271OooO00o;
        AccessibilityNodeInfo accessibilityNodeInfo = o000oooo.f1437OooO00o;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.f5649OooOOO;
        o00O0O o00o0o = chip.f3341OooO0o0;
        if (o00o0o != null && o00o0o.f5673OoooO00) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        o000oooo.OooOO0O(chip.getText());
    }

    public final boolean OooOO0(int i) {
        if (this.f5648OooOO0o != i) {
            return false;
        }
        this.f5648OooOO0o = Integer.MIN_VALUE;
        if (i == 1) {
            Chip chip = this.f5649OooOOO;
            chip.OooOOO0 = false;
            chip.refreshDrawableState();
        }
        OooOOo0(i, 8);
        return true;
    }

    public final Oooo000.o000oOoO OooOO0O(int i) {
        boolean z;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        Oooo000.o000oOoO o000oooo = new Oooo000.o000oOoO(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f5637OooOOOO;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        o000oooo.f1438OooO0O0 = -1;
        View view = this.f5640OooO;
        obtain.setParent(view);
        OooOOOO(i, o000oooo);
        if (o000oooo.OooO0oO() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f5643OooO0o0;
        o000oooo.OooO0o(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    o000oooo.f1439OooO0OO = i;
                    obtain.setSource(view, i);
                    boolean z2 = false;
                    if (this.f5647OooOO0O == i) {
                        obtain.setAccessibilityFocused(true);
                        o000oooo.OooO00o(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        o000oooo.OooO00o(64);
                    }
                    if (this.f5648OooOO0o == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        o000oooo.OooO00o(2);
                    } else if (obtain.isFocusable()) {
                        o000oooo.OooO00o(1);
                    }
                    obtain.setFocused(z);
                    int[] iArr = this.f5644OooO0oO;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.f5641OooO0Oo;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        o000oooo.OooO0o(rect3);
                        if (o000oooo.f1438OooO0O0 != -1) {
                            Oooo000.o000oOoO o000oooo2 = new Oooo000.o000oOoO(AccessibilityNodeInfo.obtain());
                            for (int i2 = o000oooo.f1438OooO0O0; i2 != -1; i2 = o000oooo2.f1438OooO0O0) {
                                o000oooo2.f1438OooO0O0 = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo = o000oooo2.f1437OooO00o;
                                accessibilityNodeInfo.setParent(view, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                OooOOOO(i2, o000oooo2);
                                o000oooo2.OooO0o(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f5642OooO0o;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            o000oooo.f1437OooO00o.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                while (true) {
                                    ViewParent parent = view.getParent();
                                    if (parent instanceof View) {
                                        view = (View) parent;
                                        if (view.getAlpha() <= 0.0f) {
                                            break;
                                        } else if (view.getVisibility() != 0) {
                                            break;
                                        }
                                    } else if (parent != null) {
                                        z2 = true;
                                    }
                                }
                            }
                            if (z2) {
                                obtain.setVisibleToUser(true);
                            }
                        }
                    }
                    return o000oooo;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final void OooOO0o(ArrayList arrayList) {
        boolean z = false;
        arrayList.add(0);
        Rect rect = Chip.f3337OooOo0o;
        Chip chip = this.f5649OooOOO;
        if (chip.OooO0OO()) {
            o00O0O o00o0o = chip.f3341OooO0o0;
            if (o00o0o != null && o00o0o.f5666Oooo0OO) {
                z = true;
            }
            if (z && chip.f3343OooO0oo != null) {
                arrayList.add(1);
            }
        }
    }

    public final Oooo000.o000oOoO OooOOO(int i) {
        if (i == -1) {
            View view = this.f5640OooO;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            Oooo000.o000oOoO o000oooo = new Oooo000.o000oOoO(obtain);
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            OooOO0o(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                o000oooo.f1437OooO00o.addChild(view, ((Integer) arrayList.get(i2)).intValue());
            }
            return o000oooo;
        }
        return OooOO0O(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x013f, code lost:
        if (r14 < ((r15 * r15) + ((r13 * 13) * r13))) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOOO0(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ooOO.o000oOoO.OooOOO0(int, android.graphics.Rect):boolean");
    }

    public final void OooOOOO(int i, Oooo000.o000oOoO o000oooo) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = o000oooo.f1437OooO00o;
        String str = "";
        if (i == 1) {
            Chip chip = this.f5649OooOOO;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    str = text;
                }
                objArr[0] = str;
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            o000oooo.OooO0O0(OooOOO.f1425OooO0o0);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.f3337OooOo0o);
    }

    public final boolean OooOOOo(int i) {
        int i2;
        View view = this.f5640OooO;
        if ((view.isFocused() || view.requestFocus()) && (i2 = this.f5648OooOO0o) != i) {
            if (i2 != Integer.MIN_VALUE) {
                OooOO0(i2);
            }
            if (i != Integer.MIN_VALUE) {
                this.f5648OooOO0o = i;
                if (i == 1) {
                    Chip chip = this.f5649OooOOO;
                    chip.OooOOO0 = true;
                    chip.refreshDrawableState();
                }
                OooOOo0(i, 8);
                return true;
            }
        }
        return false;
    }

    public final void OooOOo0(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i != Integer.MIN_VALUE && this.f5645OooO0oo.isEnabled() && (parent = (view = this.f5640OooO).getParent()) != null) {
            if (i != -1) {
                obtain = AccessibilityEvent.obtain(i2);
                Oooo000.o000oOoO OooOOO2 = OooOOO(i);
                obtain.getText().add(OooOOO2.OooO0oO());
                AccessibilityNodeInfo accessibilityNodeInfo = OooOOO2.f1437OooO00o;
                obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
                obtain.setScrollable(accessibilityNodeInfo.isScrollable());
                obtain.setPassword(accessibilityNodeInfo.isPassword());
                obtain.setEnabled(accessibilityNodeInfo.isEnabled());
                obtain.setChecked(accessibilityNodeInfo.isChecked());
                if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
                obtain.setClassName(accessibilityNodeInfo.getClassName());
                oo000o.OooO00o(obtain, view, i);
                obtain.setPackageName(view.getContext().getPackageName());
            } else {
                obtain = AccessibilityEvent.obtain(i2);
                view.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }
}