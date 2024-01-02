package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class oo0o0Oo extends AnimationSet implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ViewGroup f3039OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final View f3040OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f3041OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f3042OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f3043OooO0o0;

    public oo0o0Oo(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f3043OooO0o0 = true;
        this.f3039OooO00o = viewGroup;
        this.f3040OooO0O0 = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f3043OooO0o0 = true;
        if (this.f3041OooO0OO) {
            return !this.f3042OooO0Oo;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f3041OooO0OO = true;
            OooOooo.o00O000o.OooO00o(this.f3039OooO00o, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f3041OooO0OO;
        ViewGroup viewGroup = this.f3039OooO00o;
        if (z || !this.f3043OooO0o0) {
            viewGroup.endViewTransition(this.f3040OooO0O0);
            this.f3042OooO0Oo = true;
            return;
        }
        this.f3043OooO0o0 = false;
        viewGroup.post(this);
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f3043OooO0o0 = true;
        if (this.f3041OooO0OO) {
            return !this.f3042OooO0Oo;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f3041OooO0OO = true;
            OooOooo.o00O000o.OooO00o(this.f3039OooO00o, this);
        }
        return true;
    }
}