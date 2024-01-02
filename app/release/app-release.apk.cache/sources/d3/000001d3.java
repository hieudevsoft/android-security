package Oooo0oO;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.OooOo;

/* loaded from: classes.dex */
public final class o0OoOoOo implements TransformationMethod {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final TransformationMethod f1506OooO00o;

    public o0OoOoOo(TransformationMethod transformationMethod) {
        this.f1506OooO00o = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f1506OooO00o;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && OooOo.OooO00o().OooO0O0() == 1) {
            OooOo OooO00o2 = OooOo.OooO00o();
            OooO00o2.getClass();
            return OooO00o2.OooO0o(0, charSequence.length(), charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f1506OooO00o;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}