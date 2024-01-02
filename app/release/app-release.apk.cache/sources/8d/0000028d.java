package androidx.appcompat.widget;

import OoooOoo.oO00000;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class OooO0o extends AnimatorListenerAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2119OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f2120OooO0O0;

    public /* synthetic */ OooO0o(int i, Object obj) {
        this.f2119OooO00o = i;
        this.f2120OooO0O0 = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f2119OooO00o) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2120OooO0O0;
                actionBarOverlayLayout.f2066OooOo0o = null;
                actionBarOverlayLayout.f2054OooOO0O = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f2119OooO00o;
        Object obj = this.f2120OooO0O0;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f2066OooOo0o = null;
                actionBarOverlayLayout.f2054OooOO0O = false;
                return;
            case 1:
                ((oO00000) obj).OooOOO0();
                animator.removeListener(this);
                return;
            case 2:
                Ooooo00.OooOOOO oooOOOO = (Ooooo00.OooOOOO) obj;
                ArrayList arrayList = new ArrayList(oooOOOO.f1710OooO0o0);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((o0OoOo0.OooO00o) arrayList.get(i2)).f5439OooO0O0.f5454OooOOOO;
                    if (colorStateList != null) {
                        OooOoO0.o0OOO0o.OooO0oo(oooOOOO, colorStateList);
                    }
                }
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) obj).f3245OooO0oo = null;
                return;
            case 4:
            default:
                ((ExpandableTransformationBehavior) obj).getClass();
                return;
            case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                OooO0O0.OooO00o.OooO0oO(obj);
                throw null;
            case 6:
                o0OOO0o.OooOo00 oooOo00 = (o0OOO0o.OooOo00) obj;
                oooOo00.OooOOo0();
                oooOo00.f5349OooOOo.start();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f2119OooO00o;
        Object obj = this.f2120OooO0O0;
        switch (i) {
            case 2:
                Ooooo00.OooOOOO oooOOOO = (Ooooo00.OooOOOO) obj;
                ArrayList arrayList = new ArrayList(oooOOOO.f1710OooO0o0);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    o0OoOo0.OooO0OO oooO0OO = ((o0OoOo0.OooO00o) arrayList.get(i2)).f5439OooO0O0;
                    ColorStateList colorStateList = oooO0OO.f5454OooOOOO;
                    if (colorStateList != null) {
                        OooOoO0.o0OOO0o.OooO0oO(oooOOOO, colorStateList.getColorForState(oooO0OO.f5458OooOOoo, colorStateList.getDefaultColor()));
                    }
                }
                return;
            case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                OooO0O0.OooO00o.OooO0oO(obj);
                throw null;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}