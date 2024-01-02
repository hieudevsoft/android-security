package OooOOo0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class OooO0OO extends View {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int[] f938OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f939OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Context f940OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public OooOOO.OooOo00 f941OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public String f942OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public String f943OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final HashMap f944OooO0oO;

    public OooO0OO(Context context) {
        super(context);
        this.f938OooO00o = new int[32];
        this.f944OooO0oO = new HashMap();
        this.f940OooO0OO = context;
        OooO0oO(null);
    }

    public final void OooO() {
        if (this.f941OooO0Oo == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof OooO) {
            ((OooO) layoutParams).f925o00o0O = this.f941OooO0Oo;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L8e
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto L8e
        La:
            android.content.Context r0 = r5.f940OooO0OO
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L21:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L31
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5b
            if (r1 == 0) goto L5b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.OooOOO0
            if (r3 == 0) goto L4f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.OooOOO0
            java.lang.Object r3 = r3.get(r6)
            goto L50
        L4f:
            r3 = r2
        L50:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5c
        L5b:
            r3 = 0
        L5c:
            if (r3 != 0) goto L64
            if (r1 == 0) goto L64
            int r3 = r5.OooO0o(r1, r6)
        L64:
            if (r3 != 0) goto L70
            java.lang.Class<OooOOo0.o00Oo0> r1 = OooOOo0.o00Oo0.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L70
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L70
        L70:
            if (r3 != 0) goto L80
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L80:
            if (r3 == 0) goto L8e
            java.util.HashMap r0 = r5.f944OooO0oO
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.OooO0O0(r3)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOOo0.OooO0OO.OooO00o(java.lang.String):void");
    }

    public final void OooO0O0(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f939OooO0O0 + 1;
        int[] iArr = this.f938OooO00o;
        if (i2 > iArr.length) {
            this.f938OooO00o = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f938OooO00o;
        int i3 = this.f939OooO0O0;
        iArr2[i3] = i;
        this.f939OooO0O0 = i3 + 1;
    }

    public final void OooO0OO(String str) {
        if (str == null || str.length() == 0 || this.f940OooO0OO == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof OooO) && trim.equals(((OooO) layoutParams).f911OoooOo0) && childAt.getId() != -1) {
                OooO0O0(childAt.getId());
            }
        }
    }

    public final void OooO0Oo(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f939OooO0O0; i++) {
            View view = (View) constraintLayout.f2586OooO00o.get(this.f938OooO00o[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int OooO0o(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f940OooO0OO.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void OooO0o0(ConstraintLayout constraintLayout) {
    }

    public void OooO0oO(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o00Ooo.f1076OooO0O0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f943OooO0o0 = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f942OooO0o = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void OooO0oo(OooOOO.OooO oooO, boolean z);

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f938OooO00o, this.f939OooO0O0);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f943OooO0o0;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f942OooO0o;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f943OooO0o0 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f939OooO0O0 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                OooO00o(str.substring(i));
                return;
            } else {
                OooO00o(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f942OooO0o = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f939OooO0O0 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                OooO0OO(str.substring(i));
                return;
            } else {
                OooO0OO(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f943OooO0o0 = null;
        this.f939OooO0O0 = 0;
        for (int i : iArr) {
            OooO0O0(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f943OooO0o0 == null) {
            OooO0O0(i);
        }
    }

    public OooO0OO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f938OooO00o = new int[32];
        this.f944OooO0oO = new HashMap();
        this.f940OooO0OO = context;
        OooO0oO(attributeSet);
    }
}