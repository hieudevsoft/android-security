package androidx.appcompat.widget;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;

/* loaded from: classes.dex */
public abstract class o0000O {
    public static void OooO00o(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (!OooOooO.o0000oo.OooO00o(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}