package OoooOoo;

import OooOO0.OooO0O0;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0OOOO00 extends oO00000o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1616OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f1617OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f1618OooO0OO;

    public /* synthetic */ o0OOOO00(Object obj, int i, Object obj2) {
        this.f1616OooO00o = i;
        this.f1618OooO0OO = obj;
        this.f1617OooO0O0 = obj2;
    }

    @Override // OoooOoo.o
    public final void OooO0o0(oO00000 oo00000) {
        int i = this.f1616OooO00o;
        Object obj = this.f1617OooO0O0;
        switch (i) {
            case 0:
                oO000OOo oo000ooo = oO0Ooooo.f1692OooO00o;
                oo000ooo.OooOoo0((View) obj, 1.0f);
                oo000ooo.getClass();
                oo00000.OooOo0O(this);
                return;
            case 1:
                ((ArrayList) ((OooO0O0) obj).getOrDefault(((oO0000O) this.f1618OooO0OO).f1660OooO0O0, null)).remove(oo00000);
                oo00000.OooOo0O(this);
                return;
            default:
                ((oO00000) obj).OooOoO0();
                oo00000.OooOo0O(this);
                return;
        }
    }
}