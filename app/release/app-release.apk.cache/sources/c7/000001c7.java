package Oooo0o0;

import OooO0Oo.o0000OO0;
import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class OooOo extends o0000OO0 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ ooOO.o000oOoO f1461OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(ooOO.o000oOoO o000oooo) {
        super(14);
        this.f1461OooO0OO = o000oooo;
    }

    @Override // OooO0Oo.o0000OO0
    public final Oooo000.o000oOoO OooOOo0(int i) {
        return new Oooo000.o000oOoO(AccessibilityNodeInfo.obtain(this.f1461OooO0OO.OooOOO(i).f1437OooO00o));
    }

    @Override // OooO0Oo.o0000OO0
    public final Oooo000.o000oOoO OooOo(int i) {
        ooOO.o000oOoO o000oooo = this.f1461OooO0OO;
        int i2 = i == 2 ? o000oooo.f5647OooOO0O : o000oooo.f5648OooOO0o;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return OooOOo0(i2);
    }

    @Override // OooO0Oo.o0000OO0
    public final boolean OooOoO0(int i, int i2, Bundle bundle) {
        int i3;
        ooOO.o000oOoO o000oooo = this.f1461OooO0OO;
        View view = o000oooo.f5640OooO;
        if (i != -1) {
            boolean z = true;
            if (i2 != 1) {
                if (i2 != 2) {
                    boolean z2 = false;
                    if (i2 != 64) {
                        if (i2 != 128) {
                            if (i2 == 16) {
                                Chip chip = o000oooo.f5649OooOOO;
                                if (i == 0) {
                                    return chip.performClick();
                                }
                                if (i == 1) {
                                    chip.playSoundEffect(0);
                                    View.OnClickListener onClickListener = chip.f3343OooO0oo;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(chip);
                                        z2 = true;
                                    }
                                    if (chip.f3352OooOOoo) {
                                        chip.f3350OooOOo.OooOOo0(1, 1);
                                    }
                                }
                            }
                            return z2;
                        }
                        if (o000oooo.f5647OooOO0O == i) {
                            o000oooo.f5647OooOO0O = Integer.MIN_VALUE;
                            view.invalidate();
                            o000oooo.OooOOo0(i, 65536);
                        }
                        z = false;
                    } else {
                        AccessibilityManager accessibilityManager = o000oooo.f5645OooO0oo;
                        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = o000oooo.f5647OooOO0O) != i) {
                            if (i3 != Integer.MIN_VALUE) {
                                o000oooo.f5647OooOO0O = Integer.MIN_VALUE;
                                o000oooo.f5640OooO.invalidate();
                                o000oooo.OooOOo0(i3, 65536);
                            }
                            o000oooo.f5647OooOO0O = i;
                            view.invalidate();
                            o000oooo.OooOOo0(i, 32768);
                        }
                        z = false;
                    }
                    return z;
                }
                return o000oooo.OooOO0(i);
            }
            return o000oooo.OooOOOo(i);
        }
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        return o00O0O0.OooOO0(view, i2, bundle);
    }
}