package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* loaded from: classes.dex */
public enum o00oOoo {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public static o00oOoo OooO0O0(int i) {
        if (i != 0) {
            if (i != 4) {
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(OooO0O0.OooO00o.OooO0O0("Unknown visibility ", i));
            }
            return INVISIBLE;
        }
        return VISIBLE;
    }

    public static o00oOoo OooO0OO(View view) {
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : OooO0O0(view.getVisibility());
    }

    public final void OooO00o(View view) {
        int i;
        int ordinal = ordinal();
        if (ordinal == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (o0000oo.OooOooo(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (ordinal == 1) {
            if (o0000oo.OooOooo(2)) {
                Objects.toString(view);
            }
            i = 0;
        } else if (ordinal == 2) {
            if (o0000oo.OooOooo(2)) {
                Objects.toString(view);
            }
            i = 8;
        } else if (ordinal != 3) {
            return;
        } else {
            if (o0000oo.OooOooo(2)) {
                Objects.toString(view);
            }
            i = 4;
        }
        view.setVisibility(i);
    }
}