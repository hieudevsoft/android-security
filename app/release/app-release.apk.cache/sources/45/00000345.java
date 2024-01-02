package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class OooO0O0 implements Parcelable {
    public static final Parcelable.Creator<OooO0O0> CREATOR = new androidx.activity.result.OooO00o(3);

    /* renamed from: OooO  reason: collision with root package name */
    public final CharSequence f2757OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int[] f2758OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ArrayList f2759OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int[] f2760OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int[] f2761OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final String f2762OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f2763OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final int f2764OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final int f2765OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final int f2766OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final CharSequence f2767OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final ArrayList f2768OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final boolean f2769OooOOO;
    public final ArrayList OooOOO0;

    public OooO0O0(Parcel parcel) {
        this.f2758OooO00o = parcel.createIntArray();
        this.f2759OooO0O0 = parcel.createStringArrayList();
        this.f2760OooO0OO = parcel.createIntArray();
        this.f2761OooO0Oo = parcel.createIntArray();
        this.f2763OooO0o0 = parcel.readInt();
        this.f2762OooO0o = parcel.readString();
        this.f2764OooO0oO = parcel.readInt();
        this.f2765OooO0oo = parcel.readInt();
        this.f2757OooO = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2766OooOO0 = parcel.readInt();
        this.f2767OooOO0O = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2768OooOO0o = parcel.createStringArrayList();
        this.OooOOO0 = parcel.createStringArrayList();
        this.f2769OooOOO = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2758OooO00o);
        parcel.writeStringList(this.f2759OooO0O0);
        parcel.writeIntArray(this.f2760OooO0OO);
        parcel.writeIntArray(this.f2761OooO0Oo);
        parcel.writeInt(this.f2763OooO0o0);
        parcel.writeString(this.f2762OooO0o);
        parcel.writeInt(this.f2764OooO0oO);
        parcel.writeInt(this.f2765OooO0oo);
        TextUtils.writeToParcel(this.f2757OooO, parcel, 0);
        parcel.writeInt(this.f2766OooOO0);
        TextUtils.writeToParcel(this.f2767OooOO0O, parcel, 0);
        parcel.writeStringList(this.f2768OooOO0o);
        parcel.writeStringList(this.OooOOO0);
        parcel.writeInt(this.f2769OooOOO ? 1 : 0);
    }

    public OooO0O0(OooO00o oooO00o) {
        int size = oooO00o.f2741OooO00o.size();
        this.f2758OooO00o = new int[size * 5];
        if (!oooO00o.f2747OooO0oO) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2759OooO0O0 = new ArrayList(size);
        this.f2760OooO0OO = new int[size];
        this.f2761OooO0Oo = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            o000O000 o000o000 = (o000O000) oooO00o.f2741OooO00o.get(i);
            int i3 = i2 + 1;
            this.f2758OooO00o[i2] = o000o000.f2906OooO00o;
            ArrayList arrayList = this.f2759OooO0O0;
            o00Oo0 o00oo0 = o000o000.f2907OooO0O0;
            arrayList.add(o00oo0 != null ? o00oo0.f2956OooO0o0 : null);
            int[] iArr = this.f2758OooO00o;
            int i4 = i3 + 1;
            iArr[i3] = o000o000.f2908OooO0OO;
            int i5 = i4 + 1;
            iArr[i4] = o000o000.f2909OooO0Oo;
            int i6 = i5 + 1;
            iArr[i5] = o000o000.f2911OooO0o0;
            iArr[i6] = o000o000.f2910OooO0o;
            this.f2760OooO0OO[i] = o000o000.f2912OooO0oO.ordinal();
            this.f2761OooO0Oo[i] = o000o000.f2913OooO0oo.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.f2763OooO0o0 = oooO00o.f2745OooO0o;
        this.f2762OooO0o = oooO00o.f2748OooO0oo;
        this.f2764OooO0oO = oooO00o.f2755OooOOo;
        this.f2765OooO0oo = oooO00o.f2740OooO;
        this.f2757OooO = oooO00o.f2749OooOO0;
        this.f2766OooOO0 = oooO00o.f2750OooOO0O;
        this.f2767OooOO0O = oooO00o.f2751OooOO0o;
        this.f2768OooOO0o = oooO00o.OooOOO0;
        this.OooOOO0 = oooO00o.f2752OooOOO;
        this.f2769OooOOO = oooO00o.f2753OooOOOO;
    }
}