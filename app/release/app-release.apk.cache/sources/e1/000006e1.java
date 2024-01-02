package o0ooOO0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class oo000o extends o0ooOOo {

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static final RectF f5571OooO0oo = new RectF();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public float f5572OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public float f5573OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public float f5574OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public float f5575OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public float f5576OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public float f5577OooO0oO;

    public oo000o(float f, float f2, float f3, float f4) {
        this.f5572OooO0O0 = f;
        this.f5573OooO0OO = f2;
        this.f5574OooO0Oo = f3;
        this.f5576OooO0o0 = f4;
    }

    @Override // o0ooOO0.o0ooOOo
    public final void OooO00o(Matrix matrix, Path path) {
        Matrix matrix2 = this.f5570OooO00o;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f5571OooO0oo;
        rectF.set(this.f5572OooO0O0, this.f5573OooO0OO, this.f5574OooO0Oo, this.f5576OooO0o0);
        path.arcTo(rectF, this.f5575OooO0o, this.f5577OooO0oO, false);
        path.transform(matrix);
    }
}