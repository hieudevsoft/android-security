package o0ooOO0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import o00oO0O.OooO00o;

/* loaded from: classes.dex */
public final class o00Oo0 extends o0OOO0o {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final oo000o f5542OooO0OO;

    public o00Oo0(oo000o oo000oVar) {
        this.f5542OooO0OO = oo000oVar;
    }

    @Override // o0ooOO0.o0OOO0o
    public final void OooO00o(Matrix matrix, OooO00o oooO00o, int i, Canvas canvas) {
        boolean z;
        oo000o oo000oVar = this.f5542OooO0OO;
        float f = oo000oVar.f5575OooO0o;
        float f2 = oo000oVar.f5577OooO0oO;
        RectF rectF = new RectF(oo000oVar.f5572OooO0O0, oo000oVar.f5573OooO0OO, oo000oVar.f5574OooO0Oo, oo000oVar.f5576OooO0o0);
        oooO00o.getClass();
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = oooO00o.f5293OooO0oO;
        int[] iArr = OooO00o.f5285OooOO0O;
        if (z) {
            iArr[0] = 0;
            iArr[1] = oooO00o.f5291OooO0o;
            iArr[2] = oooO00o.f5292OooO0o0;
            iArr[3] = oooO00o.f5290OooO0Oo;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = oooO00o.f5290OooO0Oo;
            iArr[2] = oooO00o.f5292OooO0o0;
            iArr[3] = oooO00o.f5291OooO0o;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (i / width);
            float[] fArr = OooO00o.f5286OooOO0o;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = oooO00o.f5288OooO0O0;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, oooO00o.f5294OooO0oo);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }
}