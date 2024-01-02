package Oooooo0;

import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import Oooo0o0.o000oOoO;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o000 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final View f1864OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f1865OooO0O0;

    public o000(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f1865OooO0O0 = swipeDismissBehavior;
        this.f1864OooO00o = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o000oOoO o000oooo = this.f1865OooO0O0.f3246OooO00o;
        if (o000oooo != null && o000oooo.OooO0oO()) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            o00O0O0.OooOOO0(this.f1864OooO00o, this);
        }
    }
}