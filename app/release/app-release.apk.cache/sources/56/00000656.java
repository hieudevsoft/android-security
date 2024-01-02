package o000oOoO;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes.dex */
public final class OooOo implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4924OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f4925OooO0O0;

    public /* synthetic */ OooOo(int i, Object obj) {
        this.f4924OooO00o = i;
        this.f4925OooO0O0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4924OooO00o;
        Object obj = this.f4925OooO0O0;
        switch (i) {
            case 0:
                o0OoOo0 o0oooo0 = (o0OoOo0) obj;
                int i2 = o0oooo0.f5157OooOoOO;
                ValueAnimator valueAnimator = o0oooo0.f5155OooOoO;
                if (i2 != 1) {
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                o0oooo0.f5157OooOoOO = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            default:
                ((StaggeredGridLayoutManager) obj).o0OO00O();
                return;
        }
    }
}