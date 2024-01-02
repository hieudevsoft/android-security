package ooOO;

import OooO0O0.OooO0O0;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import o00o0O.OooOOO;
import o00o0O.OooOOOO;

/* loaded from: classes.dex */
public final class Oooo000 extends OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f5635OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f5636OooO0O0;

    public /* synthetic */ Oooo000(int i, Object obj) {
        this.f5635OooO00o = i;
        this.f5636OooO0O0 = obj;
    }

    @Override // OooO0O0.OooO0O0
    public final void OooOO0O(int i) {
        switch (this.f5635OooO00o) {
            case 0:
                return;
            default:
                OooOOOO oooOOOO = (OooOOOO) this.f5636OooO0O0;
                oooOOOO.f5278OooO0Oo = true;
                OooOOO oooOOO = (OooOOO) oooOOOO.f5280OooO0o0.get();
                if (oooOOO != null) {
                    o00O0O o00o0o = (o00O0O) oooOOO;
                    o00o0o.OooOo0();
                    o00o0o.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // OooO0O0.OooO0O0
    public final void OooOOO0(Typeface typeface, boolean z) {
        CharSequence text;
        int i = this.f5635OooO00o;
        Object obj = this.f5636OooO0O0;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                o00O0O o00o0o = chip.f3341OooO0o0;
                if (o00o0o.f5689o000000) {
                    text = o00o0o.f5659OooOooo;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z) {
                    OooOOOO oooOOOO = (OooOOOO) obj;
                    oooOOOO.f5278OooO0Oo = true;
                    OooOOO oooOOO = (OooOOO) oooOOOO.f5280OooO0o0.get();
                    if (oooOOO != null) {
                        o00O0O o00o0o2 = (o00O0O) oooOOO;
                        o00o0o2.OooOo0();
                        o00o0o2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}