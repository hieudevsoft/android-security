package o00oO0O;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class OooO00o {

    /* renamed from: OooO  reason: collision with root package name */
    public static final int[] f5283OooO = new int[3];

    /* renamed from: OooOO0  reason: collision with root package name */
    public static final float[] f5284OooOO0 = {0.0f, 0.5f, 1.0f};

    /* renamed from: OooOO0O  reason: collision with root package name */
    public static final int[] f5285OooOO0O = new int[4];

    /* renamed from: OooOO0o  reason: collision with root package name */
    public static final float[] f5286OooOO0o = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Paint f5287OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Paint f5288OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Paint f5289OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f5290OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f5291OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f5292OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final Path f5293OooO0oO = new Path();

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final Paint f5294OooO0oo;

    public OooO00o() {
        Paint paint = new Paint();
        this.f5294OooO0oo = paint;
        this.f5287OooO00o = new Paint();
        OooO00o(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f5288OooO0O0 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f5289OooO0OO = new Paint(paint2);
    }

    public final void OooO00o(int i) {
        this.f5290OooO0Oo = OooOo.OooO00o.OooO0OO(i, 68);
        this.f5292OooO0o0 = OooOo.OooO00o.OooO0OO(i, 20);
        this.f5291OooO0o = OooOo.OooO00o.OooO0OO(i, 0);
        this.f5287OooO00o.setColor(this.f5290OooO0Oo);
    }
}