package com.google.android.material.sidesheet;

import OooOOoo.o00Oo0;
import OooOOoo.o00oO0o;
import OooOooo.o0o0Oo;
import OooOooo.oo0o0O0;
import Oooo000.OooOOO;
import Oooo000.o000OOo;
import Oooo0o0.o000oOoO;
import OooooO0.o0000O;
import Oooooo.o00000O0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o0ooOO0.OooOOOO;
import o0ooOO0.Oooo0;
import o0ooOOo.OooO00o;
import o0ooOOo.OooO0OO;
import o0ooOOo.OooO0o;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends o00Oo0 {

    /* renamed from: OooO  reason: collision with root package name */
    public o000oOoO f3469OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public OooO00o f3470OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public OooOOOO f3471OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ColorStateList f3472OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Oooo0 f3473OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final float f3474OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final o00000O0 f3475OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f3476OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f3477OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f3478OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final float f3479OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f3480OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f3481OooOOO;
    public int OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public int f3482OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public WeakReference f3483OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public int f3484OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public WeakReference f3485OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public VelocityTracker f3486OooOOoo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public final LinkedHashSet f3487OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public int f3488OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public final OooO0OO f3489OooOo0O;

    public SideSheetBehavior() {
        this.f3475OooO0o0 = new o00000O0(this);
        this.f3476OooO0oO = true;
        this.f3477OooO0oo = 5;
        this.f3479OooOO0O = 0.1f;
        this.f3484OooOOo = -1;
        this.f3487OooOo0 = new LinkedHashSet();
        this.f3489OooOo0O = new OooO0OO(this);
    }

    @Override // OooOOoo.o00Oo0
    public final void OooO0OO(o00oO0o o00oo0o) {
        this.f3483OooOOOo = null;
        this.f3469OooO = null;
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooO0o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        o000oOoO o000oooo;
        VelocityTracker velocityTracker;
        if ((view.isShown() || o0o0Oo.OooO0Oo(view) != null) && this.f3476OooO0oO) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f3478OooOO0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f3486OooOOoo) != null) {
            velocityTracker.recycle();
            this.f3486OooOOoo = null;
        }
        if (this.f3486OooOOoo == null) {
            this.f3486OooOOoo = VelocityTracker.obtain();
        }
        this.f3486OooOOoo.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f3478OooOO0) {
                this.f3478OooOO0 = false;
                return false;
            }
        } else {
            this.f3488OooOo00 = (int) motionEvent.getX();
        }
        if (!this.f3478OooOO0 && (o000oooo = this.f3469OooO) != null && o000oooo.OooOOo0(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // OooOOoo.o00Oo0
    public final void OooO0o0() {
        this.f3483OooOOOo = null;
        this.f3469OooO = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    @Override // OooOOoo.o00Oo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0oO(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.OooO0oO(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooO0oo(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    @Override // OooOOoo.o00Oo0
    public final Parcelable OooOOO(View view) {
        return new OooO0o(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // OooOOoo.o00Oo0
    public final void OooOOO0(View view, Parcelable parcelable) {
        int i = ((OooO0o) parcelable).f5583OooO0OO;
        this.f3477OooO0oo = (i == 1 || i == 2) ? 5 : 5;
    }

    public final o00oO0o OooOOo() {
        View view;
        WeakReference weakReference = this.f3483OooOOOo;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof o00oO0o)) {
            return null;
        }
        return (o00oO0o) view.getLayoutParams();
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooOOo0(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        boolean z4 = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f3477OooO0oo;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        o000oOoO o000oooo = this.f3469OooO;
        if (o000oooo != null && (this.f3476OooO0oO || i == 1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            o000oooo.OooOO0(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f3486OooOOoo) != null) {
            velocityTracker.recycle();
            this.f3486OooOOoo = null;
        }
        if (this.f3486OooOOoo == null) {
            this.f3486OooOOoo = VelocityTracker.obtain();
        }
        this.f3486OooOOoo.addMovement(motionEvent);
        o000oOoO o000oooo2 = this.f3469OooO;
        if (o000oooo2 != null && (this.f3476OooO0oO || this.f3477OooO0oo == 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && actionMasked == 2 && !this.f3478OooOO0) {
            if (o000oooo2 != null && (this.f3476OooO0oO || this.f3477OooO0oo == 1)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && Math.abs(this.f3488OooOo00 - motionEvent.getX()) > this.f3469OooO.f1470OooO0O0) {
                z4 = true;
            }
            if (z4) {
                this.f3469OooO.OooO0O0(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3478OooOO0;
    }

    public final void OooOOoo(int i) {
        View view;
        int i2;
        if (this.f3477OooO0oo == i) {
            return;
        }
        this.f3477OooO0oo = i;
        WeakReference weakReference = this.f3483OooOOOo;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (this.f3477OooO0oo == 5) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f3487OooOo0.iterator();
        if (!it.hasNext()) {
            OooOo0();
        } else {
            OooO0O0.OooO00o.OooO0oO(it.next());
            throw null;
        }
    }

    public final void OooOo0() {
        View view;
        WeakReference weakReference = this.f3483OooOOOo;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        o0o0Oo.OooO(view, 262144);
        o0o0Oo.OooO0oO(view, 0);
        o0o0Oo.OooO(view, 1048576);
        o0o0Oo.OooO0oO(view, 0);
        if (this.f3477OooO0oo != 5) {
            o0o0Oo.OooOO0(view, OooOOO.f1428OooOO0, new o000OOo() { // from class: o0ooOOo.OooO0O0
                /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
                @Override // Oooo000.o000OOo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final boolean OooO0o(android.view.View r5) {
                    /*
                        r4 = this;
                        com.google.android.material.sidesheet.SideSheetBehavior r5 = com.google.android.material.sidesheet.SideSheetBehavior.this
                        r5.getClass()
                        r0 = 1
                        int r1 = r2
                        if (r1 == r0) goto L4b
                        r2 = 2
                        if (r1 != r2) goto Le
                        goto L4b
                    Le:
                        java.lang.ref.WeakReference r2 = r5.f3483OooOOOo
                        if (r2 == 0) goto L47
                        java.lang.Object r2 = r2.get()
                        if (r2 != 0) goto L19
                        goto L47
                    L19:
                        java.lang.ref.WeakReference r2 = r5.f3483OooOOOo
                        java.lang.Object r2 = r2.get()
                        android.view.View r2 = (android.view.View) r2
                        OooOo0o.o00000O r3 = new OooOo0o.o00000O
                        r3.<init>(r1, r0, r5)
                        android.view.ViewParent r5 = r2.getParent()
                        if (r5 == 0) goto L3c
                        boolean r5 = r5.isLayoutRequested()
                        if (r5 == 0) goto L3c
                        java.util.WeakHashMap r5 = OooOooo.o0o0Oo.f1363OooO00o
                        boolean r5 = OooOooo.oo0o0O0.OooO0O0(r2)
                        if (r5 == 0) goto L3c
                        r5 = r0
                        goto L3d
                    L3c:
                        r5 = 0
                    L3d:
                        if (r5 == 0) goto L43
                        r2.post(r3)
                        goto L4a
                    L43:
                        r3.run()
                        goto L4a
                    L47:
                        r5.OooOOoo(r1)
                    L4a:
                        return r0
                    L4b:
                        java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "STATE_"
                        r2.<init>(r3)
                        if (r1 != r0) goto L59
                        java.lang.String r0 = "DRAGGING"
                        goto L5b
                    L59:
                        java.lang.String r0 = "SETTLING"
                    L5b:
                        r2.append(r0)
                        java.lang.String r0 = " should not be set externally."
                        r2.append(r0)
                        java.lang.String r0 = r2.toString()
                        r5.<init>(r0)
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o0ooOOo.OooO0O0.OooO0o(android.view.View):boolean");
                }
            });
        }
        if (this.f3477OooO0oo != 3) {
            o0o0Oo.OooOO0(view, OooOOO.f1427OooO0oo, new o000OOo() { // from class: o0ooOOo.OooO0O0
                @Override // Oooo000.o000OOo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final boolean OooO0o(android.view.View r5) {
                    /*
                        r4 = this;
                        com.google.android.material.sidesheet.SideSheetBehavior r5 = com.google.android.material.sidesheet.SideSheetBehavior.this
                        r5.getClass()
                        r0 = 1
                        int r1 = r2
                        if (r1 == r0) goto L4b
                        r2 = 2
                        if (r1 != r2) goto Le
                        goto L4b
                    Le:
                        java.lang.ref.WeakReference r2 = r5.f3483OooOOOo
                        if (r2 == 0) goto L47
                        java.lang.Object r2 = r2.get()
                        if (r2 != 0) goto L19
                        goto L47
                    L19:
                        java.lang.ref.WeakReference r2 = r5.f3483OooOOOo
                        java.lang.Object r2 = r2.get()
                        android.view.View r2 = (android.view.View) r2
                        OooOo0o.o00000O r3 = new OooOo0o.o00000O
                        r3.<init>(r1, r0, r5)
                        android.view.ViewParent r5 = r2.getParent()
                        if (r5 == 0) goto L3c
                        boolean r5 = r5.isLayoutRequested()
                        if (r5 == 0) goto L3c
                        java.util.WeakHashMap r5 = OooOooo.o0o0Oo.f1363OooO00o
                        boolean r5 = OooOooo.oo0o0O0.OooO0O0(r2)
                        if (r5 == 0) goto L3c
                        r5 = r0
                        goto L3d
                    L3c:
                        r5 = 0
                    L3d:
                        if (r5 == 0) goto L43
                        r2.post(r3)
                        goto L4a
                    L43:
                        r3.run()
                        goto L4a
                    L47:
                        r5.OooOOoo(r1)
                    L4a:
                        return r0
                    L4b:
                        java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "STATE_"
                        r2.<init>(r3)
                        if (r1 != r0) goto L59
                        java.lang.String r0 = "DRAGGING"
                        goto L5b
                    L59:
                        java.lang.String r0 = "SETTLING"
                    L5b:
                        r2.append(r0)
                        java.lang.String r0 = " should not be set externally."
                        r2.append(r0)
                        java.lang.String r0 = r2.toString()
                        r5.<init>(r0)
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o0ooOOo.OooO0O0.OooO0o(android.view.View):boolean");
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r1.OooOOOo(r0, r4.getTop()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r4 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOo00(android.view.View r4, int r5, boolean r6) {
        /*
            r3 = this;
            r0 = 3
            if (r5 == r0) goto L19
            r0 = 5
            if (r5 != r0) goto Ld
            o0ooOOo.OooO00o r0 = r3.f3470OooO00o
            int r0 = r0.OooOo00()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid state to get outer edge offset: "
            java.lang.String r5 = OooO0O0.OooO00o.OooO0O0(r6, r5)
            r4.<init>(r5)
            throw r4
        L19:
            o0ooOOo.OooO00o r0 = r3.f3470OooO00o
            int r0 = r0.OooOOoo()
        L1f:
            Oooo0o0.o000oOoO r1 = r3.f3469OooO
            r2 = 0
            if (r1 == 0) goto L4e
            if (r6 == 0) goto L31
            int r4 = r4.getTop()
            boolean r4 = r1.OooOOOo(r0, r4)
            if (r4 == 0) goto L4e
            goto L4d
        L31:
            int r6 = r4.getTop()
            r1.f1483OooOOo = r4
            r4 = -1
            r1.f1471OooO0OO = r4
            boolean r4 = r1.OooO(r0, r6, r2, r2)
            if (r4 != 0) goto L4b
            int r6 = r1.f1469OooO00o
            if (r6 != 0) goto L4b
            android.view.View r6 = r1.f1483OooOOo
            if (r6 == 0) goto L4b
            r6 = 0
            r1.f1483OooOOo = r6
        L4b:
            if (r4 == 0) goto L4e
        L4d:
            r2 = 1
        L4e:
            if (r2 == 0) goto L5a
            r4 = 2
            r3.OooOOoo(r4)
            Oooooo.o00000O0 r4 = r3.f3475OooO0o0
            r4.OooO00o(r5)
            goto L5d
        L5a:
            r3.OooOOoo(r5)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.OooOo00(android.view.View, int, boolean):void");
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f3475OooO0o0 = new o00000O0(this);
        this.f3476OooO0oO = true;
        this.f3477OooO0oo = 5;
        this.f3479OooOO0O = 0.1f;
        this.f3484OooOOo = -1;
        this.f3487OooOo0 = new LinkedHashSet();
        this.f3489OooOo0O = new OooO0OO(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0000O.f1808OooOo0o);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f3472OooO0OO = o0000O00.OooO00o.o00oO0o(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f3473OooO0Oo = new Oooo0(Oooo0.OooO0O0(context, attributeSet, 0, 2131755971));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f3484OooOOo = resourceId;
            WeakReference weakReference = this.f3485OooOOo0;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f3485OooOOo0 = null;
            WeakReference weakReference2 = this.f3483OooOOOo;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                    if (oo0o0O0.OooO0OO(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        Oooo0 oooo0 = this.f3473OooO0Oo;
        if (oooo0 != null) {
            OooOOOO oooOOOO = new OooOOOO(oooo0);
            this.f3471OooO0O0 = oooOOOO;
            oooOOOO.OooO0oo(context);
            ColorStateList colorStateList = this.f3472OooO0OO;
            if (colorStateList != null) {
                this.f3471OooO0O0.OooOO0(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f3471OooO0O0.setTint(typedValue.data);
            }
        }
        this.f3474OooO0o = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f3476OooO0oO = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}