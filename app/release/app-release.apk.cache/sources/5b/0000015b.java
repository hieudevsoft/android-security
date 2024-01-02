package OooOooo;

import OooOo.OooO0OO;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class o0O000O implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o0O00O f1311OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o0O0OOOo f1312OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ o0O0OOOo f1313OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ int f1314OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ View f1315OooO0o0;

    public o0O000O(o0O00O o0o00o, o0O0OOOo o0o0oooo, o0O0OOOo o0o0oooo2, int i, View view) {
        this.f1311OooO00o = o0o00o;
        this.f1312OooO0O0 = o0o0oooo;
        this.f1313OooO0OO = o0o0oooo2;
        this.f1314OooO0Oo = i;
        this.f1315OooO0o0 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        o0O00oO0 o0o00ooo;
        OooO0OO OooO0o2;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        o0O00O o0o00o = this.f1311OooO00o;
        o0o00o.f1321OooO00o.OooO0Oo(animatedFraction);
        float OooO0O02 = o0o00o.f1321OooO00o.OooO0O0();
        PathInterpolator pathInterpolator = o0O000o0.f1319OooO0o0;
        int i = Build.VERSION.SDK_INT;
        o0O0OOOo o0o0oooo = this.f1312OooO0O0;
        if (i >= 30) {
            o0o00ooo = new o0O00o00(o0o0oooo);
        } else if (i >= 29) {
            o0o00ooo = new o0oO0Ooo(o0o0oooo);
        } else {
            o0o00ooo = new o0O00OOO(o0o0oooo);
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((this.f1314OooO0Oo & i2) == 0) {
                OooO0o2 = o0o0oooo.OooO00o(i2);
            } else {
                OooO0OO OooO00o2 = o0o0oooo.OooO00o(i2);
                OooO0OO OooO00o3 = this.f1313OooO0OO.OooO00o(i2);
                float f = 1.0f - OooO0O02;
                OooO0o2 = o0O0OOOo.OooO0o(OooO00o2, (int) (((OooO00o2.f1110OooO00o - OooO00o3.f1110OooO00o) * f) + 0.5d), (int) (((OooO00o2.f1111OooO0O0 - OooO00o3.f1111OooO0O0) * f) + 0.5d), (int) (((OooO00o2.f1112OooO0OO - OooO00o3.f1112OooO0OO) * f) + 0.5d), (int) (((OooO00o2.f1113OooO0Oo - OooO00o3.f1113OooO0Oo) * f) + 0.5d));
            }
            o0o00ooo.OooO0OO(i2, OooO0o2);
        }
        o0O000o0.OooO0oO(this.f1315OooO0o0, o0o00ooo.OooO0O0(), Collections.singletonList(o0o00o));
    }
}