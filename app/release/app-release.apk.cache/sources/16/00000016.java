package OooO0Oo;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import hieubui.eup.android_app_security.R;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class OooOOOO extends androidx.activity.Oooo0 implements DialogInterface, Oooo0 {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public o00000OO f85OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final OooOOO0 f86OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final o0000Ooo f87OooO0o0;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [OooO0Oo.o0000Ooo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OooOOOO(android.content.Context r2, int r3) {
        /*
            r1 = this;
            int r3 = OooOOOo(r2, r3)
            int r0 = OooOO0o(r2, r3)
            r1.<init>(r2, r0)
            OooO0Oo.o0000Ooo r0 = new OooO0Oo.o0000Ooo
            r0.<init>()
            r1.f87OooO0o0 = r0
            OooO0Oo.o00Oo0 r0 = r1.OooOO0O()
            int r2 = OooOO0o(r2, r3)
            r3 = r0
            OooO0Oo.o00000OO r3 = (OooO0Oo.o00000OO) r3
            r3.f154OoooO = r2
            r0.OooO0Oo()
            OooO0Oo.OooOOO0 r2 = new OooO0Oo.OooOOO0
            android.content.Context r3 = r1.getContext()
            android.view.Window r0 = r1.getWindow()
            r2.<init>(r3, r1, r0)
            r1.f86OooO0o = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.OooOOOO.<init>(android.content.Context, int):void");
    }

    public static int OooOO0o(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    public static int OooOOOo(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    /* renamed from: OooO */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return OooO00o.Oooooo0(this.f87OooO0o0, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    /* renamed from: OooO0OO */
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        OooOO0O().OooO00o(view, layoutParams);
    }

    @Override // OooO0Oo.Oooo0
    public final /* bridge */ /* synthetic */ void OooO0Oo() {
    }

    @Override // OooO0Oo.Oooo0
    public final /* bridge */ /* synthetic */ void OooO0o() {
    }

    @Override // OooO0Oo.Oooo0
    public final /* bridge */ /* synthetic */ void OooO0o0() {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    /* renamed from: OooO0oo */
    public final void dismiss() {
        super.dismiss();
        OooOO0O().OooO0o();
    }

    @Override // android.app.Dialog
    /* renamed from: OooOO0 */
    public final View findViewById(int i) {
        o00000OO o00000oo2 = (o00000OO) OooOO0O();
        o00000oo2.OooOo0o();
        return o00000oo2.f124OooOO0o.findViewById(i);
    }

    public final o00Oo0 OooOO0O() {
        if (this.f85OooO0Oo == null) {
            o000OO o000oo = o00Oo0.f234OooO00o;
            this.f85OooO0Oo = new o00000OO(getContext(), getWindow(), this, this);
        }
        return this.f85OooO0Oo;
    }

    public final void OooOOO(Bundle bundle) {
        o00000OO o00000oo2 = (o00000OO) OooOO0O();
        LayoutInflater from = LayoutInflater.from(o00000oo2.f123OooOO0O);
        if (from.getFactory() == null) {
            from.setFactory2(o00000oo2);
        } else {
            boolean z = from.getFactory2() instanceof o00000OO;
        }
        super.onCreate(bundle);
        OooOO0O().OooO0Oo();
    }

    @Override // android.app.Dialog
    /* renamed from: OooOOO0 */
    public final void invalidateOptionsMenu() {
        OooOO0O().OooO0O0();
    }

    @Override // androidx.activity.Oooo0, android.app.Dialog
    /* renamed from: OooOOOO */
    public final void onStop() {
        super.onStop();
        o00000OO o00000oo2 = (o00000OO) OooOO0O();
        o00000oo2.OooOoo0();
        o000O00O o000o00o = o00000oo2.f126OooOOOO;
        if (o000o00o != null) {
            o000o00o.f216OooOo00 = false;
            OooO0o.Oooo0 oooo0 = o000o00o.f213OooOOoo;
            if (oooo0 != null) {
                oooo0.OooO00o();
            }
        }
    }

    @Override // android.app.Dialog
    /* renamed from: OooOOo */
    public final void setContentView(View view) {
        OooOO0O().OooOO0O(view);
    }

    @Override // android.app.Dialog
    /* renamed from: OooOOo0 */
    public final void setContentView(int i) {
        OooOO0O().OooO(i);
    }

    @Override // android.app.Dialog
    /* renamed from: OooOOoo */
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        OooOO0O().OooOO0o(view, layoutParams);
    }

    public final void OooOo0(CharSequence charSequence) {
        super.setTitle(charSequence);
        OooOO0O().OooOOO0(charSequence);
    }

    @Override // android.app.Dialog
    /* renamed from: OooOo00 */
    public final void setTitle(int i) {
        super.setTitle(i);
        OooOO0O().OooOOO0(getContext().getString(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean OooOo0O(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0227, code lost:
        if (r4 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0229, code lost:
        r4.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0234, code lost:
        if (r4 != null) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023d  */
    @Override // androidx.activity.Oooo0, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.OooOOOO.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        NestedScrollView nestedScrollView = this.f86OooO0o.f62OooO;
        if (nestedScrollView != null && nestedScrollView.OooOO0(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z;
        NestedScrollView nestedScrollView = this.f86OooO0o.f62OooO;
        if (nestedScrollView != null && nestedScrollView.OooOO0(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        OooOo0(charSequence);
        OooOOO0 oooOOO0 = this.f86OooO0o;
        oooOOO0.f66OooO0Oo = charSequence;
        TextView textView = oooOOO0.OooOOO0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}