package o0OOO0o;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* loaded from: classes.dex */
public final class OooOO0O extends OooOOO0 {
    @Override // o0ooOO0.OooOOOO
    public final void OooO0o(Canvas canvas) {
        if (this.f5335OooOo.f5332OooOo0O.isEmpty()) {
            super.OooO0o(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f5335OooOo.f5332OooOo0O);
        } else {
            canvas.clipRect(this.f5335OooOo.f5332OooOo0O, Region.Op.DIFFERENCE);
        }
        super.OooO0o(canvas);
        canvas.restore();
    }
}