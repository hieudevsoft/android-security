package o000oOoO;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o00000O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4953OooO00o;

    public /* synthetic */ o00000O0(RecyclerView recyclerView) {
        this.f4953OooO00o = recyclerView;
    }

    public final void OooO00o(OooO00o oooO00o) {
        int i = oooO00o.f4883OooO00o;
        RecyclerView recyclerView = this.f4953OooO00o;
        if (i == 1) {
            recyclerView.f3154OooOO0o.OoooOO0(oooO00o.f4884OooO0O0, oooO00o.f4886OooO0Oo);
        } else if (i == 2) {
            recyclerView.f3154OooOO0o.OoooOOo(oooO00o.f4884OooO0O0, oooO00o.f4886OooO0Oo);
        } else if (i == 4) {
            recyclerView.f3154OooOO0o.OoooOo0(oooO00o.f4884OooO0O0, oooO00o.f4886OooO0Oo);
        } else if (i != 8) {
        } else {
            recyclerView.f3154OooOO0o.OoooOOO(oooO00o.f4884OooO0O0, oooO00o.f4886OooO0Oo);
        }
    }

    public final o000OOo0 OooO0O0(int i) {
        RecyclerView recyclerView = this.f4953OooO00o;
        int OooO0oo2 = recyclerView.f3149OooO0o0.OooO0oo();
        int i2 = 0;
        o000OOo0 o000ooo0 = null;
        while (true) {
            if (i2 >= OooO0oo2) {
                break;
            }
            o000OOo0 Oooo02 = RecyclerView.Oooo0(recyclerView.f3149OooO0o0.OooO0oO(i2));
            if (Oooo02 != null && !Oooo02.OooO() && Oooo02.f5033OooO0OO == i) {
                if (recyclerView.f3149OooO0o0.OooOO0(Oooo02.f5031OooO00o)) {
                    o000ooo0 = Oooo02;
                } else {
                    o000ooo0 = Oooo02;
                    break;
                }
            }
            i2++;
        }
        if (o000ooo0 == null || recyclerView.f3149OooO0o0.OooOO0(o000ooo0.f5031OooO00o)) {
            return null;
        }
        return o000ooo0;
    }

    public final int OooO0OO() {
        return this.f4953OooO00o.getChildCount();
    }

    public final void OooO0Oo(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f4953OooO00o;
        int OooO0oo2 = recyclerView.f3149OooO0o0.OooO0oo();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < OooO0oo2; i6++) {
            View OooO0oO2 = recyclerView.f3149OooO0o0.OooO0oO(i6);
            o000OOo0 Oooo02 = RecyclerView.Oooo0(OooO0oO2);
            if (Oooo02 != null && !Oooo02.OooOOOO() && (i4 = Oooo02.f5033OooO0OO) >= i && i4 < i5) {
                Oooo02.OooO0O0(2);
                Oooo02.OooO00o(obj);
                ((o0000O) OooO0oO2.getLayoutParams()).f4956OooO0OO = true;
            }
        }
        o000O00 o000o00 = recyclerView.f3145OooO0O0;
        ArrayList arrayList = o000o00.f4975OooO0OO;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                o000OOo0 o000ooo0 = (o000OOo0) arrayList.get(size);
                if (o000ooo0 != null && (i3 = o000ooo0.f5033OooO0OO) >= i && i3 < i5) {
                    o000ooo0.OooO0O0(2);
                    o000o00.OooO0o(size);
                }
            } else {
                recyclerView.f3195OooooO0 = true;
                return;
            }
        }
    }

    public final void OooO0o(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f4953OooO00o;
        int OooO0oo2 = recyclerView.f3149OooO0o0.OooO0oo();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < OooO0oo2; i11++) {
            o000OOo0 Oooo02 = RecyclerView.Oooo0(recyclerView.f3149OooO0o0.OooO0oO(i11));
            if (Oooo02 != null && (i9 = Oooo02.f5033OooO0OO) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    Oooo02.OooOO0o(i2 - i, false);
                } else {
                    Oooo02.OooOO0o(i5, false);
                }
                recyclerView.OoooOoO.f4986OooO0o = true;
            }
        }
        o000O00 o000o00 = recyclerView.f3145OooO0O0;
        o000o00.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = o000o00.f4975OooO0OO;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            o000OOo0 o000ooo0 = (o000OOo0) arrayList.get(i12);
            if (o000ooo0 != null && (i8 = o000ooo0.f5033OooO0OO) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    o000ooo0.OooOO0o(i2 - i, false);
                } else {
                    o000ooo0.OooOO0o(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3194Ooooo0o = true;
    }

    public final void OooO0o0(int i, int i2) {
        RecyclerView recyclerView = this.f4953OooO00o;
        int OooO0oo2 = recyclerView.f3149OooO0o0.OooO0oo();
        for (int i3 = 0; i3 < OooO0oo2; i3++) {
            o000OOo0 Oooo02 = RecyclerView.Oooo0(recyclerView.f3149OooO0o0.OooO0oO(i3));
            if (Oooo02 != null && !Oooo02.OooOOOO() && Oooo02.f5033OooO0OO >= i) {
                Oooo02.OooOO0o(i2, false);
                recyclerView.OoooOoO.f4986OooO0o = true;
            }
        }
        ArrayList arrayList = recyclerView.f3145OooO0O0.f4975OooO0OO;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o000OOo0 o000ooo0 = (o000OOo0) arrayList.get(i4);
            if (o000ooo0 != null && o000ooo0.f5033OooO0OO >= i) {
                o000ooo0.OooOO0o(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3194Ooooo0o = true;
    }

    public final void OooO0oO(int i) {
        RecyclerView recyclerView = this.f4953OooO00o;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.Oooo0(childAt);
            o00000O o00000o = recyclerView.f3153OooOO0O;
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}