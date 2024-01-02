package Ooooo00;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class OooOOO extends Drawable.ConstantState {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Drawable.ConstantState f1701OooO00o;

    public OooOOO(Drawable.ConstantState constantState) {
        this.f1701OooO00o = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f1701OooO00o.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f1701OooO00o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        OooOOOO oooOOOO = new OooOOOO(null);
        Drawable newDrawable = this.f1701OooO00o.newDrawable();
        oooOOOO.f1711OooO00o = newDrawable;
        newDrawable.setCallback(oooOOOO.f1709OooO0o);
        return oooOOOO;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        OooOOOO oooOOOO = new OooOOOO(null);
        Drawable newDrawable = this.f1701OooO00o.newDrawable(resources);
        oooOOOO.f1711OooO00o = newDrawable;
        newDrawable.setCallback(oooOOOO.f1709OooO0o);
        return oooOOOO;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        OooOOOO oooOOOO = new OooOOOO(null);
        Drawable newDrawable = this.f1701OooO00o.newDrawable(resources, theme);
        oooOOOO.f1711OooO00o = newDrawable;
        newDrawable.setCallback(oooOOOO.f1709OooO0o);
        return oooOOOO;
    }
}