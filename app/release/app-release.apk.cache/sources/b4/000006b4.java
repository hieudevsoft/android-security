package o0OOO0o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class OooOO0 extends o0ooOO0.OooOOO {

    /* renamed from: OooOo0O  reason: collision with root package name */
    public final RectF f5332OooOo0O;

    public OooOO0(OooOO0 oooOO0) {
        super(oooOO0);
        this.f5332OooOo0O = oooOO0.f5332OooOo0O;
    }

    @Override // o0ooOO0.OooOOO, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        OooOO0O oooOO0O = new OooOO0O(this);
        oooOO0O.invalidateSelf();
        return oooOO0O;
    }

    public OooOO0(o0ooOO0.Oooo0 oooo0, RectF rectF) {
        super(oooo0);
        this.f5332OooOo0O = rectF;
    }
}