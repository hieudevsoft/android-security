package Ooooo00;

import OooOoO0.o0OOO0o;
import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import o0OoOo0.OooO00o;
import o0OoOo0.OooO0OO;

/* loaded from: classes.dex */
public final class OooOO0O extends Animatable2.AnimationCallback {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ OooO00o f1700OooO00o;

    public OooOO0O(OooO00o oooO00o) {
        this.f1700OooO00o = oooO00o;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f1700OooO00o.f5439OooO0O0.f5454OooOOOO;
        if (colorStateList != null) {
            o0OOO0o.OooO0oo(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        OooO0OO oooO0OO = this.f1700OooO00o.f5439OooO0O0;
        ColorStateList colorStateList = oooO0OO.f5454OooOOOO;
        if (colorStateList != null) {
            o0OOO0o.OooO0oO(drawable, colorStateList.getColorForState(oooO0OO.f5458OooOOoo, colorStateList.getDefaultColor()));
        }
    }
}