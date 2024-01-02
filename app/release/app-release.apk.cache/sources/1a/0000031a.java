package androidx.constraintlayout.widget;

import OooOO0o.OooOo;
import OooOOO.OooO;
import OooOOO.OooOO0;
import OooOOO.OooOOO;
import OooOOOO.Oooo000;
import OooOOo0.OooO0OO;
import OooOOo0.OooOOO0;
import OooOOo0.o000oOoO;
import OooOOo0.o00O0O;
import OooOOo0.o00Ooo;
import OooOOo0.o0OoOo0;
import OooOOo0.oo000o;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: OooOOOo  reason: collision with root package name */
    public static oo000o f2584OooOOOo;

    /* renamed from: OooO  reason: collision with root package name */
    public int f2585OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final SparseArray f2586OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ArrayList f2587OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final OooOO0 f2588OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f2589OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f2590OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f2591OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f2592OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f2593OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public o000oOoO f2594OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public OooOOO0 f2595OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f2596OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final SparseArray f2597OooOOO;
    public HashMap OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public final Oooo000 f2598OooOOOO;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2586OooO00o = new SparseArray();
        this.f2587OooO0O0 = new ArrayList(4);
        this.f2588OooO0OO = new OooOO0();
        this.f2589OooO0Oo = 0;
        this.f2591OooO0o0 = 0;
        this.f2590OooO0o = Integer.MAX_VALUE;
        this.f2592OooO0oO = Integer.MAX_VALUE;
        this.f2593OooO0oo = true;
        this.f2585OooO = 257;
        this.f2594OooOO0 = null;
        this.f2595OooOO0O = null;
        this.f2596OooOO0o = -1;
        this.OooOOO0 = new HashMap();
        this.f2597OooOOO = new SparseArray();
        this.f2598OooOOOO = new Oooo000(this, this);
        OooO0oo(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static oo000o getSharedValues() {
        if (f2584OooOOOo == null) {
            f2584OooOOOo = new oo000o();
        }
        return f2584OooOOOo;
    }

    public final boolean OooO() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public final OooO OooO0oO(View view) {
        if (view == this) {
            return this.f2588OooO0OO;
        }
        if (view != null) {
            if (!(view.getLayoutParams() instanceof OooOOo0.OooO)) {
                view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
                if (!(view.getLayoutParams() instanceof OooOOo0.OooO)) {
                    return null;
                }
            }
            return ((OooOOo0.OooO) view.getLayoutParams()).f925o00o0O;
        }
        return null;
    }

    public final void OooO0oo(AttributeSet attributeSet, int i) {
        OooOO0 oooOO0 = this.f2588OooO0OO;
        oooOO0.f673OooooOo = this;
        Oooo000 oooo000 = this.f2598OooOOOO;
        oooOO0.f735o0ooOO0 = oooo000;
        oooOO0.o00oO0o.f803OooO0o = oooo000;
        this.f2586OooO00o.put(getId(), this);
        this.f2594OooOO0 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o00Ooo.f1076OooO0O0, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f2589OooO0Oo = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2589OooO0Oo);
                } else if (index == 17) {
                    this.f2591OooO0o0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2591OooO0o0);
                } else if (index == 14) {
                    this.f2590OooO0o = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2590OooO0o);
                } else if (index == 15) {
                    this.f2592OooO0oO = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2592OooO0oO);
                } else if (index == 113) {
                    this.f2585OooO = obtainStyledAttributes.getInt(index, this.f2585OooO);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.f2595OooOO0O = new OooOOO0(getContext(), resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2595OooOO0O = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        o000oOoO o000oooo = new o000oOoO();
                        this.f2594OooOO0 = o000oooo;
                        o000oooo.OooO0o0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2594OooOO0 = null;
                    }
                    this.f2596OooOO0o = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        oooOO0.f722o000000 = this.f2585OooO;
        OooOo.f577OooOOOo = oooOO0.o000oOoO(512);
    }

    public final void OooOO0(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.OooOOO0 == null) {
                this.OooOOO0 = new HashMap();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.OooOOO0.put(str, Integer.valueOf(num.intValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0381  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOO0O() {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.OooOO0O():boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof OooOOo0.OooO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f2587OooO0O0;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((OooO0OO) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f2593OooO0oo = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new OooOOo0.OooO();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OooOOo0.OooO(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f2592OooO0oO;
    }

    public int getMaxWidth() {
        return this.f2590OooO0o;
    }

    public int getMinHeight() {
        return this.f2591OooO0o0;
    }

    public int getMinWidth() {
        return this.f2589OooO0Oo;
    }

    public int getOptimizationLevel() {
        return this.f2588OooO0OO.f722o000000;
    }

    public String getSceneString() {
        int id;
        String str;
        StringBuilder sb = new StringBuilder();
        OooOO0 oooOO0 = this.f2588OooO0OO;
        if (oooOO0.f628OooOO0 == null) {
            int id2 = getId();
            if (id2 != -1) {
                str = getContext().getResources().getResourceEntryName(id2);
            } else {
                str = "parent";
            }
            oooOO0.f628OooOO0 = str;
        }
        if (oooOO0.f674Oooooo == null) {
            oooOO0.f674Oooooo = oooOO0.f628OooOO0;
        }
        Iterator it = oooOO0.f796o00ooo.iterator();
        while (it.hasNext()) {
            OooO oooO = (OooO) it.next();
            View view = (View) oooO.f673OooooOo;
            if (view != null) {
                if (oooO.f628OooOO0 == null && (id = view.getId()) != -1) {
                    oooO.f628OooOO0 = getContext().getResources().getResourceEntryName(id);
                }
                if (oooO.f674Oooooo == null) {
                    oooO.f674Oooooo = oooO.f628OooOO0;
                }
            }
        }
        oooOO0.OooOOO(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            OooOOo0.OooO oooO = (OooOOo0.OooO) childAt.getLayoutParams();
            OooO oooO2 = oooO.f925o00o0O;
            if (childAt.getVisibility() != 8 || oooO.f915OooooO0 || oooO.f916OooooOO || isInEditMode) {
                int OooOOo2 = oooO2.OooOOo();
                int OooOOoo2 = oooO2.OooOOoo();
                childAt.layout(OooOOo2, OooOOoo2, oooO2.OooOOo0() + OooOOo2, oooO2.OooOO0o() + OooOOoo2);
            }
        }
        ArrayList arrayList = this.f2587OooO0O0;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((OooO0OO) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0181  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        OooO OooO0oO2 = OooO0oO(view);
        if ((view instanceof o00O0O) && !(OooO0oO2 instanceof OooOOO)) {
            OooOOo0.OooO oooO = (OooOOo0.OooO) view.getLayoutParams();
            OooOOO oooOOO = new OooOOO();
            oooO.f925o00o0O = oooOOO;
            oooO.f915OooooO0 = true;
            oooOOO.OoooO00(oooO.f922o000oOoO);
        }
        if (view instanceof OooO0OO) {
            OooO0OO oooO0OO = (OooO0OO) view;
            oooO0OO.OooO();
            ((OooOOo0.OooO) view.getLayoutParams()).f916OooooOO = true;
            ArrayList arrayList = this.f2587OooO0O0;
            if (!arrayList.contains(oooO0OO)) {
                arrayList.add(oooO0OO);
            }
        }
        this.f2586OooO00o.put(view.getId(), view);
        this.f2593OooO0oo = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2586OooO00o.remove(view.getId());
        OooO OooO0oO2 = OooO0oO(view);
        this.f2588OooO0OO.f796o00ooo.remove(OooO0oO2);
        OooO0oO2.OooOoo();
        this.f2587OooO0O0.remove(view);
        this.f2593OooO0oo = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2593OooO0oo = true;
        super.requestLayout();
    }

    public void setConstraintSet(o000oOoO o000oooo) {
        this.f2594OooOO0 = o000oooo;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f2586OooO00o;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f2592OooO0oO) {
            return;
        }
        this.f2592OooO0oO = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f2590OooO0o) {
            return;
        }
        this.f2590OooO0o = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f2591OooO0o0) {
            return;
        }
        this.f2591OooO0o0 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f2589OooO0Oo) {
            return;
        }
        this.f2589OooO0Oo = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(o0OoOo0 o0oooo0) {
        OooOOO0 oooOOO0 = this.f2595OooOO0O;
        if (oooOOO0 != null) {
            oooOOO0.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f2585OooO = i;
        OooOO0 oooOO0 = this.f2588OooO0OO;
        oooOO0.f722o000000 = i;
        OooOo.f577OooOOOo = oooOO0.o000oOoO(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2586OooO00o = new SparseArray();
        this.f2587OooO0O0 = new ArrayList(4);
        this.f2588OooO0OO = new OooOO0();
        this.f2589OooO0Oo = 0;
        this.f2591OooO0o0 = 0;
        this.f2590OooO0o = Integer.MAX_VALUE;
        this.f2592OooO0oO = Integer.MAX_VALUE;
        this.f2593OooO0oo = true;
        this.f2585OooO = 257;
        this.f2594OooOO0 = null;
        this.f2595OooOO0O = null;
        this.f2596OooOO0o = -1;
        this.OooOOO0 = new HashMap();
        this.f2597OooOOO = new SparseArray();
        this.f2598OooOOOO = new Oooo000(this, this);
        OooO0oo(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new OooOOo0.OooO(layoutParams);
    }
}