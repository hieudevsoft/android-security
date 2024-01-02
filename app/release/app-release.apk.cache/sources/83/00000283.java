package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f2083OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f2084OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f2085OooO0OO;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2085OooO0OO = -1;
        int[] iArr = OooO0OO.OooO00o.f27OooOO0O;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        OooOooo.o0o0Oo.OooOO0O(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f2083OooO00o = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f2083OooO00o);
        }
    }

    private void setStacked(boolean z) {
        if (this.f2084OooO0O0 != z) {
            if (!z || this.f2083OooO00o) {
                this.f2084OooO0O0 = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int paddingBottom;
        boolean z2;
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        if (this.f2083OooO00o) {
            if (size > this.f2085OooO0OO && this.f2084OooO0O0) {
                setStacked(false);
            }
            this.f2085OooO0OO = size;
        }
        if (!this.f2084OooO0O0 && View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        super.onMeasure(i3, i2);
        if (this.f2083OooO00o && !this.f2084OooO0O0) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            i4 = -1;
            if (i6 < childCount) {
                if (getChildAt(i6).getVisibility() == 0) {
                    break;
                }
                i6++;
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 >= 0) {
            View childAt = getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i5 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f2084OooO0O0) {
                int i7 = i6 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i7 >= childCount2) {
                        break;
                    } else if (getChildAt(i7).getVisibility() == 0) {
                        i4 = i7;
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i4 >= 0) {
                    paddingBottom = getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i5 += paddingBottom;
        }
        WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
        if (OooOooo.o00O0O0.OooO0Oo(this) != i5) {
            setMinimumHeight(i5);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f2083OooO00o != z) {
            this.f2083OooO00o = z;
            if (!z && this.f2084OooO0O0) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}