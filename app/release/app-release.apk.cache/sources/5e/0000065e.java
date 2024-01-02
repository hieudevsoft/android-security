package o000oOoO;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class o000000 extends oo0o0Oo {

    /* renamed from: OooOOOo  reason: collision with root package name */
    public final /* synthetic */ int f4945OooOOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final /* synthetic */ Object f4946OooOOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o000000(Object obj, Context context, int i) {
        super(context);
        this.f4945OooOOOo = i;
        this.f4946OooOOo0 = obj;
    }

    @Override // o000oOoO.oo0o0Oo
    public final int OooO0O0(View view, int i) {
        switch (this.f4945OooOOOo) {
            case 1:
                ((CarouselLayoutManager) this.f4946OooOOo0).getClass();
                return 0;
            default:
                return super.OooO0O0(view, i);
        }
    }

    @Override // o000oOoO.oo0o0Oo
    public final int OooO0OO(View view, int i) {
        switch (this.f4945OooOOOo) {
            case 1:
                ((CarouselLayoutManager) this.f4946OooOOo0).getClass();
                return 0;
            default:
                return super.OooO0OO(view, i);
        }
    }

    @Override // o000oOoO.oo0o0Oo
    public final float OooO0Oo(DisplayMetrics displayMetrics) {
        int i;
        switch (this.f4945OooOOOo) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            case 1:
            default:
                return 25.0f / displayMetrics.densityDpi;
            case 2:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i;
    }

    @Override // o000oOoO.oo0o0Oo
    public final PointF OooO0o(int i) {
        switch (this.f4945OooOOOo) {
            case 1:
                ((CarouselLayoutManager) this.f4946OooOOo0).getClass();
                return null;
            default:
                return super.OooO0o(i);
        }
    }

    @Override // o000oOoO.oo0o0Oo
    public final int OooO0o0(int i) {
        switch (this.f4945OooOOOo) {
            case 0:
                return Math.min(100, super.OooO0o0(i));
            default:
                return super.OooO0o0(i);
        }
    }

    @Override // o000oOoO.oo0o0Oo
    public final void OooO0oo(View view, o000O0O0 o000o0o0, o000O0Oo o000o0oo) {
        switch (this.f4945OooOOOo) {
            case 0:
                o000000O o000000o2 = (o000000O) this.f4946OooOOo0;
                int[] OooO00o2 = o000000o2.OooO00o(o000000o2.f4947OooO00o.getLayoutManager(), view);
                int i = OooO00o2[0];
                int i2 = OooO00o2[1];
                int ceil = (int) Math.ceil(OooO0o0(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f5174OooO;
                    o000o0oo.f4995OooO0O0 = i;
                    o000o0oo.f4996OooO0OO = i2;
                    o000o0oo.f4997OooO0Oo = ceil;
                    o000o0oo.f5000OooO0oO = decelerateInterpolator;
                    o000o0oo.f4994OooO00o = true;
                    return;
                }
                return;
            default:
                super.OooO0oo(view, o000o0o0, o000o0oo);
                return;
        }
    }
}