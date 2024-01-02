package OooOOo0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import o00000.o000;

/* loaded from: classes.dex */
public final class Oooo0 {

    /* renamed from: OooOOO  reason: collision with root package name */
    public static final SparseIntArray f1050OooOOO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public float f1052OooO00o = 0.0f;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public float f1053OooO0O0 = 0.0f;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public float f1054OooO0OO = 0.0f;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public float f1055OooO0Oo = 1.0f;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public float f1057OooO0o0 = 1.0f;

    /* renamed from: OooO0o  reason: collision with root package name */
    public float f1056OooO0o = Float.NaN;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public float f1058OooO0oO = Float.NaN;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f1059OooO0oo = -1;

    /* renamed from: OooO  reason: collision with root package name */
    public float f1051OooO = 0.0f;

    /* renamed from: OooOO0  reason: collision with root package name */
    public float f1060OooOO0 = 0.0f;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public float f1061OooOO0O = 0.0f;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public boolean f1062OooOO0o = false;
    public float OooOOO0 = 0.0f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1050OooOOO = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o00Ooo.f1074OooO);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f1050OooOOO.get(index)) {
                case 1:
                    this.f1052OooO00o = obtainStyledAttributes.getFloat(index, this.f1052OooO00o);
                    break;
                case 2:
                    this.f1053OooO0O0 = obtainStyledAttributes.getFloat(index, this.f1053OooO0O0);
                    break;
                case 3:
                    this.f1054OooO0OO = obtainStyledAttributes.getFloat(index, this.f1054OooO0OO);
                    break;
                case 4:
                    this.f1055OooO0Oo = obtainStyledAttributes.getFloat(index, this.f1055OooO0Oo);
                    break;
                case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    this.f1057OooO0o0 = obtainStyledAttributes.getFloat(index, this.f1057OooO0o0);
                    break;
                case 6:
                    this.f1056OooO0o = obtainStyledAttributes.getDimension(index, this.f1056OooO0o);
                    break;
                case 7:
                    this.f1058OooO0oO = obtainStyledAttributes.getDimension(index, this.f1058OooO0oO);
                    break;
                case 8:
                    this.f1051OooO = obtainStyledAttributes.getDimension(index, this.f1051OooO);
                    break;
                case 9:
                    this.f1060OooOO0 = obtainStyledAttributes.getDimension(index, this.f1060OooOO0);
                    break;
                case 10:
                    this.f1061OooOO0O = obtainStyledAttributes.getDimension(index, this.f1061OooOO0O);
                    break;
                case 11:
                    this.f1062OooOO0o = true;
                    this.OooOOO0 = obtainStyledAttributes.getDimension(index, this.OooOOO0);
                    break;
                case 12:
                    this.f1059OooO0oo = o000oOoO.OooO0o(obtainStyledAttributes, index, this.f1059OooO0oo);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}