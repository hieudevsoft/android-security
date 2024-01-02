package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f2238OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f2239OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public WeakReference f2240OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public LayoutInflater f2241OooO0Oo;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2238OooO00o = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0OO.OooO00o.f42OooOoOO, 0, 0);
        this.f2239OooO0O0 = obtainStyledAttributes.getResourceId(2, -1);
        this.f2238OooO00o = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View OooO00o() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f2238OooO00o != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f2241OooO0Oo;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f2238OooO00o, viewGroup, false);
                int i = this.f2239OooO0O0;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f2240OooO0OO = new WeakReference(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2239OooO0O0;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2241OooO0Oo;
    }

    public int getLayoutResource() {
        return this.f2238OooO00o;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f2239OooO0O0 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2241OooO0Oo = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f2238OooO00o = i;
    }

    public void setOnInflateListener(o0OO0o o0oo0o) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f2240OooO0OO;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            OooO00o();
        }
    }
}