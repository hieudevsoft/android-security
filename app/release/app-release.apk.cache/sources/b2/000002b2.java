package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o000O0Oo extends OooO0O0.OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2301OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ int f2302OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ WeakReference f2303OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ o00 f2304OooO0Oo;

    public o000O0Oo(o00 o00Var, int i, int i2, WeakReference weakReference) {
        this.f2304OooO0Oo = o00Var;
        this.f2301OooO00o = i;
        this.f2302OooO0O0 = i2;
        this.f2303OooO0OO = weakReference;
    }

    @Override // OooO0O0.OooO0O0
    public final void OooOO0O(int i) {
    }

    @Override // OooO0O0.OooO0O0
    public final void OooOO0o(Typeface typeface) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f2301OooO00o) != -1) {
            if ((this.f2302OooO0O0 & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = o000OOo0.OooO00o(typeface, i, z);
        }
        o00 o00Var = this.f2304OooO0Oo;
        if (o00Var.OooOOO0) {
            o00Var.f2255OooOO0o = typeface;
            TextView textView = (TextView) this.f2303OooO0OO.get();
            if (textView != null) {
                WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
                if (OooOooo.oo0o0O0.OooO0O0(textView)) {
                    textView.post(new o000OO0O(textView, typeface, o00Var.f2253OooOO0));
                } else {
                    textView.setTypeface(typeface, o00Var.f2253OooOO0);
                }
            }
        }
    }
}