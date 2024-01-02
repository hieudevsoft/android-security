package OoooooO;

import OooOoO0.o0OOO0o;
import OooOooo.o00O0O0O;
import OooOooo.o0o0Oo;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.gson.internal.OooO0o;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;
import o0000O00.OooO00o;
import o0ooOO0.OooOOO;
import o0ooOO0.OooOOOO;
import o0ooOO0.Oooo0;
import o0ooOO0.o0OO00O;

/* loaded from: classes.dex */
public final class oO00o000 {

    /* renamed from: OooO  reason: collision with root package name */
    public PorterDuff.Mode f1874OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final MaterialButton f1875OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Oooo0 f1876OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f1877OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f1878OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f1879OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f1880OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f1881OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f1882OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public ColorStateList f1883OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public ColorStateList f1884OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public ColorStateList f1885OooOO0o;
    public OooOOOO OooOOO0;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public boolean f1890OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public RippleDrawable f1891OooOOoo;

    /* renamed from: OooOo00  reason: collision with root package name */
    public int f1892OooOo00;

    /* renamed from: OooOOO  reason: collision with root package name */
    public boolean f1886OooOOO = false;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public boolean f1887OooOOOO = false;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public boolean f1888OooOOOo = false;

    /* renamed from: OooOOo  reason: collision with root package name */
    public boolean f1889OooOOo = true;

    public oO00o000(MaterialButton materialButton, Oooo0 oooo0) {
        this.f1875OooO00o = materialButton;
        this.f1876OooO0O0 = oooo0;
    }

    public final o0OO00O OooO00o() {
        RippleDrawable rippleDrawable = this.f1891OooOOoo;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (o0OO00O) (this.f1891OooOOoo.getNumberOfLayers() > 2 ? this.f1891OooOOoo.getDrawable(2) : this.f1891OooOOoo.getDrawable(1));
    }

    public final OooOOOO OooO0O0(boolean z) {
        RippleDrawable rippleDrawable = this.f1891OooOOoo;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (OooOOOO) ((LayerDrawable) ((InsetDrawable) this.f1891OooOOoo.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void OooO0OO(Oooo0 oooo0) {
        this.f1876OooO0O0 = oooo0;
        if (OooO0O0(false) != null) {
            OooO0O0(false).setShapeAppearanceModel(oooo0);
        }
        if (OooO0O0(true) != null) {
            OooO0O0(true).setShapeAppearanceModel(oooo0);
        }
        if (OooO00o() != null) {
            OooO00o().setShapeAppearanceModel(oooo0);
        }
    }

    public final void OooO0Oo(int i, int i2) {
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        MaterialButton materialButton = this.f1875OooO00o;
        int OooO0o2 = o00O0O0O.OooO0o(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int OooO0o02 = o00O0O0O.OooO0o0(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f1880OooO0o0;
        int i4 = this.f1879OooO0o;
        this.f1879OooO0o = i2;
        this.f1880OooO0o0 = i;
        if (!this.f1887OooOOOO) {
            OooO0o0();
        }
        o00O0O0O.OooOO0O(materialButton, OooO0o2, (paddingTop + i) - i3, OooO0o02, (paddingBottom + i2) - i4);
    }

    public final void OooO0o() {
        int i = 0;
        OooOOOO OooO0O02 = OooO0O0(false);
        OooOOOO OooO0O03 = OooO0O0(true);
        if (OooO0O02 != null) {
            ColorStateList colorStateList = this.f1884OooOO0O;
            OooO0O02.f5494OooO00o.f5477OooOO0O = this.f1882OooO0oo;
            OooO0O02.invalidateSelf();
            OooOOO oooOOO = OooO0O02.f5494OooO00o;
            if (oooOOO.f5471OooO0Oo != colorStateList) {
                oooOOO.f5471OooO0Oo = colorStateList;
                OooO0O02.onStateChange(OooO0O02.getState());
            }
            if (OooO0O03 != null) {
                float f = this.f1882OooO0oo;
                if (this.f1886OooOOO) {
                    i = OooO00o.oo000o(this.f1875OooO00o, R.attr.colorSurface);
                }
                OooO0O03.f5494OooO00o.f5477OooOO0O = f;
                OooO0O03.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                OooOOO oooOOO2 = OooO0O03.f5494OooO00o;
                if (oooOOO2.f5471OooO0Oo != valueOf) {
                    oooOOO2.f5471OooO0Oo = valueOf;
                    OooO0O03.onStateChange(OooO0O03.getState());
                }
            }
        }
    }

    public final void OooO0o0() {
        int i;
        OooOOOO oooOOOO = new OooOOOO(this.f1876OooO0O0);
        MaterialButton materialButton = this.f1875OooO00o;
        oooOOOO.OooO0oo(materialButton.getContext());
        o0OOO0o.OooO0oo(oooOOOO, this.f1883OooOO0);
        PorterDuff.Mode mode = this.f1874OooO;
        if (mode != null) {
            o0OOO0o.OooO(oooOOOO, mode);
        }
        ColorStateList colorStateList = this.f1884OooOO0O;
        oooOOOO.f5494OooO00o.f5477OooOO0O = this.f1882OooO0oo;
        oooOOOO.invalidateSelf();
        OooOOO oooOOO = oooOOOO.f5494OooO00o;
        if (oooOOO.f5471OooO0Oo != colorStateList) {
            oooOOO.f5471OooO0Oo = colorStateList;
            oooOOOO.onStateChange(oooOOOO.getState());
        }
        OooOOOO oooOOOO2 = new OooOOOO(this.f1876OooO0O0);
        oooOOOO2.setTint(0);
        float f = this.f1882OooO0oo;
        if (this.f1886OooOOO) {
            i = OooO00o.oo000o(materialButton, R.attr.colorSurface);
        } else {
            i = 0;
        }
        oooOOOO2.f5494OooO00o.f5477OooOO0O = f;
        oooOOOO2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i);
        OooOOO oooOOO2 = oooOOOO2.f5494OooO00o;
        if (oooOOO2.f5471OooO0Oo != valueOf) {
            oooOOO2.f5471OooO0Oo = valueOf;
            oooOOOO2.onStateChange(oooOOOO2.getState());
        }
        OooOOOO oooOOOO3 = new OooOOOO(this.f1876OooO0O0);
        this.OooOOO0 = oooOOOO3;
        o0OOO0o.OooO0oO(oooOOOO3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(OooO0o.OooOOo(this.f1885OooOO0o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{oooOOOO2, oooOOOO}), this.f1877OooO0OO, this.f1880OooO0o0, this.f1878OooO0Oo, this.f1879OooO0o), this.OooOOO0);
        this.f1891OooOOoo = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        OooOOOO OooO0O02 = OooO0O0(false);
        if (OooO0O02 != null) {
            OooO0O02.OooO(this.f1892OooOo00);
            OooO0O02.setState(materialButton.getDrawableState());
        }
    }
}