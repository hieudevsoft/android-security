package ooOO;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class Oooo0 extends ViewOutlineProvider {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ Chip f5634OooO00o;

    public Oooo0(Chip chip) {
        this.f5634OooO00o = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        o00O0O o00o0o = this.f5634OooO00o.f3341OooO0o0;
        if (o00o0o != null) {
            o00o0o.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}