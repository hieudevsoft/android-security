package com.google.android.material.bottomsheet;

import OooO0O0.OooO00o;
import OooOOoo.o00Oo0;
import OooOOoo.o00oO0o;
import OooOooo.o0000O;
import OooOooo.o0000O0O;
import OooOooo.o0o0Oo;
import OooOooo.oo0oOO0;
import Oooo000.OooOOO;
import Oooo0o0.o000oOoO;
import Oooooo.o00000;
import Oooooo.o000000;
import Oooooo.o000000O;
import Oooooo.o00000O0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import hieubui.eup.android_app_security.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import o0ooOO0.OooOOOO;
import o0ooOO0.Oooo0;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends o00Oo0 {

    /* renamed from: OooO  reason: collision with root package name */
    public OooOOOO f3254OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f3255OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f3256OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final float f3257OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f3258OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f3259OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f3260OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f3261OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final int f3262OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final ColorStateList f3263OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public int f3264OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f3265OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public boolean f3266OooOOO;
    public int OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public final boolean f3267OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public final boolean f3268OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public final boolean f3269OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final boolean f3270OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public final boolean f3271OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public final boolean f3272OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public final boolean f3273OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public final boolean f3274OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public int f3275OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public int f3276OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public boolean f3277OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public final Oooo0 f3278OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public final o00000O0 f3279OooOoOO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public int f3280OooOoo;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public ValueAnimator f3281OooOoo0;

    /* renamed from: OooOooO  reason: collision with root package name */
    public int f3282OooOooO;

    /* renamed from: OooOooo  reason: collision with root package name */
    public int f3283OooOooo;

    /* renamed from: Oooo  reason: collision with root package name */
    public boolean f3284Oooo;

    /* renamed from: Oooo0  reason: collision with root package name */
    public boolean f3285Oooo0;

    /* renamed from: Oooo000  reason: collision with root package name */
    public float f3286Oooo000;

    /* renamed from: Oooo00O  reason: collision with root package name */
    public int f3287Oooo00O;

    /* renamed from: Oooo00o  reason: collision with root package name */
    public final float f3288Oooo00o;

    /* renamed from: Oooo0O0  reason: collision with root package name */
    public boolean f3289Oooo0O0;

    /* renamed from: Oooo0OO  reason: collision with root package name */
    public boolean f3290Oooo0OO;

    /* renamed from: Oooo0o  reason: collision with root package name */
    public o000oOoO f3291Oooo0o;

    /* renamed from: Oooo0o0  reason: collision with root package name */
    public int f3292Oooo0o0;

    /* renamed from: Oooo0oO  reason: collision with root package name */
    public boolean f3293Oooo0oO;

    /* renamed from: Oooo0oo  reason: collision with root package name */
    public int f3294Oooo0oo;

    /* renamed from: OoooO  reason: collision with root package name */
    public int f3295OoooO;

    /* renamed from: OoooO0  reason: collision with root package name */
    public int f3296OoooO0;

    /* renamed from: OoooO00  reason: collision with root package name */
    public final float f3297OoooO00;

    /* renamed from: OoooO0O  reason: collision with root package name */
    public int f3298OoooO0O;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public WeakReference f3299OoooOO0;

    /* renamed from: OoooOOO  reason: collision with root package name */
    public final ArrayList f3300OoooOOO;

    /* renamed from: OoooOOo  reason: collision with root package name */
    public VelocityTracker f3301OoooOOo;

    /* renamed from: OoooOo0  reason: collision with root package name */
    public int f3302OoooOo0;
    public int OoooOoO;

    /* renamed from: OoooOoo  reason: collision with root package name */
    public boolean f3303OoooOoo;

    /* renamed from: Ooooo00  reason: collision with root package name */
    public HashMap f3304Ooooo00;

    /* renamed from: Ooooo0o  reason: collision with root package name */
    public final SparseIntArray f3305Ooooo0o;

    /* renamed from: OooooO0  reason: collision with root package name */
    public final o000000O f3306OooooO0;

    /* renamed from: o000oOoO  reason: collision with root package name */
    public WeakReference f3307o000oOoO;

    public BottomSheetBehavior() {
        this.f3255OooO00o = 0;
        this.f3256OooO0O0 = true;
        this.f3264OooOO0O = -1;
        this.f3265OooOO0o = -1;
        this.f3279OooOoOO = new o00000O0(this, 0);
        this.f3286Oooo000 = 0.5f;
        this.f3288Oooo00o = -1.0f;
        this.f3290Oooo0OO = true;
        this.f3292Oooo0o0 = 4;
        this.f3297OoooO00 = 0.1f;
        this.f3300OoooOOO = new ArrayList();
        this.OoooOoO = -1;
        this.f3305Ooooo0o = new SparseIntArray();
        this.f3306OooooO0 = new o000000O(this);
    }

    public static View OooOo0O(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        if (oo0oOO0.OooOOOo(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View OooOo0O2 = OooOo0O(viewGroup.getChildAt(i));
                if (OooOo0O2 != null) {
                    return OooOo0O2;
                }
            }
        }
        return null;
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooO(View view) {
        WeakReference weakReference = this.f3307o000oOoO;
        return (weakReference == null || view != weakReference.get() || this.f3292Oooo0o0 == 3) ? false : true;
    }

    @Override // OooOOoo.o00Oo0
    public final void OooO0OO(o00oO0o o00oo0o) {
        this.f3299OoooOO0 = null;
        this.f3291Oooo0o = null;
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooO0o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        View view2;
        int i;
        o000oOoO o000oooo;
        if (view.isShown() && this.f3290Oooo0OO) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.f3302OoooOo0 = -1;
                this.OoooOoO = -1;
                VelocityTracker velocityTracker = this.f3301OoooOOo;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f3301OoooOOo = null;
                }
            }
            if (this.f3301OoooOOo == null) {
                this.f3301OoooOOo = VelocityTracker.obtain();
            }
            this.f3301OoooOOo.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f3303OoooOoo = false;
                    this.f3302OoooOo0 = -1;
                    if (this.f3293Oooo0oO) {
                        this.f3293Oooo0oO = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.OoooOoO = (int) motionEvent.getY();
                if (this.f3292Oooo0o0 != 2) {
                    WeakReference weakReference = this.f3307o000oOoO;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.OooOOO(view2, x, this.OoooOoO)) {
                        this.f3302OoooOo0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f3303OoooOoo = true;
                    }
                }
                if (this.f3302OoooOo0 == -1 && !coordinatorLayout.OooOOO(view, x, this.OoooOoO)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f3293Oooo0oO = z;
            }
            if (!this.f3293Oooo0oO && (o000oooo = this.f3291Oooo0o) != null && o000oooo.OooOOo0(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.f3307o000oOoO;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked != 2 || view3 == null || this.f3293Oooo0oO || this.f3292Oooo0o0 == 1 || coordinatorLayout.OooOOO(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f3291Oooo0o == null || (i = this.OoooOoO) == -1 || Math.abs(i - motionEvent.getY()) <= this.f3291Oooo0o.f1470OooO0O0) {
                return false;
            }
            return true;
        }
        this.f3293Oooo0oO = true;
        return false;
    }

    @Override // OooOOoo.o00Oo0
    public final void OooO0o0() {
        this.f3299OoooOO0 = null;
        this.f3291Oooo0o = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0155, code lost:
        if (r12 == (-1)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015b, code lost:
        if (r12 == (-1)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015e, code lost:
        r14 = java.lang.Math.min(r14, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0162, code lost:
        r11.f3296OoooO0 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c4  */
    @Override // OooOOoo.o00Oo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0oO(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, int r14) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0oO(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooO0oo(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(OooOo0o(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f3264OooOO0O, marginLayoutParams.width), OooOo0o(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f3265OooOO0o, marginLayoutParams.height));
        return true;
    }

    @Override // OooOOoo.o00Oo0
    public final void OooOO0(View view, View view2, int i, int[] iArr, int i2) {
        View view3;
        int i3;
        if (i2 == 1) {
            return;
        }
        WeakReference weakReference = this.f3307o000oOoO;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        } else {
            view3 = null;
        }
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i;
        if (i > 0) {
            if (i4 < OooOo()) {
                int OooOo2 = top - OooOo();
                iArr[1] = OooOo2;
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                view.offsetTopAndBottom(-OooOo2);
                i3 = 3;
                OooOooo(i3);
            } else if (!this.f3290Oooo0OO) {
                return;
            } else {
                iArr[1] = i;
                int i5 = -i;
                WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
                view.offsetTopAndBottom(i5);
                OooOooo(1);
            }
        } else if (i < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.f3287Oooo00O;
            if (i4 > i6 && !this.f3285Oooo0) {
                int i7 = top - i6;
                iArr[1] = i7;
                WeakHashMap weakHashMap3 = o0o0Oo.f1363OooO00o;
                view.offsetTopAndBottom(-i7);
                i3 = 4;
                OooOooo(i3);
            } else if (!this.f3290Oooo0OO) {
                return;
            } else {
                iArr[1] = i;
                int i52 = -i;
                WeakHashMap weakHashMap22 = o0o0Oo.f1363OooO00o;
                view.offsetTopAndBottom(i52);
                OooOooo(1);
            }
        }
        OooOo0(view.getTop());
        this.f3294Oooo0oo = i;
        this.f3284Oooo = true;
    }

    @Override // OooOOoo.o00Oo0
    public final void OooOO0O(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // OooOOoo.o00Oo0
    public final Parcelable OooOOO(View view) {
        return new o00000(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // OooOOoo.o00Oo0
    public final void OooOOO0(View view, Parcelable parcelable) {
        o00000 o00000Var = (o00000) parcelable;
        int i = this.f3255OooO00o;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f3260OooO0o0 = o00000Var.f1847OooO0Oo;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f3256OooO0O0 = o00000Var.f1849OooO0o0;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f3285Oooo0 = o00000Var.f1848OooO0o;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f3289Oooo0O0 = o00000Var.f1850OooO0oO;
            }
        }
        int i2 = o00000Var.f1846OooO0OO;
        if (i2 != 1 && i2 != 2) {
            this.f3292Oooo0o0 = i2;
        } else {
            this.f3292Oooo0o0 = 4;
        }
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooOOOO(View view, int i, int i2) {
        this.f3294Oooo0oo = 0;
        this.f3284Oooo = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r3.getTop() <= r2.f3283OooOooo) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
        if (java.lang.Math.abs(r4 - r2.f3282OooOooO) < java.lang.Math.abs(r4 - r2.f3287Oooo00O)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
        if (r4 < java.lang.Math.abs(r4 - r2.f3287Oooo00O)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
        if (java.lang.Math.abs(r4 - r5) < java.lang.Math.abs(r4 - r2.f3287Oooo00O)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a9, code lost:
        if (java.lang.Math.abs(r4 - r2.f3283OooOooo) < java.lang.Math.abs(r4 - r2.f3287Oooo00O)) goto L18;
     */
    @Override // OooOOoo.o00Oo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOOo(android.view.View r3, android.view.View r4, int r5) {
        /*
            r2 = this;
            int r5 = r3.getTop()
            int r0 = r2.OooOo()
            r1 = 3
            if (r5 != r0) goto Lf
            r2.OooOooo(r1)
            return
        Lf:
            java.lang.ref.WeakReference r5 = r2.f3307o000oOoO
            if (r5 == 0) goto Lb4
            java.lang.Object r5 = r5.get()
            if (r4 != r5) goto Lb4
            boolean r4 = r2.f3284Oooo
            if (r4 != 0) goto L1f
            goto Lb4
        L1f:
            int r4 = r2.f3294Oooo0oo
            if (r4 <= 0) goto L33
            boolean r4 = r2.f3256OooO0O0
            if (r4 == 0) goto L29
            goto Lae
        L29:
            int r4 = r3.getTop()
            int r5 = r2.f3283OooOooo
            if (r4 <= r5) goto Lae
            goto Lab
        L33:
            boolean r4 = r2.f3285Oooo0
            if (r4 == 0) goto L54
            android.view.VelocityTracker r4 = r2.f3301OoooOOo
            if (r4 != 0) goto L3d
            r4 = 0
            goto L4c
        L3d:
            r5 = 1000(0x3e8, float:1.401E-42)
            float r0 = r2.f3257OooO0OO
            r4.computeCurrentVelocity(r5, r0)
            android.view.VelocityTracker r4 = r2.f3301OoooOOo
            int r5 = r2.f3302OoooOo0
            float r4 = r4.getYVelocity(r5)
        L4c:
            boolean r4 = r2.Oooo000(r3, r4)
            if (r4 == 0) goto L54
            r1 = 5
            goto Lae
        L54:
            int r4 = r2.f3294Oooo0oo
            if (r4 != 0) goto L91
            int r4 = r3.getTop()
            boolean r5 = r2.f3256OooO0O0
            if (r5 == 0) goto L72
            int r5 = r2.f3282OooOooO
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.f3287Oooo00O
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto Lad
            goto Lae
        L72:
            int r5 = r2.f3283OooOooo
            if (r4 >= r5) goto L81
            int r5 = r2.f3287Oooo00O
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r4 >= r5) goto Lab
            goto Lae
        L81:
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.f3287Oooo00O
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto Lad
            goto Lab
        L91:
            boolean r4 = r2.f3256OooO0O0
            if (r4 == 0) goto L96
            goto Lad
        L96:
            int r4 = r3.getTop()
            int r5 = r2.f3283OooOooo
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.f3287Oooo00O
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto Lad
        Lab:
            r1 = 6
            goto Lae
        Lad:
            r1 = 4
        Lae:
            r4 = 0
            r2.Oooo00O(r3, r1, r4)
            r2.f3284Oooo = r4
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.OooOOOo(android.view.View, android.view.View, int):void");
    }

    public final void OooOOo() {
        int OooOo002 = OooOo00();
        if (this.f3256OooO0O0) {
            this.f3287Oooo00O = Math.max(this.f3295OoooO - OooOo002, this.f3282OooOooO);
        } else {
            this.f3287Oooo00O = this.f3295OoooO - OooOo002;
        }
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooOOo0(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f3292Oooo0o0;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        o000oOoO o000oooo = this.f3291Oooo0o;
        if (o000oooo != null && (this.f3290Oooo0OO || i == 1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            o000oooo.OooOO0(motionEvent);
        }
        if (actionMasked == 0) {
            this.f3302OoooOo0 = -1;
            this.OoooOoO = -1;
            VelocityTracker velocityTracker = this.f3301OoooOOo;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3301OoooOOo = null;
            }
        }
        if (this.f3301OoooOOo == null) {
            this.f3301OoooOOo = VelocityTracker.obtain();
        }
        this.f3301OoooOOo.addMovement(motionEvent);
        if (this.f3291Oooo0o != null && (this.f3290Oooo0OO || this.f3292Oooo0o0 == 1)) {
            z2 = true;
        }
        if (z2 && actionMasked == 2 && !this.f3293Oooo0oO) {
            float abs = Math.abs(this.OoooOoO - motionEvent.getY());
            o000oOoO o000oooo2 = this.f3291Oooo0o;
            if (abs > o000oooo2.f1470OooO0O0) {
                o000oooo2.OooO0O0(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3293Oooo0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float OooOOoo() {
        /*
            r5 = this;
            o0ooOO0.OooOOOO r0 = r5.f3254OooO
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.f3299OoooOO0
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.f3299OoooOO0
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.OooOoO()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            o0ooOO0.OooOOOO r2 = r5.f3254OooO
            o0ooOO0.OooOOO r3 = r2.f5494OooO00o
            o0ooOO0.Oooo0 r3 = r3.f5468OooO00o
            o0ooOO0.OooOO0 r3 = r3.f5521OooO0o0
            android.graphics.RectF r2 = r2.OooO0oO()
            float r2 = r3.OooO00o(r2)
            android.view.RoundedCorner r3 = OooOooo.o0000OO0.OooO0oo(r0)
            if (r3 == 0) goto L4e
            int r3 = OooOooo.o0000OO0.OooO0OO(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            o0ooOO0.OooOOOO r2 = r5.f3254OooO
            o0ooOO0.OooOOO r4 = r2.f5494OooO00o
            o0ooOO0.Oooo0 r4 = r4.f5468OooO00o
            o0ooOO0.OooOO0 r4 = r4.f5520OooO0o
            android.graphics.RectF r2 = r2.OooO0oO()
            float r2 = r4.OooO00o(r2)
            android.view.RoundedCorner r0 = OooOooo.o0000OO0.OooOOO0(r0)
            if (r0 == 0) goto L74
            int r0 = OooOooo.o0000OO0.OooO0OO(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.OooOOoo():float");
    }

    public final int OooOo() {
        if (this.f3256OooO0O0) {
            return this.f3282OooOooO;
        }
        return Math.max(this.f3280OooOoo, this.f3269OooOOo ? 0 : this.f3276OooOo0o);
    }

    public final void OooOo0(int i) {
        if (((View) this.f3299OoooOO0.get()) != null) {
            ArrayList arrayList = this.f3300OoooOOO;
            if (!arrayList.isEmpty()) {
                int i2 = this.f3287Oooo00O;
                if (i <= i2 && i2 != OooOo()) {
                    OooOo();
                }
                if (arrayList.size() > 0) {
                    OooO00o.OooO0oO(arrayList.get(0));
                    throw null;
                }
            }
        }
    }

    public final int OooOo00() {
        int i;
        return this.f3259OooO0o ? Math.min(Math.max(this.f3261OooO0oO, this.f3295OoooO - ((this.f3298OoooO0O * 9) / 16)), this.f3296OoooO0) + this.f3275OooOo0O : (this.f3266OooOOO || this.f3267OooOOOO || (i = this.OooOOO0) <= 0) ? this.f3260OooO0o0 + this.f3275OooOo0O : Math.max(this.f3260OooO0o0, i + this.f3262OooO0oo);
    }

    public final int OooOo0o(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    public final boolean OooOoO() {
        WeakReference weakReference = this.f3299OoooOO0;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f3299OoooOO0.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final int OooOoO0(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.f3283OooOooo;
                    }
                    throw new IllegalArgumentException(OooO00o.OooO0O0("Invalid state to get top offset: ", i));
                }
                return this.f3295OoooO;
            }
            return this.f3287Oooo00O;
        }
        return OooOo();
    }

    public final void OooOoOO(View view, OooOOO oooOOO, int i) {
        o0o0Oo.OooOO0(view, oooOOO, new OooO0Oo.OooOOO(this, i));
    }

    public final void OooOoo(int i) {
        boolean z = false;
        if (i == -1) {
            if (!this.f3259OooO0o) {
                this.f3259OooO0o = true;
                z = true;
            }
        } else if (this.f3259OooO0o || this.f3260OooO0o0 != i) {
            this.f3259OooO0o = false;
            this.f3260OooO0o0 = Math.max(0, i);
            z = true;
        }
        if (z) {
            Oooo0OO();
        }
    }

    public final void OooOoo0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f3280OooOoo = i;
        Oooo0(this.f3292Oooo0o0, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
        if (OooOooo.oo0o0O0.OooO0O0(r5) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOooO(int r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L5d
            r1 = 2
            if (r5 != r1) goto L7
            goto L5d
        L7:
            boolean r2 = r4.f3285Oooo0
            if (r2 != 0) goto Lf
            r2 = 5
            if (r5 != r2) goto Lf
            return
        Lf:
            r2 = 6
            if (r5 != r2) goto L20
            boolean r2 = r4.f3256OooO0O0
            if (r2 == 0) goto L20
            int r2 = r4.OooOoO0(r5)
            int r3 = r4.f3282OooOooO
            if (r2 > r3) goto L20
            r2 = 3
            goto L21
        L20:
            r2 = r5
        L21:
            java.lang.ref.WeakReference r3 = r4.f3299OoooOO0
            if (r3 == 0) goto L59
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L2c
            goto L59
        L2c:
            java.lang.ref.WeakReference r5 = r4.f3299OoooOO0
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            OooOoo0.o000000 r3 = new OooOoo0.o000000
            r3.<init>(r2, r1, r4, r5)
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L4e
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L4e
            java.util.WeakHashMap r1 = OooOooo.o0o0Oo.f1363OooO00o
            boolean r1 = OooOooo.oo0o0O0.OooO0O0(r5)
            if (r1 == 0) goto L4e
            goto L4f
        L4e:
            r0 = 0
        L4f:
            if (r0 == 0) goto L55
            r5.post(r3)
            goto L5c
        L55:
            r3.run()
            goto L5c
        L59:
            r4.OooOooo(r5)
        L5c:
            return
        L5d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r5 != r0) goto L6b
            java.lang.String r5 = "DRAGGING"
            goto L6d
        L6b:
            java.lang.String r5 = "SETTLING"
        L6d:
            r2.append(r5)
            java.lang.String r5 = " should not be set externally."
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.OooOooO(int):void");
    }

    public final void OooOooo(int i) {
        if (this.f3292Oooo0o0 == i) {
            return;
        }
        this.f3292Oooo0o0 = i;
        WeakReference weakReference = this.f3299OoooOO0;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            Oooo0O0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            Oooo0O0(false);
        }
        Oooo0(i, true);
        ArrayList arrayList = this.f3300OoooOOO;
        if (arrayList.size() <= 0) {
            Oooo00o();
        } else {
            OooO00o.OooO0oO(arrayList.get(0));
            throw null;
        }
    }

    public final void Oooo0(int i, boolean z) {
        boolean z2;
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        if (this.f3292Oooo0o0 == 3 && (this.f3272OooOo || OooOoO())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f3277OooOoO != z2 && this.f3254OooO != null) {
            this.f3277OooOoO = z2;
            float f = 1.0f;
            if (z && (valueAnimator = this.f3281OooOoo0) != null) {
                if (valueAnimator.isRunning()) {
                    this.f3281OooOoo0.reverse();
                    return;
                }
                float f2 = this.f3254OooO.f5494OooO00o.f5476OooOO0;
                if (z2) {
                    f = OooOOoo();
                }
                this.f3281OooOoo0.setFloatValues(f2, f);
                this.f3281OooOoo0.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.f3281OooOoo0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f3281OooOoo0.cancel();
            }
            OooOOOO oooOOOO = this.f3254OooO;
            if (this.f3277OooOoO) {
                f = OooOOoo();
            }
            o0ooOO0.OooOOO oooOOO = oooOOOO.f5494OooO00o;
            if (oooOOO.f5476OooOO0 != f) {
                oooOOO.f5476OooOO0 = f;
                oooOOOO.f5499OooO0o0 = true;
                oooOOOO.invalidateSelf();
            }
        }
    }

    public final boolean Oooo000(View view, float f) {
        if (this.f3289Oooo0O0) {
            return true;
        }
        if (view.getTop() < this.f3287Oooo00O) {
            return false;
        }
        return Math.abs(((f * this.f3297OoooO00) + ((float) view.getTop())) - ((float) this.f3287Oooo00O)) / ((float) OooOo00()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r5 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r1.OooOOOo(r5.getLeft(), r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Oooo00O(android.view.View r5, int r6, boolean r7) {
        /*
            r4 = this;
            int r0 = r4.OooOoO0(r6)
            Oooo0o0.o000oOoO r1 = r4.f3291Oooo0o
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r7 == 0) goto L17
            int r5 = r5.getLeft()
            boolean r5 = r1.OooOOOo(r5, r0)
            if (r5 == 0) goto L34
            goto L33
        L17:
            int r7 = r5.getLeft()
            r1.f1483OooOOo = r5
            r5 = -1
            r1.f1471OooO0OO = r5
            boolean r5 = r1.OooO(r7, r0, r2, r2)
            if (r5 != 0) goto L31
            int r7 = r1.f1469OooO00o
            if (r7 != 0) goto L31
            android.view.View r7 = r1.f1483OooOOo
            if (r7 == 0) goto L31
            r7 = 0
            r1.f1483OooOOo = r7
        L31:
            if (r5 == 0) goto L34
        L33:
            r2 = r3
        L34:
            if (r2 == 0) goto L43
            r5 = 2
            r4.OooOooo(r5)
            r4.Oooo0(r6, r3)
            Oooooo.o00000O0 r5 = r4.f3279OooOoOO
            r5.OooO00o(r6)
            goto L46
        L43:
            r4.OooOooo(r6)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.Oooo00O(android.view.View, int, boolean):void");
    }

    public final void Oooo00o() {
        View view;
        OooOOO oooOOO;
        int i;
        boolean z;
        o0000O o0000o2;
        WeakReference weakReference = this.f3299OoooOO0;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            o0o0Oo.OooO(view, 524288);
            o0o0Oo.OooO0oO(view, 0);
            o0o0Oo.OooO(view, 262144);
            o0o0Oo.OooO0oO(view, 0);
            o0o0Oo.OooO(view, 1048576);
            o0o0Oo.OooO0oO(view, 0);
            SparseIntArray sparseIntArray = this.f3305Ooooo0o;
            int i2 = sparseIntArray.get(0, -1);
            if (i2 != -1) {
                o0o0Oo.OooO(view, i2);
                o0o0Oo.OooO0oO(view, 0);
                sparseIntArray.delete(0);
            }
            int i3 = 6;
            if (!this.f3256OooO0O0 && this.f3292Oooo0o0 != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                OooO0Oo.OooOOO oooOOO2 = new OooO0Oo.OooOOO(this, 6);
                ArrayList OooO0o02 = o0o0Oo.OooO0o0(view);
                int i4 = 0;
                while (true) {
                    if (i4 < OooO0o02.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((OooOOO) OooO0o02.get(i4)).f1431OooO00o).getLabel())) {
                            i = ((OooOOO) OooO0o02.get(i4)).OooO00o();
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = 0;
                        int i6 = -1;
                        while (true) {
                            int[] iArr = o0o0Oo.f1366OooO0Oo;
                            if (i5 >= iArr.length || i6 != -1) {
                                break;
                            }
                            int i7 = iArr[i5];
                            boolean z2 = true;
                            for (int i8 = 0; i8 < OooO0o02.size(); i8++) {
                                if (((OooOOO) OooO0o02.get(i8)).OooO00o() != i7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z2 &= z;
                            }
                            if (z2) {
                                i6 = i7;
                            }
                            i5++;
                        }
                        i = i6;
                    }
                }
                if (i != -1) {
                    OooOOO oooOOO3 = new OooOOO(null, i, string, oooOOO2, null);
                    View.AccessibilityDelegate OooO0OO2 = o0o0Oo.OooO0OO(view);
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
                    o0o0Oo.OooOO0o(view, o0000o2);
                    o0o0Oo.OooO(view, oooOOO3.OooO00o());
                    o0o0Oo.OooO0o0(view).add(oooOOO3);
                    o0o0Oo.OooO0oO(view, 0);
                }
                sparseIntArray.put(0, i);
            }
            if (this.f3285Oooo0 && this.f3292Oooo0o0 != 5) {
                OooOoOO(view, OooOOO.f1428OooOO0, 5);
            }
            int i9 = this.f3292Oooo0o0;
            if (i9 != 3) {
                if (i9 != 4) {
                    if (i9 == 6) {
                        OooOoOO(view, OooOOO.f1423OooO, 4);
                        OooOoOO(view, OooOOO.f1427OooO0oo, 3);
                        return;
                    }
                    return;
                }
                if (this.f3256OooO0O0) {
                    i3 = 3;
                }
                oooOOO = OooOOO.f1427OooO0oo;
            } else {
                if (this.f3256OooO0O0) {
                    i3 = 4;
                }
                oooOOO = OooOOO.f1423OooO;
            }
            OooOoOO(view, oooOOO, i3);
        }
    }

    public final void Oooo0O0(boolean z) {
        WeakReference weakReference = this.f3299OoooOO0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f3304Ooooo00 != null) {
                    return;
                }
                this.f3304Ooooo00 = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f3299OoooOO0.get() && z) {
                    this.f3304Ooooo00.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f3304Ooooo00 = null;
        }
    }

    public final void Oooo0OO() {
        View view;
        if (this.f3299OoooOO0 != null) {
            OooOOo();
            if (this.f3292Oooo0o0 != 4 || (view = (View) this.f3299OoooOO0.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        int i;
        this.f3255OooO00o = 0;
        this.f3256OooO0O0 = true;
        this.f3264OooOO0O = -1;
        this.f3265OooOO0o = -1;
        this.f3279OooOoOO = new o00000O0(this, 0);
        this.f3286Oooo000 = 0.5f;
        this.f3288Oooo00o = -1.0f;
        this.f3290Oooo0OO = true;
        this.f3292Oooo0o0 = 4;
        this.f3297OoooO00 = 0.1f;
        this.f3300OoooOOO = new ArrayList();
        this.OoooOoO = -1;
        this.f3305Ooooo0o = new SparseIntArray();
        this.f3306OooooO0 = new o000000O(this);
        this.f3262OooO0oo = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooooO0.o0000O.f1787OooO00o);
        int i2 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f3263OooOO0 = o0000O00.OooO00o.o00oO0o(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f3278OooOoO0 = new Oooo0(Oooo0.OooO0O0(context, attributeSet, R.attr.bottomSheetStyle, 2131755826));
        }
        Oooo0 oooo0 = this.f3278OooOoO0;
        if (oooo0 != null) {
            OooOOOO oooOOOO = new OooOOOO(oooo0);
            this.f3254OooO = oooOOOO;
            oooOOOO.OooO0oo(context);
            ColorStateList colorStateList = this.f3263OooOO0;
            if (colorStateList != null) {
                this.f3254OooO.OooOO0(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f3254OooO.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(OooOOoo(), 1.0f);
        this.f3281OooOoo0 = ofFloat;
        ofFloat.setDuration(500L);
        this.f3281OooOoo0.addUpdateListener(new o000000(0, this));
        this.f3288Oooo00o = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f3264OooOO0O = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f3265OooOO0o = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i = peekValue.data) != -1) {
            OooOoo(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            OooOoo(i);
        }
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        if (this.f3285Oooo0 != z) {
            this.f3285Oooo0 = z;
            if (!z && this.f3292Oooo0o0 == 5) {
                OooOooO(4);
            }
            Oooo00o();
        }
        this.f3266OooOOO = obtainStyledAttributes.getBoolean(13, false);
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f3256OooO0O0 != z2) {
            this.f3256OooO0O0 = z2;
            if (this.f3299OoooOO0 != null) {
                OooOOo();
            }
            OooOooo((this.f3256OooO0O0 && this.f3292Oooo0o0 == 6) ? i2 : this.f3292Oooo0o0);
            Oooo0(this.f3292Oooo0o0, true);
            Oooo00o();
        }
        this.f3289Oooo0O0 = obtainStyledAttributes.getBoolean(12, false);
        this.f3290Oooo0OO = obtainStyledAttributes.getBoolean(4, true);
        this.f3255OooO00o = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f3286Oooo000 = f;
            if (this.f3299OoooOO0 != null) {
                this.f3283OooOooo = (int) ((1.0f - f) * this.f3295OoooO);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            OooOoo0((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(5, 0) : peekValue2.data);
            this.f3258OooO0Oo = obtainStyledAttributes.getInt(11, 500);
            this.f3267OooOOOO = obtainStyledAttributes.getBoolean(17, false);
            this.f3268OooOOOo = obtainStyledAttributes.getBoolean(18, false);
            this.f3270OooOOo0 = obtainStyledAttributes.getBoolean(19, false);
            this.f3269OooOOo = obtainStyledAttributes.getBoolean(20, true);
            this.f3271OooOOoo = obtainStyledAttributes.getBoolean(14, false);
            this.f3274OooOo00 = obtainStyledAttributes.getBoolean(15, false);
            this.f3273OooOo0 = obtainStyledAttributes.getBoolean(16, false);
            this.f3272OooOo = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f3257OooO0OO = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}