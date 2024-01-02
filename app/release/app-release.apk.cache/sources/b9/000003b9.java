package androidx.recyclerview.widget;

import OooOO0.OooOOOO;
import OooOoOO.o0000Ooo;
import OooOoo.o0ooOOo;
import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import OooOooo.oo0oOO0;
import Oooo0o0.Oooo0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import hieubui.eup.android_app_security.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o000oOoO.OooO00o;
import o000oOoO.OooO0O0;
import o000oOoO.OooO0o;
import o000oOoO.o000;
import o000oOoO.o0000;
import o000oOoO.o00000;
import o000oOoO.o00000O;
import o000oOoO.o00000O0;
import o000oOoO.o0000O;
import o000oOoO.o0000O0;
import o000oOoO.o0000O00;
import o000oOoO.o0000OO0;
import o000oOoO.o0000oo;
import o000oOoO.o000O;
import o000oOoO.o000O0;
import o000oOoO.o000O00;
import o000oOoO.o000O000;
import o000oOoO.o000O00O;
import o000oOoO.o000O0O0;
import o000oOoO.o000O0o;
import o000oOoO.o000OO;
import o000oOoO.o000OO00;
import o000oOoO.o000OOo0;
import o000oOoO.o000Oo0;
import o000oOoO.o00O0000;
import o000oOoO.o00O00o0;
import o000oOoO.o00O0O;
import o000oOoO.o00Ooo;
import o000oOoO.oo00o;
import o000oOoO.oo0o0Oo;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: o00o0O  reason: collision with root package name */
    public static final int[] f3140o00o0O = {16843830};

    /* renamed from: o00ooo  reason: collision with root package name */
    public static final Class[] f3141o00ooo;

    /* renamed from: oo000o  reason: collision with root package name */
    public static final Oooo0 f3142oo000o;

    /* renamed from: OooO  reason: collision with root package name */
    public final Rect f3143OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0ooOOo f3144OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o000O00 f3145OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o000O0 f3146OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public OooO0O0 f3147OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final oo00o f3148OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public OooO0o f3149OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f3150OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final Rect f3151OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final RectF f3152OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public o00000O f3153OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public o000OO f3154OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final ArrayList f3155OooOOO;
    public final ArrayList OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public o000 f3156OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public boolean f3157OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public boolean f3158OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public boolean f3159OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public int f3160OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public final AccessibilityManager f3161OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public boolean f3162OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public boolean f3163OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public boolean f3164OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public int f3165OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public boolean f3166OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public boolean f3167OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public int f3168OooOoOO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public o0000 f3169OooOoo;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public int f3170OooOoo0;

    /* renamed from: OooOooO  reason: collision with root package name */
    public EdgeEffect f3171OooOooO;

    /* renamed from: OooOooo  reason: collision with root package name */
    public EdgeEffect f3172OooOooo;

    /* renamed from: Oooo  reason: collision with root package name */
    public int f3173Oooo;

    /* renamed from: Oooo0  reason: collision with root package name */
    public int f3174Oooo0;

    /* renamed from: Oooo000  reason: collision with root package name */
    public EdgeEffect f3175Oooo000;

    /* renamed from: Oooo00O  reason: collision with root package name */
    public EdgeEffect f3176Oooo00O;

    /* renamed from: Oooo00o  reason: collision with root package name */
    public o0000oo f3177Oooo00o;

    /* renamed from: Oooo0O0  reason: collision with root package name */
    public int f3178Oooo0O0;

    /* renamed from: Oooo0OO  reason: collision with root package name */
    public VelocityTracker f3179Oooo0OO;

    /* renamed from: Oooo0o  reason: collision with root package name */
    public int f3180Oooo0o;

    /* renamed from: Oooo0o0  reason: collision with root package name */
    public int f3181Oooo0o0;

    /* renamed from: Oooo0oO  reason: collision with root package name */
    public int f3182Oooo0oO;

    /* renamed from: Oooo0oo  reason: collision with root package name */
    public int f3183Oooo0oo;

    /* renamed from: OoooO  reason: collision with root package name */
    public final float f3184OoooO;

    /* renamed from: OoooO0  reason: collision with root package name */
    public final int f3185OoooO0;

    /* renamed from: OoooO00  reason: collision with root package name */
    public o0000OO0 f3186OoooO00;

    /* renamed from: OoooO0O  reason: collision with root package name */
    public final int f3187OoooO0O;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public final float f3188OoooOO0;

    /* renamed from: OoooOOO  reason: collision with root package name */
    public final o000OO00 f3189OoooOOO;

    /* renamed from: OoooOOo  reason: collision with root package name */
    public o00Ooo f3190OoooOOo;

    /* renamed from: OoooOo0  reason: collision with root package name */
    public final o00O0O f3191OoooOo0;
    public final o000O0O0 OoooOoO;

    /* renamed from: OoooOoo  reason: collision with root package name */
    public o000O000 f3192OoooOoo;

    /* renamed from: Ooooo00  reason: collision with root package name */
    public ArrayList f3193Ooooo00;

    /* renamed from: Ooooo0o  reason: collision with root package name */
    public boolean f3194Ooooo0o;

    /* renamed from: OooooO0  reason: collision with root package name */
    public boolean f3195OooooO0;

    /* renamed from: OooooOO  reason: collision with root package name */
    public final o00000O0 f3196OooooOO;

    /* renamed from: OooooOo  reason: collision with root package name */
    public boolean f3197OooooOo;

    /* renamed from: Oooooo  reason: collision with root package name */
    public final int[] f3198Oooooo;

    /* renamed from: Oooooo0  reason: collision with root package name */
    public o00O0000 f3199Oooooo0;

    /* renamed from: OoooooO  reason: collision with root package name */
    public OooOooo.o000OO00 f3200OoooooO;

    /* renamed from: Ooooooo  reason: collision with root package name */
    public final int[] f3201Ooooooo;

    /* renamed from: o000oOoO  reason: collision with root package name */
    public boolean f3202o000oOoO;

    /* renamed from: o00O0O  reason: collision with root package name */
    public final ArrayList f3203o00O0O;
    public final o00000 o00Oo0;

    /* renamed from: o00Ooo  reason: collision with root package name */
    public final o00000O0 f3204o00Ooo;

    /* renamed from: o0OoOo0  reason: collision with root package name */
    public final int[] f3205o0OoOo0;

    /* renamed from: ooOO  reason: collision with root package name */
    public final int[] f3206ooOO;

    static {
        Class cls = Integer.TYPE;
        f3141o00ooo = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f3142oo000o = new Oooo0(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public static void OooOO0(o000OOo0 o000ooo0) {
        WeakReference weakReference = o000ooo0.f5032OooO0O0;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                for (View view = (View) obj; view != null; view = null) {
                    if (view == o000ooo0.f5031OooO00o) {
                        return;
                    }
                    obj = view.getParent();
                    if (obj instanceof View) {
                        break;
                    }
                }
                o000ooo0.f5032OooO0O0 = null;
                return;
            }
        }
    }

    public static RecyclerView OooOooO(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView OooOooO2 = OooOooO(viewGroup.getChildAt(i));
                if (OooOooO2 != null) {
                    return OooOooO2;
                }
            }
            return null;
        }
        return null;
    }

    public static o000OOo0 Oooo0(View view) {
        if (view == null) {
            return null;
        }
        return ((o0000O) view.getLayoutParams()).f4954OooO00o;
    }

    private OooOooo.o000OO00 getScrollingChildHelper() {
        if (this.f3200OoooooO == null) {
            this.f3200OoooooO = new OooOooo.o000OO00(this);
        }
        return this.f3200OoooooO;
    }

    public final void OooO(String str) {
        if (Oooo0OO()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + OooOoO0());
        } else if (this.f3170OooOoo0 > 0) {
            new IllegalStateException("" + OooOoO0());
        }
    }

    public final void OooO0o(o000OOo0 o000ooo0) {
        boolean z;
        View view = o000ooo0.f5031OooO00o;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.f3145OooO0O0.OooOO0O(Oooo00o(view));
        if (o000ooo0.OooOO0O()) {
            this.f3149OooO0o0.OooO0O0(view, -1, view.getLayoutParams(), true);
            return;
        }
        OooO0o oooO0o = this.f3149OooO0o0;
        if (!z) {
            oooO0o.OooO00o(view, -1, true);
            return;
        }
        int indexOfChild = oooO0o.f4894OooO00o.f4953OooO00o.indexOfChild(view);
        if (indexOfChild >= 0) {
            oooO0o.f4895OooO0O0.OooO0oo(indexOfChild);
            oooO0o.OooO(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final void OooO0oO(o0000O0 o0000o02) {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null) {
            o000oo.OooO0OO("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.OooOOO0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(o0000o02);
        Oooo0o();
        requestLayout();
    }

    public final void OooO0oo(o000O000 o000o000) {
        if (this.f3193Ooooo00 == null) {
            this.f3193Ooooo00 = new ArrayList();
        }
        this.f3193Ooooo00.add(o000o000);
    }

    public final void OooOO0O() {
        int OooO0oo2 = this.f3149OooO0o0.OooO0oo();
        for (int i = 0; i < OooO0oo2; i++) {
            o000OOo0 Oooo02 = Oooo0(this.f3149OooO0o0.OooO0oO(i));
            if (!Oooo02.OooOOOO()) {
                Oooo02.f5034OooO0Oo = -1;
                Oooo02.f5037OooO0oO = -1;
            }
        }
        o000O00 o000o00 = this.f3145OooO0O0;
        ArrayList arrayList = o000o00.f4975OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o000OOo0 o000ooo0 = (o000OOo0) arrayList.get(i2);
            o000ooo0.f5034OooO0Oo = -1;
            o000ooo0.f5037OooO0oO = -1;
        }
        ArrayList arrayList2 = o000o00.f4973OooO00o;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            o000OOo0 o000ooo02 = (o000OOo0) arrayList2.get(i3);
            o000ooo02.f5034OooO0Oo = -1;
            o000ooo02.f5037OooO0oO = -1;
        }
        ArrayList arrayList3 = o000o00.f4974OooO0O0;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                o000OOo0 o000ooo03 = (o000OOo0) o000o00.f4974OooO0O0.get(i4);
                o000ooo03.f5034OooO0Oo = -1;
                o000ooo03.f5037OooO0oO = -1;
            }
        }
    }

    public final void OooOO0o(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f3171OooOooO;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.f3171OooOooO.onRelease();
            z = this.f3171OooOooO.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f3175Oooo000;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f3175Oooo000.onRelease();
            z |= this.f3175Oooo000.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3172OooOooo;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f3172OooOooo.onRelease();
            z |= this.f3172OooOooo.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3176Oooo00O;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f3176Oooo00O.onRelease();
            z |= this.f3176Oooo00O.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            o00O0O0.OooOO0O(this);
        }
    }

    public final void OooOOO(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        setMeasuredDimension(o000OO.OooO0oO(i, paddingRight, o00O0O0.OooO0o0(this)), o000OO.OooO0oO(i2, getPaddingBottom() + getPaddingTop(), o00O0O0.OooO0Oo(this)));
    }

    public final void OooOOO0() {
        if (this.f3158OooOOo && !this.f3167OooOoO0) {
            if (!this.f3147OooO0Oo.OooO0oO()) {
                return;
            }
            this.f3147OooO0Oo.getClass();
            if (this.f3147OooO0Oo.OooO0oO()) {
                int i = OooOoOO.o0000.f1201OooO00o;
                o0000Ooo.OooO00o("RV FullInvalidate");
                OooOOOO();
                o0000Ooo.OooO0O0();
                return;
            }
            return;
        }
        int i2 = OooOoOO.o0000.f1201OooO00o;
        o0000Ooo.OooO00o("RV FullInvalidate");
        OooOOOO();
        o0000Ooo.OooO0O0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0358, code lost:
        if (r17.f3149OooO0o0.OooOO0(getFocusedChild()) == false) goto L240;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOOO() {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OooOOOO():void");
    }

    public final void OooOOOo() {
        View view;
        o000OOo0 o000ooo0;
        int Oooo0002;
        View view2;
        int id;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        View OooOoOO2;
        o000O0O0 o000o0o0 = this.OoooOoO;
        o000o0o0.OooO00o(1);
        OooOoO(o000o0o0);
        o000o0o0.f4981OooO = false;
        Ooooo00();
        oo00o oo00oVar = this.f3148OooO0o;
        oo00oVar.OooO0Oo();
        Oooo0oo();
        OoooO0O();
        if (this.f3202o000oOoO && hasFocus() && this.f3153OooOO0O != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view == null || (OooOoOO2 = OooOoOO(view)) == null) {
            o000ooo0 = null;
        } else {
            o000ooo0 = Oooo00o(OooOoOO2);
        }
        long j = -1;
        if (o000ooo0 == null) {
            o000o0o0.OooOOO0 = -1L;
            o000o0o0.f4992OooOO0o = -1;
            o000o0o0.f4993OooOOO = -1;
        } else {
            if (this.f3153OooOO0O.f4952OooO0O0) {
                j = o000ooo0.f5036OooO0o0;
            }
            o000o0o0.OooOOO0 = j;
            if (!this.f3167OooOoO0) {
                if (o000ooo0.OooO()) {
                    Oooo0002 = o000ooo0.f5034OooO0Oo;
                } else {
                    RecyclerView recyclerView = o000ooo0.f5045OooOOo;
                    if (recyclerView != null) {
                        Oooo0002 = recyclerView.Oooo000(o000ooo0);
                    }
                }
                o000o0o0.f4992OooOO0o = Oooo0002;
                view2 = o000ooo0.f5031OooO00o;
                loop3: while (true) {
                    id = view2.getId();
                    while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                        view2 = ((ViewGroup) view2).getFocusedChild();
                        if (view2.getId() != -1) {
                            break;
                        }
                    }
                }
                o000o0o0.f4993OooOOO = id;
            }
            Oooo0002 = -1;
            o000o0o0.f4992OooOO0o = Oooo0002;
            view2 = o000ooo0.f5031OooO00o;
            loop3: while (true) {
                id = view2.getId();
                while (!view2.isFocused()) {
                    view2 = ((ViewGroup) view2).getFocusedChild();
                    if (view2.getId() != -1) {
                        break;
                    }
                }
            }
            o000o0o0.f4993OooOOO = id;
        }
        if (o000o0o0.f4990OooOO0 && this.f3195OooooO0) {
            z = true;
        } else {
            z = false;
        }
        o000o0o0.f4989OooO0oo = z;
        this.f3195OooooO0 = false;
        this.f3194Ooooo0o = false;
        o000o0o0.f4988OooO0oO = o000o0o0.f4991OooOO0O;
        o000o0o0.f4987OooO0o0 = this.f3153OooOO0O.OooO00o();
        OooOoo(this.f3198Oooooo);
        if (o000o0o0.f4990OooOO0) {
            int OooO0o02 = this.f3149OooO0o0.OooO0o0();
            for (int i = 0; i < OooO0o02; i++) {
                o000OOo0 Oooo02 = Oooo0(this.f3149OooO0o0.OooO0Oo(i));
                if (!Oooo02.OooOOOO() && (!Oooo02.OooO0oO() || this.f3153OooOO0O.f4952OooO0O0)) {
                    o0000oo o0000ooVar = this.f3177Oooo00o;
                    o0000oo.OooO0O0(Oooo02);
                    Oooo02.OooO0Oo();
                    o0000ooVar.getClass();
                    o0000O00 o0000o00 = new o0000O00();
                    o0000o00.OooO00o(Oooo02);
                    oo00oVar.OooO0OO(Oooo02, o0000o00);
                    if (o000o0o0.f4989OooO0oo) {
                        if ((Oooo02.f5039OooOO0 & 2) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4 && !Oooo02.OooO() && !Oooo02.OooOOOO() && !Oooo02.OooO0oO()) {
                            ((OooOO0.OooO0o) oo00oVar.f5173OooO0OO).OooO0o0(Oooo00O(Oooo02), Oooo02);
                        }
                    }
                }
            }
        }
        if (o000o0o0.f4991OooOO0O) {
            int OooO0oo2 = this.f3149OooO0o0.OooO0oo();
            for (int i2 = 0; i2 < OooO0oo2; i2++) {
                o000OOo0 Oooo03 = Oooo0(this.f3149OooO0o0.OooO0oO(i2));
                if (!Oooo03.OooOOOO() && Oooo03.f5034OooO0Oo == -1) {
                    Oooo03.f5034OooO0Oo = Oooo03.f5033OooO0OO;
                }
            }
            boolean z5 = o000o0o0.f4986OooO0o;
            o000o0o0.f4986OooO0o = false;
            this.f3154OooOO0o.OoooOoO(this.f3145OooO0O0, o000o0o0);
            o000o0o0.f4986OooO0o = z5;
            for (int i3 = 0; i3 < this.f3149OooO0o0.OooO0o0(); i3++) {
                o000OOo0 Oooo04 = Oooo0(this.f3149OooO0o0.OooO0Oo(i3));
                if (!Oooo04.OooOOOO()) {
                    o00O00o0 o00o00o0 = (o00O00o0) ((OooOOOO) oo00oVar.f5172OooO0O0).getOrDefault(Oooo04, null);
                    if (o00o00o0 != null && (o00o00o0.f5074OooO00o & 4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        o0000oo.OooO0O0(Oooo04);
                        if ((Oooo04.f5039OooOO0 & 8192) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        o0000oo o0000ooVar2 = this.f3177Oooo00o;
                        Oooo04.OooO0Oo();
                        o0000ooVar2.getClass();
                        o0000O00 o0000o002 = new o0000O00();
                        o0000o002.OooO00o(Oooo04);
                        if (z3) {
                            OoooOO0(Oooo04, o0000o002);
                        } else {
                            o00O00o0 o00o00o02 = (o00O00o0) ((OooOOOO) oo00oVar.f5172OooO0O0).getOrDefault(Oooo04, null);
                            if (o00o00o02 == null) {
                                o00o00o02 = o00O00o0.OooO00o();
                                ((OooOOOO) oo00oVar.f5172OooO0O0).put(Oooo04, o00o00o02);
                            }
                            o00o00o02.f5074OooO00o |= 2;
                            o00o00o02.f5075OooO0O0 = o0000o002;
                        }
                    }
                }
            }
        }
        OooOO0O();
        Oooo(true);
        Ooooo0o(false);
        o000o0o0.f4985OooO0Oo = 2;
    }

    public final boolean OooOOo(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().OooO0OO(i, i2, iArr, iArr2, i3);
    }

    public final void OooOOo0() {
        boolean z;
        Ooooo00();
        Oooo0oo();
        o000O0O0 o000o0o0 = this.OoooOoO;
        o000o0o0.OooO00o(6);
        this.f3147OooO0Oo.OooO0OO();
        o000o0o0.f4987OooO0o0 = this.f3153OooOO0O.OooO00o();
        o000o0o0.f4984OooO0OO = 0;
        o000o0o0.f4988OooO0oO = false;
        this.f3154OooOO0o.OoooOoO(this.f3145OooO0O0, o000o0o0);
        o000o0o0.f4986OooO0o = false;
        this.f3146OooO0OO = null;
        if (o000o0o0.f4990OooOO0 && this.f3177Oooo00o != null) {
            z = true;
        } else {
            z = false;
        }
        o000o0o0.f4990OooOO0 = z;
        o000o0o0.f4985OooO0Oo = 4;
        Oooo(true);
        Ooooo0o(false);
    }

    public final void OooOOoo(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().OooO0o0(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void OooOo() {
        int measuredWidth;
        int measuredHeight;
        if (this.f3172OooOooo != null) {
            return;
        }
        this.f3169OooOoo.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3172OooOooo = edgeEffect;
        if (this.f3150OooO0oO) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public final void OooOo0() {
        int measuredWidth;
        int measuredHeight;
        if (this.f3176Oooo00O != null) {
            return;
        }
        this.f3169OooOoo.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3176Oooo00O = edgeEffect;
        if (this.f3150OooO0oO) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public final void OooOo00(int i, int i2) {
        this.f3170OooOoo0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        o000O000 o000o000 = this.f3192OoooOoo;
        if (o000o000 != null) {
            o000o000.OooO0O0(this, i, i2);
        }
        ArrayList arrayList = this.f3193Ooooo00;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((o000O000) this.f3193Ooooo00.get(size)).OooO0O0(this, i, i2);
            }
        }
        this.f3170OooOoo0--;
    }

    public final void OooOo0O() {
        int measuredHeight;
        int measuredWidth;
        if (this.f3171OooOooO != null) {
            return;
        }
        this.f3169OooOoo.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3171OooOooO = edgeEffect;
        if (this.f3150OooO0oO) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void OooOo0o() {
        int measuredHeight;
        int measuredWidth;
        if (this.f3175Oooo000 != null) {
            return;
        }
        this.f3169OooOoo.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3175Oooo000 = edgeEffect;
        if (this.f3150OooO0oO) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void OooOoO(o000O0O0 o000o0o0) {
        if (getScrollState() != 2) {
            o000o0o0.getClass();
            return;
        }
        OverScroller overScroller = this.f3189OoooOOO.f5021OooO0OO;
        overScroller.getFinalX();
        overScroller.getCurrX();
        o000o0o0.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final String OooOoO0() {
        return " " + super.toString() + ", adapter:" + this.f3153OooOO0O + ", layout:" + this.f3154OooOO0o + ", context:" + getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View OooOoOO(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OooOoOO(android.view.View):android.view.View");
    }

    public final void OooOoo(int[] iArr) {
        int OooO0o02 = this.f3149OooO0o0.OooO0o0();
        if (OooO0o02 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < OooO0o02; i3++) {
            o000OOo0 Oooo02 = Oooo0(this.f3149OooO0o0.OooO0Oo(i3));
            if (!Oooo02.OooOOOO()) {
                int OooO0OO2 = Oooo02.OooO0OO();
                if (OooO0OO2 < i) {
                    i = OooO0OO2;
                }
                if (OooO0OO2 > i2) {
                    i2 = OooO0OO2;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r7 == 2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOoo0(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            java.util.ArrayList r1 = r12.f3155OooOOO
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L6c
            java.lang.Object r5 = r1.get(r4)
            o000oOoO.o000 r5 = (o000oOoO.o000) r5
            r6 = r5
            o000oOoO.o0OoOo0 r6 = (o000oOoO.o0OoOo0) r6
            int r7 = r6.f5153OooOo0O
            r8 = 1
            r9 = 2
            if (r7 != r8) goto L5c
            float r7 = r13.getX()
            float r10 = r13.getY()
            boolean r7 = r6.OooO0Oo(r7, r10)
            float r10 = r13.getX()
            float r11 = r13.getY()
            boolean r10 = r6.OooO0OO(r10, r11)
            int r11 = r13.getAction()
            if (r11 != 0) goto L60
            if (r7 != 0) goto L3f
            if (r10 == 0) goto L60
        L3f:
            if (r10 == 0) goto L4c
            r6.f5154OooOo0o = r8
            float r7 = r13.getX()
            int r7 = (int) r7
            float r7 = (float) r7
            r6.f5146OooOOOo = r7
            goto L58
        L4c:
            if (r7 == 0) goto L58
            r6.f5154OooOo0o = r9
            float r7 = r13.getY()
            int r7 = (int) r7
            float r7 = (float) r7
            r6.OooOOO0 = r7
        L58:
            r6.OooO0o(r9)
            goto L5e
        L5c:
            if (r7 != r9) goto L60
        L5e:
            r6 = r8
            goto L61
        L60:
            r6 = r3
        L61:
            if (r6 == 0) goto L69
            r6 = 3
            if (r0 == r6) goto L69
            r12.f3156OooOOOO = r5
            return r8
        L69:
            int r4 = r4 + 1
            goto Lc
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OooOoo0(android.view.MotionEvent):boolean");
    }

    public final o000OOo0 OooOooo(int i) {
        o000OOo0 o000ooo0 = null;
        if (this.f3167OooOoO0) {
            return null;
        }
        int OooO0oo2 = this.f3149OooO0o0.OooO0oo();
        for (int i2 = 0; i2 < OooO0oo2; i2++) {
            o000OOo0 Oooo02 = Oooo0(this.f3149OooO0o0.OooO0oO(i2));
            if (Oooo02 != null && !Oooo02.OooO() && Oooo000(Oooo02) == i) {
                if (!this.f3149OooO0o0.OooOO0(Oooo02.f5031OooO00o)) {
                    return Oooo02;
                }
                o000ooo0 = Oooo02;
            }
        }
        return o000ooo0;
    }

    public final void Oooo(boolean z) {
        int i;
        boolean z2 = true;
        int i2 = this.f3168OooOoOO - 1;
        this.f3168OooOoOO = i2;
        if (i2 < 1) {
            this.f3168OooOoOO = 0;
            if (z) {
                int i3 = this.f3165OooOo0o;
                this.f3165OooOo0o = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f3161OooOo;
                    if ((accessibilityManager == null || !accessibilityManager.isEnabled()) ? false : false) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        Oooo000.OooO0O0.OooO0O0(obtain, i3);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.f3203o00O0O;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    o000OOo0 o000ooo0 = (o000OOo0) arrayList.get(size);
                    if (o000ooo0.f5031OooO00o.getParent() == this && !o000ooo0.OooOOOO() && (i = o000ooo0.f5046OooOOo0) != -1) {
                        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                        o00O0O0.OooOOoo(o000ooo0.f5031OooO00o, i);
                        o000ooo0.f5046OooOOo0 = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final int Oooo000(o000OOo0 o000ooo0) {
        boolean z;
        if ((o000ooo0.f5039OooOO0 & 524) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && o000ooo0.OooO0o()) {
            OooO0O0 oooO0O0 = this.f3147OooO0Oo;
            int i = o000ooo0.f5033OooO0OO;
            ArrayList arrayList = oooO0O0.f4888OooO0O0;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooO00o oooO00o = (OooO00o) arrayList.get(i2);
                int i3 = oooO00o.f4883OooO00o;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 8) {
                            int i4 = oooO00o.f4884OooO0O0;
                            if (i4 == i) {
                                i = oooO00o.f4886OooO0Oo;
                            } else {
                                if (i4 < i) {
                                    i--;
                                }
                                if (oooO00o.f4886OooO0Oo <= i) {
                                    i++;
                                }
                            }
                        }
                    } else {
                        int i5 = oooO00o.f4884OooO0O0;
                        if (i5 <= i) {
                            int i6 = oooO00o.f4886OooO0Oo;
                            if (i5 + i6 <= i) {
                                i -= i6;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (oooO00o.f4884OooO0O0 <= i) {
                    i += oooO00o.f4886OooO0Oo;
                }
            }
            return i;
        }
        return -1;
    }

    public final long Oooo00O(o000OOo0 o000ooo0) {
        if (this.f3153OooOO0O.f4952OooO0O0) {
            return o000ooo0.f5036OooO0o0;
        }
        return o000ooo0.f5033OooO0OO;
    }

    public final o000OOo0 Oooo00o(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return Oooo0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect Oooo0O0(View view) {
        o0000O o0000o2 = (o0000O) view.getLayoutParams();
        boolean z = o0000o2.f4956OooO0OO;
        Rect rect = o0000o2.f4955OooO0O0;
        if (!z) {
            return rect;
        }
        if (this.OoooOoO.f4988OooO0oO && (o0000o2.OooO0O0() || o0000o2.f4954OooO00o.OooO0oO())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.OooOOO0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f3151OooO0oo;
            rect2.set(0, 0, 0, 0);
            ((o0000O0) arrayList.get(i)).getClass();
            ((o0000O) view.getLayoutParams()).OooO00o();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        o0000o2.f4956OooO0OO = false;
        return rect;
    }

    public final boolean Oooo0OO() {
        return this.f3168OooOoOO > 0;
    }

    public final void Oooo0o() {
        int OooO0oo2 = this.f3149OooO0o0.OooO0oo();
        for (int i = 0; i < OooO0oo2; i++) {
            ((o0000O) this.f3149OooO0o0.OooO0oO(i).getLayoutParams()).f4956OooO0OO = true;
        }
        ArrayList arrayList = this.f3145OooO0O0.f4975OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o0000O o0000o2 = (o0000O) ((o000OOo0) arrayList.get(i2)).f5031OooO00o.getLayoutParams();
            if (o0000o2 != null) {
                o0000o2.f4956OooO0OO = true;
            }
        }
    }

    public final void Oooo0o0(int i) {
        if (this.f3154OooOO0o == null) {
            return;
        }
        setScrollState(2);
        this.f3154OooOO0o.ooOO(i);
        awakenScrollBars();
    }

    public final void Oooo0oO(int i, int i2, boolean z) {
        int i3 = i + i2;
        int OooO0oo2 = this.f3149OooO0o0.OooO0oo();
        for (int i4 = 0; i4 < OooO0oo2; i4++) {
            o000OOo0 Oooo02 = Oooo0(this.f3149OooO0o0.OooO0oO(i4));
            if (Oooo02 != null && !Oooo02.OooOOOO()) {
                int i5 = Oooo02.f5033OooO0OO;
                if (i5 >= i3) {
                    Oooo02.OooOO0o(-i2, z);
                } else if (i5 >= i) {
                    Oooo02.OooO0O0(8);
                    Oooo02.OooOO0o(-i2, z);
                    Oooo02.f5033OooO0OO = i - 1;
                }
                this.OoooOoO.f4986OooO0o = true;
            }
        }
        o000O00 o000o00 = this.f3145OooO0O0;
        ArrayList arrayList = o000o00.f4975OooO0OO;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                o000OOo0 o000ooo0 = (o000OOo0) arrayList.get(size);
                if (o000ooo0 != null) {
                    int i6 = o000ooo0.f5033OooO0OO;
                    if (i6 >= i3) {
                        o000ooo0.OooOO0o(-i2, z);
                    } else if (i6 >= i) {
                        o000ooo0.OooO0O0(8);
                        o000o00.OooO0o(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void Oooo0oo() {
        this.f3168OooOoOO++;
    }

    public final void OoooO(boolean z) {
        this.f3166OooOoO = z | this.f3166OooOoO;
        this.f3167OooOoO0 = true;
        int OooO0oo2 = this.f3149OooO0o0.OooO0oo();
        for (int i = 0; i < OooO0oo2; i++) {
            o000OOo0 Oooo02 = Oooo0(this.f3149OooO0o0.OooO0oO(i));
            if (Oooo02 != null && !Oooo02.OooOOOO()) {
                Oooo02.OooO0O0(6);
            }
        }
        Oooo0o();
        o000O00 o000o00 = this.f3145OooO0O0;
        ArrayList arrayList = o000o00.f4975OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o000OOo0 o000ooo0 = (o000OOo0) arrayList.get(i2);
            if (o000ooo0 != null) {
                o000ooo0.OooO0O0(6);
                o000ooo0.OooO00o(null);
            }
        }
        o00000O o00000o = o000o00.f4980OooO0oo.f3153OooOO0O;
        if (o00000o == null || !o00000o.f4952OooO0O0) {
            o000o00.OooO0o0();
        }
    }

    public final void OoooO0() {
        if (!this.f3197OooooOo && this.f3157OooOOOo) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            o00O0O0.OooOOO0(this, this.o00Oo0);
            this.f3197OooooOo = true;
        }
    }

    public final void OoooO00(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3178Oooo0O0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3178Oooo0O0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f3182Oooo0oO = x;
            this.f3181Oooo0o0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f3183Oooo0oo = y;
            this.f3180Oooo0o = y;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007d, code lost:
        if (r0 != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OoooO0O() {
        /*
            r5 = this;
            boolean r0 = r5.f3167OooOoO0
            if (r0 == 0) goto L19
            o000oOoO.OooO0O0 r0 = r5.f3147OooO0Oo
            java.util.ArrayList r1 = r0.f4888OooO0O0
            r0.OooOO0o(r1)
            java.util.ArrayList r1 = r0.f4889OooO0OO
            r0.OooOO0o(r1)
            boolean r0 = r5.f3166OooOoO
            if (r0 == 0) goto L19
            o000oOoO.o000OO r0 = r5.f3154OooOO0o
            r0.o000oOoO()
        L19:
            o000oOoO.o0000oo r0 = r5.f3177Oooo00o
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L29
            o000oOoO.o000OO r0 = r5.f3154OooOO0o
            boolean r0 = r0.o0OOO0o()
            if (r0 == 0) goto L29
            r0 = r1
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 == 0) goto L32
            o000oOoO.OooO0O0 r0 = r5.f3147OooO0Oo
            r0.OooOO0()
            goto L37
        L32:
            o000oOoO.OooO0O0 r0 = r5.f3147OooO0Oo
            r0.OooO0OO()
        L37:
            boolean r0 = r5.f3194Ooooo0o
            if (r0 != 0) goto L42
            boolean r0 = r5.f3195OooooO0
            if (r0 == 0) goto L40
            goto L42
        L40:
            r0 = r2
            goto L43
        L42:
            r0 = r1
        L43:
            boolean r3 = r5.f3158OooOOo
            if (r3 == 0) goto L61
            o000oOoO.o0000oo r3 = r5.f3177Oooo00o
            if (r3 == 0) goto L61
            boolean r3 = r5.f3167OooOoO0
            if (r3 != 0) goto L57
            if (r0 != 0) goto L57
            o000oOoO.o000OO r4 = r5.f3154OooOO0o
            boolean r4 = r4.f5010OooO0o
            if (r4 == 0) goto L61
        L57:
            if (r3 == 0) goto L5f
            o000oOoO.o00000O r3 = r5.f3153OooOO0O
            boolean r3 = r3.f4952OooO0O0
            if (r3 == 0) goto L61
        L5f:
            r3 = r1
            goto L62
        L61:
            r3 = r2
        L62:
            o000oOoO.o000O0O0 r4 = r5.OoooOoO
            r4.f4990OooOO0 = r3
            if (r3 == 0) goto L80
            if (r0 == 0) goto L80
            boolean r0 = r5.f3167OooOoO0
            if (r0 != 0) goto L80
            o000oOoO.o0000oo r0 = r5.f3177Oooo00o
            if (r0 == 0) goto L7c
            o000oOoO.o000OO r0 = r5.f3154OooOO0o
            boolean r0 = r0.o0OOO0o()
            if (r0 == 0) goto L7c
            r0 = r1
            goto L7d
        L7c:
            r0 = r2
        L7d:
            if (r0 == 0) goto L80
            goto L81
        L80:
            r1 = r2
        L81:
            r4.f4991OooOO0O = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OoooO0O():void");
    }

    public final void OoooOO0(o000OOo0 o000ooo0, o0000O00 o0000o00) {
        boolean z = false;
        int i = (o000ooo0.f5039OooOO0 & (-8193)) | 0;
        o000ooo0.f5039OooOO0 = i;
        boolean z2 = this.OoooOoO.f4989OooO0oo;
        oo00o oo00oVar = this.f3148OooO0o;
        if (z2) {
            if ((i & 2) != 0) {
                z = true;
            }
            if (z && !o000ooo0.OooO() && !o000ooo0.OooOOOO()) {
                ((OooOO0.OooO0o) oo00oVar.f5173OooO0OO).OooO0o0(Oooo00O(o000ooo0), o000ooo0);
            }
        }
        oo00oVar.OooO0OO(o000ooo0, o0000o00);
    }

    public final void OoooOOO() {
        VelocityTracker velocityTracker = this.f3179Oooo0OO;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        OooooO0(0);
        EdgeEffect edgeEffect = this.f3171OooOooO;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f3171OooOooO.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3172OooOooo;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f3172OooOooo.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3175Oooo000;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f3175Oooo000.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3176Oooo00O;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f3176Oooo00O.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            o00O0O0.OooOO0O(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OoooOOo(int r19, int r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OoooOOo(int, int, android.view.MotionEvent):boolean");
    }

    public final void OoooOo0(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        o000OOo0 o000ooo0;
        Ooooo00();
        Oooo0oo();
        int i5 = OooOoOO.o0000.f1201OooO00o;
        o0000Ooo.OooO00o("RV Scroll");
        o000O0O0 o000o0o0 = this.OoooOoO;
        OooOoO(o000o0o0);
        o000O00 o000o00 = this.f3145OooO0O0;
        if (i != 0) {
            i3 = this.f3154OooOO0o.o0OoOo0(i, o000o00, o000o0o0);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.f3154OooOO0o.o00O0O(i2, o000o00, o000o0o0);
        } else {
            i4 = 0;
        }
        o0000Ooo.OooO0O0();
        int OooO0o02 = this.f3149OooO0o0.OooO0o0();
        for (int i6 = 0; i6 < OooO0o02; i6++) {
            View OooO0Oo2 = this.f3149OooO0o0.OooO0Oo(i6);
            o000OOo0 Oooo00o2 = Oooo00o(OooO0Oo2);
            if (Oooo00o2 != null && (o000ooo0 = Oooo00o2.f5030OooO) != null) {
                int left = OooO0Oo2.getLeft();
                int top = OooO0Oo2.getTop();
                View view = o000ooo0.f5031OooO00o;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Oooo(true);
        Ooooo0o(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public final void OoooOoO(int i) {
        oo0o0Oo oo0o0oo;
        if (this.f3162OooOo0) {
            return;
        }
        setScrollState(0);
        o000OO00 o000oo00 = this.f3189OoooOOO;
        o000oo00.f5025OooO0oO.removeCallbacks(o000oo00);
        o000oo00.f5021OooO0OO.abortAnimation();
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null && (oo0o0oo = o000oo.f5011OooO0o0) != null) {
            oo0o0oo.OooO();
        }
        o000OO o000oo2 = this.f3154OooOO0o;
        if (o000oo2 == null) {
            return;
        }
        o000oo2.ooOO(i);
        awakenScrollBars();
    }

    public final void OoooOoo(int i, int i2, boolean z) {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo == null || this.f3162OooOo0) {
            return;
        }
        int i3 = 0;
        if (!o000oo.OooO0Oo()) {
            i = 0;
        }
        if (!this.f3154OooOO0o.OooO0o0()) {
            i2 = 0;
        }
        if (i != 0 || i2 != 0) {
            if (z) {
                if (i != 0) {
                    i3 = 1;
                }
                if (i2 != 0) {
                    i3 |= 2;
                }
                getScrollingChildHelper().OooO0oO(i3, 1);
            }
            this.f3189OoooOOO.OooO0O0(i, i2, Integer.MIN_VALUE, null);
        }
    }

    public final void Ooooo00() {
        int i = this.f3160OooOOoo + 1;
        this.f3160OooOOoo = i;
        if (i != 1 || this.f3162OooOo0) {
            return;
        }
        this.f3163OooOo00 = false;
    }

    public final void Ooooo0o(boolean z) {
        if (this.f3160OooOOoo < 1) {
            this.f3160OooOOoo = 1;
        }
        if (!z && !this.f3162OooOo0) {
            this.f3163OooOo00 = false;
        }
        if (this.f3160OooOOoo == 1) {
            if (z && this.f3163OooOo00 && !this.f3162OooOo0 && this.f3154OooOO0o != null && this.f3153OooOO0O != null) {
                OooOOOO();
            }
            if (!this.f3162OooOo0) {
                this.f3163OooOo00 = false;
            }
        }
        this.f3160OooOOoo--;
    }

    public final void OooooO0(int i) {
        getScrollingChildHelper().OooO0oo(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null) {
            o000oo.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o0000O) && this.f3154OooOO0o.OooO0o((o0000O) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null && o000oo.OooO0Oo()) {
            return this.f3154OooOO0o.OooOO0(this.OoooOoO);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null && o000oo.OooO0Oo()) {
            return this.f3154OooOO0o.OooOO0O(this.OoooOoO);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null && o000oo.OooO0Oo()) {
            return this.f3154OooOO0o.OooOO0o(this.OoooOoO);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null && o000oo.OooO0o0()) {
            return this.f3154OooOO0o.OooOOO0(this.OoooOoO);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null && o000oo.OooO0o0()) {
            return this.f3154OooOO0o.OooOOO(this.OoooOoO);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null && o000oo.OooO0o0()) {
            return this.f3154OooOO0o.OooOOOO(this.OoooOoO);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().OooO00o(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().OooO0O0(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().OooO0OO(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().OooO0o0(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        ArrayList arrayList = this.OooOOO0;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((o0000O0) arrayList.get(i3)).OooO0O0(canvas, this);
        }
        EdgeEffect edgeEffect = this.f3171OooOooO;
        boolean z5 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f3150OooO0oO) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, 0.0f);
            EdgeEffect edgeEffect2 = this.f3171OooOooO;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.f3172OooOooo;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3150OooO0oO) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3172OooOooo;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3175Oooo000;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f3150OooO0oO) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(-i, -width);
            EdgeEffect edgeEffect6 = this.f3175Oooo000;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3176Oooo00O;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3150OooO0oO) {
                f = getPaddingRight() + (-getWidth());
                f2 = getPaddingBottom() + (-getHeight());
            } else {
                f = -getWidth();
                f2 = -getHeight();
            }
            canvas.translate(f, f2);
            EdgeEffect edgeEffect8 = this.f3176Oooo00O;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || this.f3177Oooo00o == null || arrayList.size() <= 0 || !this.f3177Oooo00o.OooO0o()) {
            z5 = z;
        }
        if (z5) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            o00O0O0.OooOO0O(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0158, code lost:
        if (r4 > 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0176, code lost:
        if (r3 > 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0179, code lost:
        if (r4 < 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x017c, code lost:
        if (r3 < 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0184, code lost:
        if ((r3 * r2) < 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x018c, code lost:
        if ((r3 * r2) > 0) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null) {
            return o000oo.OooOOo();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + OooOoO0());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null) {
            return o000oo.OooOOoo(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + OooOoO0());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public o00000O getAdapter() {
        return this.f3153OooOO0O;
    }

    @Override // android.view.View
    public int getBaseline() {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null) {
            o000oo.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f3150OooO0oO;
    }

    public o00O0000 getCompatAccessibilityDelegate() {
        return this.f3199Oooooo0;
    }

    public o0000 getEdgeEffectFactory() {
        return this.f3169OooOoo;
    }

    public o0000oo getItemAnimator() {
        return this.f3177Oooo00o;
    }

    public int getItemDecorationCount() {
        return this.OooOOO0.size();
    }

    public o000OO getLayoutManager() {
        return this.f3154OooOO0o;
    }

    public int getMaxFlingVelocity() {
        return this.f3187OoooO0O;
    }

    public int getMinFlingVelocity() {
        return this.f3185OoooO0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public o0000OO0 getOnFlingListener() {
        return this.f3186OoooO00;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3202o000oOoO;
    }

    public o000Oo0 getRecycledViewPool() {
        return this.f3145OooO0O0.OooO0OO();
    }

    public int getScrollState() {
        return this.f3174Oooo0;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (getScrollingChildHelper().OooO0o(0) == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f3157OooOOOo;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f3162OooOo0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f1285OooO0Oo;
    }

    public final void o000oOoO(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f3151OooO0oo;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o0000O) {
            o0000O o0000o2 = (o0000O) layoutParams;
            if (!o0000o2.f4956OooO0OO) {
                int i = rect.left;
                Rect rect2 = o0000o2.f4955OooO0O0;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f3154OooOO0o.OoooooO(this, view, this.f3151OooO0oo, !this.f3158OooOOo, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r1 >= 30.0f) goto L16;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f3168OooOoOO = r0
            r1 = 1
            r5.f3157OooOOOo = r1
            boolean r2 = r5.f3158OooOOo
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f3158OooOOo = r2
            o000oOoO.o000OO r2 = r5.f3154OooOO0o
            if (r2 == 0) goto L21
            r2.f5012OooO0oO = r1
            r2.Oooo0oo(r5)
        L21:
            r5.f3197OooooOo = r0
            java.lang.ThreadLocal r0 = o000oOoO.o00Ooo.f5087OooO0o0
            java.lang.Object r1 = r0.get()
            o000oOoO.o00Ooo r1 = (o000oOoO.o00Ooo) r1
            r5.f3190OoooOOo = r1
            if (r1 != 0) goto L5d
            o000oOoO.o00Ooo r1 = new o000oOoO.o00Ooo
            r1.<init>()
            r5.f3190OoooOOo = r1
            java.util.WeakHashMap r1 = OooOooo.o0o0Oo.f1363OooO00o
            android.view.Display r1 = OooOooo.o00O0O0O.OooO0O0(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4f
            if (r1 == 0) goto L4f
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4f
            goto L51
        L4f:
            r1 = 1114636288(0x42700000, float:60.0)
        L51:
            o000oOoO.o00Ooo r2 = r5.f3190OoooOOo
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f5090OooO0OO = r3
            r0.set(r2)
        L5d:
            o000oOoO.o00Ooo r0 = r5.f3190OoooOOo
            java.util.ArrayList r0 = r0.f5088OooO00o
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        oo0o0Oo oo0o0oo;
        super.onDetachedFromWindow();
        o0000oo o0000ooVar = this.f3177Oooo00o;
        if (o0000ooVar != null) {
            o0000ooVar.OooO0o0();
        }
        setScrollState(0);
        o000OO00 o000oo00 = this.f3189OoooOOO;
        o000oo00.f5025OooO0oO.removeCallbacks(o000oo00);
        o000oo00.f5021OooO0OO.abortAnimation();
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null && (oo0o0oo = o000oo.f5011OooO0o0) != null) {
            oo0o0oo.OooO();
        }
        this.f3157OooOOOo = false;
        o000OO o000oo2 = this.f3154OooOO0o;
        if (o000oo2 != null) {
            o000oo2.f5012OooO0oO = false;
            o000oo2.Oooo(this);
        }
        this.f3203o00O0O.clear();
        removeCallbacks(this.o00Oo0);
        this.f3148OooO0o.getClass();
        do {
        } while (o00O00o0.f5073OooO0Oo.OooO00o() != null);
        o00Ooo o00ooo2 = this.f3190OoooOOo;
        if (o00ooo2 != null) {
            o00ooo2.f5088OooO00o.remove(this);
            this.f3190OoooOOo = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.OooOOO0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o0000O0) arrayList.get(i)).OooO00o(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            o000oOoO.o000OO r0 = r5.f3154OooOO0o
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f3162OooOo0
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            o000oOoO.o000OO r0 = r5.f3154OooOO0o
            boolean r0 = r0.OooO0o0()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            o000oOoO.o000OO r3 = r5.f3154OooOO0o
            boolean r3 = r3.OooO0Oo()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            o000oOoO.o000OO r3 = r5.f3154OooOO0o
            boolean r3 = r3.OooO0o0()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            o000oOoO.o000OO r3 = r5.f3154OooOO0o
            boolean r3 = r3.OooO0Oo()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f3184OoooO
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f3188OoooOO0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.OoooOOo(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f3162OooOo0) {
            return false;
        }
        this.f3156OooOOOO = null;
        if (OooOoo0(motionEvent)) {
            OoooOOO();
            setScrollState(0);
            return true;
        }
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo == null) {
            return false;
        }
        boolean OooO0Oo2 = o000oo.OooO0Oo();
        boolean OooO0o02 = this.f3154OooOO0o.OooO0o0();
        if (this.f3179Oooo0OO == null) {
            this.f3179Oooo0OO = VelocityTracker.obtain();
        }
        this.f3179Oooo0OO.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                OoooO00(motionEvent);
                            }
                        } else {
                            this.f3178Oooo0O0 = motionEvent.getPointerId(actionIndex);
                            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f3182Oooo0oO = x;
                            this.f3181Oooo0o0 = x;
                            int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f3183Oooo0oo = y;
                            this.f3180Oooo0o = y;
                        }
                    } else {
                        OoooOOO();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3178Oooo0O0);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f3174Oooo0 != 1) {
                        int i = x2 - this.f3181Oooo0o0;
                        int i2 = y2 - this.f3180Oooo0o;
                        if (OooO0Oo2 && Math.abs(i) > this.f3173Oooo) {
                            this.f3182Oooo0oO = x2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (OooO0o02 && Math.abs(i2) > this.f3173Oooo) {
                            this.f3183Oooo0oo = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.f3179Oooo0OO.clear();
                OooooO0(0);
            }
        } else {
            if (this.f3164OooOo0O) {
                this.f3164OooOo0O = false;
            }
            this.f3178Oooo0O0 = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f3182Oooo0oO = x3;
            this.f3181Oooo0o0 = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.f3183Oooo0oo = y3;
            this.f3180Oooo0o = y3;
            if (this.f3174Oooo0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                OooooO0(1);
            }
            int[] iArr = this.f3205o0OoOo0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = OooO0Oo2;
            if (OooO0o02) {
                i3 = (OooO0Oo2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().OooO0oO(i3, 0);
        }
        if (this.f3174Oooo0 != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = OooOoOO.o0000.f1201OooO00o;
        o0000Ooo.OooO00o("RV OnLayout");
        OooOOOO();
        o0000Ooo.OooO0O0();
        this.f3158OooOOo = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo == null) {
            OooOOO(i, i2);
            return;
        }
        boolean Oooo0O02 = o000oo.Oooo0O0();
        boolean z = false;
        o000O0O0 o000o0o0 = this.OoooOoO;
        if (Oooo0O02) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3154OooOO0o.f5007OooO0O0.OooOOO(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f3153OooOO0O != null) {
                if (o000o0o0.f4985OooO0Oo == 1) {
                    OooOOOo();
                }
                this.f3154OooOO0o.o00Ooo(i, i2);
                o000o0o0.f4981OooO = true;
                OooOOo0();
                this.f3154OooOO0o.o00ooo(i, i2);
                if (this.f3154OooOO0o.o00oO0O()) {
                    this.f3154OooOO0o.o00Ooo(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    o000o0o0.f4981OooO = true;
                    OooOOo0();
                    this.f3154OooOO0o.o00ooo(i, i2);
                }
            }
        } else if (this.f3159OooOOo0) {
            this.f3154OooOO0o.f5007OooO0O0.OooOOO(i, i2);
        } else if (o000o0o0.f4991OooOO0O) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            o00000O o00000o = this.f3153OooOO0O;
            if (o00000o != null) {
                o000o0o0.f4987OooO0o0 = o00000o.OooO00o();
            } else {
                o000o0o0.f4987OooO0o0 = 0;
            }
            Ooooo00();
            this.f3154OooOO0o.f5007OooO0O0.OooOOO(i, i2);
            Ooooo0o(false);
            o000o0o0.f4988OooO0oO = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (Oooo0OO()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof o000O0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o000O0 o000o0 = (o000O0) parcelable;
        this.f3146OooO0OO = o000o0;
        super.onRestoreInstanceState(o000o0.f1456OooO00o);
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null && (parcelable2 = this.f3146OooO0OO.f4972OooO0OO) != null) {
            o000oo.Ooooo00(parcelable2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        o000O0 o000o0 = new o000O0(super.onSaveInstanceState());
        o000O0 o000o02 = this.f3146OooO0OO;
        if (o000o02 != null) {
            o000o0.f4972OooO0OO = o000o02.f4972OooO0OO;
        } else {
            o000OO o000oo = this.f3154OooOO0o;
            if (o000oo != null) {
                parcelable = o000oo.Ooooo0o();
            } else {
                parcelable = null;
            }
            o000o0.f4972OooO0OO = parcelable;
        }
        return o000o0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.f3176Oooo00O = null;
            this.f3172OooOooo = null;
            this.f3175Oooo000 = null;
            this.f3171OooOooO = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x0411, code lost:
        if (r1 < r2) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
        if (r15 >= 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0139, code lost:
        if (r12 >= 0) goto L274;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04ca  */
    /* JADX WARN: Type inference failed for: r5v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v35 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        o000OOo0 Oooo02 = Oooo0(view);
        if (Oooo02 != null) {
            if (Oooo02.OooOO0O()) {
                Oooo02.f5039OooOO0 &= -257;
            } else if (!Oooo02.OooOOOO()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + Oooo02 + OooOoO0());
            }
        }
        view.clearAnimation();
        Oooo0(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        boolean z;
        oo0o0Oo oo0o0oo = this.f3154OooOO0o.f5011OooO0o0;
        boolean z2 = true;
        if (oo0o0oo != null && oo0o0oo.f5180OooO0o0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !Oooo0OO()) {
            z2 = false;
        }
        if (!z2 && view2 != null) {
            o000oOoO(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f3154OooOO0o.OoooooO(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f3155OooOOO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o000) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3160OooOOoo != 0 || this.f3162OooOo0) {
            this.f3163OooOo00 = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo == null || this.f3162OooOo0) {
            return;
        }
        boolean OooO0Oo2 = o000oo.OooO0Oo();
        boolean OooO0o02 = this.f3154OooOO0o.OooO0o0();
        if (OooO0Oo2 || OooO0o02) {
            if (!OooO0Oo2) {
                i = 0;
            }
            if (!OooO0o02) {
                i2 = 0;
            }
            OoooOOo(i, i2, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2 = 0;
        if (Oooo0OO()) {
            if (accessibilityEvent != null) {
                i = Oooo000.OooO0O0.OooO00o(accessibilityEvent);
            } else {
                i = 0;
            }
            if (i != 0) {
                i2 = i;
            }
            this.f3165OooOo0o |= i2;
            i2 = 1;
        }
        if (i2 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(o00O0000 o00o0000) {
        this.f3199Oooooo0 = o00o0000;
        o0o0Oo.OooOO0o(this, o00o0000);
    }

    public void setAdapter(o00000O o00000o) {
        setLayoutFrozen(false);
        o00000O o00000o2 = this.f3153OooOO0O;
        o0ooOOo o0ooooo = this.f3144OooO00o;
        if (o00000o2 != null) {
            o00000o2.f4951OooO00o.unregisterObserver(o0ooooo);
            this.f3153OooOO0O.getClass();
        }
        o0000oo o0000ooVar = this.f3177Oooo00o;
        if (o0000ooVar != null) {
            o0000ooVar.OooO0o0();
        }
        o000OO o000oo = this.f3154OooOO0o;
        o000O00 o000o00 = this.f3145OooO0O0;
        if (o000oo != null) {
            o000oo.OooooOO(o000o00);
            this.f3154OooOO0o.OooooOo(o000o00);
        }
        o000o00.f4973OooO00o.clear();
        o000o00.OooO0o0();
        OooO0O0 oooO0O0 = this.f3147OooO0Oo;
        oooO0O0.OooOO0o(oooO0O0.f4888OooO0O0);
        oooO0O0.OooOO0o(oooO0O0.f4889OooO0OO);
        o00000O o00000o3 = this.f3153OooOO0O;
        this.f3153OooOO0O = o00000o;
        if (o00000o != null) {
            o00000o.f4951OooO00o.registerObserver(o0ooooo);
        }
        o00000O o00000o4 = this.f3153OooOO0O;
        o000o00.f4973OooO00o.clear();
        o000o00.OooO0o0();
        o000Oo0 OooO0OO2 = o000o00.OooO0OO();
        if (o00000o3 != null) {
            OooO0OO2.f5048OooO0O0--;
        }
        if (OooO0OO2.f5048OooO0O0 == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = OooO0OO2.f5047OooO00o;
                if (i >= sparseArray.size()) {
                    break;
                }
                ((o000O0o) sparseArray.valueAt(i)).f5001OooO00o.clear();
                i++;
            }
        }
        if (o00000o4 != null) {
            OooO0OO2.f5048OooO0O0++;
        }
        this.OoooOoO.f4986OooO0o = true;
        OoooO(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(o000oOoO.o0000Ooo o0000ooo) {
        if (o0000ooo == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f3150OooO0oO) {
            this.f3176Oooo00O = null;
            this.f3172OooOooo = null;
            this.f3175Oooo000 = null;
            this.f3171OooOooO = null;
        }
        this.f3150OooO0oO = z;
        super.setClipToPadding(z);
        if (this.f3158OooOOo) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(o0000 o0000Var) {
        o0000Var.getClass();
        this.f3169OooOoo = o0000Var;
        this.f3176Oooo00O = null;
        this.f3172OooOooo = null;
        this.f3175Oooo000 = null;
        this.f3171OooOooO = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f3159OooOOo0 = z;
    }

    public void setItemAnimator(o0000oo o0000ooVar) {
        o0000oo o0000ooVar2 = this.f3177Oooo00o;
        if (o0000ooVar2 != null) {
            o0000ooVar2.OooO0o0();
            this.f3177Oooo00o.f4966OooO00o = null;
        }
        this.f3177Oooo00o = o0000ooVar;
        if (o0000ooVar != null) {
            o0000ooVar.f4966OooO00o = this.f3196OooooOO;
        }
    }

    public void setItemViewCacheSize(int i) {
        o000O00 o000o00 = this.f3145OooO0O0;
        o000o00.f4978OooO0o0 = i;
        o000o00.OooOO0o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(o000OO o000oo) {
        o00000O0 o00000o02;
        RecyclerView recyclerView;
        oo0o0Oo oo0o0oo;
        if (o000oo == this.f3154OooOO0o) {
            return;
        }
        int i = 0;
        setScrollState(0);
        o000OO00 o000oo00 = this.f3189OoooOOO;
        o000oo00.f5025OooO0oO.removeCallbacks(o000oo00);
        o000oo00.f5021OooO0OO.abortAnimation();
        o000OO o000oo2 = this.f3154OooOO0o;
        if (o000oo2 != null && (oo0o0oo = o000oo2.f5011OooO0o0) != null) {
            oo0o0oo.OooO();
        }
        o000OO o000oo3 = this.f3154OooOO0o;
        o000O00 o000o00 = this.f3145OooO0O0;
        if (o000oo3 != null) {
            o0000oo o0000ooVar = this.f3177Oooo00o;
            if (o0000ooVar != null) {
                o0000ooVar.OooO0o0();
            }
            this.f3154OooOO0o.OooooOO(o000o00);
            this.f3154OooOO0o.OooooOo(o000o00);
            o000o00.f4973OooO00o.clear();
            o000o00.OooO0o0();
            if (this.f3157OooOOOo) {
                o000OO o000oo4 = this.f3154OooOO0o;
                o000oo4.f5012OooO0oO = false;
                o000oo4.Oooo(this);
            }
            this.f3154OooOO0o.oo000o(null);
            this.f3154OooOO0o = null;
        } else {
            o000o00.f4973OooO00o.clear();
            o000o00.OooO0o0();
        }
        OooO0o oooO0o = this.f3149OooO0o0;
        oooO0o.f4895OooO0O0.OooO0oO();
        ArrayList arrayList = oooO0o.f4896OooO0OO;
        int size = arrayList.size();
        while (true) {
            size--;
            o00000o02 = oooO0o.f4894OooO00o;
            if (size < 0) {
                break;
            }
            o00000o02.getClass();
            o000OOo0 Oooo02 = Oooo0((View) arrayList.get(size));
            if (Oooo02 != null) {
                int i2 = Oooo02.f5044OooOOOo;
                RecyclerView recyclerView2 = o00000o02.f4953OooO00o;
                if (recyclerView2.Oooo0OO()) {
                    Oooo02.f5046OooOOo0 = i2;
                    recyclerView2.f3203o00O0O.add(Oooo02);
                } else {
                    WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                    o00O0O0.OooOOoo(Oooo02.f5031OooO00o, i2);
                }
                Oooo02.f5044OooOOOo = 0;
            }
            arrayList.remove(size);
        }
        int OooO0OO2 = o00000o02.OooO0OO();
        while (true) {
            recyclerView = o00000o02.f4953OooO00o;
            if (i >= OooO0OO2) {
                break;
            }
            View childAt = recyclerView.getChildAt(i);
            recyclerView.getClass();
            Oooo0(childAt);
            o00000O o00000o = recyclerView.f3153OooOO0O;
            childAt.clearAnimation();
            i++;
        }
        recyclerView.removeAllViews();
        this.f3154OooOO0o = o000oo;
        if (o000oo != null) {
            if (o000oo.f5007OooO0O0 == null) {
                o000oo.oo000o(this);
                if (this.f3157OooOOOo) {
                    o000OO o000oo5 = this.f3154OooOO0o;
                    o000oo5.f5012OooO0oO = true;
                    o000oo5.Oooo0oo(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + o000oo + " is already attached to a RecyclerView:" + o000oo.f5007OooO0O0.OooOoO0());
            }
        }
        o000o00.OooOO0o();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        OooOooo.o000OO00 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f1285OooO0Oo) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            oo0oOO0.OooOoO(scrollingChildHelper.f1284OooO0OO);
        }
        scrollingChildHelper.f1285OooO0Oo = z;
    }

    public void setOnFlingListener(o0000OO0 o0000oo02) {
        this.f3186OoooO00 = o0000oo02;
    }

    @Deprecated
    public void setOnScrollListener(o000O000 o000o000) {
        this.f3192OoooOoo = o000o000;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f3202o000oOoO = z;
    }

    public void setRecycledViewPool(o000Oo0 o000oo0) {
        o000Oo0 o000oo02;
        o000O00 o000o00 = this.f3145OooO0O0;
        if (o000o00.f4979OooO0oO != null) {
            o000oo02.f5048OooO0O0--;
        }
        o000o00.f4979OooO0oO = o000oo0;
        if (o000oo0 != null && o000o00.f4980OooO0oo.getAdapter() != null) {
            o000o00.f4979OooO0oO.f5048OooO0O0++;
        }
    }

    public void setRecyclerListener(o000O00O o000o00o) {
    }

    public void setScrollState(int i) {
        oo0o0Oo oo0o0oo;
        if (i == this.f3174Oooo0) {
            return;
        }
        this.f3174Oooo0 = i;
        if (i != 2) {
            o000OO00 o000oo00 = this.f3189OoooOOO;
            o000oo00.f5025OooO0oO.removeCallbacks(o000oo00);
            o000oo00.f5021OooO0OO.abortAnimation();
            o000OO o000oo = this.f3154OooOO0o;
            if (o000oo != null && (oo0o0oo = o000oo.f5011OooO0o0) != null) {
                oo0o0oo.OooO();
            }
        }
        o000OO o000oo2 = this.f3154OooOO0o;
        if (o000oo2 != null) {
            o000oo2.OooooO0(i);
        }
        o000O000 o000o000 = this.f3192OoooOoo;
        if (o000o000 != null) {
            o000o000.OooO00o(this, i);
        }
        ArrayList arrayList = this.f3193Ooooo00;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((o000O000) this.f3193Ooooo00.get(size)).OooO00o(this, i);
                } else {
                    return;
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3173Oooo = i != 1 ? viewConfiguration.getScaledTouchSlop() : viewConfiguration.getScaledPagingTouchSlop();
    }

    public void setViewCacheExtension(o000O o000o) {
        this.f3145OooO0O0.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().OooO0oO(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().OooO0oo(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        oo0o0Oo oo0o0oo;
        if (z != this.f3162OooOo0) {
            OooO("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f3162OooOo0 = false;
                if (this.f3163OooOo00 && this.f3154OooOO0o != null && this.f3153OooOO0O != null) {
                    requestLayout();
                }
                this.f3163OooOo00 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3162OooOo0 = true;
            this.f3164OooOo0O = true;
            setScrollState(0);
            o000OO00 o000oo00 = this.f3189OoooOOO;
            o000oo00.f5025OooO0oO.removeCallbacks(o000oo00);
            o000oo00.f5021OooO0OO.abortAnimation();
            o000OO o000oo = this.f3154OooOO0o;
            if (o000oo != null && (oo0o0oo = o000oo.f5011OooO0o0) != null) {
                oo0o0oo.OooO();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:41|(1:43)(11:81|(1:83)|45|46|47|(1:49)(1:65)|50|51|52|53|54)|44|45|46|47|(0)(0)|50|51|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0264, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0266, code lost:
        r0 = r4.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x026c, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x027c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x027d, code lost:
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x029d, code lost:
        throw new java.lang.IllegalStateException(r20.getPositionDescription() + ": Error creating LayoutManager " + r3, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0232 A[Catch: ClassCastException -> 0x029e, IllegalAccessException -> 0x02bd, InstantiationException -> 0x02dc, InvocationTargetException -> 0x02f9, ClassNotFoundException -> 0x0316, TryCatch #4 {ClassCastException -> 0x029e, ClassNotFoundException -> 0x0316, IllegalAccessException -> 0x02bd, InstantiationException -> 0x02dc, InvocationTargetException -> 0x02f9, blocks: (B:53:0x022c, B:55:0x0232, B:57:0x023f, B:58:0x0249, B:65:0x026e, B:62:0x0266, B:67:0x027d, B:68:0x029d, B:56:0x023b), top: B:93:0x022c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023b A[Catch: ClassCastException -> 0x029e, IllegalAccessException -> 0x02bd, InstantiationException -> 0x02dc, InvocationTargetException -> 0x02f9, ClassNotFoundException -> 0x0316, TryCatch #4 {ClassCastException -> 0x029e, ClassNotFoundException -> 0x0316, IllegalAccessException -> 0x02bd, InstantiationException -> 0x02dc, InvocationTargetException -> 0x02f9, blocks: (B:53:0x022c, B:55:0x0232, B:57:0x023f, B:58:0x0249, B:65:0x026e, B:62:0x0266, B:67:0x027d, B:68:0x029d, B:56:0x023b), top: B:93:0x022c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RecyclerView(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o000OO o000oo = this.f3154OooOO0o;
        if (o000oo != null) {
            return o000oo.OooOo00(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + OooOoO0());
    }
}