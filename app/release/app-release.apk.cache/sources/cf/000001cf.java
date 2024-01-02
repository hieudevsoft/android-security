package Oooo0oO;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.OooOo;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public final class o0O0000O extends OooOOO0 {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final o0O00000 f1496OooO0o;

    public o0O0000O(TextView textView) {
        super(17, (Object) null);
        this.f1496OooO0o = new o0O00000(textView);
    }

    @Override // o0ooOO0.OooOOO0
    public final InputFilter[] OooO0oO(InputFilter[] inputFilterArr) {
        boolean z;
        if (OooOo.f2680OooOO0 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return inputFilterArr;
        }
        return this.f1496OooO0o.OooO0oO(inputFilterArr);
    }

    @Override // o0ooOO0.OooOOO0
    public final void OooOo00(boolean z) {
        boolean z2;
        if (OooOo.f2680OooOO0 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return;
        }
        this.f1496OooO0o.OooOo00(z);
    }

    @Override // o0ooOO0.OooOOO0
    public final void OooOo0o(boolean z) {
        boolean z2;
        if (OooOo.f2680OooOO0 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = !z2;
        o0O00000 o0o00000 = this.f1496OooO0o;
        if (z3) {
            o0o00000.f1495OooO0oo = z;
        } else {
            o0o00000.OooOo0o(z);
        }
    }
}