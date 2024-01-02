package o000oOoO;

import OooOooo.o00O0O0O;
import OooOooo.o0o0Oo;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0OoOo0 extends o0000O0 implements o000 {

    /* renamed from: OooOoo  reason: collision with root package name */
    public static final int[] f5130OooOoo = {16842919};

    /* renamed from: OooOooO  reason: collision with root package name */
    public static final int[] f5131OooOooO = new int[0];

    /* renamed from: OooO  reason: collision with root package name */
    public final int f5132OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f5133OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f5134OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final StateListDrawable f5135OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Drawable f5136OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final int f5137OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f5138OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final StateListDrawable f5139OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final Drawable f5140OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final int f5141OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public int f5142OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f5143OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f5144OooOOO;
    public float OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public int f5145OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public float f5146OooOOOo;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public RecyclerView f5149OooOOoo;

    /* renamed from: OooOoO  reason: collision with root package name */
    public final ValueAnimator f5155OooOoO;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public int f5157OooOoOO;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public final OooOo f5158OooOoo0;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public int f5148OooOOo0 = 0;

    /* renamed from: OooOOo  reason: collision with root package name */
    public int f5147OooOOo = 0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public boolean f5152OooOo00 = false;

    /* renamed from: OooOo0  reason: collision with root package name */
    public boolean f5151OooOo0 = false;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public int f5153OooOo0O = 0;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public int f5154OooOo0o = 0;

    /* renamed from: OooOo  reason: collision with root package name */
    public final int[] f5150OooOo = new int[2];

    /* renamed from: OooOoO0  reason: collision with root package name */
    public final int[] f5156OooOoO0 = new int[2];

    public o0OoOo0(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5155OooOoO = ofFloat;
        this.f5157OooOoOO = 0;
        OooOo oooOo = new OooOo(0, this);
        this.f5158OooOoo0 = oooOo;
        Oooo000 oooo000 = new Oooo000(this);
        this.f5135OooO0OO = stateListDrawable;
        this.f5136OooO0Oo = drawable;
        this.f5139OooO0oO = stateListDrawable2;
        this.f5140OooO0oo = drawable2;
        this.f5138OooO0o0 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f5137OooO0o = Math.max(i, drawable.getIntrinsicWidth());
        this.f5132OooO = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f5141OooOO0 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f5133OooO00o = i2;
        this.f5134OooO0O0 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new Oooo0(this));
        ofFloat.addUpdateListener(new o000oOoO(this));
        RecyclerView recyclerView2 = this.f5149OooOOoo;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            o000OO o000oo = recyclerView2.f3154OooOO0o;
            if (o000oo != null) {
                o000oo.OooO0OO("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.OooOOO0;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.Oooo0o();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f5149OooOOoo;
            recyclerView3.f3155OooOOO.remove(this);
            if (recyclerView3.f3156OooOOOO == this) {
                recyclerView3.f3156OooOOOO = null;
            }
            ArrayList arrayList2 = this.f5149OooOOoo.f3193Ooooo00;
            if (arrayList2 != null) {
                arrayList2.remove(oooo000);
            }
            this.f5149OooOOoo.removeCallbacks(oooOo);
        }
        this.f5149OooOOoo = recyclerView;
        if (recyclerView != null) {
            recyclerView.OooO0oO(this);
            this.f5149OooOOoo.f3155OooOOO.add(this);
            this.f5149OooOOoo.OooO0oo(oooo000);
        }
    }

    @Override // o000oOoO.o0000O0
    public final void OooO0O0(Canvas canvas, RecyclerView recyclerView) {
        int i;
        if (this.f5148OooOOo0 == this.f5149OooOOoo.getWidth() && this.f5147OooOOo == this.f5149OooOOoo.getHeight()) {
            if (this.f5157OooOoOO != 0) {
                if (this.f5152OooOo00) {
                    int i2 = this.f5148OooOOo0;
                    int i3 = this.f5138OooO0o0;
                    int i4 = i2 - i3;
                    int i5 = this.f5143OooOO0o;
                    int i6 = this.f5142OooOO0O;
                    int i7 = i5 - (i6 / 2);
                    StateListDrawable stateListDrawable = this.f5135OooO0OO;
                    stateListDrawable.setBounds(0, 0, i3, i6);
                    int i8 = this.f5147OooOOo;
                    int i9 = this.f5137OooO0o;
                    Drawable drawable = this.f5136OooO0Oo;
                    drawable.setBounds(0, 0, i9, i8);
                    RecyclerView recyclerView2 = this.f5149OooOOoo;
                    WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                    boolean z = true;
                    if (o00O0O0O.OooO0Oo(recyclerView2) != 1) {
                        z = false;
                    }
                    if (z) {
                        drawable.draw(canvas);
                        canvas.translate(i3, i7);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        i = -i3;
                    } else {
                        canvas.translate(i4, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i7);
                        stateListDrawable.draw(canvas);
                        i = -i4;
                    }
                    canvas.translate(i, -i7);
                }
                if (this.f5151OooOo0) {
                    int i10 = this.f5147OooOOo;
                    int i11 = this.f5132OooO;
                    int i12 = i10 - i11;
                    int i13 = this.f5145OooOOOO;
                    int i14 = this.f5144OooOOO;
                    int i15 = i13 - (i14 / 2);
                    StateListDrawable stateListDrawable2 = this.f5139OooO0oO;
                    stateListDrawable2.setBounds(0, 0, i14, i11);
                    int i16 = this.f5148OooOOo0;
                    int i17 = this.f5141OooOO0;
                    Drawable drawable2 = this.f5140OooO0oo;
                    drawable2.setBounds(0, 0, i16, i17);
                    canvas.translate(0.0f, i12);
                    drawable2.draw(canvas);
                    canvas.translate(i15, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i15, -i12);
                    return;
                }
                return;
            }
            return;
        }
        this.f5148OooOOo0 = this.f5149OooOOoo.getWidth();
        this.f5147OooOOo = this.f5149OooOOoo.getHeight();
        OooO0o(0);
    }

    public final boolean OooO0OO(float f, float f2) {
        if (f2 >= this.f5147OooOOo - this.f5132OooO) {
            int i = this.f5145OooOOOO;
            int i2 = this.f5144OooOOO;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0Oo(float f, float f2) {
        boolean z;
        RecyclerView recyclerView = this.f5149OooOOoo;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        if (o00O0O0O.OooO0Oo(recyclerView) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = this.f5138OooO0o0;
        if (z) {
            if (f > i / 2) {
                return false;
            }
        } else if (f < this.f5148OooOOo0 - i) {
            return false;
        }
        int i2 = this.f5143OooOO0o;
        int i3 = this.f5142OooOO0O / 2;
        if (f2 < i2 - i3 || f2 > i3 + i2) {
            return false;
        }
        return true;
    }

    public final void OooO0o(int i) {
        int i2;
        StateListDrawable stateListDrawable = this.f5135OooO0OO;
        if (i == 2 && this.f5153OooOo0O != 2) {
            stateListDrawable.setState(f5130OooOoo);
            this.f5149OooOOoo.removeCallbacks(this.f5158OooOoo0);
        }
        if (i == 0) {
            this.f5149OooOOoo.invalidate();
        } else {
            OooO0oO();
        }
        if (this.f5153OooOo0O == 2 && i != 2) {
            stateListDrawable.setState(f5131OooOooO);
            i2 = 1200;
        } else {
            i2 = i == 1 ? 1500 : 1500;
            this.f5153OooOo0O = i;
        }
        OooO0o0(i2);
        this.f5153OooOo0O = i;
    }

    public final void OooO0o0(int i) {
        RecyclerView recyclerView = this.f5149OooOOoo;
        OooOo oooOo = this.f5158OooOoo0;
        recyclerView.removeCallbacks(oooOo);
        this.f5149OooOOoo.postDelayed(oooOo, i);
    }

    public final void OooO0oO() {
        int i = this.f5157OooOoOO;
        ValueAnimator valueAnimator = this.f5155OooOoO;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            valueAnimator.cancel();
        }
        this.f5157OooOoOO = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}