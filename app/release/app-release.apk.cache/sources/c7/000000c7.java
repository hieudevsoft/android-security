package OooOOoo;

import android.os.Trace;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o00O0O {
    public static /* synthetic */ WindowInsets.Builder OooO0Oo() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder OooO0o0(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ void OooOOO0(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }

    public static /* bridge */ /* synthetic */ boolean OooOOOo() {
        return Trace.isEnabled();
    }
}