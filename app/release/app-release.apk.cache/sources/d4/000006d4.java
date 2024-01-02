package o0ooOO0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class OooOo00 implements OooOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final float f5514OooO00o;

    public OooOo00(float f) {
        this.f5514OooO00o = f;
    }

    @Override // o0ooOO0.OooOO0
    public final float OooO00o(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f5514OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooOo00) && this.f5514OooO00o == ((OooOo00) obj).f5514OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5514OooO00o)});
    }
}