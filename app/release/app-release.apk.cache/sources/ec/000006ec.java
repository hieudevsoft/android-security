package oo000o;

import OooO0Oo.o0000OO0;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class OooO00o extends OooO0O0.OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Typeface f5602OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0000OO0 f5603OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f5604OooO0OO;

    public OooO00o(o0000OO0 o0000oo02, Typeface typeface) {
        this.f5602OooO00o = typeface;
        this.f5603OooO0O0 = o0000oo02;
    }

    @Override // OooO0O0.OooO0O0
    public final void OooOO0O(int i) {
        if (!this.f5604OooO0OO) {
            o00o0O.OooO0OO oooO0OO = (o00o0O.OooO0OO) this.f5603OooO0O0.f183OooO0O0;
            if (oooO0OO.OooOO0(this.f5602OooO00o)) {
                oooO0OO.OooO0oo(false);
            }
        }
    }

    @Override // OooO0O0.OooO0O0
    public final void OooOOO0(Typeface typeface, boolean z) {
        if (!this.f5604OooO0OO) {
            o00o0O.OooO0OO oooO0OO = (o00o0O.OooO0OO) this.f5603OooO0O0.f183OooO0O0;
            if (oooO0OO.OooOO0(typeface)) {
                oooO0OO.OooO0oo(false);
            }
        }
    }
}