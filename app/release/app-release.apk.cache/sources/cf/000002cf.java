package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class o00OO0OO implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: OooO  reason: collision with root package name */
    public final int[] f2352OooO = new int[2];

    /* renamed from: OooO00o  reason: collision with root package name */
    public final float f2353OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f2354OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f2355OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final View f2356OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public o00OO0O0 f2357OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public o00OO0O0 f2358OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f2359OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f2360OooO0oo;

    public o00OO0OO(View view) {
        this.f2356OooO0Oo = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2353OooO00o = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2354OooO0O0 = tapTimeout;
        this.f2355OooO0OO = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void OooO00o() {
        o00OO0O0 o00oo0o0 = this.f2357OooO0o;
        View view = this.f2356OooO0Oo;
        if (o00oo0o0 != null) {
            view.removeCallbacks(o00oo0o0);
        }
        o00OO0O0 o00oo0o02 = this.f2358OooO0o0;
        if (o00oo0o02 != null) {
            view.removeCallbacks(o00oo0o02);
        }
    }

    public abstract OooO0oO.o00OO0OO OooO0O0();

    public abstract boolean OooO0OO();

    public boolean OooO0Oo() {
        OooO0oO.o00OO0OO OooO0O02 = OooO0O0();
        if (OooO0O02 == null || !OooO0O02.OooO0O0()) {
            return true;
        }
        OooO0O02.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r4 != 3) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o00OO0OO.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2359OooO0oO = false;
        this.f2360OooO0oo = -1;
        o00OO0O0 o00oo0o0 = this.f2358OooO0o0;
        if (o00oo0o0 != null) {
            this.f2356OooO0Oo.removeCallbacks(o00oo0o0);
        }
    }
}