package o0ooOO0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class OooO implements OooOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOO0 f5464OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final float f5465OooO0O0;

    public OooO(float f, OooOO0 oooOO0) {
        while (oooOO0 instanceof OooO) {
            oooOO0 = ((OooO) oooOO0).f5464OooO00o;
            f += ((OooO) oooOO0).f5465OooO0O0;
        }
        this.f5464OooO00o = oooOO0;
        this.f5465OooO0O0 = f;
    }

    @Override // o0ooOO0.OooOO0
    public final float OooO00o(RectF rectF) {
        return Math.max(0.0f, this.f5464OooO00o.OooO00o(rectF) + this.f5465OooO0O0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO) {
            OooO oooO = (OooO) obj;
            return this.f5464OooO00o.equals(oooO.f5464OooO00o) && this.f5465OooO0O0 == oooO.f5465OooO0O0;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5464OooO00o, Float.valueOf(this.f5465OooO0O0)});
    }
}