package OoooO;

import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class oo000o {
    public static void OooO00o(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: OoooO.o00Ooo
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}