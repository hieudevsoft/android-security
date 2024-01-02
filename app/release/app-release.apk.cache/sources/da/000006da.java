package o0ooOO0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import o00oO0O.OooO00o;

/* loaded from: classes.dex */
public final class o00Ooo extends o0OOO0o {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o00oO0o f5543OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final float f5544OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final float f5545OooO0o0;

    public o00Ooo(o00oO0o o00oo0o, float f, float f2) {
        this.f5543OooO0OO = o00oo0o;
        this.f5544OooO0Oo = f;
        this.f5545OooO0o0 = f2;
    }

    @Override // o0ooOO0.o0OOO0o
    public final void OooO00o(Matrix matrix, OooO00o oooO00o, int i, Canvas canvas) {
        o00oO0o o00oo0o = this.f5543OooO0OO;
        float f = o00oo0o.f5547OooO0OO;
        float f2 = this.f5545OooO0o0;
        float f3 = o00oo0o.f5546OooO0O0;
        float f4 = this.f5544OooO0Oo;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f5549OooO00o;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(OooO0O0());
        oooO00o.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = OooO00o.f5283OooO;
        iArr[0] = oooO00o.f5291OooO0o;
        iArr[1] = oooO00o.f5292OooO0o0;
        iArr[2] = oooO00o.f5290OooO0Oo;
        Paint paint = oooO00o.f5289OooO0OO;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, OooO00o.f5284OooOO0, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float OooO0O0() {
        o00oO0o o00oo0o = this.f5543OooO0OO;
        return (float) Math.toDegrees(Math.atan((o00oo0o.f5547OooO0OO - this.f5545OooO0o0) / (o00oo0o.f5546OooO0O0 - this.f5544OooO0Oo)));
    }
}