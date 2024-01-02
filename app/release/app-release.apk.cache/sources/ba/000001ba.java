package Oooo00o;

import OooO0Oo.o0000OO0;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class OooOO0O extends InputConnectionWrapper {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ OooOO0 f1442OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(InputConnection inputConnection, OooOO0 oooOO0) {
        super(inputConnection, false);
        this.f1442OooO00o = oooOO0;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        o0000OO0 o0000oo02 = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            o0000oo02 = new o0000OO0(15, new OooOOO(inputContentInfo));
        }
        if (this.f1442OooO00o.OooO00o(o0000oo02, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}