package OooO0oO;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.o00000O;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class oo0O extends o00O0OO0 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: OooO  reason: collision with root package name */
    public final o0 f476OooO;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Context f477OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o00O00O f478OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o00O000 f479OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final int f480OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final boolean f481OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final int f482OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final int f483OooO0oo;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public PopupWindow.OnDismissListener f486OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public View f487OooOOO;
    public View OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public oo0oOO0 f488OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public ViewTreeObserver f489OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public boolean f490OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public boolean f491OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public int f492OooOOoo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public boolean f493OooOo0;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final o000O f484OooOO0 = new o000O(1, this);

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final o000OO00 f485OooOO0O = new o000OO00(1, this);

    /* renamed from: OooOo00  reason: collision with root package name */
    public int f494OooOo00 = 0;

    public oo0O(int i, int i2, Context context, View view, o00O00O o00o00o, boolean z) {
        this.f477OooO0O0 = context;
        this.f478OooO0OO = o00o00o;
        this.f481OooO0o0 = z;
        this.f479OooO0Oo = new o00O000(o00o00o, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f482OooO0oO = i;
        this.f483OooO0oo = i2;
        Resources resources = context.getResources();
        this.f480OooO0o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.OooOOO0 = view;
        this.f476OooO = new o0(context, i, i2);
        o00o00o.OooO0O0(this, context);
    }

    @Override // OooO0oO.o00OO0OO
    public final void OooO() {
        View view;
        boolean z;
        Rect rect;
        boolean z2 = true;
        if (!OooO0O0()) {
            if (!this.f491OooOOo0 && (view = this.OooOOO0) != null) {
                this.f487OooOOO = view;
                o0 o0Var = this.f476OooO;
                o0Var.f2397OooOoO.setOnDismissListener(this);
                o0Var.f2388OooOOOo = this;
                o0Var.f2398OooOoO0 = true;
                o00000O o00000o = o0Var.f2397OooOoO;
                o00000o.setFocusable(true);
                View view2 = this.f487OooOOO;
                if (this.f489OooOOOo == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f489OooOOOo = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f484OooOO0);
                }
                view2.addOnAttachStateChangeListener(this.f485OooOO0O);
                o0Var.f2387OooOOOO = view2;
                o0Var.f2385OooOO0o = this.f494OooOo00;
                boolean z3 = this.f490OooOOo;
                Context context = this.f477OooO0O0;
                o00O000 o00o000 = this.f479OooO0Oo;
                if (!z3) {
                    this.f492OooOOoo = o00O0OO0.OooOOO0(o00o000, context, this.f480OooO0o);
                    this.f490OooOOo = true;
                }
                o0Var.OooOOo(this.f492OooOOoo);
                o00000o.setInputMethodMode(2);
                Rect rect2 = this.f448OooO00o;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                o0Var.f2392OooOo = rect;
                o0Var.OooO();
                androidx.appcompat.widget.o00OO000 o00oo000 = o0Var.f2377OooO0OO;
                o00oo000.setOnKeyListener(this);
                if (this.f493OooOo0) {
                    o00O00O o00o00o = this.f478OooO0OO;
                    if (o00o00o.OooOOO0 != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) o00oo000, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(o00o00o.OooOOO0);
                        }
                        frameLayout.setEnabled(false);
                        o00oo000.addHeaderView(frameLayout, null, false);
                    }
                }
                o0Var.OooOOOO(o00o000);
                o0Var.OooO();
            } else {
                z2 = false;
            }
        }
        if (z2) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // OooO0oO.o00O
    public final void OooO00o(o00O00O o00o00o, boolean z) {
        if (o00o00o != this.f478OooO0OO) {
            return;
        }
        dismiss();
        oo0oOO0 oo0ooo0 = this.f488OooOOOO;
        if (oo0ooo0 != null) {
            oo0ooo0.OooO00o(o00o00o, z);
        }
    }

    @Override // OooO0oO.o00OO0OO
    public final boolean OooO0O0() {
        return !this.f491OooOOo0 && this.f476OooO.OooO0O0();
    }

    @Override // OooO0oO.o00O
    public final void OooO0OO() {
        this.f490OooOOo = false;
        o00O000 o00o000 = this.f479OooO0Oo;
        if (o00o000 != null) {
            o00o000.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    @Override // OooO0oO.o00O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0o(OooO0oO.o00OO r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7a
            OooO0oO.o00O0OOO r0 = new OooO0oO.o00O0OOO
            android.content.Context r5 = r9.f477OooO0O0
            android.view.View r6 = r9.f487OooOOO
            boolean r8 = r9.f481OooO0o0
            int r3 = r9.f482OooO0oO
            int r4 = r9.f483OooO0oo
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            OooO0oO.oo0oOO0 r2 = r9.f488OooOOOO
            r0.f449OooO = r2
            OooO0oO.o00O0OO0 r3 = r0.f458OooOO0
            if (r3 == 0) goto L23
            r3.OooOO0(r2)
        L23:
            boolean r2 = OooO0oO.o00O0OO0.OooOo0(r10)
            r0.f457OooO0oo = r2
            OooO0oO.o00O0OO0 r3 = r0.f458OooOO0
            if (r3 == 0) goto L30
            r3.OooOOOO(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f486OooOO0o
            r0.f459OooOO0O = r2
            r2 = 0
            r9.f486OooOO0o = r2
            OooO0oO.o00O00O r2 = r9.f478OooO0OO
            r2.OooO0OO(r1)
            androidx.appcompat.widget.o0 r2 = r9.f476OooO
            int r3 = r2.f2379OooO0o
            int r2 = r2.OooOO0()
            int r4 = r9.f494OooOo00
            android.view.View r5 = r9.OooOOO0
            java.util.WeakHashMap r6 = OooOooo.o0o0Oo.f1363OooO00o
            int r5 = OooOooo.o00O0O0O.OooO0Oo(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5e
            android.view.View r4 = r9.OooOOO0
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5e:
            boolean r4 = r0.OooO0O0()
            r5 = 1
            if (r4 == 0) goto L66
            goto L6f
        L66:
            android.view.View r4 = r0.f454OooO0o
            if (r4 != 0) goto L6c
            r0 = r1
            goto L70
        L6c:
            r0.OooO0Oo(r3, r2, r5, r5)
        L6f:
            r0 = r5
        L70:
            if (r0 == 0) goto L7a
            OooO0oO.oo0oOO0 r0 = r9.f488OooOOOO
            if (r0 == 0) goto L79
            r0.OooOOOO(r10)
        L79:
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0oO.oo0O.OooO0o(OooO0oO.o00OO):boolean");
    }

    @Override // OooO0oO.o00OO0OO
    public final androidx.appcompat.widget.o00OO000 OooO0o0() {
        return this.f476OooO.f2377OooO0OO;
    }

    @Override // OooO0oO.o00O
    public final boolean OooO0oO() {
        return false;
    }

    @Override // OooO0oO.o00O
    public final void OooOO0(oo0oOO0 oo0ooo0) {
        this.f488OooOOOO = oo0ooo0;
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOO0o(o00O00O o00o00o) {
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOOO(View view) {
        this.OooOOO0 = view;
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOOOO(boolean z) {
        this.f479OooO0Oo.f359OooO0OO = z;
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOOOo(int i) {
        this.f494OooOo00 = i;
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOOo(PopupWindow.OnDismissListener onDismissListener) {
        this.f486OooOO0o = onDismissListener;
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOOo0(int i) {
        this.f476OooO.f2379OooO0o = i;
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOOoo(boolean z) {
        this.f493OooOo0 = z;
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOo00(int i) {
        this.f476OooO.OooOOO0(i);
    }

    @Override // OooO0oO.o00OO0OO
    public final void dismiss() {
        if (OooO0O0()) {
            this.f476OooO.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f491OooOOo0 = true;
        this.f478OooO0OO.OooO0OO(true);
        ViewTreeObserver viewTreeObserver = this.f489OooOOOo;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f489OooOOOo = this.f487OooOOO.getViewTreeObserver();
            }
            this.f489OooOOOo.removeGlobalOnLayoutListener(this.f484OooOO0);
            this.f489OooOOOo = null;
        }
        this.f487OooOOO.removeOnAttachStateChangeListener(this.f485OooOO0O);
        PopupWindow.OnDismissListener onDismissListener = this.f486OooOO0o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }
}