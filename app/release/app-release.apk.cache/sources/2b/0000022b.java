package Ooooo00;

import OooOo.OooOO0;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public abstract class o0OoOo0 extends o000oOoO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public OooOO0[] f1762OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public String f1763OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f1764OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f1765OooO0Oo;

    public o0OoOo0() {
        this.f1762OooO00o = null;
        this.f1764OooO0OO = 0;
    }

    public OooOO0[] getPathData() {
        return this.f1762OooO00o;
    }

    public String getPathName() {
        return this.f1763OooO0O0;
    }

    public void setPathData(OooOO0[] oooOO0Arr) {
        if (!OooO00o.OooOOoo(this.f1762OooO00o, oooOO0Arr)) {
            this.f1762OooO00o = OooO00o.OooooO0(oooOO0Arr);
            return;
        }
        OooOO0[] oooOO0Arr2 = this.f1762OooO00o;
        for (int i = 0; i < oooOO0Arr.length; i++) {
            oooOO0Arr2[i].f1114OooO00o = oooOO0Arr[i].f1114OooO00o;
            int i2 = 0;
            while (true) {
                float[] fArr = oooOO0Arr[i].f1115OooO0O0;
                if (i2 < fArr.length) {
                    oooOO0Arr2[i].f1115OooO0O0[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public o0OoOo0(o0OoOo0 o0oooo0) {
        this.f1762OooO00o = null;
        this.f1764OooO0OO = 0;
        this.f1763OooO0O0 = o0oooo0.f1763OooO0O0;
        this.f1765OooO0Oo = o0oooo0.f1765OooO0Oo;
        this.f1762OooO00o = OooO00o.OooooO0(o0oooo0.f1762OooO00o);
    }
}