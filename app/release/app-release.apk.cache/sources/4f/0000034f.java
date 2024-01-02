package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public class Oooo0 extends o00Oo0 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: OoooO0O  reason: collision with root package name */
    public Handler f2794OoooO0O;

    /* renamed from: Ooooo00  reason: collision with root package name */
    public boolean f2800Ooooo00;

    /* renamed from: OooooO0  reason: collision with root package name */
    public Dialog f2802OooooO0;

    /* renamed from: OooooOO  reason: collision with root package name */
    public boolean f2803OooooOO;

    /* renamed from: OooooOo  reason: collision with root package name */
    public boolean f2804OooooOo;

    /* renamed from: OoooO  reason: collision with root package name */
    public final o0OOO0o f2793OoooO = new o0OOO0o(2, this);

    /* renamed from: OoooOO0  reason: collision with root package name */
    public final OooOOOO f2795OoooOO0 = new OooOOOO(this);

    /* renamed from: o000oOoO  reason: collision with root package name */
    public final OooOo00 f2806o000oOoO = new OooOo00(this);

    /* renamed from: OoooOOO  reason: collision with root package name */
    public int f2796OoooOOO = 0;

    /* renamed from: OoooOOo  reason: collision with root package name */
    public int f2797OoooOOo = 0;

    /* renamed from: OoooOo0  reason: collision with root package name */
    public boolean f2798OoooOo0 = true;
    public boolean OoooOoO = true;

    /* renamed from: OoooOoo  reason: collision with root package name */
    public int f2799OoooOoo = -1;

    /* renamed from: Ooooo0o  reason: collision with root package name */
    public final OooOo f2801Ooooo0o = new OooOo(0, this);

    /* renamed from: Oooooo0  reason: collision with root package name */
    public boolean f2805Oooooo0 = false;

    @Override // androidx.fragment.app.o00Oo0
    public final o0000O00.OooO00o OooO0Oo() {
        return new Oooo000(this, new o000oOoO(this));
    }

    @Override // androidx.fragment.app.o00Oo0
    public final void OooOOOo(Context context) {
        super.OooOOOo(context);
        this.f2990Oooo0oo.OooO0Oo(this.f2801Ooooo0o);
        this.f2804OooooOo = false;
    }

    @Override // androidx.fragment.app.o00Oo0
    public void OooOOo0(Bundle bundle) {
        super.OooOOo0(bundle);
        this.f2794OoooO0O = new Handler();
        this.OoooOoO = this.f2972OooOo0o == 0;
        if (bundle != null) {
            this.f2796OoooOOO = bundle.getInt("android:style", 0);
            this.f2797OoooOOo = bundle.getInt("android:theme", 0);
            this.f2798OoooOo0 = bundle.getBoolean("android:cancelable", true);
            this.OoooOoO = bundle.getBoolean("android:showsDialog", this.OoooOoO);
            this.f2799OoooOoo = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.o00Oo0
    public final void OooOOoo() {
        this.f2976OooOoo = true;
        Dialog dialog = this.f2802OooooO0;
        if (dialog != null) {
            this.f2803OooooOO = true;
            dialog.setOnDismissListener(null);
            this.f2802OooooO0.dismiss();
            if (!this.f2804OooooOo) {
                onDismiss(this.f2802OooooO0);
            }
            this.f2802OooooO0 = null;
            this.f2805Oooooo0 = false;
        }
    }

    @Override // androidx.fragment.app.o00Oo0
    public void OooOo() {
        this.f2976OooOoo = true;
        Dialog dialog = this.f2802OooooO0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:12:0x0018, B:14:0x0024, B:24:0x003c, B:26:0x0044, B:27:0x004b, B:20:0x002e, B:22:0x0034, B:23:0x0039, B:28:0x0063), top: B:44:0x0018 }] */
    @Override // androidx.fragment.app.o00Oo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater OooOo0(android.os.Bundle r7) {
        /*
            r6 = this;
            android.view.LayoutInflater r7 = super.OooOo0(r7)
            boolean r0 = r6.OoooOoO
            r1 = 2
            if (r0 == 0) goto L83
            boolean r2 = r6.f2800Ooooo00
            if (r2 == 0) goto Lf
            goto L83
        Lf:
            if (r0 != 0) goto L12
            goto L6d
        L12:
            boolean r0 = r6.f2805Oooooo0
            if (r0 != 0) goto L6d
            r0 = 0
            r2 = 1
            r6.f2800Ooooo00 = r2     // Catch: java.lang.Throwable -> L69
            android.app.Dialog r3 = r6.Oooo00O()     // Catch: java.lang.Throwable -> L69
            r6.f2802OooooO0 = r3     // Catch: java.lang.Throwable -> L69
            boolean r4 = r6.OoooOoO     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L63
            int r4 = r6.f2796OoooOOO     // Catch: java.lang.Throwable -> L69
            if (r4 == r2) goto L39
            if (r4 == r1) goto L39
            r5 = 3
            if (r4 == r5) goto L2e
            goto L3c
        L2e:
            android.view.Window r4 = r3.getWindow()     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L39
            r5 = 24
            r4.addFlags(r5)     // Catch: java.lang.Throwable -> L69
        L39:
            r3.requestWindowFeature(r2)     // Catch: java.lang.Throwable -> L69
        L3c:
            android.content.Context r3 = r6.OooO()     // Catch: java.lang.Throwable -> L69
            boolean r4 = r3 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L4b
            android.app.Dialog r4 = r6.f2802OooooO0     // Catch: java.lang.Throwable -> L69
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L69
            r4.setOwnerActivity(r3)     // Catch: java.lang.Throwable -> L69
        L4b:
            android.app.Dialog r3 = r6.f2802OooooO0     // Catch: java.lang.Throwable -> L69
            boolean r4 = r6.f2798OoooOo0     // Catch: java.lang.Throwable -> L69
            r3.setCancelable(r4)     // Catch: java.lang.Throwable -> L69
            android.app.Dialog r3 = r6.f2802OooooO0     // Catch: java.lang.Throwable -> L69
            androidx.fragment.app.OooOOOO r4 = r6.f2795OoooOO0     // Catch: java.lang.Throwable -> L69
            r3.setOnCancelListener(r4)     // Catch: java.lang.Throwable -> L69
            android.app.Dialog r3 = r6.f2802OooooO0     // Catch: java.lang.Throwable -> L69
            androidx.fragment.app.OooOo00 r4 = r6.f2806o000oOoO     // Catch: java.lang.Throwable -> L69
            r3.setOnDismissListener(r4)     // Catch: java.lang.Throwable -> L69
            r6.f2805Oooooo0 = r2     // Catch: java.lang.Throwable -> L69
            goto L66
        L63:
            r2 = 0
            r6.f2802OooooO0 = r2     // Catch: java.lang.Throwable -> L69
        L66:
            r6.f2800Ooooo00 = r0
            goto L6d
        L69:
            r7 = move-exception
            r6.f2800Ooooo00 = r0
            throw r7
        L6d:
            boolean r0 = androidx.fragment.app.o0000oo.OooOooo(r1)
            if (r0 == 0) goto L76
            r6.toString()
        L76:
            android.app.Dialog r0 = r6.f2802OooooO0
            if (r0 == 0) goto L82
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r7 = r7.cloneInContext(r0)
        L82:
            return r7
        L83:
            boolean r0 = androidx.fragment.app.o0000oo.OooOooo(r1)
            if (r0 == 0) goto L8c
            r6.toString()
        L8c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Oooo0.OooOo0(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.o00Oo0
    public final void OooOo00() {
        this.f2976OooOoo = true;
        if (!this.f2804OooooOo) {
            this.f2804OooooOo = true;
        }
        androidx.lifecycle.o0OO00O o0oo00o = this.f2990Oooo0oo;
        o0oo00o.getClass();
        androidx.lifecycle.o0OO00O.OooO00o("removeObserver");
        androidx.lifecycle.o0Oo0oo o0oo0oo = (androidx.lifecycle.o0Oo0oo) o0oo00o.f3101OooO0O0.OooO0oO(this.f2801Ooooo0o);
        if (o0oo0oo != null) {
            o0oo0oo.OooO0Oo();
            o0oo0oo.OooO0OO(false);
        }
    }

    @Override // androidx.fragment.app.o00Oo0
    public void OooOo0O(Bundle bundle) {
        Dialog dialog = this.f2802OooooO0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f2796OoooOOO;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f2797OoooOOo;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f2798OoooOo0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.OoooOoO;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f2799OoooOoo;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.o00Oo0
    public void OooOo0o() {
        this.f2976OooOoo = true;
        Dialog dialog = this.f2802OooooO0;
        if (dialog != null) {
            this.f2803OooooOO = false;
            dialog.show();
            View decorView = this.f2802OooooO0.getWindow().getDecorView();
            o0000O00.OooO00o.OooOoo0(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.o00Oo0
    public final void OooOoO(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.OooOoO(layoutInflater, viewGroup, bundle);
        if (this.f2979OooOooo != null || this.f2802OooooO0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2802OooooO0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.o00Oo0
    public final void OooOoO0(Bundle bundle) {
        Bundle bundle2;
        this.f2976OooOoo = true;
        if (this.f2802OooooO0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f2802OooooO0.onRestoreInstanceState(bundle2);
        }
    }

    public final void Oooo000(boolean z, boolean z2) {
        if (this.f2804OooooOo) {
            return;
        }
        this.f2804OooooOo = true;
        Dialog dialog = this.f2802OooooO0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2802OooooO0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f2794OoooO0O.getLooper()) {
                    onDismiss(this.f2802OooooO0);
                } else {
                    this.f2794OoooO0O.post(this.f2793OoooO);
                }
            }
        }
        this.f2803OooooOO = true;
        if (this.f2799OoooOoo >= 0) {
            o0000oo OooOO0O2 = OooOO0O();
            int i = this.f2799OoooOoo;
            if (i >= 0) {
                OooOO0O2.OooOo0O(new o0000O00(OooOO0O2, i), false);
                this.f2799OoooOoo = -1;
                return;
            }
            throw new IllegalArgumentException(OooO0O0.OooO00o.OooO0O0("Bad id: ", i));
        }
        OooO00o oooO00o = new OooO00o(OooOO0O());
        o0000oo o0000ooVar = this.f2965OooOOo;
        if (o0000ooVar != null && o0000ooVar != oooO00o.f2754OooOOOo) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        oooO00o.OooO0O0(new o000O000(3, this));
        if (z) {
            oooO00o.OooO0Oo(true);
        } else {
            oooO00o.OooO0Oo(false);
        }
    }

    public Dialog Oooo00O() {
        if (o0000oo.OooOooo(3)) {
            toString();
        }
        return new Dialog(OooOoo0(), this.f2797OoooOOo);
    }

    public final Dialog Oooo00o() {
        Dialog dialog = this.f2802OooooO0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2803OooooOO) {
            return;
        }
        if (o0000oo.OooOooo(3)) {
            toString();
        }
        Oooo000(true, true);
    }
}