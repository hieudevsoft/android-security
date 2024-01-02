package Ooooo00;

import OooOo0o.o0OOO0o;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class Oooo000 extends o0OoOo0 {

    /* renamed from: OooO  reason: collision with root package name */
    public float f1724OooO;

    /* renamed from: OooO0o  reason: collision with root package name */
    public float f1725OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public o0OOO0o f1726OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public o0OOO0o f1727OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public float f1728OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public float f1729OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public float f1730OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public float f1731OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public Paint.Join f1732OooOOO;
    public Paint.Cap OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public float f1733OooOOOO;

    public Oooo000() {
        this.f1725OooO0o = 0.0f;
        this.f1728OooO0oo = 1.0f;
        this.f1724OooO = 1.0f;
        this.f1729OooOO0 = 0.0f;
        this.f1730OooOO0O = 1.0f;
        this.f1731OooOO0o = 0.0f;
        this.OooOOO0 = Paint.Cap.BUTT;
        this.f1732OooOOO = Paint.Join.MITER;
        this.f1733OooOOOO = 4.0f;
    }

    @Override // Ooooo00.o000oOoO
    public final boolean OooO00o() {
        return this.f1727OooO0oO.OooO0O0() || this.f1726OooO0o0.OooO0O0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // Ooooo00.o000oOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0O0(int[] r7) {
        /*
            r6 = this;
            OooOo0o.o0OOO0o r0 = r6.f1727OooO0oO
            boolean r1 = r0.OooO0O0()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            android.content.res.ColorStateList r1 = r0.f1197OooO0O0
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f1198OooO0OO
            if (r1 == r4) goto L1c
            r0.f1198OooO0OO = r1
            r0 = r2
            goto L1d
        L1c:
            r0 = r3
        L1d:
            OooOo0o.o0OOO0o r1 = r6.f1726OooO0o0
            boolean r4 = r1.OooO0O0()
            if (r4 == 0) goto L36
            android.content.res.ColorStateList r4 = r1.f1197OooO0O0
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f1198OooO0OO
            if (r7 == r4) goto L36
            r1.f1198OooO0OO = r7
            goto L37
        L36:
            r2 = r3
        L37:
            r7 = r2 | r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ooooo00.Oooo000.OooO0O0(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f1724OooO;
    }

    public int getFillColor() {
        return this.f1727OooO0oO.f1198OooO0OO;
    }

    public float getStrokeAlpha() {
        return this.f1728OooO0oo;
    }

    public int getStrokeColor() {
        return this.f1726OooO0o0.f1198OooO0OO;
    }

    public float getStrokeWidth() {
        return this.f1725OooO0o;
    }

    public float getTrimPathEnd() {
        return this.f1730OooOO0O;
    }

    public float getTrimPathOffset() {
        return this.f1731OooOO0o;
    }

    public float getTrimPathStart() {
        return this.f1729OooOO0;
    }

    public void setFillAlpha(float f) {
        this.f1724OooO = f;
    }

    public void setFillColor(int i) {
        this.f1727OooO0oO.f1198OooO0OO = i;
    }

    public void setStrokeAlpha(float f) {
        this.f1728OooO0oo = f;
    }

    public void setStrokeColor(int i) {
        this.f1726OooO0o0.f1198OooO0OO = i;
    }

    public void setStrokeWidth(float f) {
        this.f1725OooO0o = f;
    }

    public void setTrimPathEnd(float f) {
        this.f1730OooOO0O = f;
    }

    public void setTrimPathOffset(float f) {
        this.f1731OooOO0o = f;
    }

    public void setTrimPathStart(float f) {
        this.f1729OooOO0 = f;
    }

    public Oooo000(Oooo000 oooo000) {
        super(oooo000);
        this.f1725OooO0o = 0.0f;
        this.f1728OooO0oo = 1.0f;
        this.f1724OooO = 1.0f;
        this.f1729OooOO0 = 0.0f;
        this.f1730OooOO0O = 1.0f;
        this.f1731OooOO0o = 0.0f;
        this.OooOOO0 = Paint.Cap.BUTT;
        this.f1732OooOOO = Paint.Join.MITER;
        this.f1733OooOOOO = 4.0f;
        this.f1726OooO0o0 = oooo000.f1726OooO0o0;
        this.f1725OooO0o = oooo000.f1725OooO0o;
        this.f1728OooO0oo = oooo000.f1728OooO0oo;
        this.f1727OooO0oO = oooo000.f1727OooO0oO;
        this.f1764OooO0OO = oooo000.f1764OooO0OO;
        this.f1724OooO = oooo000.f1724OooO;
        this.f1729OooOO0 = oooo000.f1729OooOO0;
        this.f1730OooOO0O = oooo000.f1730OooOO0O;
        this.f1731OooOO0o = oooo000.f1731OooOO0o;
        this.OooOOO0 = oooo000.OooOOO0;
        this.f1732OooOOO = oooo000.f1732OooOOO;
        this.f1733OooOOOO = oooo000.f1733OooOOOO;
    }
}