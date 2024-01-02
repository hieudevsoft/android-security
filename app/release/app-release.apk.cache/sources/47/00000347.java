package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class OooO0o implements Animation.AnimationListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2775OooO00o = 0;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2776OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f2777OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ Object f2778OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ Object f2779OooO0o0;

    public OooO0o(View view, ViewGroup viewGroup, OooOO0O oooOO0O, OooOOO oooOOO) {
        this.f2779OooO0o0 = oooOOO;
        this.f2776OooO0O0 = viewGroup;
        this.f2777OooO0OO = view;
        this.f2778OooO0Oo = oooOO0O;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i = this.f2775OooO00o;
        ViewGroup viewGroup = this.f2776OooO0O0;
        switch (i) {
            case 0:
                viewGroup.post(new o0OOO0o(1, this));
                return;
            default:
                viewGroup.post(new o0OOO0o(0, this));
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public OooO0o(ViewGroup viewGroup, o00Oo0 o00oo0, o000000O o000000o2, OooOoOO.o000000 o000000Var) {
        this.f2776OooO0O0 = viewGroup;
        this.f2777OooO0OO = o00oo0;
        this.f2778OooO0Oo = o000000o2;
        this.f2779OooO0o0 = o000000Var;
    }
}