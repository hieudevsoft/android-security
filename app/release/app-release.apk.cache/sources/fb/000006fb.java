package ooOO;

import OooOo.OooO00o;
import OooOoO0.o0O0O00;
import OooOoO0.o0OOO0o;
import OooOoO0.o0Oo0oo;
import OooOoO0.oo0o0Oo;
import OooooOO.oO00O0o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import com.google.gson.internal.OooO0o;
import hieubui.eup.android_app_security.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o00o0O.OooOOO;
import o0ooOO0.OooOOOO;

/* loaded from: classes.dex */
public final class o00O0O extends OooOOOO implements Drawable.Callback, OooOOO {

    /* renamed from: o00000  reason: collision with root package name */
    public static final int[] f5650o00000 = {16842910};

    /* renamed from: o00000O0  reason: collision with root package name */
    public static final ShapeDrawable f5651o00000O0 = new ShapeDrawable(new OvalShape());

    /* renamed from: OooOo  reason: collision with root package name */
    public ColorStateList f5652OooOo;

    /* renamed from: OooOoO  reason: collision with root package name */
    public float f5653OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public ColorStateList f5654OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public float f5655OooOoOO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public float f5656OooOoo;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public ColorStateList f5657OooOoo0;

    /* renamed from: OooOooO  reason: collision with root package name */
    public ColorStateList f5658OooOooO;

    /* renamed from: OooOooo  reason: collision with root package name */
    public CharSequence f5659OooOooo;

    /* renamed from: Oooo  reason: collision with root package name */
    public SpannableStringBuilder f5660Oooo;

    /* renamed from: Oooo0  reason: collision with root package name */
    public float f5661Oooo0;

    /* renamed from: Oooo000  reason: collision with root package name */
    public boolean f5662Oooo000;

    /* renamed from: Oooo00O  reason: collision with root package name */
    public Drawable f5663Oooo00O;

    /* renamed from: Oooo00o  reason: collision with root package name */
    public ColorStateList f5664Oooo00o;

    /* renamed from: Oooo0O0  reason: collision with root package name */
    public boolean f5665Oooo0O0;

    /* renamed from: Oooo0OO  reason: collision with root package name */
    public boolean f5666Oooo0OO;

    /* renamed from: Oooo0o  reason: collision with root package name */
    public RippleDrawable f5667Oooo0o;

    /* renamed from: Oooo0o0  reason: collision with root package name */
    public Drawable f5668Oooo0o0;

    /* renamed from: Oooo0oO  reason: collision with root package name */
    public ColorStateList f5669Oooo0oO;

    /* renamed from: Oooo0oo  reason: collision with root package name */
    public float f5670Oooo0oo;

    /* renamed from: OoooO  reason: collision with root package name */
    public ColorStateList f5671OoooO;

    /* renamed from: OoooO0  reason: collision with root package name */
    public boolean f5672OoooO0;

    /* renamed from: OoooO00  reason: collision with root package name */
    public boolean f5673OoooO00;

    /* renamed from: OoooO0O  reason: collision with root package name */
    public Drawable f5674OoooO0O;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public oO00O0o f5675OoooOO0;

    /* renamed from: OoooOOO  reason: collision with root package name */
    public float f5676OoooOOO;

    /* renamed from: OoooOOo  reason: collision with root package name */
    public float f5677OoooOOo;

    /* renamed from: OoooOo0  reason: collision with root package name */
    public float f5678OoooOo0;
    public float OoooOoO;

    /* renamed from: OoooOoo  reason: collision with root package name */
    public float f5679OoooOoo;

    /* renamed from: Ooooo00  reason: collision with root package name */
    public float f5680Ooooo00;

    /* renamed from: Ooooo0o  reason: collision with root package name */
    public float f5681Ooooo0o;

    /* renamed from: OooooO0  reason: collision with root package name */
    public float f5682OooooO0;

    /* renamed from: OooooOO  reason: collision with root package name */
    public final Context f5683OooooOO;

    /* renamed from: OooooOo  reason: collision with root package name */
    public final Paint f5684OooooOo;

    /* renamed from: Oooooo  reason: collision with root package name */
    public final RectF f5685Oooooo;

    /* renamed from: Oooooo0  reason: collision with root package name */
    public final Paint.FontMetrics f5686Oooooo0;

    /* renamed from: OoooooO  reason: collision with root package name */
    public final PointF f5687OoooooO;

    /* renamed from: Ooooooo  reason: collision with root package name */
    public final Path f5688Ooooooo;

    /* renamed from: o000000  reason: collision with root package name */
    public boolean f5689o000000;

    /* renamed from: o000000O  reason: collision with root package name */
    public int f5690o000000O;

    /* renamed from: o000000o  reason: collision with root package name */
    public boolean f5691o000000o;

    /* renamed from: o000OOo  reason: collision with root package name */
    public TextUtils.TruncateAt f5692o000OOo;

    /* renamed from: o000oOoO  reason: collision with root package name */
    public oO00O0o f5693o000oOoO;

    /* renamed from: o00O0O  reason: collision with root package name */
    public int f5694o00O0O;
    public int o00Oo0;

    /* renamed from: o00Ooo  reason: collision with root package name */
    public int f5695o00Ooo;

    /* renamed from: o00o0O  reason: collision with root package name */
    public int f5696o00o0O;

    /* renamed from: o00oO0O  reason: collision with root package name */
    public int f5697o00oO0O;
    public int o00oO0o;

    /* renamed from: o00ooo  reason: collision with root package name */
    public int f5698o00ooo;

    /* renamed from: o0O0O00  reason: collision with root package name */
    public WeakReference f5699o0O0O00;

    /* renamed from: o0OO00O  reason: collision with root package name */
    public boolean f5700o0OO00O;

    /* renamed from: o0OOO0o  reason: collision with root package name */
    public PorterDuff.Mode f5701o0OOO0o;
    public int[] o0Oo0oo;

    /* renamed from: o0OoOo0  reason: collision with root package name */
    public final o00o0O.OooOOOO f5702o0OoOo0;

    /* renamed from: o0ooOO0  reason: collision with root package name */
    public ColorFilter f5703o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with root package name */
    public PorterDuffColorFilter f5704o0ooOOo;

    /* renamed from: o0ooOoO  reason: collision with root package name */
    public ColorStateList f5705o0ooOoO;

    /* renamed from: oo000o  reason: collision with root package name */
    public boolean f5706oo000o;

    /* renamed from: oo0o0Oo  reason: collision with root package name */
    public ColorStateList f5707oo0o0Oo;

    /* renamed from: ooOO  reason: collision with root package name */
    public int f5708ooOO;

    public o00O0O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2131756034);
        this.f5655OooOoOO = -1.0f;
        this.f5684OooooOo = new Paint(1);
        this.f5686Oooooo0 = new Paint.FontMetrics();
        this.f5685Oooooo = new RectF();
        this.f5687OoooooO = new PointF();
        this.f5688Ooooooo = new Path();
        this.f5697o00oO0O = 255;
        this.f5701o0OOO0o = PorterDuff.Mode.SRC_IN;
        this.f5699o0O0O00 = new WeakReference(null);
        OooO0oo(context);
        this.f5683OooooOO = context;
        o00o0O.OooOOOO oooOOOO = new o00o0O.OooOOOO(this);
        this.f5702o0OoOo0 = oooOOOO;
        this.f5659OooOooo = "";
        oooOOOO.f5275OooO00o.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f5650o00000;
        setState(iArr);
        if (!Arrays.equals(this.o0Oo0oo, iArr)) {
            this.o0Oo0oo = iArr;
            if (OoooO()) {
                OooOo0O(getState(), iArr);
            }
        }
        this.f5689o000000 = true;
        f5651o00000O0.setTint(-1);
    }

    public static boolean OooOOoo(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean OooOo00(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void OoooOO0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void OooOOO(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        o0Oo0oo.OooO0O0(drawable, o0Oo0oo.OooO00o(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f5668Oooo0o0) {
            if (drawable.isStateful()) {
                drawable.setState(this.o0Oo0oo);
            }
            o0OOO0o.OooO0oo(drawable, this.f5669Oooo0oO);
            return;
        }
        Drawable drawable2 = this.f5663Oooo00O;
        if (drawable == drawable2 && this.f5665Oooo0O0) {
            o0OOO0o.OooO0oo(drawable2, this.f5664Oooo00o);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void OooOOOO(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f;
        rectF.setEmpty();
        if (OoooO0O() || OoooO0()) {
            float f2 = this.f5676OoooOOO + this.f5677OoooOOo;
            if (this.f5706oo000o) {
                drawable = this.f5674OoooO0O;
            } else {
                drawable = this.f5663Oooo00O;
            }
            float f3 = this.f5661Oooo0;
            if (f3 <= 0.0f && drawable != null) {
                f3 = drawable.getIntrinsicWidth();
            }
            if (o0Oo0oo.OooO00o(this) == 0) {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + f3;
            } else {
                float f5 = rect.right - f2;
                rectF.right = f5;
                rectF.left = f5 - f3;
            }
            if (this.f5706oo000o) {
                drawable2 = this.f5674OoooO0O;
            } else {
                drawable2 = this.f5663Oooo00O;
            }
            float f6 = this.f5661Oooo0;
            if (f6 <= 0.0f && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f5683OooooOO.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f6) {
                    f = drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f;
                }
            }
            f = f6;
            float exactCenterY2 = rect.exactCenterY() - (f / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f;
        }
    }

    public final float OooOOOo() {
        Drawable drawable;
        if (!OoooO0O() && !OoooO0()) {
            return 0.0f;
        }
        float f = this.f5677OoooOOo;
        if (this.f5706oo000o) {
            drawable = this.f5674OoooO0O;
        } else {
            drawable = this.f5663Oooo00O;
        }
        float f2 = this.f5661Oooo0;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.f5678OoooOo0;
    }

    public final float OooOOo() {
        if (this.f5691o000000o) {
            return this.f5494OooO00o.f5468OooO00o.f5521OooO0o0.OooO00o(OooO0oO());
        }
        return this.f5655OooOoOO;
    }

    public final float OooOOo0() {
        if (OoooO()) {
            return this.f5680Ooooo00 + this.f5670Oooo0oo + this.f5681Ooooo0o;
        }
        return 0.0f;
    }

    public final void OooOo(Drawable drawable) {
        if (this.f5674OoooO0O != drawable) {
            float OooOOOo2 = OooOOOo();
            this.f5674OoooO0O = drawable;
            float OooOOOo3 = OooOOOo();
            OoooOO0(this.f5674OoooO0O);
            OooOOO(this.f5674OoooO0O);
            invalidateSelf();
            if (OooOOOo2 != OooOOOo3) {
                OooOo0();
            }
        }
    }

    public final void OooOo0() {
        o0OoOo0 o0oooo0 = (o0OoOo0) this.f5699o0O0O00.get();
        if (o0oooo0 != null) {
            Chip chip = (Chip) o0oooo0;
            chip.OooO0O0(chip.f3349OooOOOo);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean OooOo0O(int[] iArr, int[] iArr2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        int i6;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f5652OooOo;
        if (colorStateList2 != null) {
            i = colorStateList2.getColorForState(iArr, this.f5708ooOO);
        } else {
            i = 0;
        }
        int OooO0OO2 = OooO0OO(i);
        boolean z6 = true;
        if (this.f5708ooOO != OooO0OO2) {
            this.f5708ooOO = OooO0OO2;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f5654OooOoO0;
        if (colorStateList3 != null) {
            i2 = colorStateList3.getColorForState(iArr, this.f5694o00O0O);
        } else {
            i2 = 0;
        }
        int OooO0OO3 = OooO0OO(i2);
        if (this.f5694o00O0O != OooO0OO3) {
            this.f5694o00O0O = OooO0OO3;
            onStateChange = true;
        }
        int OooO0O02 = OooO00o.OooO0O0(OooO0OO3, OooO0OO2);
        if (this.o00Oo0 != OooO0O02) {
            z = true;
        } else {
            z = false;
        }
        if (this.f5494OooO00o.f5470OooO0OO == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z | z2) {
            this.o00Oo0 = OooO0O02;
            OooOO0(ColorStateList.valueOf(OooO0O02));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f5657OooOoo0;
        if (colorStateList4 != null) {
            i3 = colorStateList4.getColorForState(iArr, this.f5695o00Ooo);
        } else {
            i3 = 0;
        }
        if (this.f5695o00Ooo != i3) {
            this.f5695o00Ooo = i3;
            onStateChange = true;
        }
        if (this.f5707oo0o0Oo != null && OooO0o.OooOOoo(iArr)) {
            i4 = this.f5707oo0o0Oo.getColorForState(iArr, this.f5696o00o0O);
        } else {
            i4 = 0;
        }
        if (this.f5696o00o0O != i4) {
            this.f5696o00o0O = i4;
            if (this.f5700o0OO00O) {
                onStateChange = true;
            }
        }
        oo000o.OooO0o oooO0o = this.f5702o0OoOo0.f5279OooO0o;
        if (oooO0o != null && (colorStateList = oooO0o.f5620OooOO0) != null) {
            i5 = colorStateList.getColorForState(iArr, this.f5698o00ooo);
        } else {
            i5 = 0;
        }
        if (this.f5698o00ooo != i5) {
            this.f5698o00ooo = i5;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i7 : state) {
                if (i7 == 16842912) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (z3 && this.f5673OoooO00) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f5706oo000o != z4 && this.f5674OoooO0O != null) {
            float OooOOOo2 = OooOOOo();
            this.f5706oo000o = z4;
            if (OooOOOo2 != OooOOOo()) {
                onStateChange = true;
                z5 = true;
            } else {
                z5 = false;
                onStateChange = true;
            }
        } else {
            z5 = false;
        }
        ColorStateList colorStateList5 = this.f5705o0ooOoO;
        if (colorStateList5 != null) {
            i6 = colorStateList5.getColorForState(iArr, this.o00oO0o);
        } else {
            i6 = 0;
        }
        if (this.o00oO0o != i6) {
            this.o00oO0o = i6;
            ColorStateList colorStateList6 = this.f5705o0ooOoO;
            PorterDuff.Mode mode = this.f5701o0OOO0o;
            if (colorStateList6 != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f5704o0ooOOo = porterDuffColorFilter;
        } else {
            z6 = onStateChange;
        }
        if (OooOo00(this.f5663Oooo00O)) {
            z6 |= this.f5663Oooo00O.setState(iArr);
        }
        if (OooOo00(this.f5674OoooO0O)) {
            z6 |= this.f5674OoooO0O.setState(iArr);
        }
        if (OooOo00(this.f5668Oooo0o0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z6 |= this.f5668Oooo0o0.setState(iArr3);
        }
        if (OooOo00(this.f5667Oooo0o)) {
            z6 |= this.f5667Oooo0o.setState(iArr2);
        }
        if (z6) {
            invalidateSelf();
        }
        if (z5) {
            OooOo0();
        }
        return z6;
    }

    public final void OooOo0o(boolean z) {
        if (this.f5673OoooO00 != z) {
            this.f5673OoooO00 = z;
            float OooOOOo2 = OooOOOo();
            if (!z && this.f5706oo000o) {
                this.f5706oo000o = false;
            }
            float OooOOOo3 = OooOOOo();
            invalidateSelf();
            if (OooOOOo2 != OooOOOo3) {
                OooOo0();
            }
        }
    }

    public final void OooOoO(boolean z) {
        if (this.f5672OoooO0 != z) {
            boolean OoooO02 = OoooO0();
            this.f5672OoooO0 = z;
            boolean OoooO03 = OoooO0();
            if (OoooO02 != OoooO03) {
                if (OoooO03) {
                    OooOOO(this.f5674OoooO0O);
                } else {
                    OoooOO0(this.f5674OoooO0O);
                }
                invalidateSelf();
                OooOo0();
            }
        }
    }

    public final void OooOoO0(ColorStateList colorStateList) {
        boolean z;
        if (this.f5671OoooO != colorStateList) {
            this.f5671OoooO = colorStateList;
            if (this.f5672OoooO0 && this.f5674OoooO0O != null && this.f5673OoooO00) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                o0OOO0o.OooO0oo(this.f5674OoooO0O, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void OooOoOO(float f) {
        if (this.f5655OooOoOO != f) {
            this.f5655OooOoOO = f;
            o0ooOO0.Oooo0 oooo0 = this.f5494OooO00o.f5468OooO00o;
            oooo0.getClass();
            o0ooOO0.Oooo000 oooo000 = new o0ooOO0.Oooo000(oooo0);
            oooo000.f5533OooO0o0 = new o0ooOO0.OooO0o(f);
            oooo000.f5532OooO0o = new o0ooOO0.OooO0o(f);
            oooo000.f5534OooO0oO = new o0ooOO0.OooO0o(f);
            oooo000.f5535OooO0oo = new o0ooOO0.OooO0o(f);
            setShapeAppearanceModel(new o0ooOO0.Oooo0(oooo000));
        }
    }

    public final void OooOoo(float f) {
        if (this.f5661Oooo0 != f) {
            float OooOOOo2 = OooOOOo();
            this.f5661Oooo0 = f;
            float OooOOOo3 = OooOOOo();
            invalidateSelf();
            if (OooOOOo2 != OooOOOo3) {
                OooOo0();
            }
        }
    }

    public final void OooOoo0(Drawable drawable) {
        Drawable drawable2 = this.f5663Oooo00O;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof oo0o0Oo) {
                ((o0O0O00) ((oo0o0Oo) drawable2)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float OooOOOo2 = OooOOOo();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f5663Oooo00O = drawable3;
            float OooOOOo3 = OooOOOo();
            OoooOO0(drawable2);
            if (OoooO0O()) {
                OooOOO(this.f5663Oooo00O);
            }
            invalidateSelf();
            if (OooOOOo2 != OooOOOo3) {
                OooOo0();
            }
        }
    }

    public final void OooOooO(ColorStateList colorStateList) {
        this.f5665Oooo0O0 = true;
        if (this.f5664Oooo00o != colorStateList) {
            this.f5664Oooo00o = colorStateList;
            if (OoooO0O()) {
                o0OOO0o.OooO0oo(this.f5663Oooo00O, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void OooOooo(boolean z) {
        if (this.f5662Oooo000 != z) {
            boolean OoooO0O2 = OoooO0O();
            this.f5662Oooo000 = z;
            boolean OoooO0O3 = OoooO0O();
            if (OoooO0O2 != OoooO0O3) {
                if (OoooO0O3) {
                    OooOOO(this.f5663Oooo00O);
                } else {
                    OoooOO0(this.f5663Oooo00O);
                }
                invalidateSelf();
                OooOo0();
            }
        }
    }

    public final void Oooo(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.f5658OooOooO != colorStateList) {
            this.f5658OooOooO = colorStateList;
            if (this.f5700o0OO00O) {
                colorStateList2 = OooO0o.OooOOo(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.f5707oo0o0Oo = colorStateList2;
            onStateChange(getState());
        }
    }

    public final void Oooo0(float f) {
        if (this.f5681Ooooo0o != f) {
            this.f5681Ooooo0o = f;
            invalidateSelf();
            if (OoooO()) {
                OooOo0();
            }
        }
    }

    public final void Oooo000(ColorStateList colorStateList) {
        if (this.f5657OooOoo0 != colorStateList) {
            this.f5657OooOoo0 = colorStateList;
            if (this.f5691o000000o) {
                o0ooOO0.OooOOO oooOOO = this.f5494OooO00o;
                if (oooOOO.f5471OooO0Oo != colorStateList) {
                    oooOOO.f5471OooO0Oo = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void Oooo00O(float f) {
        if (this.f5656OooOoo != f) {
            this.f5656OooOoo = f;
            this.f5684OooooOo.setStrokeWidth(f);
            if (this.f5691o000000o) {
                this.f5494OooO00o.f5477OooOO0O = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void Oooo00o(Drawable drawable) {
        Drawable drawable2 = this.f5668Oooo0o0;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof oo0o0Oo) {
                ((o0O0O00) ((oo0o0Oo) drawable2)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float OooOOo02 = OooOOo0();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f5668Oooo0o0 = drawable3;
            this.f5667Oooo0o = new RippleDrawable(OooO0o.OooOOo(this.f5658OooOooO), this.f5668Oooo0o0, f5651o00000O0);
            float OooOOo03 = OooOOo0();
            OoooOO0(drawable2);
            if (OoooO()) {
                OooOOO(this.f5668Oooo0o0);
            }
            invalidateSelf();
            if (OooOOo02 != OooOOo03) {
                OooOo0();
            }
        }
    }

    public final void Oooo0O0(float f) {
        if (this.f5670Oooo0oo != f) {
            this.f5670Oooo0oo = f;
            invalidateSelf();
            if (OoooO()) {
                OooOo0();
            }
        }
    }

    public final void Oooo0OO(float f) {
        if (this.f5680Ooooo00 != f) {
            this.f5680Ooooo00 = f;
            invalidateSelf();
            if (OoooO()) {
                OooOo0();
            }
        }
    }

    public final void Oooo0o(boolean z) {
        if (this.f5666Oooo0OO != z) {
            boolean OoooO2 = OoooO();
            this.f5666Oooo0OO = z;
            boolean OoooO3 = OoooO();
            if (OoooO2 != OoooO3) {
                if (OoooO3) {
                    OooOOO(this.f5668Oooo0o0);
                } else {
                    OoooOO0(this.f5668Oooo0o0);
                }
                invalidateSelf();
                OooOo0();
            }
        }
    }

    public final void Oooo0o0(ColorStateList colorStateList) {
        if (this.f5669Oooo0oO != colorStateList) {
            this.f5669Oooo0oO = colorStateList;
            if (OoooO()) {
                o0OOO0o.OooO0oo(this.f5668Oooo0o0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Oooo0oO(float f) {
        if (this.f5678OoooOo0 != f) {
            float OooOOOo2 = OooOOOo();
            this.f5678OoooOo0 = f;
            float OooOOOo3 = OooOOOo();
            invalidateSelf();
            if (OooOOOo2 != OooOOOo3) {
                OooOo0();
            }
        }
    }

    public final void Oooo0oo(float f) {
        if (this.f5677OoooOOo != f) {
            float OooOOOo2 = OooOOOo();
            this.f5677OoooOOo = f;
            float OooOOOo3 = OooOOOo();
            invalidateSelf();
            if (OooOOOo2 != OooOOOo3) {
                OooOo0();
            }
        }
    }

    public final boolean OoooO() {
        return this.f5666Oooo0OO && this.f5668Oooo0o0 != null;
    }

    public final boolean OoooO0() {
        return this.f5672OoooO0 && this.f5674OoooO0O != null && this.f5706oo000o;
    }

    public final void OoooO00(oo000o.OooO0o oooO0o) {
        o00o0O.OooOOOO oooOOOO = this.f5702o0OoOo0;
        if (oooOOOO.f5279OooO0o != oooO0o) {
            oooOOOO.f5279OooO0o = oooO0o;
            if (oooO0o != null) {
                TextPaint textPaint = oooOOOO.f5275OooO00o;
                Context context = this.f5683OooooOO;
                Oooo000 oooo000 = oooOOOO.f5276OooO0O0;
                oooO0o.OooO0o(context, textPaint, oooo000);
                OooOOO oooOOO = (OooOOO) oooOOOO.f5280OooO0o0.get();
                if (oooOOO != null) {
                    textPaint.drawableState = oooOOO.getState();
                }
                oooO0o.OooO0o0(context, textPaint, oooo000);
                oooOOOO.f5278OooO0Oo = true;
            }
            OooOOO oooOOO2 = (OooOOO) oooOOOO.f5280OooO0o0.get();
            if (oooOOO2 != null) {
                o00O0O o00o0o = (o00O0O) oooOOO2;
                o00o0o.OooOo0();
                o00o0o.invalidateSelf();
                o00o0o.onStateChange(oooOOO2.getState());
            }
        }
    }

    public final boolean OoooO0O() {
        return this.f5662Oooo000 && this.f5663Oooo00O != null;
    }

    @Override // o0ooOO0.OooOOOO, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        RectF rectF;
        int i3;
        int i4;
        int i5;
        RectF rectF2;
        boolean z;
        int i6;
        float f;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.f5697o00oO0O) != 0) {
            if (i < 255) {
                i2 = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
            } else {
                i2 = 0;
            }
            boolean z2 = this.f5691o000000o;
            Paint paint = this.f5684OooooOo;
            RectF rectF3 = this.f5685Oooooo;
            if (!z2) {
                paint.setColor(this.f5708ooOO);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, OooOOo(), OooOOo(), paint);
            }
            if (!this.f5691o000000o) {
                paint.setColor(this.f5694o00O0O);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f5703o0ooOO0;
                if (colorFilter == null) {
                    colorFilter = this.f5704o0ooOOo;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, OooOOo(), OooOOo(), paint);
            }
            if (this.f5691o000000o) {
                super.draw(canvas);
            }
            if (this.f5656OooOoo > 0.0f && !this.f5691o000000o) {
                paint.setColor(this.f5695o00Ooo);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.f5691o000000o) {
                    ColorFilter colorFilter2 = this.f5703o0ooOO0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f5704o0ooOOo;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f2 = this.f5656OooOoo / 2.0f;
                rectF3.set(bounds.left + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
                float f3 = this.f5655OooOoOO - (this.f5656OooOoo / 2.0f);
                canvas.drawRoundRect(rectF3, f3, f3, paint);
            }
            paint.setColor(this.f5696o00o0O);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.f5691o000000o) {
                canvas.drawRoundRect(rectF3, OooOOo(), OooOOo(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.f5688Ooooooo;
                o0ooOO0.o0OoOo0 o0oooo0 = this.f5508OooOOo;
                o0ooOO0.OooOOO oooOOO = this.f5494OooO00o;
                o0oooo0.OooO00o(oooOOO.f5468OooO00o, oooOOO.f5476OooOO0, rectF4, this.f5509OooOOo0, path);
                OooO0o0(canvas, paint, path, this.f5494OooO00o.f5468OooO00o, OooO0oO());
            }
            if (OoooO0O()) {
                OooOOOO(bounds, rectF3);
                float f4 = rectF3.left;
                float f5 = rectF3.top;
                canvas.translate(f4, f5);
                this.f5663Oooo00O.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f5663Oooo00O.draw(canvas);
                canvas.translate(-f4, -f5);
            }
            if (OoooO0()) {
                OooOOOO(bounds, rectF3);
                float f6 = rectF3.left;
                float f7 = rectF3.top;
                canvas.translate(f6, f7);
                this.f5674OoooO0O.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f5674OoooO0O.draw(canvas);
                canvas.translate(-f6, -f7);
            }
            if (this.f5689o000000 && this.f5659OooOooo != null) {
                PointF pointF = this.f5687OoooooO;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.f5659OooOooo;
                o00o0O.OooOOOO oooOOOO = this.f5702o0OoOo0;
                if (charSequence != null) {
                    float OooOOOo2 = OooOOOo() + this.f5676OoooOOO + this.OoooOoO;
                    if (o0Oo0oo.OooO00o(this) == 0) {
                        pointF.x = bounds.left + OooOOOo2;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - OooOOOo2;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = oooOOOO.f5275OooO00o;
                    Paint.FontMetrics fontMetrics = this.f5686Oooooo0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.f5659OooOooo != null) {
                    float OooOOOo3 = OooOOOo() + this.f5676OoooOOO + this.OoooOoO;
                    float OooOOo02 = OooOOo0() + this.f5682OooooO0 + this.f5679OoooOoo;
                    if (o0Oo0oo.OooO00o(this) == 0) {
                        rectF3.left = bounds.left + OooOOOo3;
                        f = bounds.right - OooOOo02;
                    } else {
                        rectF3.left = bounds.left + OooOOo02;
                        f = bounds.right - OooOOOo3;
                    }
                    rectF3.right = f;
                    rectF3.top = bounds.top;
                    rectF3.bottom = bounds.bottom;
                }
                oo000o.OooO0o oooO0o = oooOOOO.f5279OooO0o;
                TextPaint textPaint2 = oooOOOO.f5275OooO00o;
                if (oooO0o != null) {
                    textPaint2.drawableState = getState();
                    oooOOOO.f5279OooO0o.OooO0o0(this.f5683OooooOO, textPaint2, oooOOOO.f5276OooO0O0);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(oooOOOO.OooO00o(this.f5659OooOooo.toString())) > Math.round(rectF3.width())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i6 = canvas.save();
                    canvas.clipRect(rectF3);
                } else {
                    i6 = 0;
                }
                CharSequence charSequence2 = this.f5659OooOooo;
                if (z && this.f5692o000OOo != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f5692o000OOo);
                }
                CharSequence charSequence3 = charSequence2;
                int length = charSequence3.length();
                float f8 = pointF.x;
                float f9 = pointF.y;
                rectF = rectF3;
                i3 = i2;
                i4 = 0;
                i5 = 255;
                canvas.drawText(charSequence3, 0, length, f8, f9, textPaint2);
                if (z) {
                    canvas.restoreToCount(i6);
                }
            } else {
                rectF = rectF3;
                i3 = i2;
                i4 = 0;
                i5 = 255;
            }
            if (OoooO()) {
                rectF.setEmpty();
                if (OoooO()) {
                    float f10 = this.f5682OooooO0 + this.f5681Ooooo0o;
                    if (o0Oo0oo.OooO00o(this) == 0) {
                        float f11 = bounds.right - f10;
                        rectF2 = rectF;
                        rectF2.right = f11;
                        rectF2.left = f11 - this.f5670Oooo0oo;
                    } else {
                        rectF2 = rectF;
                        float f12 = bounds.left + f10;
                        rectF2.left = f12;
                        rectF2.right = f12 + this.f5670Oooo0oo;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f13 = this.f5670Oooo0oo;
                    float f14 = exactCenterY - (f13 / 2.0f);
                    rectF2.top = f14;
                    rectF2.bottom = f14 + f13;
                } else {
                    rectF2 = rectF;
                }
                float f15 = rectF2.left;
                float f16 = rectF2.top;
                canvas.translate(f15, f16);
                this.f5668Oooo0o0.setBounds(i4, i4, (int) rectF2.width(), (int) rectF2.height());
                this.f5667Oooo0o.setBounds(this.f5668Oooo0o0.getBounds());
                this.f5667Oooo0o.jumpToCurrentState();
                this.f5667Oooo0o.draw(canvas);
                canvas.translate(-f15, -f16);
            }
            if (this.f5697o00oO0O < i5) {
                canvas.restoreToCount(i3);
            }
        }
    }

    @Override // o0ooOO0.OooOOOO, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f5697o00oO0O;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f5703o0ooOO0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f5653OooOoO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(OooOOo0() + this.f5702o0OoOo0.OooO00o(this.f5659OooOooo.toString()) + OooOOOo() + this.f5676OoooOOO + this.OoooOoO + this.f5679OoooOoo + this.f5682OooooO0), this.f5690o000000O);
    }

    @Override // o0ooOO0.OooOOOO, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // o0ooOO0.OooOOOO, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f5691o000000o) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f5655OooOoOO);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f5653OooOoO, this.f5655OooOoOO);
        }
        outline.setAlpha(this.f5697o00oO0O / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // o0ooOO0.OooOOOO, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        if (OooOOoo(this.f5652OooOo) || OooOOoo(this.f5654OooOoO0) || OooOOoo(this.f5657OooOoo0)) {
            return true;
        }
        if (this.f5700o0OO00O && OooOOoo(this.f5707oo0o0Oo)) {
            return true;
        }
        oo000o.OooO0o oooO0o = this.f5702o0OoOo0.f5279OooO0o;
        if (oooO0o != null && (colorStateList = oooO0o.f5620OooOO0) != null && colorStateList.isStateful()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (this.f5672OoooO0 && this.f5674OoooO0O != null && this.f5673OoooO00) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || OooOo00(this.f5663Oooo00O) || OooOo00(this.f5674OoooO0O) || OooOOoo(this.f5705o0ooOoO)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (OoooO0O()) {
            onLayoutDirectionChanged |= o0Oo0oo.OooO0O0(this.f5663Oooo00O, i);
        }
        if (OoooO0()) {
            onLayoutDirectionChanged |= o0Oo0oo.OooO0O0(this.f5674OoooO0O, i);
        }
        if (OoooO()) {
            onLayoutDirectionChanged |= o0Oo0oo.OooO0O0(this.f5668Oooo0o0, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (OoooO0O()) {
            onLevelChange |= this.f5663Oooo00O.setLevel(i);
        }
        if (OoooO0()) {
            onLevelChange |= this.f5674OoooO0O.setLevel(i);
        }
        if (OoooO()) {
            onLevelChange |= this.f5668Oooo0o0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // o0ooOO0.OooOOOO, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f5691o000000o) {
            super.onStateChange(iArr);
        }
        return OooOo0O(iArr, this.o0Oo0oo);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // o0ooOO0.OooOOOO, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f5697o00oO0O != i) {
            this.f5697o00oO0O = i;
            invalidateSelf();
        }
    }

    @Override // o0ooOO0.OooOOOO, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f5703o0ooOO0 != colorFilter) {
            this.f5703o0ooOO0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // o0ooOO0.OooOOOO, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f5705o0ooOoO != colorStateList) {
            this.f5705o0ooOoO = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // o0ooOO0.OooOOOO, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f5701o0OOO0o != mode) {
            this.f5701o0OOO0o = mode;
            ColorStateList colorStateList = this.f5705o0ooOoO;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f5704o0ooOOo = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (OoooO0O()) {
            visible |= this.f5663Oooo00O.setVisible(z, z2);
        }
        if (OoooO0()) {
            visible |= this.f5674OoooO0O.setVisible(z, z2);
        }
        if (OoooO()) {
            visible |= this.f5668Oooo0o0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}