package o0ooOO0;

import OooO0Oo.o0000OO0;
import OooOooO.o0000oo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;
import o00oO0O.OooO00o;

/* loaded from: classes.dex */
public class OooOOOO extends Drawable implements o0OO00O {

    /* renamed from: OooOo0o  reason: collision with root package name */
    public static final Paint f5492OooOo0o;

    /* renamed from: OooO  reason: collision with root package name */
    public final RectF f5493OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public OooOOO f5494OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0OOO0o[] f5495OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o0OOO0o[] f5496OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final BitSet f5497OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final Matrix f5498OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f5499OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final Path f5500OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final Path f5501OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final RectF f5502OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final Region f5503OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final Region f5504OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final Paint f5505OooOOO;
    public Oooo0 OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public final Paint f5506OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public final OooO00o f5507OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public final o0OoOo0 f5508OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final o0000OO0 f5509OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public PorterDuffColorFilter f5510OooOOoo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public final RectF f5511OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public PorterDuffColorFilter f5512OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public final boolean f5513OooOo0O;

    static {
        Paint paint = new Paint(1);
        f5492OooOo0o = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public OooOOOO() {
        this(new Oooo0());
    }

    public final void OooO(float f) {
        OooOOO oooOOO = this.f5494OooO00o;
        if (oooOOO.f5479OooOOO != f) {
            oooOOO.f5479OooOOO = f;
            OooOOO0();
        }
    }

    public final void OooO00o(RectF rectF, Path path) {
        o0OoOo0 o0oooo0 = this.f5508OooOOo;
        OooOOO oooOOO = this.f5494OooO00o;
        o0oooo0.OooO00o(oooOOO.f5468OooO00o, oooOOO.f5476OooOO0, rectF, this.f5509OooOOo0, path);
        if (this.f5494OooO00o.f5467OooO != 1.0f) {
            Matrix matrix = this.f5498OooO0o;
            matrix.reset();
            float f = this.f5494OooO00o.f5467OooO;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f5511OooOo0, true);
    }

    public final PorterDuffColorFilter OooO0O0(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int OooO0OO2;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = OooO0OO(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z && (OooO0OO2 = OooO0OO((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(OooO0OO2, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final int OooO0OO(int i) {
        boolean z;
        float f;
        float f2;
        int i2;
        OooOOO oooOOO = this.f5494OooO00o;
        float f3 = oooOOO.f5479OooOOO + oooOOO.f5480OooOOOO + oooOOO.OooOOO0;
        o00Ooo.OooO00o oooO00o = oooOOO.f5469OooO0O0;
        if (oooO00o != null && oooO00o.f5193OooO00o) {
            if (OooOo.OooO00o.OooO0OO(i, 255) == oooO00o.f5196OooO0Oo) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (oooO00o.f5197OooO0o0 > 0.0f && f3 > 0.0f) {
                    f2 = Math.min(((((float) Math.log1p(f3 / f)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                } else {
                    f2 = 0.0f;
                }
                int alpha = Color.alpha(i);
                int o0000OOO2 = o0000O00.OooO00o.o0000OOO(OooOo.OooO00o.OooO0OO(i, 255), oooO00o.f5194OooO0O0, f2);
                if (f2 > 0.0f && (i2 = oooO00o.f5195OooO0OO) != 0) {
                    o0000OOO2 = OooOo.OooO00o.OooO0O0(OooOo.OooO00o.OooO0OO(i2, o00Ooo.OooO00o.f5192OooO0o), o0000OOO2);
                }
                return OooOo.OooO00o.OooO0OO(o0000OOO2, alpha);
            }
            return i;
        }
        return i;
    }

    public final void OooO0Oo(Canvas canvas) {
        this.f5497OooO0Oo.cardinality();
        int i = this.f5494OooO00o.f5482OooOOo;
        Path path = this.f5500OooO0oO;
        OooO00o oooO00o = this.f5507OooOOOo;
        if (i != 0) {
            canvas.drawPath(path, oooO00o.f5287OooO00o);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            o0OOO0o o0ooo0o = this.f5495OooO0O0[i2];
            int i3 = this.f5494OooO00o.f5483OooOOo0;
            Matrix matrix = o0OOO0o.f5548OooO0O0;
            o0ooo0o.OooO00o(matrix, oooO00o, i3, canvas);
            this.f5496OooO0OO[i2].OooO00o(matrix, oooO00o, this.f5494OooO00o.f5483OooOOo0, canvas);
        }
        if (this.f5513OooOo0O) {
            OooOOO oooOOO = this.f5494OooO00o;
            int sin = (int) (Math.sin(Math.toRadians(oooOOO.f5484OooOOoo)) * oooOOO.f5482OooOOo);
            OooOOO oooOOO2 = this.f5494OooO00o;
            int cos = (int) (Math.cos(Math.toRadians(oooOOO2.f5484OooOOoo)) * oooOOO2.f5482OooOOo);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f5492OooOo0o);
            canvas.translate(sin, cos);
        }
    }

    public void OooO0o(Canvas canvas) {
        boolean z;
        Paint paint = this.f5506OooOOOO;
        Path path = this.f5501OooO0oo;
        Oooo0 oooo0 = this.OooOOO0;
        RectF rectF = this.f5502OooOO0;
        rectF.set(OooO0oO());
        Paint.Style style = this.f5494OooO00o.f5485OooOo0;
        float f = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && paint.getStrokeWidth() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = paint.getStrokeWidth() / 2.0f;
        }
        rectF.inset(f, f);
        OooO0o0(canvas, paint, path, oooo0, rectF);
    }

    public final void OooO0o0(Canvas canvas, Paint paint, Path path, Oooo0 oooo0, RectF rectF) {
        if (!oooo0.OooO0Oo(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float OooO00o2 = oooo0.f5520OooO0o.OooO00o(rectF) * this.f5494OooO00o.f5476OooOO0;
        canvas.drawRoundRect(rectF, OooO00o2, OooO00o2, paint);
    }

    public final RectF OooO0oO() {
        RectF rectF = this.f5493OooO;
        rectF.set(getBounds());
        return rectF;
    }

    public final void OooO0oo(Context context) {
        this.f5494OooO00o.f5469OooO0O0 = new o00Ooo.OooO00o(context);
        OooOOO0();
    }

    public final void OooOO0(ColorStateList colorStateList) {
        OooOOO oooOOO = this.f5494OooO00o;
        if (oooOOO.f5470OooO0OO != colorStateList) {
            oooOOO.f5470OooO0OO = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean OooOO0O(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f5494OooO00o.f5470OooO0OO == null || color2 == (colorForState2 = this.f5494OooO00o.f5470OooO0OO.getColorForState(iArr, (color2 = (paint2 = this.f5505OooOOO).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f5494OooO00o.f5471OooO0Oo == null || color == (colorForState = this.f5494OooO00o.f5471OooO0Oo.getColorForState(iArr, (color = (paint = this.f5506OooOOOO).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean OooOO0o() {
        PorterDuffColorFilter porterDuffColorFilter = this.f5510OooOOoo;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f5512OooOo00;
        OooOOO oooOOO = this.f5494OooO00o;
        this.f5510OooOOoo = OooO0O0(oooOOO.f5472OooO0o, oooOOO.f5474OooO0oO, this.f5505OooOOO, true);
        OooOOO oooOOO2 = this.f5494OooO00o;
        this.f5512OooOo00 = OooO0O0(oooOOO2.f5473OooO0o0, oooOOO2.f5474OooO0oO, this.f5506OooOOOO, false);
        OooOOO oooOOO3 = this.f5494OooO00o;
        if (oooOOO3.f5486OooOo00) {
            this.f5507OooOOOo.OooO00o(oooOOO3.f5472OooO0o.getColorForState(getState(), 0));
        }
        if (!o0000oo.OooO00o(porterDuffColorFilter, this.f5510OooOOoo) || !o0000oo.OooO00o(porterDuffColorFilter2, this.f5512OooOo00)) {
            return true;
        }
        return false;
    }

    public final void OooOOO0() {
        OooOOO oooOOO = this.f5494OooO00o;
        float f = oooOOO.f5479OooOOO + oooOOO.f5480OooOOOO;
        oooOOO.f5483OooOOo0 = (int) Math.ceil(0.75f * f);
        this.f5494OooO00o.f5482OooOOo = (int) Math.ceil(f * 0.25f);
        OooOO0o();
        super.invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0128, code lost:
        if (r0 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0211  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0ooOO0.OooOOOO.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5494OooO00o.f5478OooOO0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f5494OooO00o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        OooOOO oooOOO = this.f5494OooO00o;
        if (oooOOO.f5481OooOOOo == 2) {
            return;
        }
        if (oooOOO.f5468OooO00o.OooO0Oo(OooO0oO())) {
            outline.setRoundRect(getBounds(), this.f5494OooO00o.f5468OooO00o.f5521OooO0o0.OooO00o(OooO0oO()) * this.f5494OooO00o.f5476OooOO0);
            return;
        }
        RectF OooO0oO2 = OooO0oO();
        Path path = this.f5500OooO0oO;
        OooO00o(OooO0oO2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            Oooo000.OooOO0.OooO0Oo(outline, path);
        } else if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f5494OooO00o.f5475OooO0oo;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f5503OooOO0O;
        region.set(bounds);
        RectF OooO0oO2 = OooO0oO();
        Path path = this.f5500OooO0oO;
        OooO00o(OooO0oO2, path);
        Region region2 = this.f5504OooOO0o;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f5499OooO0o0 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f5494OooO00o.f5472OooO0o) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f5494OooO00o.f5473OooO0o0) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f5494OooO00o.f5471OooO0Oo) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f5494OooO00o.f5470OooO0OO) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f5494OooO00o = new OooOOO(this.f5494OooO00o);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f5499OooO0o0 = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = OooOO0O(iArr) || OooOO0o();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        OooOOO oooOOO = this.f5494OooO00o;
        if (oooOOO.f5478OooOO0o != i) {
            oooOOO.f5478OooOO0o = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5494OooO00o.getClass();
        super.invalidateSelf();
    }

    @Override // o0ooOO0.o0OO00O
    public final void setShapeAppearanceModel(Oooo0 oooo0) {
        this.f5494OooO00o.f5468OooO00o = oooo0;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f5494OooO00o.f5472OooO0o = colorStateList;
        OooOO0o();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        OooOOO oooOOO = this.f5494OooO00o;
        if (oooOOO.f5474OooO0oO != mode) {
            oooOOO.f5474OooO0oO = mode;
            OooOO0o();
            super.invalidateSelf();
        }
    }

    public OooOOOO(Context context, AttributeSet attributeSet, int i, int i2) {
        this(Oooo0.OooO0O0(context, attributeSet, i, i2).OooO00o());
    }

    public OooOOOO(OooOOO oooOOO) {
        o0OoOo0 o0oooo0;
        this.f5495OooO0O0 = new o0OOO0o[4];
        this.f5496OooO0OO = new o0OOO0o[4];
        this.f5497OooO0Oo = new BitSet(8);
        this.f5498OooO0o = new Matrix();
        this.f5500OooO0oO = new Path();
        this.f5501OooO0oo = new Path();
        this.f5493OooO = new RectF();
        this.f5502OooOO0 = new RectF();
        this.f5503OooOO0O = new Region();
        this.f5504OooOO0o = new Region();
        Paint paint = new Paint(1);
        this.f5505OooOOO = paint;
        Paint paint2 = new Paint(1);
        this.f5506OooOOOO = paint2;
        this.f5507OooOOOo = new OooO00o();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            o0oooo0 = o000oOoO.f5539OooO00o;
        } else {
            o0oooo0 = new o0OoOo0();
        }
        this.f5508OooOOo = o0oooo0;
        this.f5511OooOo0 = new RectF();
        this.f5513OooOo0O = true;
        this.f5494OooO00o = oooOOO;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        OooOO0o();
        OooOO0O(getState());
        this.f5509OooOOo0 = new o0000OO0(28, this);
    }

    public OooOOOO(Oooo0 oooo0) {
        this(new OooOOO(oooo0));
    }
}