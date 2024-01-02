package o0ooOO0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import o00oO0O.OooO00o;

/* loaded from: classes.dex */
public final class o00O0O extends o0OOO0o {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ List f5540OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ Matrix f5541OooO0Oo;

    public o00O0O(ArrayList arrayList, Matrix matrix) {
        this.f5540OooO0OO = arrayList;
        this.f5541OooO0Oo = matrix;
    }

    @Override // o0ooOO0.o0OOO0o
    public final void OooO00o(Matrix matrix, OooO00o oooO00o, int i, Canvas canvas) {
        for (o0OOO0o o0ooo0o : this.f5540OooO0OO) {
            o0ooo0o.OooO00o(this.f5541OooO0Oo, oooO00o, i, canvas);
        }
    }
}