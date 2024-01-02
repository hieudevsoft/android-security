package o000oOoO;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class Oooo000 extends o000O000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f4941OooO00o;

    public Oooo000(o0OoOo0 o0oooo0) {
        this.f4941OooO00o = o0oooo0;
    }

    @Override // o000oOoO.o000O000
    public final void OooO0O0(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        o0OoOo0 o0oooo0 = this.f4941OooO00o;
        int computeVerticalScrollRange = o0oooo0.f5149OooOOoo.computeVerticalScrollRange();
        int i3 = o0oooo0.f5147OooOOo;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = o0oooo0.f5133OooO00o;
        if (i4 > 0 && i3 >= i5) {
            z = true;
        } else {
            z = false;
        }
        o0oooo0.f5152OooOo00 = z;
        int computeHorizontalScrollRange = o0oooo0.f5149OooOOoo.computeHorizontalScrollRange();
        int i6 = o0oooo0.f5148OooOOo0;
        if (computeHorizontalScrollRange - i6 > 0 && i6 >= i5) {
            z2 = true;
        } else {
            z2 = false;
        }
        o0oooo0.f5151OooOo0 = z2;
        boolean z3 = o0oooo0.f5152OooOo00;
        if (!z3 && !z2) {
            if (o0oooo0.f5153OooOo0O != 0) {
                o0oooo0.OooO0o(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i3;
            o0oooo0.f5143OooOO0o = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            o0oooo0.f5142OooOO0O = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (o0oooo0.f5151OooOo0) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i6;
            o0oooo0.f5145OooOOOO = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            o0oooo0.f5144OooOOO = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = o0oooo0.f5153OooOo0O;
        if (i7 == 0 || i7 == 1) {
            o0oooo0.OooO0o(1);
        }
    }
}