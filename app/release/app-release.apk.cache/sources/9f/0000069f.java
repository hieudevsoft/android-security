package o00ooo;

import OooooO0.o0000O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.o0000Ooo;
import com.google.gson.internal.OooO0o;
import hieubui.eup.android_app_security.R;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class OooO0O0 extends o0000Ooo {

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final int[][] f5295OooO0oO = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f5296OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public ColorStateList f5297OooO0o0;

    public OooO0O0(Context context, AttributeSet attributeSet) {
        super(OooO0o.OooOo0o(context, attributeSet, R.attr.radioButtonStyle, 2131756045), attributeSet);
        Context context2 = getContext();
        TypedArray OooOOOO2 = OooO0o.OooOOOO(context2, attributeSet, o0000O.f1799OooOOOO, R.attr.radioButtonStyle, 2131756045, new int[0]);
        if (OooOOOO2.hasValue(0)) {
            Oooo0.OooO0O0.OooO0OO(this, OooO00o.o00oO0o(context2, OooOOOO2, 0));
        }
        this.f5296OooO0o = OooOOOO2.getBoolean(1, false);
        OooOOOO2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5297OooO0o0 == null) {
            int oo000o2 = OooO00o.oo000o(this, R.attr.colorControlActivated);
            int oo000o3 = OooO00o.oo000o(this, R.attr.colorOnSurface);
            int oo000o4 = OooO00o.oo000o(this, R.attr.colorSurface);
            this.f5297OooO0o0 = new ColorStateList(f5295OooO0oO, new int[]{OooO00o.o0000OOO(oo000o4, oo000o2, 1.0f), OooO00o.o0000OOO(oo000o4, oo000o3, 0.54f), OooO00o.o0000OOO(oo000o4, oo000o3, 0.38f), OooO00o.o0000OOO(oo000o4, oo000o3, 0.38f)});
        }
        return this.f5297OooO0o0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5296OooO0o && Oooo0.OooO0O0.OooO00o(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.f5296OooO0o = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        Oooo0.OooO0O0.OooO0OO(this, colorStateList);
    }
}