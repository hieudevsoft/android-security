package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class OooOo00 implements DialogInterface.OnDismissListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ Oooo0 f2792OooO00o;

    public OooOo00(Oooo0 oooo0) {
        this.f2792OooO00o = oooo0;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Oooo0 oooo0 = this.f2792OooO00o;
        Dialog dialog = oooo0.f2802OooooO0;
        if (dialog != null) {
            oooo0.onDismiss(dialog);
        }
    }
}