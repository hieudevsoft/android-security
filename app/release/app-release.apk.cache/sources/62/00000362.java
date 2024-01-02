package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o000O0 implements Transition.TransitionListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ Object f2897OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2898OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f2899OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2900OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2901OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ Object f2902OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final /* synthetic */ o000OO0O f2903OooO0oO;

    public o000O0(o000OO0O o000oo0o, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f2903OooO0oO = o000oo0o;
        this.f2897OooO00o = obj;
        this.f2898OooO0O0 = arrayList;
        this.f2899OooO0OO = obj2;
        this.f2900OooO0Oo = arrayList2;
        this.f2902OooO0o0 = obj3;
        this.f2901OooO0o = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        o000OO0O o000oo0o = this.f2903OooO0oO;
        Object obj = this.f2897OooO00o;
        if (obj != null) {
            o000oo0o.OooOo0O(obj, this.f2898OooO0O0, null);
        }
        Object obj2 = this.f2899OooO0OO;
        if (obj2 != null) {
            o000oo0o.OooOo0O(obj2, this.f2900OooO0Oo, null);
        }
        Object obj3 = this.f2902OooO0o0;
        if (obj3 != null) {
            o000oo0o.OooOo0O(obj3, this.f2901OooO0o, null);
        }
    }
}