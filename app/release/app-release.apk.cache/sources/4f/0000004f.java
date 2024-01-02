package OooO0o0;

import Ooooo00.OooOOOO;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class OooO implements Drawable.Callback {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f322OooO00o = 1;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Object f323OooO0O0;

    public OooO(OooOOOO oooOOOO) {
        this.f323OooO0O0 = oooOOOO;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f322OooO00o) {
            case 0:
                return;
            default:
                ((OooOOOO) this.f323OooO0O0).invalidateSelf();
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f322OooO00o) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f323OooO0O0;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
            default:
                ((OooOOOO) this.f323OooO0O0).scheduleSelf(runnable, j);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f322OooO00o) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f323OooO0O0;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            default:
                ((OooOOOO) this.f323OooO0O0).unscheduleSelf(runnable);
                return;
        }
    }
}