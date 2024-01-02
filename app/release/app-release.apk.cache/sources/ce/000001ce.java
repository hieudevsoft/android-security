package Oooo0oO;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public final class o0O00000 extends OooOOO0 {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final TextView f1493OooO0o;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final o0O0o f1494OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f1495OooO0oo;

    public o0O00000(TextView textView) {
        super(17, (Object) null);
        this.f1493OooO0o = textView;
        this.f1495OooO0oo = true;
        this.f1494OooO0oO = new o0O0o(textView);
    }

    @Override // o0ooOO0.OooOOO0
    public final InputFilter[] OooO0oO(InputFilter[] inputFilterArr) {
        if (!this.f1495OooO0oo) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof o0O0o) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() != 0) {
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            return inputFilterArr;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            o0O0o o0o0o = this.f1494OooO0oO;
            if (i4 < length2) {
                if (inputFilterArr[i4] != o0o0o) {
                    i4++;
                } else {
                    return inputFilterArr;
                }
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = o0o0o;
                return inputFilterArr3;
            }
        }
    }

    @Override // o0ooOO0.OooOOO0
    public final void OooOo00(boolean z) {
        if (z) {
            OooOoOO();
        }
    }

    @Override // o0ooOO0.OooOOO0
    public final void OooOo0o(boolean z) {
        this.f1495OooO0oo = z;
        OooOoOO();
        TextView textView = this.f1493OooO0o;
        textView.setFilters(OooO0oO(textView.getFilters()));
    }

    public final void OooOoOO() {
        TextView textView = this.f1493OooO0o;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f1495OooO0oo) {
            if (!(transformationMethod instanceof o0OoOoOo) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new o0OoOoOo(transformationMethod);
            }
        } else if (transformationMethod instanceof o0OoOoOo) {
            transformationMethod = ((o0OoOoOo) transformationMethod).f1506OooO00o;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}