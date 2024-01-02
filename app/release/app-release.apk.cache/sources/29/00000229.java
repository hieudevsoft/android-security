package Ooooo00;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class o00Oo0 extends Drawable.ConstantState {

    /* renamed from: OooO  reason: collision with root package name */
    public int f1749OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f1750OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public o00O0O f1751OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public ColorStateList f1752OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public PorterDuff.Mode f1753OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public Bitmap f1754OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f1755OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public ColorStateList f1756OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public PorterDuff.Mode f1757OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f1758OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean f1759OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public Paint f1760OooOO0o;

    public o00Oo0() {
        this.f1752OooO0OO = null;
        this.f1753OooO0Oo = oo000o.f1766OooOO0;
        this.f1751OooO0O0 = new o00O0O();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1750OooO00o;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new oo000o(this);
    }

    public o00Oo0(o00Oo0 o00oo0) {
        this.f1752OooO0OO = null;
        this.f1753OooO0Oo = oo000o.f1766OooOO0;
        if (o00oo0 != null) {
            this.f1750OooO00o = o00oo0.f1750OooO00o;
            o00O0O o00o0o = new o00O0O(o00oo0.f1751OooO0O0);
            this.f1751OooO0O0 = o00o0o;
            if (o00oo0.f1751OooO0O0.f1741OooO0o0 != null) {
                o00o0o.f1741OooO0o0 = new Paint(o00oo0.f1751OooO0O0.f1741OooO0o0);
            }
            if (o00oo0.f1751OooO0O0.f1739OooO0Oo != null) {
                this.f1751OooO0O0.f1739OooO0Oo = new Paint(o00oo0.f1751OooO0O0.f1739OooO0Oo);
            }
            this.f1752OooO0OO = o00oo0.f1752OooO0OO;
            this.f1753OooO0Oo = o00oo0.f1753OooO0Oo;
            this.f1755OooO0o0 = o00oo0.f1755OooO0o0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new oo000o(this);
    }
}