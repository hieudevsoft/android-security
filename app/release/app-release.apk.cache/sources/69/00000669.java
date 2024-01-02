package o000oOoO;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class o0000oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public o00000O0 f4966OooO00o = null;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ArrayList f4967OooO0O0 = new ArrayList();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final long f4968OooO0OO = 120;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final long f4969OooO0Oo = 120;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final long f4971OooO0o0 = 250;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final long f4970OooO0o = 250;

    public static void OooO0O0(o000OOo0 o000ooo0) {
        RecyclerView recyclerView;
        int i = o000ooo0.f5039OooOO0 & 14;
        if (!o000ooo0.OooO0oO() && (i & 4) == 0 && (recyclerView = o000ooo0.f5045OooOOo) != null) {
            recyclerView.Oooo000(o000ooo0);
        }
    }

    public abstract boolean OooO00o(o000OOo0 o000ooo0, o000OOo0 o000ooo02, o0000O00 o0000o00, o0000O00 o0000o002);

    public final void OooO0OO(o000OOo0 o000ooo0) {
        boolean z;
        o00000O0 o00000o02 = this.f4966OooO00o;
        if (o00000o02 != null) {
            boolean z2 = true;
            o000ooo0.OooOOO(true);
            if (o000ooo0.f5038OooO0oo != null && o000ooo0.f5030OooO == null) {
                o000ooo0.f5038OooO0oo = null;
            }
            o000ooo0.f5030OooO = null;
            if ((o000ooo0.f5039OooOO0 & 16) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                RecyclerView recyclerView = o00000o02.f4953OooO00o;
                recyclerView.Ooooo00();
                OooO0o oooO0o = recyclerView.f3149OooO0o0;
                o00000O0 o00000o03 = oooO0o.f4894OooO00o;
                RecyclerView recyclerView2 = o00000o03.f4953OooO00o;
                View view = o000ooo0.f5031OooO00o;
                int indexOfChild = recyclerView2.indexOfChild(view);
                if (indexOfChild == -1) {
                    oooO0o.OooOO0O(view);
                } else {
                    OooO0OO oooO0OO = oooO0o.f4895OooO0O0;
                    if (oooO0OO.OooO0Oo(indexOfChild)) {
                        oooO0OO.OooO0o(indexOfChild);
                        oooO0o.OooOO0O(view);
                        o00000o03.OooO0oO(indexOfChild);
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    o000OOo0 Oooo02 = RecyclerView.Oooo0(view);
                    o000O00 o000o00 = recyclerView.f3145OooO0O0;
                    o000o00.OooOO0O(Oooo02);
                    o000o00.OooO0oo(Oooo02);
                }
                recyclerView.Ooooo0o(!z2);
                if (!z2 && o000ooo0.OooOO0O()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public abstract void OooO0Oo(o000OOo0 o000ooo0);

    public abstract boolean OooO0o();

    public abstract void OooO0o0();
}