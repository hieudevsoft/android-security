package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o000O00O implements Transition.TransitionListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ View f2914OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2915OooO0O0;

    public o000O00O(View view, ArrayList arrayList) {
        this.f2914OooO00o = view;
        this.f2915OooO0O0 = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f2914OooO00o.setVisibility(8);
        ArrayList arrayList = this.f2915OooO0O0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}