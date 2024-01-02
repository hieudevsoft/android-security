package oo000o;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class OooO0OO extends OooO0O0.OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ Context f5607OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ TextPaint f5608OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ OooO0O0.OooO0O0 f5609OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ OooO0o f5610OooO0Oo;

    public OooO0OO(OooO0o oooO0o, Context context, TextPaint textPaint, OooO0O0.OooO0O0 oooO0O0) {
        this.f5610OooO0Oo = oooO0o;
        this.f5607OooO00o = context;
        this.f5608OooO0O0 = textPaint;
        this.f5609OooO0OO = oooO0O0;
    }

    @Override // OooO0O0.OooO0O0
    public final void OooOO0O(int i) {
        this.f5609OooO0OO.OooOO0O(i);
    }

    @Override // OooO0O0.OooO0O0
    public final void OooOOO0(Typeface typeface, boolean z) {
        this.f5610OooO0Oo.OooO0oO(this.f5607OooO00o, this.f5608OooO0O0, typeface);
        this.f5609OooO0OO.OooOOO0(typeface, z);
    }
}