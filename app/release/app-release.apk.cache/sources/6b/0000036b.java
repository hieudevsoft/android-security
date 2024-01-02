package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o000OO0O extends o000O {
    public static boolean OooOo0(Transition transition) {
        return (o000O.OooO0oo(transition.getTargetIds()) && o000O.OooO0oo(transition.getTargetNames()) && o000O.OooO0oo(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.o000O
    public final Object OooO(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.o000O
    public final void OooO00o(View view, Object obj) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.o000O
    public final void OooO0O0(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                OooO0O0(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (OooOo0(transition) || !o000O.OooO0oo(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.o000O
    public final void OooO0OO(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.o000O
    public final Object OooO0o(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.o000O
    public final boolean OooO0o0(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.o000O
    public final Object OooOO0(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.o000O
    public final void OooOO0o(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new o000O00O(view, arrayList));
    }

    @Override // androidx.fragment.app.o000O
    public final void OooOOO(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            o000O.OooO0oO(view, rect);
            ((Transition) obj).setEpicenterCallback(new o000O00(rect, 0));
        }
    }

    @Override // androidx.fragment.app.o000O
    public final void OooOOO0(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new o000O0(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.o000O
    public final void OooOOOO(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new o000O00(rect, 1));
        }
    }

    @Override // androidx.fragment.app.o000O
    public final void OooOOOo(Object obj, Runnable runnable) {
        ((Transition) obj).addListener(new o000O0Oo(runnable));
    }

    @Override // androidx.fragment.app.o000O
    public final void OooOOo(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o000O.OooO0Oo((View) arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        OooO0O0(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.o000O
    public final void OooOOoo(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            OooOo0O(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.o000O
    public final Object OooOo00(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void OooOo0O(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                OooOo0O(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!OooOo0(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget((View) arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }
}