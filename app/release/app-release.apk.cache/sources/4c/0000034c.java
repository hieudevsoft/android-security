package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class OooOOOO implements DialogInterface.OnCancelListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ Oooo0 f2789OooO00o;

    public OooOOOO(Oooo0 oooo0) {
        this.f2789OooO00o = oooo0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Oooo0 oooo0 = this.f2789OooO00o;
        Dialog dialog = oooo0.f2802OooooO0;
        if (dialog != null) {
            oooo0.onCancel(dialog);
        }
    }
}