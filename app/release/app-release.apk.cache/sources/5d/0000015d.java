package OooOooo;

import Oooo.OooOOO0;
import Oooooo.o00000O;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.o0O0O00;
import hieubui.eup.android_app_security.R;
import java.util.List;

/* loaded from: classes.dex */
public final class o0O000o0 extends o0O00O0o {

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final PathInterpolator f1319OooO0o0 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final OooOOO0 f1318OooO0o = new OooOOO0();

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final DecelerateInterpolator f1320OooO0oO = new DecelerateInterpolator();

    public static WindowInsets OooO(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static void OooO0o(View view, WindowInsets windowInsets, boolean z) {
        o00000O OooOO02 = OooOO0(view);
        if (OooOO02 != null) {
            OooOO02.f1854OooO00o = windowInsets;
            if (!z) {
                View view2 = OooOO02.f1855OooO0O0;
                int[] iArr = OooOO02.f1858OooO0o0;
                view2.getLocationOnScreen(iArr);
                z = true;
                OooOO02.f1856OooO0OO = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0o(viewGroup.getChildAt(i), windowInsets, z);
            }
        }
    }

    public static void OooO0o0(View view) {
        o00000O OooOO02 = OooOO0(view);
        if (OooOO02 != null) {
            OooOO02.f1855OooO0O0.setTranslationY(0.0f);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0o0(viewGroup.getChildAt(i));
            }
        }
    }

    public static void OooO0oO(View view, o0O0OOOo o0o0oooo, List list) {
        o00000O OooOO02 = OooOO0(view);
        if (OooOO02 != null) {
            OooOO02.OooO00o(o0o0oooo, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0oO(viewGroup.getChildAt(i), o0o0oooo, list);
            }
        }
    }

    public static void OooO0oo(View view, o0O0O00 o0o0o00) {
        o00000O OooOO02 = OooOO0(view);
        if (OooOO02 != null) {
            View view2 = OooOO02.f1855OooO0O0;
            int[] iArr = OooOO02.f1858OooO0o0;
            view2.getLocationOnScreen(iArr);
            int i = OooOO02.f1856OooO0OO - iArr[1];
            OooOO02.f1857OooO0Oo = i;
            view2.setTranslationY(i);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                OooO0oo(viewGroup.getChildAt(i2), o0o0o00);
            }
        }
    }

    public static o00000O OooOO0(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof o0O000Oo) {
            return ((o0O000Oo) tag).f1316OooO00o;
        }
        return null;
    }
}