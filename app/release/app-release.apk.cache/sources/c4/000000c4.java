package OooOOo0;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class o00oO0o extends OooO0OO {

    /* renamed from: OooO  reason: collision with root package name */
    public boolean f1084OooO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f1085OooO0oo;

    @Override // OooOOo0.OooO0OO
    public final void OooO0o0(ConstraintLayout constraintLayout) {
        OooO0Oo(constraintLayout);
    }

    @Override // OooOOo0.OooO0OO
    public void OooO0oO(AttributeSet attributeSet) {
        super.OooO0oO(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o00Ooo.f1076OooO0O0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f1085OooO0oo = true;
                } else if (index == 22) {
                    this.f1084OooO = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void OooOO0(OooOOO.OooOOO0 oooOOO0, int i, int i2);

    @Override // OooOOo0.OooO0OO, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1085OooO0oo || this.f1084OooO) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f939OooO0O0; i++) {
                    View view = (View) constraintLayout.f2586OooO00o.get(this.f938OooO00o[i]);
                    if (view != null) {
                        if (this.f1085OooO0oo) {
                            view.setVisibility(visibility);
                        }
                        if (this.f1084OooO && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            OooO0Oo((ConstraintLayout) parent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            OooO0Oo((ConstraintLayout) parent);
        }
    }
}