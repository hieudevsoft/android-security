package OooooOo;

import OooO0O0.OooO00o;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class oO00OOOo extends oO00OOo0 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f1835OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f1836OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f1837OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f1838OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public VelocityTracker f1839OooO0oO;

    public oO00OOOo() {
        this.f1836OooO0Oo = -1;
        this.f1837OooO0o = -1;
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooO0o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f1837OooO0o < 0) {
            this.f1837OooO0o = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f1835OooO0OO) {
            int i = this.f1836OooO0Oo;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f1838OooO0o0) > this.f1837OooO0o) {
                this.f1838OooO0o0 = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f1839OooO0oO;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f1836OooO0Oo = -1;
        motionEvent.getX();
        motionEvent.getY();
        OooO00o.OooO0oo(view);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    @Override // OooOOoo.o00Oo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOOo0(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getActionMasked()
            r1 = -1
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == r3) goto L41
            r5 = 2
            if (r0 == r5) goto L2d
            r7 = 3
            if (r0 == r7) goto L45
            r7 = 6
            if (r0 == r7) goto L14
            goto L52
        L14:
            int r7 = r8.getActionIndex()
            if (r7 != 0) goto L1b
            goto L1c
        L1b:
            r3 = r4
        L1c:
            int r7 = r8.getPointerId(r3)
            r6.f1836OooO0Oo = r7
            float r7 = r8.getY(r3)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r0
            int r7 = (int) r7
            r6.f1838OooO0o0 = r7
            goto L52
        L2d:
            int r0 = r6.f1836OooO0Oo
            int r0 = r8.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r4
        L36:
            float r8 = r8.getY(r0)
            int r8 = (int) r8
            r6.f1838OooO0o0 = r8
            OooO0O0.OooO00o.OooO0oO(r7)
            throw r2
        L41:
            android.view.VelocityTracker r0 = r6.f1839OooO0oO
            if (r0 != 0) goto L5c
        L45:
            r6.f1835OooO0OO = r4
            r6.f1836OooO0Oo = r1
            android.view.VelocityTracker r7 = r6.f1839OooO0oO
            if (r7 == 0) goto L52
            r7.recycle()
            r6.f1839OooO0oO = r2
        L52:
            android.view.VelocityTracker r7 = r6.f1839OooO0oO
            if (r7 == 0) goto L59
            r7.addMovement(r8)
        L59:
            boolean r7 = r6.f1835OooO0OO
            return r7
        L5c:
            r0.addMovement(r8)
            android.view.VelocityTracker r8 = r6.f1839OooO0oO
            r0 = 1000(0x3e8, float:1.401E-42)
            r8.computeCurrentVelocity(r0)
            android.view.VelocityTracker r8 = r6.f1839OooO0oO
            int r0 = r6.f1836OooO0Oo
            r8.getYVelocity(r0)
            OooO0O0.OooO00o.OooO0oO(r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: OooooOo.oO00OOOo.OooOOo0(android.view.View, android.view.MotionEvent):boolean");
    }

    public oO00OOOo(int i) {
        super(0);
        this.f1836OooO0Oo = -1;
        this.f1837OooO0o = -1;
    }
}