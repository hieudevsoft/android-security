package androidx.fragment.app;

import OooOooo.o00O0OO;
import OooOooo.o0O0OOOo;
import OooOooo.o0o0Oo;
import Oooo0oo.o0O000Oo;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import hieubui.eup.android_app_security.R;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: OooO00o  reason: collision with root package name */
    public ArrayList f2733OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public ArrayList f2734OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f2735OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f2736OooO0Oo;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        this.f2736OooO0Oo = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O000Oo.f1515OooO0O0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    public final void OooO00o(View view) {
        ArrayList arrayList = this.f2734OooO0O0;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f2733OooO00o == null) {
            this.f2733OooO00o = new ArrayList();
        }
        this.f2733OooO00o.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        o00Oo0 o00oo0;
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof o00Oo0) {
            o00oo0 = (o00Oo0) tag;
        } else {
            o00oo0 = null;
        }
        if (o00oo0 != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        o00Oo0 o00oo0;
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof o00Oo0) {
            o00oo0 = (o00Oo0) tag;
        } else {
            o00oo0 = null;
        }
        if (o00oo0 != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        o0O0OOOo o0o0oooo;
        o0O0OOOo OooO0oo2 = o0O0OOOo.OooO0oo(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2735OooO0OO;
        if (onApplyWindowInsetsListener != null) {
            o0o0oooo = o0O0OOOo.OooO0oo(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            WindowInsets OooO0oO2 = OooO0oo2.OooO0oO();
            if (OooO0oO2 != null) {
                WindowInsets OooO0O02 = o00O0OO.OooO0O0(this, OooO0oO2);
                if (!OooO0O02.equals(OooO0oO2)) {
                    OooO0oo2 = o0O0OOOo.OooO0oo(this, OooO0O02);
                }
            }
            o0o0oooo = OooO0oo2;
        }
        if (!o0o0oooo.f1355OooO00o.OooOOO0()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
                WindowInsets OooO0oO3 = o0o0oooo.OooO0oO();
                if (OooO0oO3 != null) {
                    WindowInsets OooO00o2 = o00O0OO.OooO00o(childAt, OooO0oO3);
                    if (!OooO00o2.equals(OooO0oO3)) {
                        o0O0OOOo.OooO0oo(childAt, OooO00o2);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f2736OooO0Oo && this.f2733OooO00o != null) {
            for (int i = 0; i < this.f2733OooO00o.size(); i++) {
                super.drawChild(canvas, (View) this.f2733OooO00o.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList arrayList;
        if (!this.f2736OooO0Oo || (arrayList = this.f2733OooO00o) == null || arrayList.size() <= 0 || !this.f2733OooO00o.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList arrayList = this.f2734OooO0O0;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f2733OooO00o;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2736OooO0Oo = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            OooO00o(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        if (z) {
            OooO00o(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        OooO00o(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        OooO00o(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        OooO00o(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            OooO00o(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            OooO00o(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f2736OooO0Oo = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f2735OooO0OO = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2734OooO0O0 == null) {
                this.f2734OooO0O0 = new ArrayList();
            }
            this.f2734OooO0O0.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, o0000oo o0000ooVar) {
        super(context, attributeSet);
        View view;
        this.f2736OooO0Oo = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O000Oo.f1515OooO0O0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        o00Oo0 OooOoOO2 = o0000ooVar.OooOoOO(id);
        if (classAttribute != null && OooOoOO2 == null) {
            if (id <= 0) {
                throw new IllegalStateException(OooO0O0.OooO00o.OooO0Oo("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            o00000O0 OooOoo2 = o0000ooVar.OooOoo();
            context.getClassLoader();
            o00Oo0 OooO00o2 = OooOoo2.OooO00o(classAttribute);
            OooO00o2.f2976OooOoo = true;
            o00oO0o o00oo0o = OooO00o2.f2967OooOOoo;
            if ((o00oo0o == null ? null : o00oo0o.f2993OoooO) != null) {
                OooO00o2.f2976OooOoo = true;
            }
            OooO00o oooO00o = new OooO00o(o0000ooVar);
            oooO00o.f2753OooOOOO = true;
            OooO00o2.f2978OooOooO = this;
            int id2 = getId();
            Class<?> cls = OooO00o2.getClass();
            int modifiers = cls.getModifiers();
            if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
                if (string != null) {
                    String str = OooO00o2.f2968OooOo;
                    if (str != null && !string.equals(str)) {
                        throw new IllegalStateException("Can't change tag of fragment " + OooO00o2 + ": was " + OooO00o2.f2968OooOo + " now " + string);
                    }
                    OooO00o2.f2968OooOo = string;
                }
                if (id2 != 0) {
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Can't add fragment " + OooO00o2 + " with tag " + string + " to container view with no id");
                    }
                    int i = OooO00o2.f2971OooOo0O;
                    if (i != 0 && i != id2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + OooO00o2 + ": was " + OooO00o2.f2971OooOo0O + " now " + id2);
                    }
                    OooO00o2.f2971OooOo0O = id2;
                    OooO00o2.f2972OooOo0o = id2;
                }
                oooO00o.OooO0O0(new o000O000(1, OooO00o2));
                o0000oo o0000ooVar2 = oooO00o.f2754OooOOOo;
                OooO00o2.f2965OooOOo = o0000ooVar2;
                if (!oooO00o.f2747OooO0oO) {
                    if (o0000ooVar2.f2877OooOOOo != null && !o0000ooVar2.f2889OooOoo) {
                        o0000ooVar2.OooOo0o(true);
                        oooO00o.OooO00o(o0000ooVar2.f2892OooOooo, o0000ooVar2.f2894Oooo000);
                        o0000ooVar2.f2865OooO0O0 = true;
                        try {
                            o0000ooVar2.Oooo0oo(o0000ooVar2.f2892OooOooo, o0000ooVar2.f2894Oooo000);
                            o0000ooVar2.OooO0Oo();
                            o0000ooVar2.OoooOo0();
                            o0000ooVar2.OooOo00();
                            o0000ooVar2.f2866OooO0OO.f2813OooO0O0.values().removeAll(Collections.singleton(null));
                        } catch (Throwable th) {
                            o0000ooVar2.OooO0Oo();
                            throw th;
                        }
                    }
                } else {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
            } else {
                throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
            }
        }
        Iterator it = o0000ooVar.f2866OooO0OO.OooO0Oo().iterator();
        while (it.hasNext()) {
            o0000OO0 o0000oo02 = (o0000OO0) it.next();
            o00Oo0 o00oo0 = o0000oo02.f2858OooO0OO;
            if (o00oo0.f2972OooOo0o == getId() && (view = o00oo0.f2979OooOooo) != null && view.getParent() == null) {
                o00oo0.f2978OooOooO = this;
                o0000oo02.OooO0O0();
            }
        }
    }
}