package Ooooo00;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes.dex */
public final class o00Ooo extends Drawable.ConstantState {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Drawable.ConstantState f1761OooO00o;

    public o00Ooo(Drawable.ConstantState constantState) {
        this.f1761OooO00o = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f1761OooO00o.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1761OooO00o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        oo000o oo000oVar = new oo000o();
        oo000oVar.f1711OooO00o = (VectorDrawable) this.f1761OooO00o.newDrawable();
        return oo000oVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        oo000o oo000oVar = new oo000o();
        oo000oVar.f1711OooO00o = (VectorDrawable) this.f1761OooO00o.newDrawable(resources);
        return oo000oVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        oo000o oo000oVar = new oo000o();
        oo000oVar.f1711OooO00o = (VectorDrawable) this.f1761OooO00o.newDrawable(resources, theme);
        return oo000oVar;
    }
}