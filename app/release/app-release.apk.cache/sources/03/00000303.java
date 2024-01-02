package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class o0Oo0oo {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final PorterDuff.Mode f2532OooO0O0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static o0Oo0oo f2533OooO0OO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public o0O0000O f2534OooO00o;

    public static synchronized o0Oo0oo OooO00o() {
        o0Oo0oo o0oo0oo;
        synchronized (o0Oo0oo.class) {
            if (f2533OooO0OO == null) {
                OooO0Oo();
            }
            o0oo0oo = f2533OooO0OO;
        }
        return o0oo0oo;
    }

    public static synchronized PorterDuffColorFilter OooO0OO(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter OooO0oO2;
        synchronized (o0Oo0oo.class) {
            OooO0oO2 = o0O0000O.OooO0oO(i, mode);
        }
        return OooO0oO2;
    }

    public static synchronized void OooO0Oo() {
        synchronized (o0Oo0oo.class) {
            if (f2533OooO0OO == null) {
                o0Oo0oo o0oo0oo = new o0Oo0oo();
                f2533OooO0OO = o0oo0oo;
                o0oo0oo.f2534OooO00o = o0O0000O.OooO0OO();
                o0O0000O o0o0000o = f2533OooO0OO.f2534OooO00o;
                o0OOO0o o0ooo0o = new o0OOO0o();
                synchronized (o0o0000o) {
                    o0o0000o.f2421OooO0o0 = o0ooo0o;
                }
            }
        }
    }

    public static void OooO0o0(Drawable drawable, o0O0o00O o0o0o00o, int[] iArr) {
        boolean z;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = o0O0000O.f2414OooO0o;
        int[] state = drawable.getState();
        int[] iArr2 = o00O0OO0.f2334OooO00o;
        if (drawable.mutate() == drawable) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z2 = o0o0o00o.f2476OooO0O0;
            if (!z2 && !o0o0o00o.f2475OooO00o) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z2) {
                colorStateList = (ColorStateList) o0o0o00o.f2477OooO0OO;
            } else {
                colorStateList = null;
            }
            if (o0o0o00o.f2475OooO00o) {
                mode = (PorterDuff.Mode) o0o0o00o.f2478OooO0Oo;
            } else {
                mode = o0O0000O.f2414OooO0o;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = o0O0000O.OooO0oO(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
    }

    public final synchronized Drawable OooO0O0(Context context, int i) {
        return this.f2534OooO00o.OooO0o0(context, i);
    }
}