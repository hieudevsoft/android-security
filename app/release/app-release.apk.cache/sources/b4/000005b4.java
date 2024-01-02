package o0000Oo0;

import java.util.Iterator;
import o0000O00.OooO00o;
import o0000O0O.o0OoOo0;

/* loaded from: classes.dex */
public final class OooO0o implements o0000OOo.OooO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final CharSequence f4394OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f4395OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f4396OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o0OoOo0 f4397OooO0Oo;

    public OooO0o(CharSequence charSequence, int i, int i2, OooOOO oooOOO) {
        OooO00o.OooOoo0(charSequence, "input");
        this.f4394OooO00o = charSequence;
        this.f4395OooO0O0 = i;
        this.f4396OooO0OO = i2;
        this.f4397OooO0Oo = oooOOO;
    }

    @Override // o0000OOo.OooO0o
    public final Iterator iterator() {
        return new OooO0OO(this);
    }
}