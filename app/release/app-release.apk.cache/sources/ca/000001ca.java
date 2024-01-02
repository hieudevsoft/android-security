package Oooo0o0;

import OooOooo.o0o0Oo;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.activity.OooOOO;
import java.util.Arrays;
import java.util.WeakHashMap;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o000oOoO {

    /* renamed from: OooOo0O  reason: collision with root package name */
    public static final Oooo0 f1467OooOo0O = new Oooo0(0);

    /* renamed from: OooO  reason: collision with root package name */
    public int[] f1468OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f1469OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f1470OooO0O0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public float[] f1472OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public float[] f1473OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public float[] f1474OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public float[] f1475OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int[] f1476OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int[] f1477OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public int f1478OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public VelocityTracker f1479OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final float f1480OooOOO;
    public final float OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public final int f1481OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public final OverScroller f1482OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public View f1483OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final OooO00o f1484OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public boolean f1485OooOOoo;

    /* renamed from: OooOo00  reason: collision with root package name */
    public final ViewGroup f1487OooOo00;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f1471OooO0OO = -1;

    /* renamed from: OooOo0  reason: collision with root package name */
    public final OooOOO f1486OooOo0 = new OooOOO(5, this);

    public o000oOoO(Context context, ViewGroup viewGroup, OooO00o oooO00o) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (oooO00o == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1487OooOo00 = viewGroup;
        this.f1484OooOOo0 = oooO00o;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1481OooOOOO = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1470OooO0O0 = viewConfiguration.getScaledTouchSlop();
        this.OooOOO0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1480OooOOO = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1482OooOOOo = new OverScroller(context, f1467OooOo0O);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f1483OooOOo
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f1483OooOOo
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f1482OooOOOo
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.OooOOOO(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f1483OooOOo
            float r0 = r10.f1480OooOOO
            int r0 = (int) r0
            float r6 = r10.OooOOO0
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3c
            goto L43
        L3c:
            if (r7 <= r6) goto L44
            if (r14 <= 0) goto L42
            r14 = r6
            goto L44
        L42:
            int r11 = -r6
        L43:
            r14 = r11
        L44:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5d
            float r11 = (float) r6
            float r6 = (float) r8
            goto L5f
        L5d:
            float r11 = (float) r11
            float r6 = (float) r9
        L5f:
            float r11 = r11 / r6
            if (r14 == 0) goto L65
            float r0 = (float) r7
            float r6 = (float) r8
            goto L67
        L65:
            float r0 = (float) r0
            float r6 = (float) r9
        L67:
            float r0 = r0 / r6
            o0000O00.OooO00o r6 = r10.f1484OooOOo0
            int r12 = r6.o00000o0(r12)
            int r12 = r10.OooO0o(r4, r13, r12)
            int r13 = r6.o0000Ooo()
            int r13 = r10.OooO0o(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.OooOOOO(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo0o0.o000oOoO.OooO(int, int, int, int):boolean");
    }

    public final void OooO00o() {
        this.f1471OooO0OO = -1;
        float[] fArr = this.f1472OooO0Oo;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1474OooO0o0, 0.0f);
            Arrays.fill(this.f1473OooO0o, 0.0f);
            Arrays.fill(this.f1475OooO0oO, 0.0f);
            Arrays.fill(this.f1476OooO0oo, 0);
            Arrays.fill(this.f1468OooO, 0);
            Arrays.fill(this.f1477OooOO0, 0);
            this.f1478OooOO0O = 0;
        }
        VelocityTracker velocityTracker = this.f1479OooOO0o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1479OooOO0o = null;
        }
    }

    public final void OooO0O0(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f1487OooOo00;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f1483OooOOo = view;
        this.f1471OooO0OO = i;
        this.f1484OooOOo0.o000Oo0(view, i);
        OooOOOO(1);
    }

    public final boolean OooO0OO(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f1476OooO0oo[i] & i2) != i2 || (0 & i2) == 0 || (this.f1477OooOO0[i] & i2) == i2 || (this.f1468OooO[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f1470OooO0O0;
        if (abs > i3 || abs2 > i3) {
            if (abs < abs2 * 0.5f) {
                this.f1484OooOOo0.getClass();
            }
            return (this.f1468OooO[i] & i2) == 0 && abs > ((float) this.f1470OooO0O0);
        }
        return false;
    }

    public final boolean OooO0Oo(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        OooO00o oooO00o = this.f1484OooOOo0;
        boolean z = oooO00o.o00000o0(view) > 0;
        boolean z2 = oooO00o.o0000Ooo() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f1470OooO0O0) : z2 && Math.abs(f2) > ((float) this.f1470OooO0O0);
        }
        float f3 = f2 * f2;
        int i = this.f1470OooO0O0;
        return f3 + (f * f) > ((float) (i * i));
    }

    public final int OooO0o(int i, int i2, int i3) {
        int width;
        int abs;
        if (i == 0) {
            return 0;
        }
        float width2 = this.f1487OooOo00.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final void OooO0o0(int i) {
        float[] fArr = this.f1472OooO0Oo;
        if (fArr != null) {
            int i2 = this.f1478OooOO0O;
            boolean z = true;
            int i3 = 1 << i;
            if ((i3 & i2) == 0) {
                z = false;
            }
            if (z) {
                fArr[i] = 0.0f;
                this.f1474OooO0o0[i] = 0.0f;
                this.f1473OooO0o[i] = 0.0f;
                this.f1475OooO0oO[i] = 0.0f;
                this.f1476OooO0oo[i] = 0;
                this.f1468OooO[i] = 0;
                this.f1477OooOO0[i] = 0;
                this.f1478OooOO0O = (~i3) & i2;
            }
        }
    }

    public final boolean OooO0oO() {
        if (this.f1469OooO00o == 2) {
            OverScroller overScroller = this.f1482OooOOOo;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f1483OooOOo.getLeft();
            int top = currY - this.f1483OooOOo.getTop();
            if (left != 0) {
                View view = this.f1483OooOOo;
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f1483OooOOo;
                WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f1484OooOOo0.o000O00O(this.f1483OooOOo, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f1487OooOo00.post(this.f1486OooOo0);
            }
        }
        if (this.f1469OooO00o != 2) {
            return false;
        }
        return true;
    }

    public final View OooO0oo(int i, int i2) {
        ViewGroup viewGroup = this.f1487OooOo00;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f1484OooOOo0.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void OooOO0(MotionEvent motionEvent) {
        boolean z;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            OooO00o();
        }
        if (this.f1479OooOO0o == null) {
            this.f1479OooOO0o = VelocityTracker.obtain();
        }
        this.f1479OooOO0o.addMovement(motionEvent);
        OooO00o oooO00o = this.f1484OooOOo0;
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f1469OooO00o == 1 && pointerId == this.f1471OooO0OO) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i2 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i2);
                                            if (pointerId2 != this.f1471OooO0OO) {
                                                View OooO0oo2 = OooO0oo((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                                View view = this.f1483OooOOo;
                                                if (OooO0oo2 == view && OooOOo(view, pointerId2)) {
                                                    i = this.f1471OooO0OO;
                                                    break;
                                                }
                                            }
                                            i2++;
                                        } else {
                                            i = -1;
                                            break;
                                        }
                                    }
                                    if (i == -1) {
                                        OooOO0O();
                                    }
                                }
                                OooO0o0(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        OooOOO0(x, y, pointerId3);
                        if (this.f1469OooO00o == 0) {
                            OooOOo(OooO0oo((int) x, (int) y), pointerId3);
                            if ((this.f1476OooO0oo[pointerId3] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i3 = (int) x;
                            int i4 = (int) y;
                            View view2 = this.f1483OooOOo;
                            if (view2 != null && i3 >= view2.getLeft() && i3 < view2.getRight() && i4 >= view2.getTop() && i4 < view2.getBottom()) {
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                OooOOo(this.f1483OooOOo, pointerId3);
                                return;
                            }
                            return;
                        }
                    } else if (this.f1469OooO00o == 1) {
                        this.f1485OooOOoo = true;
                        oooO00o.o000O0(this.f1483OooOOo, 0.0f, 0.0f);
                        this.f1485OooOOoo = false;
                        if (this.f1469OooO00o == 1) {
                            OooOOOO(0);
                        }
                    }
                } else {
                    if (this.f1469OooO00o == 1) {
                        int i5 = this.f1471OooO0OO;
                        if ((this.f1478OooOO0O & (1 << i5)) != 0) {
                            i2 = 1;
                        }
                        if (i2 != 0) {
                            int findPointerIndex = motionEvent.findPointerIndex(i5);
                            float x2 = motionEvent.getX(findPointerIndex);
                            float y2 = motionEvent.getY(findPointerIndex);
                            float[] fArr = this.f1473OooO0o;
                            int i6 = this.f1471OooO0OO;
                            int i7 = (int) (x2 - fArr[i6]);
                            int i8 = (int) (y2 - this.f1475OooO0oO[i6]);
                            int left = this.f1483OooOOo.getLeft() + i7;
                            int top = this.f1483OooOOo.getTop() + i8;
                            int left2 = this.f1483OooOOo.getLeft();
                            int top2 = this.f1483OooOOo.getTop();
                            if (i7 != 0) {
                                left = oooO00o.Oooo000(this.f1483OooOOo, left);
                                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                                this.f1483OooOOo.offsetLeftAndRight(left - left2);
                            }
                            if (i8 != 0) {
                                top = oooO00o.Oooo00O(this.f1483OooOOo, top);
                                WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
                                this.f1483OooOOo.offsetTopAndBottom(top - top2);
                            }
                            if (i7 != 0 || i8 != 0) {
                                oooO00o.o000O00O(this.f1483OooOOo, left, top);
                            }
                        } else {
                            return;
                        }
                    } else {
                        int pointerCount2 = motionEvent.getPointerCount();
                        for (int i9 = 0; i9 < pointerCount2; i9++) {
                            int pointerId4 = motionEvent.getPointerId(i9);
                            if ((this.f1478OooOO0O & (1 << pointerId4)) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                float x3 = motionEvent.getX(i9);
                                float y3 = motionEvent.getY(i9);
                                float f = x3 - this.f1472OooO0Oo[pointerId4];
                                float f2 = y3 - this.f1474OooO0o0[pointerId4];
                                OooOO0o(f, f2, pointerId4);
                                if (this.f1469OooO00o == 1) {
                                    break;
                                }
                                View OooO0oo3 = OooO0oo((int) x3, (int) y3);
                                if (OooO0Oo(OooO0oo3, f, f2) && OooOOo(OooO0oo3, pointerId4)) {
                                    break;
                                }
                            }
                        }
                    }
                    OooOOO(motionEvent);
                    return;
                }
            } else if (this.f1469OooO00o == 1) {
                OooOO0O();
            }
            OooO00o();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View OooO0oo4 = OooO0oo((int) x4, (int) y4);
        OooOOO0(x4, y4, pointerId5);
        OooOOo(OooO0oo4, pointerId5);
        if ((this.f1476OooO0oo[pointerId5] & 0) == 0) {
            return;
        }
        oooO00o.getClass();
    }

    public final void OooOO0O() {
        VelocityTracker velocityTracker = this.f1479OooOO0o;
        float f = this.OooOOO0;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f1479OooOO0o.getXVelocity(this.f1471OooO0OO);
        float abs = Math.abs(xVelocity);
        float f2 = this.f1480OooOOO;
        float f3 = 0.0f;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            if (xVelocity > 0.0f) {
                xVelocity = f;
            } else {
                xVelocity = -f;
            }
        }
        float yVelocity = this.f1479OooOO0o.getYVelocity(this.f1471OooO0OO);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f2) {
            if (abs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f3 = f;
            } else {
                f3 = yVelocity;
            }
        }
        this.f1485OooOOoo = true;
        this.f1484OooOOo0.o000O0(this.f1483OooOOo, xVelocity, f3);
        this.f1485OooOOoo = false;
        if (this.f1469OooO00o == 1) {
            OooOOOO(0);
        }
    }

    public final void OooOO0o(float f, float f2, int i) {
        boolean OooO0OO2 = OooO0OO(f, f2, i, 1);
        if (OooO0OO(f2, f, i, 4)) {
            OooO0OO2 |= true;
        }
        if (OooO0OO(f, f2, i, 2)) {
            OooO0OO2 |= true;
        }
        if (OooO0OO(f2, f, i, 8)) {
            OooO0OO2 |= true;
        }
        if (OooO0OO2) {
            int[] iArr = this.f1468OooO;
            iArr[i] = iArr[i] | OooO0OO2;
            this.f1484OooOOo0.getClass();
        }
    }

    public final void OooOOO(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            boolean z = true;
            if ((this.f1478OooOO0O & (1 << pointerId)) == 0) {
                z = false;
            }
            if (z) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f1473OooO0o[pointerId] = x;
                this.f1475OooO0oO[pointerId] = y;
            }
        }
    }

    public final void OooOOO0(float f, float f2, int i) {
        float[] fArr = this.f1472OooO0Oo;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1474OooO0o0;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1473OooO0o;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1475OooO0oO;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1476OooO0oo;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1468OooO;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1477OooOO0;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1472OooO0Oo = fArr2;
            this.f1474OooO0o0 = fArr3;
            this.f1473OooO0o = fArr4;
            this.f1475OooO0oO = fArr5;
            this.f1476OooO0oo = iArr;
            this.f1468OooO = iArr2;
            this.f1477OooOO0 = iArr3;
        }
        float[] fArr9 = this.f1472OooO0Oo;
        this.f1473OooO0o[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f1474OooO0o0;
        this.f1475OooO0oO[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f1476OooO0oo;
        int i4 = (int) f;
        int i5 = (int) f2;
        ViewGroup viewGroup = this.f1487OooOo00;
        int left = viewGroup.getLeft();
        int i6 = this.f1481OooOOOO;
        if (i4 < left + i6) {
            i2 = 1;
        }
        if (i5 < viewGroup.getTop() + i6) {
            i2 |= 4;
        }
        if (i4 > viewGroup.getRight() - i6) {
            i2 |= 2;
        }
        if (i5 > viewGroup.getBottom() - i6) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f1478OooOO0O |= 1 << i;
    }

    public final void OooOOOO(int i) {
        this.f1487OooOo00.removeCallbacks(this.f1486OooOo0);
        if (this.f1469OooO00o != i) {
            this.f1469OooO00o = i;
            this.f1484OooOOo0.o000O00(i);
            if (this.f1469OooO00o == 0) {
                this.f1483OooOOo = null;
            }
        }
    }

    public final boolean OooOOOo(int i, int i2) {
        if (this.f1485OooOOoo) {
            return OooO(i, i2, (int) this.f1479OooOO0o.getXVelocity(this.f1471OooO0OO), (int) this.f1479OooOO0o.getYVelocity(this.f1471OooO0OO));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean OooOOo(View view, int i) {
        if (view == this.f1483OooOOo && this.f1471OooO0OO == i) {
            return true;
        }
        if (view == null || !this.f1484OooOOo0.o0O0ooO(view, i)) {
            return false;
        }
        this.f1471OooO0OO = i;
        OooO0O0(view, i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        if ((r18.f1476OooO0oo[r2] & 0) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d8, code lost:
        if (r13 != r12) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0122, code lost:
        if ((r18.f1476OooO0oo[r1] & 0) != 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOOo0(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo0o0.o000oOoO.OooOOo0(android.view.MotionEvent):boolean");
    }
}