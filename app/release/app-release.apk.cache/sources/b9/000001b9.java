package Oooo00o;

import OooO0Oo.o0000OO0;
import OooOooo.o000;
import OooOooo.o000O000;
import OooOooo.o000O0o;
import OooOooo.o0o0Oo;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Oooo000.OooO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ Object f1441OooO00o;

    public /* synthetic */ OooOO0(Object obj) {
        this.f1441OooO00o = obj;
    }

    public final boolean OooO00o(o0000OO0 o0000oo02, int i, Bundle bundle) {
        o000O000 o000o0o;
        View view = (View) this.f1441OooO00o;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((OooOOOO) o0000oo02.f183OooO0O0).OooO0O0();
                Parcelable parcelable = (Parcelable) ((OooOOOO) o0000oo02.f183OooO0O0).OooO0Oo();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
            }
        }
        ClipDescription OooO00o2 = ((OooOOOO) o0000oo02.f183OooO0O0).OooO00o();
        OooOOOO oooOOOO = (OooOOOO) o0000oo02.f183OooO0O0;
        ClipData clipData = new ClipData(OooO00o2, new ClipData.Item(oooOOOO.OooO0o0()));
        if (i2 >= 31) {
            o000o0o = new o000(clipData, 2);
        } else {
            o000o0o = new o000O0o(clipData, 2);
        }
        o000o0o.OooO0O0(oooOOOO.OooO0OO());
        o000o0o.OooO00o(bundle);
        if (o0o0Oo.OooO0oo(view, o000o0o.OooO0o0()) == null) {
            return true;
        }
        return false;
    }
}