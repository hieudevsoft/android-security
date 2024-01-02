package Oooo000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class OooO00o extends ClickableSpan {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f1420OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o000oOoO f1421OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f1422OooO0OO;

    public OooO00o(int i, o000oOoO o000oooo, int i2) {
        this.f1420OooO00o = i;
        this.f1421OooO0O0 = o000oooo;
        this.f1422OooO0OO = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1420OooO00o);
        this.f1421OooO0O0.f1437OooO00o.performAction(this.f1422OooO0OO, bundle);
    }
}