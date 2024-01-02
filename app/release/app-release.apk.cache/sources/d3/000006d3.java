package o0ooOO0;

import OooO0O0.OooO0O0;

/* loaded from: classes.dex */
public final class OooOo extends OooO0O0 {
    @Override // OooO0O0.OooO0O0
    public final void OooO0oo(float f, float f2, o0Oo0oo o0oo0oo) {
        o0oo0oo.OooO0Oo(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        oo000o oo000oVar = new oo000o(0.0f, 0.0f, f3, f3);
        oo000oVar.f5575OooO0o = 180.0f;
        oo000oVar.f5577OooO0oO = 90.0f;
        o0oo0oo.f5556OooO0oO.add(oo000oVar);
        o00Oo0 o00oo0 = new o00Oo0(oo000oVar);
        o0oo0oo.OooO00o(180.0f);
        o0oo0oo.f5557OooO0oo.add(o00oo0);
        o0oo0oo.f5555OooO0o0 = 270.0f;
        float f4 = (f3 + 0.0f) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        o0oo0oo.f5552OooO0OO = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        o0oo0oo.f5553OooO0Oo = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}