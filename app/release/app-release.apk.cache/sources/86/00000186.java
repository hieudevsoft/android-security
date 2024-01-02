package Oooo0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public abstract class OooO0O0 {
    public static ColorStateList OooO00o(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    public static PorterDuff.Mode OooO0O0(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    public static void OooO0OO(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void OooO0Oo(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}