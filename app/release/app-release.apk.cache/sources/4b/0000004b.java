package OooO0o;

import OooOooo.o0O00000;
import android.view.View;
import androidx.appcompat.widget.o0OO00OO;

/* loaded from: classes.dex */
public final class Oooo000 extends o0000O00.OooO00o {

    /* renamed from: OoooO  reason: collision with root package name */
    public final /* synthetic */ int f318OoooO;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public boolean f319OoooOO0;

    /* renamed from: OoooOOO  reason: collision with root package name */
    public final /* synthetic */ Object f320OoooOOO;

    /* renamed from: o000oOoO  reason: collision with root package name */
    public int f321o000oOoO;

    public Oooo000(Oooo0 oooo0) {
        this.f318OoooO = 0;
        this.f320OoooOOO = oooo0;
        this.f319OoooOO0 = false;
        this.f321o000oOoO = 0;
    }

    @Override // OooOooo.o0O00000
    public final void OooO00o() {
        int i = this.f318OoooO;
        Object obj = this.f320OoooOOO;
        switch (i) {
            case 0:
                int i2 = this.f321o000oOoO + 1;
                this.f321o000oOoO = i2;
                Oooo0 oooo0 = (Oooo0) obj;
                if (i2 == oooo0.f312OooO00o.size()) {
                    o0O00000 o0o00000 = oooo0.f315OooO0Oo;
                    if (o0o00000 != null) {
                        o0o00000.OooO00o();
                    }
                    this.f321o000oOoO = 0;
                    this.f319OoooOO0 = false;
                    oooo0.f317OooO0o0 = false;
                    return;
                }
                return;
            default:
                if (!this.f319OoooOO0) {
                    ((o0OO00OO) obj).f2490OooO00o.setVisibility(this.f321o000oOoO);
                    return;
                }
                return;
        }
    }

    @Override // o0000O00.OooO00o, OooOooo.o0O00000
    public final void OooO0Oo(View view) {
        switch (this.f318OoooO) {
            case 1:
                this.f319OoooOO0 = true;
                return;
            default:
                return;
        }
    }

    @Override // o0000O00.OooO00o, OooOooo.o0O00000
    public final void OooO0o() {
        int i = this.f318OoooO;
        Object obj = this.f320OoooOOO;
        switch (i) {
            case 0:
                if (!this.f319OoooOO0) {
                    this.f319OoooOO0 = true;
                    o0O00000 o0o00000 = ((Oooo0) obj).f315OooO0Oo;
                    if (o0o00000 != null) {
                        o0o00000.OooO0o();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((o0OO00OO) obj).f2490OooO00o.setVisibility(0);
                return;
        }
    }

    public Oooo000(o0OO00OO o0oo00oo, int i) {
        this.f318OoooO = 1;
        this.f320OoooOOO = o0oo00oo;
        this.f321o000oOoO = i;
        this.f319OoooOO0 = false;
    }
}