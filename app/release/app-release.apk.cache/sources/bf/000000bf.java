package OooOOo0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class Oooo000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f1063OooO00o = 0;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f1064OooO0O0 = 0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public float f1065OooO0OO = 1.0f;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public float f1066OooO0Oo = Float.NaN;

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o00Ooo.f1081OooO0oO);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f1065OooO0OO = obtainStyledAttributes.getFloat(index, this.f1065OooO0OO);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f1063OooO00o);
                this.f1063OooO00o = i2;
                this.f1063OooO00o = o000oOoO.f1067OooO0Oo[i2];
            } else if (index == 4) {
                this.f1064OooO0O0 = obtainStyledAttributes.getInt(index, this.f1064OooO0O0);
            } else if (index == 3) {
                this.f1066OooO0Oo = obtainStyledAttributes.getFloat(index, this.f1066OooO0Oo);
            }
        }
        obtainStyledAttributes.recycle();
    }
}