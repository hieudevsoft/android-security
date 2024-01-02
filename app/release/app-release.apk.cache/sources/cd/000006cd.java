package o0ooOO0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class OooO0o implements OooOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final float f5466OooO00o;

    public OooO0o(float f) {
        this.f5466OooO00o = f;
    }

    @Override // o0ooOO0.OooOO0
    public final float OooO00o(RectF rectF) {
        return this.f5466OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO0o) && this.f5466OooO00o == ((OooO0o) obj).f5466OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5466OooO00o)});
    }
}