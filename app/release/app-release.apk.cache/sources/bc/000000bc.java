package OooOOo0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import o00000.o000;

/* loaded from: classes.dex */
public final class OooOo {

    /* renamed from: OooOO0  reason: collision with root package name */
    public static final SparseIntArray f975OooOO0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f977OooO00o = -1;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f978OooO0O0 = 0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f979OooO0OO = -1;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public float f980OooO0Oo = Float.NaN;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public float f982OooO0o0 = Float.NaN;

    /* renamed from: OooO0o  reason: collision with root package name */
    public float f981OooO0o = Float.NaN;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f983OooO0oO = -1;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public String f984OooO0oo = null;

    /* renamed from: OooO  reason: collision with root package name */
    public int f976OooO = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f975OooOO0 = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o00Ooo.f1079OooO0o);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f975OooOO0.get(index)) {
                case 1:
                    this.f982OooO0o0 = obtainStyledAttributes.getFloat(index, this.f982OooO0o0);
                    break;
                case 2:
                    this.f979OooO0OO = obtainStyledAttributes.getInt(index, this.f979OooO0OO);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = o0000O00.OooO00o.f4114OooO0Oo[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    this.f977OooO00o = o000oOoO.OooO0o(obtainStyledAttributes, index, this.f977OooO00o);
                    break;
                case 6:
                    this.f978OooO0O0 = obtainStyledAttributes.getInteger(index, this.f978OooO0O0);
                    break;
                case 7:
                    this.f980OooO0Oo = obtainStyledAttributes.getFloat(index, this.f980OooO0Oo);
                    break;
                case 8:
                    this.f983OooO0oO = obtainStyledAttributes.getInteger(index, this.f983OooO0oO);
                    break;
                case 9:
                    this.f981OooO0o = obtainStyledAttributes.getFloat(index, this.f981OooO0o);
                    break;
                case 10:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f984OooO0oo = string;
                            if (string.indexOf("/") <= 0) {
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index, this.f976OooO);
                            break;
                        }
                    }
                    this.f976OooO = obtainStyledAttributes.getResourceId(index, -1);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}