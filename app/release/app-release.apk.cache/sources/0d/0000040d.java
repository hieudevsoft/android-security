package com.google.android.material.transformation;

import OooOOoo.o00oO0o;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, OooOOoo.o00Oo0
    public final void OooO0O0(View view) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
    }

    @Override // OooOOoo.o00Oo0
    public final void OooO0OO(o00oO0o o00oo0o) {
        if (o00oo0o.f1094OooO0oo == 0) {
            o00oo0o.f1094OooO0oo = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}