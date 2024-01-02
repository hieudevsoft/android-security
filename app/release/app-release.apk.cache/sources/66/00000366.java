package androidx.fragment.app;

import OooOooo.o0o0Oo;
import OooOooo.oo0oOO0;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o000O0O0 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2916OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2917OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2918OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2919OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2920OooO0o0;

    public o000O0O0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f2916OooO00o = i;
        this.f2917OooO0O0 = arrayList;
        this.f2918OooO0OO = arrayList2;
        this.f2919OooO0Oo = arrayList3;
        this.f2920OooO0o0 = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f2916OooO00o; i++) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            oo0oOO0.OooOo0O((View) this.f2917OooO0O0.get(i), (String) this.f2918OooO0OO.get(i));
            oo0oOO0.OooOo0O((View) this.f2919OooO0Oo.get(i), (String) this.f2920OooO0o0.get(i));
        }
    }
}