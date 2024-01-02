package OooO0Oo;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class OooOO0 extends Handler {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final WeakReference f59OooO00o;

    public OooOO0(DialogInterface dialogInterface) {
        this.f59OooO00o = new WeakReference(dialogInterface);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f59OooO00o.get(), message.what);
        } else if (i != 1) {
        } else {
            ((DialogInterface) message.obj).dismiss();
        }
    }
}