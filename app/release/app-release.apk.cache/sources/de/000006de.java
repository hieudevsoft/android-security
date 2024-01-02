package o0ooOO0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0Oo0oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public float f5550OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public float f5551OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public float f5552OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public float f5553OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public float f5554OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public float f5555OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final ArrayList f5556OooO0oO = new ArrayList();

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final ArrayList f5557OooO0oo = new ArrayList();

    public o0Oo0oo() {
        OooO0Oo(0.0f, 270.0f, 0.0f);
    }

    public final void OooO00o(float f) {
        float f2 = this.f5555OooO0o0;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f5552OooO0OO;
        float f5 = this.f5553OooO0Oo;
        oo000o oo000oVar = new oo000o(f4, f5, f4, f5);
        oo000oVar.f5575OooO0o = this.f5555OooO0o0;
        oo000oVar.f5577OooO0oO = f3;
        this.f5557OooO0oo.add(new o00Oo0(oo000oVar));
        this.f5555OooO0o0 = f;
    }

    public final void OooO0O0(Matrix matrix, Path path) {
        ArrayList arrayList = this.f5556OooO0oO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o0ooOOo) arrayList.get(i)).OooO00o(matrix, path);
        }
    }

    public final void OooO0OO(float f, float f2) {
        o00oO0o o00oo0o = new o00oO0o();
        o00oo0o.f5546OooO0O0 = f;
        o00oo0o.f5547OooO0OO = f2;
        this.f5556OooO0oO.add(o00oo0o);
        o00Ooo o00ooo2 = new o00Ooo(o00oo0o, this.f5552OooO0OO, this.f5553OooO0Oo);
        OooO00o(o00ooo2.OooO0O0() + 270.0f);
        this.f5557OooO0oo.add(o00ooo2);
        this.f5555OooO0o0 = o00ooo2.OooO0O0() + 270.0f;
        this.f5552OooO0OO = f;
        this.f5553OooO0Oo = f2;
    }

    public final void OooO0Oo(float f, float f2, float f3) {
        this.f5550OooO00o = 0.0f;
        this.f5551OooO0O0 = f;
        this.f5552OooO0OO = 0.0f;
        this.f5553OooO0Oo = f;
        this.f5555OooO0o0 = f2;
        this.f5554OooO0o = (f2 + f3) % 360.0f;
        this.f5556OooO0oO.clear();
        this.f5557OooO0oo.clear();
    }
}