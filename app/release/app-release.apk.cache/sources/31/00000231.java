package OooooOO;

import OooOO0.OooOOOO;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class oO00O0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOOO f1813OooO00o = new OooOOOO();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOOOO f1814OooO0O0 = new OooOOOO();

    public static oO00O0o OooO00o(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return OooO0O0(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return OooO0O0(arrayList);
            }
            return null;
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    public static oO00O0o OooO0O0(ArrayList arrayList) {
        oO00O0o oo00o0o = new oO00O0o();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                oo00o0o.f1814OooO0O0.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = oO00O0o0.f1817OooO0OO;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = oO00O0o0.f1818OooO0Oo;
                    }
                } else {
                    interpolator = oO00O0o0.f1816OooO0O0;
                }
                oOo00OO0 ooo00oo0 = new oOo00OO0(startDelay, duration, interpolator);
                ooo00oo0.f1822OooO0Oo = objectAnimator.getRepeatCount();
                ooo00oo0.f1823OooO0o0 = objectAnimator.getRepeatMode();
                oo00o0o.f1813OooO00o.put(propertyName, ooo00oo0);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return oo00o0o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oO00O0o) {
            return this.f1813OooO00o.equals(((oO00O0o) obj).f1813OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1813OooO00o.hashCode();
    }

    public final String toString() {
        return "\n" + oO00O0o.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f1813OooO00o + "}\n";
    }
}