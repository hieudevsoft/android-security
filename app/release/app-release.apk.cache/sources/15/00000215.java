package OoooOoo;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
public final class oO000o00 implements oO0O0OoO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final WindowId f1684OooO00o;

    public oO000o00(View view) {
        this.f1684OooO00o = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oO000o00) && ((oO000o00) obj).f1684OooO00o.equals(this.f1684OooO00o);
    }

    public final int hashCode() {
        return this.f1684OooO00o.hashCode();
    }
}