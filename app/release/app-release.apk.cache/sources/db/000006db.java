package o0ooOO0;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class o00oO0o extends o0ooOOo {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public float f5546OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public float f5547OooO0OO;

    @Override // o0ooOO0.o0ooOOo
    public final void OooO00o(Matrix matrix, Path path) {
        Matrix matrix2 = this.f5570OooO00o;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f5546OooO0O0, this.f5547OooO0OO);
        path.transform(matrix);
    }
}