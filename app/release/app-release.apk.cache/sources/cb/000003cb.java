package com.google.android.material.button;

import OooO0Oo.o0000OO0;
import OooOO0o.Oooo0;
import OooOooo.o000O0O0;
import OooOooo.o00O0O0;
import OooOooo.o00O0O0O;
import OooOooo.o0o0Oo;
import OooooO0.o0000O;
import OooooOo.oO00O0oO;
import OoooooO.oO00o00;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.OooOOO0;
import com.google.gson.internal.OooO0o;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import o0000O00.OooO00o;
import o0ooOO0.Oooo000;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: OooOO0O  reason: collision with root package name */
    public static final /* synthetic */ int f3323OooOO0O = 0;

    /* renamed from: OooO  reason: collision with root package name */
    public final int f3324OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ArrayList f3325OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0000OO0 f3326OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final LinkedHashSet f3327OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Oooo0 f3328OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f3329OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public Integer[] f3330OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f3331OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f3332OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public HashSet f3333OooOO0;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(OooO0o.OooOo0o(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131756052), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f3325OooO00o = new ArrayList();
        this.f3326OooO0O0 = new o0000OO0(this);
        this.f3327OooO0OO = new LinkedHashSet();
        this.f3328OooO0Oo = new Oooo0(1, this);
        this.f3329OooO0o = false;
        this.f3333OooOO0 = new HashSet();
        TypedArray OooOOOO2 = OooO0o.OooOOOO(getContext(), attributeSet, o0000O.f1796OooOO0O, R.attr.materialButtonToggleGroupStyle, 2131756052, new int[0]);
        setSingleSelection(OooOOOO2.getBoolean(3, false));
        this.f3324OooO = OooOOOO2.getResourceId(1, -1);
        this.f3332OooO0oo = OooOOOO2.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(OooOOOO2.getBoolean(0, true));
        OooOOOO2.recycle();
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        o00O0O0.OooOOoo(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (OooO0Oo(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (OooO0Oo(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && OooO0Oo(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            materialButton.setId(o00O0O0O.OooO00o());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f3326OooO0O0);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void OooO00o() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton OooO0OO2 = OooO0OO(i);
            int min = Math.min(OooO0OO2.getStrokeWidth(), OooO0OO(i - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = OooO0OO2.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                o000O0O0.OooO0oO(layoutParams, 0);
                o000O0O0.OooO0oo(layoutParams, -min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                o000O0O0.OooO0oo(layoutParams, 0);
            }
            OooO0OO2.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) OooO0OO(firstVisibleChildIndex).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
                return;
            }
            o000O0O0.OooO0oO(layoutParams3, 0);
            o000O0O0.OooO0oo(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    public final void OooO0O0(int i, boolean z) {
        if (i == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.f3333OooOO0);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f3331OooO0oO && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (z || !hashSet.contains(Integer.valueOf(i))) {
            return;
        } else {
            if (!this.f3332OooO0oo || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        OooO0o0(hashSet);
    }

    public final MaterialButton OooO0OO(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public final boolean OooO0Oo(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void OooO0o() {
        boolean z;
        oO00o00 oo00o00;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton OooO0OO2 = OooO0OO(i);
            if (OooO0OO2.getVisibility() != 8) {
                o0ooOO0.Oooo0 shapeAppearanceModel = OooO0OO2.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                Oooo000 oooo000 = new Oooo000(shapeAppearanceModel);
                oO00o00 oo00o002 = (oO00o00) this.f3325OooO00o.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    o0ooOO0.OooO0o oooO0o = oO00o00.f1869OooO0o0;
                    if (i == firstVisibleChildIndex) {
                        if (z) {
                            if (OooO00o.o0000O(this)) {
                                oo00o00 = new oO00o00(oooO0o, oooO0o, oo00o002.f1871OooO0O0, oo00o002.f1872OooO0OO);
                            } else {
                                oo00o00 = new oO00o00(oo00o002.f1870OooO00o, oo00o002.f1873OooO0Oo, oooO0o, oooO0o);
                            }
                        } else {
                            oo00o00 = new oO00o00(oo00o002.f1870OooO00o, oooO0o, oo00o002.f1871OooO0O0, oooO0o);
                        }
                    } else if (i == lastVisibleChildIndex) {
                        if (z) {
                            if (OooO00o.o0000O(this)) {
                                oo00o00 = new oO00o00(oo00o002.f1870OooO00o, oo00o002.f1873OooO0Oo, oooO0o, oooO0o);
                            } else {
                                oo00o00 = new oO00o00(oooO0o, oooO0o, oo00o002.f1871OooO0O0, oo00o002.f1872OooO0OO);
                            }
                        } else {
                            oo00o00 = new oO00o00(oooO0o, oo00o002.f1873OooO0Oo, oooO0o, oo00o002.f1872OooO0OO);
                        }
                    } else {
                        oo00o002 = null;
                    }
                    oo00o002 = oo00o00;
                }
                if (oo00o002 == null) {
                    oooo000.f5533OooO0o0 = new o0ooOO0.OooO0o(0.0f);
                    oooo000.f5532OooO0o = new o0ooOO0.OooO0o(0.0f);
                    oooo000.f5534OooO0oO = new o0ooOO0.OooO0o(0.0f);
                    oooo000.f5535OooO0oo = new o0ooOO0.OooO0o(0.0f);
                } else {
                    oooo000.f5533OooO0o0 = oo00o002.f1870OooO00o;
                    oooo000.f5535OooO0oo = oo00o002.f1873OooO0Oo;
                    oooo000.f5532OooO0o = oo00o002.f1871OooO0O0;
                    oooo000.f5534OooO0oO = oo00o002.f1872OooO0OO;
                }
                OooO0OO2.setShapeAppearanceModel(new o0ooOO0.Oooo0(oooo000));
            }
        }
    }

    public final void OooO0o0(Set set) {
        HashSet hashSet = this.f3333OooOO0;
        this.f3333OooOO0 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = OooO0OO(i).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f3329OooO0o = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f3329OooO0o = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f3327OooO0OO.iterator();
                while (it.hasNext()) {
                    ((OooOOO0) it.next()).OooO00o();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        OooO0O0(materialButton.getId(), materialButton.isChecked());
        o0ooOO0.Oooo0 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f3325OooO00o.add(new oO00o00(shapeAppearanceModel.f5521OooO0o0, shapeAppearanceModel.f5523OooO0oo, shapeAppearanceModel.f5520OooO0o, shapeAppearanceModel.f5522OooO0oO));
        materialButton.setEnabled(isEnabled());
        o0o0Oo.OooOO0o(materialButton, new oO00O0oO(1, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f3328OooO0Oo);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(OooO0OO(i), Integer.valueOf(i));
        }
        this.f3330OooO0o0 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public int getCheckedButtonId() {
        if (!this.f3331OooO0oO || this.f3333OooOO0.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f3333OooOO0.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = OooO0OO(i).getId();
            if (this.f3333OooOO0.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f3330OooO0o0;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f3324OooO;
        if (i != -1) {
            OooO0o0(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f3331OooO0oO) {
            i = 1;
        } else {
            i = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        OooO0o();
        OooO00o();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f3325OooO00o.remove(indexOfChild);
        }
        OooO0o();
        OooO00o();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            OooO0OO(i).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f3332OooO0oo = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f3331OooO0oO != z) {
            this.f3331OooO0oO = z;
            OooO0o0(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            OooO0OO(i).setA11yClassName((this.f3331OooO0oO ? RadioButton.class : ToggleButton.class).getName());
        }
    }
}