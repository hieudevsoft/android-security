package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import hieubui.eup.android_app_security.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0OO0O0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: OooOO0O  reason: collision with root package name */
    public static o0OO0O0 f2503OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public static o0OO0O0 f2504OooOO0o;

    /* renamed from: OooO  reason: collision with root package name */
    public boolean f2505OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final View f2506OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final CharSequence f2507OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f2508OooO0OO;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f2510OooO0o;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f2512OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public o0OOooO0 f2513OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f2514OooOO0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o0OO0 f2509OooO0Oo = new Runnable(this) { // from class: androidx.appcompat.widget.o0OO0

        /* renamed from: OooO0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f2483OooO0O0;

        {
            this.f2483OooO0O0 = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = r2;
            o0OO0O0 o0oo0o0 = this.f2483OooO0O0;
            switch (i) {
                case 0:
                    o0oo0o0.OooO0OO(false);
                    return;
                default:
                    o0oo0o0.OooO00o();
                    return;
            }
        }
    };

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final o0OO0 f2511OooO0o0 = new Runnable(this) { // from class: androidx.appcompat.widget.o0OO0

        /* renamed from: OooO0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f2483OooO0O0;

        {
            this.f2483OooO0O0 = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = r2;
            o0OO0O0 o0oo0o0 = this.f2483OooO0O0;
            switch (i) {
                case 0:
                    o0oo0o0.OooO0OO(false);
                    return;
                default:
                    o0oo0o0.OooO00o();
                    return;
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.o0OO0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.o0OO0] */
    public o0OO0O0(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f2506OooO00o = view;
        this.f2507OooO0O0 = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = OooOooo.o00Oo00.f1306OooO00o;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = OooOooo.o00OOOOo.OooO00o(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f2508OooO0OO = scaledTouchSlop;
        this.f2514OooOO0 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void OooO0O0(o0OO0O0 o0oo0o0) {
        o0OO0O0 o0oo0o02 = f2503OooOO0O;
        if (o0oo0o02 != null) {
            o0oo0o02.f2506OooO00o.removeCallbacks(o0oo0o02.f2509OooO0Oo);
        }
        f2503OooOO0O = o0oo0o0;
        if (o0oo0o0 != null) {
            o0oo0o0.f2506OooO00o.postDelayed(o0oo0o0.f2509OooO0Oo, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void OooO00o() {
        boolean z;
        o0OO0O0 o0oo0o0 = f2504OooOO0o;
        View view = this.f2506OooO00o;
        if (o0oo0o0 == this) {
            f2504OooOO0o = null;
            o0OOooO0 o0ooooo0 = this.f2513OooO0oo;
            if (o0ooooo0 != null) {
                View view2 = o0ooooo0.f2526OooO0O0;
                if (view2.getParent() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ((WindowManager) ((Context) o0ooooo0.f2525OooO00o).getSystemService("window")).removeView(view2);
                }
                this.f2513OooO0oo = null;
                this.f2514OooOO0 = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f2503OooOO0O == this) {
            OooO0O0(null);
        }
        view.removeCallbacks(this.f2511OooO0o0);
    }

    public final void OooO0OO(boolean z) {
        boolean z2;
        int height;
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        int i4;
        long longPressTimeout;
        long j;
        long j2;
        boolean z3;
        WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
        View view = this.f2506OooO00o;
        if (!OooOooo.oo0o0O0.OooO0O0(view)) {
            return;
        }
        OooO0O0(null);
        o0OO0O0 o0oo0o0 = f2504OooOO0o;
        if (o0oo0o0 != null) {
            o0oo0o0.OooO00o();
        }
        f2504OooOO0o = this;
        this.f2505OooO = z;
        o0OOooO0 o0ooooo0 = new o0OOooO0(view.getContext());
        this.f2513OooO0oo = o0ooooo0;
        int i5 = this.f2510OooO0o;
        int i6 = this.f2512OooO0oO;
        boolean z4 = this.f2505OooO;
        View view2 = o0ooooo0.f2526OooO0O0;
        if (view2.getParent() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object obj = o0ooooo0.f2525OooO00o;
        if (z2) {
            if (view2.getParent() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                ((WindowManager) ((Context) obj).getSystemService("window")).removeView(view2);
            }
        }
        o0ooooo0.f2527OooO0OO.setText(this.f2507OooO0O0);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) o0ooooo0.f2528OooO0Oo;
        layoutParams.token = view.getApplicationWindowToken();
        Context context = (Context) obj;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i5 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i6 + dimensionPixelOffset2;
            i = i6 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = context.getResources();
        if (z4) {
            i2 = R.dimen.tooltip_y_offset_touch;
        } else {
            i2 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i2);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context2 = view.getContext();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                } else if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            str2 = "window";
        } else {
            Rect rect = (Rect) o0ooooo0.f2530OooO0o0;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left >= 0 || rect.top >= 0) {
                str = "window";
                i3 = 0;
            } else {
                Resources resources2 = context.getResources();
                str = "window";
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i4 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i4 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i3 = 0;
                rect.set(0, i4, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = (int[]) o0ooooo0.f2531OooO0oO;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = (int[]) o0ooooo0.f2529OooO0o;
            view.getLocationOnScreen(iArr2);
            int i7 = iArr2[i3] - iArr[i3];
            iArr2[i3] = i7;
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams.x = (i7 + i5) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i8 = iArr2[1];
            int i9 = ((i + i8) - dimensionPixelOffset3) - measuredHeight;
            int i10 = i8 + height + dimensionPixelOffset3;
            if (!z4 ? measuredHeight + i10 <= rect.height() : i9 < 0) {
                layoutParams.y = i10;
            } else {
                layoutParams.y = i9;
            }
            str2 = str;
        }
        ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
        view.addOnAttachStateChangeListener(this);
        if (this.f2505OooO) {
            j2 = 2500;
        } else {
            if ((OooOooo.o00O0O0.OooO0oO(view) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        o0OO0 o0oo0 = this.f2511OooO0o0;
        view.removeCallbacks(o0oo0);
        view.postDelayed(o0oo0, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.widget.o0OOooO0 r5 = r4.f2513OooO0oo
            r0 = 0
            if (r5 == 0) goto La
            boolean r5 = r4.f2505OooO
            if (r5 == 0) goto La
            return r0
        La:
            android.view.View r5 = r4.f2506OooO00o
            android.content.Context r1 = r5.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r6.getAction()
            r2 = 7
            r3 = 1
            if (r1 == r2) goto L38
            r5 = 10
            if (r1 == r5) goto L32
            goto L74
        L32:
            r4.f2514OooOO0 = r3
            r4.OooO00o()
            goto L74
        L38:
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L74
            androidx.appcompat.widget.o0OOooO0 r5 = r4.f2513OooO0oo
            if (r5 != 0) goto L74
            float r5 = r6.getX()
            int r5 = (int) r5
            float r6 = r6.getY()
            int r6 = (int) r6
            boolean r1 = r4.f2514OooOO0
            if (r1 != 0) goto L69
            int r1 = r4.f2510OooO0o
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r4.f2508OooO0OO
            if (r1 > r2) goto L69
            int r1 = r4.f2512OooO0oO
            int r1 = r6 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L67
            goto L69
        L67:
            r3 = r0
            goto L6f
        L69:
            r4.f2510OooO0o = r5
            r4.f2512OooO0oO = r6
            r4.f2514OooOO0 = r0
        L6f:
            if (r3 == 0) goto L74
            OooO0O0(r4)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0OO0O0.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f2510OooO0o = view.getWidth() / 2;
        this.f2512OooO0oO = view.getHeight() / 2;
        OooO0OO(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        OooO00o();
    }
}