package o0OOO0o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class OooOOO0 extends o0ooOO0.OooOOOO {

    /* renamed from: OooOoO0  reason: collision with root package name */
    public static final /* synthetic */ int f5334OooOoO0 = 0;

    /* renamed from: OooOo  reason: collision with root package name */
    public OooOO0 f5335OooOo;

    public OooOOO0(OooOO0 oooOO0) {
        super(oooOO0);
        this.f5335OooOo = oooOO0;
    }

    public final void OooOOO(float f, float f2, float f3, float f4) {
        RectF rectF = this.f5335OooOo.f5332OooOo0O;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    @Override // o0ooOO0.OooOOOO, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f5335OooOo = new OooOO0(this.f5335OooOo);
        return this;
    }
}