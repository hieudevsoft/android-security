package o0ooOO0;

import OooO0O0.OooO0O0;
import OooooO0.o0000O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class Oooo0 {

    /* renamed from: OooO  reason: collision with root package name */
    public final OooOOO0 f5515OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooO0O0 f5516OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooO0O0 f5517OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final OooO0O0 f5518OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final OooO0O0 f5519OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final OooOO0 f5520OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final OooOO0 f5521OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final OooOO0 f5522OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final OooOO0 f5523OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final OooOOO0 f5524OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final OooOOO0 f5525OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final OooOOO0 f5526OooOO0o;

    public Oooo0() {
        this.f5516OooO00o = new OooOo();
        this.f5517OooO0O0 = new OooOo();
        this.f5518OooO0OO = new OooOo();
        this.f5519OooO0Oo = new OooOo();
        this.f5521OooO0o0 = new OooO0o(0.0f);
        this.f5520OooO0o = new OooO0o(0.0f);
        this.f5522OooO0oO = new OooO0o(0.0f);
        this.f5523OooO0oo = new OooO0o(0.0f);
        this.f5515OooO = OooO00o.OoooOOo();
        this.f5524OooOO0 = OooO00o.OoooOOo();
        this.f5525OooOO0O = OooO00o.OoooOOo();
        this.f5526OooOO0o = OooO00o.OoooOOo();
    }

    public static Oooo000 OooO00o(Context context, int i, int i2, OooO0o oooO0o) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(o0000O.f1807OooOo0O);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            OooOO0 OooO0OO2 = OooO0OO(obtainStyledAttributes, 5, oooO0o);
            OooOO0 OooO0OO3 = OooO0OO(obtainStyledAttributes, 8, OooO0OO2);
            OooOO0 OooO0OO4 = OooO0OO(obtainStyledAttributes, 9, OooO0OO2);
            OooOO0 OooO0OO5 = OooO0OO(obtainStyledAttributes, 7, OooO0OO2);
            OooOO0 OooO0OO6 = OooO0OO(obtainStyledAttributes, 6, OooO0OO2);
            Oooo000 oooo000 = new Oooo000();
            OooO0O0 OoooOOO2 = OooO00o.OoooOOO(i4);
            oooo000.f5528OooO00o = OoooOOO2;
            Oooo000.OooO0O0(OoooOOO2);
            oooo000.f5533OooO0o0 = OooO0OO3;
            OooO0O0 OoooOOO3 = OooO00o.OoooOOO(i5);
            oooo000.f5529OooO0O0 = OoooOOO3;
            Oooo000.OooO0O0(OoooOOO3);
            oooo000.f5532OooO0o = OooO0OO4;
            OooO0O0 OoooOOO4 = OooO00o.OoooOOO(i6);
            oooo000.f5530OooO0OO = OoooOOO4;
            Oooo000.OooO0O0(OoooOOO4);
            oooo000.f5534OooO0oO = OooO0OO5;
            OooO0O0 OoooOOO5 = OooO00o.OoooOOO(i7);
            oooo000.f5531OooO0Oo = OoooOOO5;
            Oooo000.OooO0O0(OoooOOO5);
            oooo000.f5535OooO0oo = OooO0OO6;
            return oooo000;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static Oooo000 OooO0O0(Context context, AttributeSet attributeSet, int i, int i2) {
        OooO0o oooO0o = new OooO0o(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0000O.f1800OooOOOo, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return OooO00o(context, resourceId, resourceId2, oooO0o);
    }

    public static OooOO0 OooO0OO(TypedArray typedArray, int i, OooOO0 oooOO0) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return oooOO0;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new OooO0o(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new OooOo00(peekValue.getFraction(1.0f, 1.0f)) : oooOO0;
    }

    public final boolean OooO0Oo(RectF rectF) {
        boolean z = this.f5526OooOO0o.getClass().equals(OooOOO0.class) && this.f5524OooOO0.getClass().equals(OooOOO0.class) && this.f5515OooO.getClass().equals(OooOOO0.class) && this.f5525OooOO0O.getClass().equals(OooOOO0.class);
        float OooO00o2 = this.f5521OooO0o0.OooO00o(rectF);
        return z && ((this.f5520OooO0o.OooO00o(rectF) > OooO00o2 ? 1 : (this.f5520OooO0o.OooO00o(rectF) == OooO00o2 ? 0 : -1)) == 0 && (this.f5523OooO0oo.OooO00o(rectF) > OooO00o2 ? 1 : (this.f5523OooO0oo.OooO00o(rectF) == OooO00o2 ? 0 : -1)) == 0 && (this.f5522OooO0oO.OooO00o(rectF) > OooO00o2 ? 1 : (this.f5522OooO0oO.OooO00o(rectF) == OooO00o2 ? 0 : -1)) == 0) && ((this.f5517OooO0O0 instanceof OooOo) && (this.f5516OooO00o instanceof OooOo) && (this.f5518OooO0OO instanceof OooOo) && (this.f5519OooO0Oo instanceof OooOo));
    }

    public Oooo0(Oooo000 oooo000) {
        this.f5516OooO00o = oooo000.f5528OooO00o;
        this.f5517OooO0O0 = oooo000.f5529OooO0O0;
        this.f5518OooO0OO = oooo000.f5530OooO0OO;
        this.f5519OooO0Oo = oooo000.f5531OooO0Oo;
        this.f5521OooO0o0 = oooo000.f5533OooO0o0;
        this.f5520OooO0o = oooo000.f5532OooO0o;
        this.f5522OooO0oO = oooo000.f5534OooO0oO;
        this.f5523OooO0oo = oooo000.f5535OooO0oo;
        this.f5515OooO = oooo000.f5527OooO;
        this.f5524OooOO0 = oooo000.f5536OooOO0;
        this.f5525OooOO0O = oooo000.f5537OooOO0O;
        this.f5526OooOO0o = oooo000.f5538OooOO0o;
    }
}