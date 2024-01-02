package Ooooo0o;

import OooOO0.OooO0O0;
import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class o000 extends o0000OO0 {

    /* renamed from: OooO  reason: collision with root package name */
    public int f1775OooO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final SparseIntArray f1776OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final int f1777OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final Parcel f1778OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final int f1779OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final String f1780OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int f1781OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public int f1782OooOO0O;

    public o000(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new OooO0O0(), new OooO0O0(), new OooO0O0());
    }

    @Override // Ooooo0o.o0000OO0
    public final void OooO(int i) {
        int i2 = this.f1775OooO;
        SparseIntArray sparseIntArray = this.f1776OooO0Oo;
        Parcel parcel = this.f1778OooO0o0;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.f1775OooO = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // Ooooo0o.o0000OO0
    public final o000 OooO00o() {
        Parcel parcel = this.f1778OooO0o0;
        int dataPosition = parcel.dataPosition();
        int i = this.f1781OooOO0;
        if (i == this.f1777OooO0o) {
            i = this.f1779OooO0oO;
        }
        int i2 = i;
        return new o000(parcel, dataPosition, i2, this.f1780OooO0oo + "  ", this.f1783OooO00o, this.f1784OooO0O0, this.f1785OooO0OO);
    }

    @Override // Ooooo0o.o0000OO0
    public final boolean OooO0o0(int i) {
        while (this.f1781OooOO0 < this.f1779OooO0oO) {
            int i2 = this.f1782OooOO0O;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f1781OooOO0;
            Parcel parcel = this.f1778OooO0o0;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f1782OooOO0O = parcel.readInt();
            this.f1781OooOO0 += readInt;
        }
        return this.f1782OooOO0O == i;
    }

    public o000(Parcel parcel, int i, int i2, String str, OooO0O0 oooO0O0, OooO0O0 oooO0O02, OooO0O0 oooO0O03) {
        super(oooO0O0, oooO0O02, oooO0O03);
        this.f1776OooO0Oo = new SparseIntArray();
        this.f1775OooO = -1;
        this.f1782OooOO0O = -1;
        this.f1778OooO0o0 = parcel;
        this.f1777OooO0o = i;
        this.f1779OooO0oO = i2;
        this.f1781OooOO0 = i;
        this.f1780OooO0oo = str;
    }
}