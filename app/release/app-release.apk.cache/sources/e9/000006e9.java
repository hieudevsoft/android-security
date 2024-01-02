package o0ooOoO;

import OooO0O0.OooO00o;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class OooOOO implements Handler.Callback {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ OooO0o.OooOOO0 f5593OooO00o;

    public OooOOO(OooO0o.OooOOO0 oooOOO0) {
        this.f5593OooO00o = oooOOO0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        OooO0o.OooOOO0 oooOOO0 = this.f5593OooO00o;
        OooO00o.OooO0oO(message.obj);
        synchronized (oooOOO0.f269OooO00o) {
            OooO00o.OooO0oO(oooOOO0.f271OooO0OO);
            throw null;
        }
    }
}