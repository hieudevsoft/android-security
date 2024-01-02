package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o00Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2365OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f2366OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Object f2367OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Object f2368OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public Object f2369OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public Object f2370OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public Object f2371OooO0oO;

    public o00Oo0(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, o0ooOO0.Oooo0 oooo0, Rect rect) {
        this.f2365OooO00o = 2;
        o0000O00.OooO00o.OooOo0O(rect.left);
        o0000O00.OooO00o.OooOo0O(rect.top);
        o0000O00.OooO00o.OooOo0O(rect.right);
        o0000O00.OooO00o.OooOo0O(rect.bottom);
        this.f2367OooO0OO = rect;
        this.f2368OooO0Oo = colorStateList2;
        this.f2370OooO0o0 = colorStateList;
        this.f2369OooO0o = colorStateList3;
        this.f2366OooO0O0 = i;
        this.f2371OooO0oO = oooo0;
    }

    public static o00Oo0 OooO0O0(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        o0000O00.OooO00o.OooOo00("Cannot create a CalendarItemStyle with a styleResId of 0", z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, OooooO0.o0000O.OooOOO0);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList o00oO0o = o0000O00.OooO00o.o00oO0o(context, obtainStyledAttributes, 4);
        ColorStateList o00oO0o2 = o0000O00.OooO00o.o00oO0o(context, obtainStyledAttributes, 9);
        ColorStateList o00oO0o3 = o0000O00.OooO00o.o00oO0o(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        o0ooOO0.Oooo0 oooo0 = new o0ooOO0.Oooo0(o0ooOO0.Oooo0.OooO00o(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new o0ooOO0.OooO0o(0)));
        obtainStyledAttributes.recycle();
        return new o00Oo0(o00oO0o, o00oO0o2, o00oO0o3, dimensionPixelSize, oooo0, rect);
    }

    public final void OooO(ColorStateList colorStateList) {
        if (((o0O0o00O) this.f2369OooO0o) == null) {
            this.f2369OooO0o = new o0O0o00O(0);
        }
        o0O0o00O o0o0o00o = (o0O0o00O) this.f2369OooO0o;
        o0o0o00o.f2477OooO0OO = colorStateList;
        o0o0o00o.f2476OooO0O0 = true;
        OooO00o();
    }

    public final void OooO00o() {
        boolean z;
        View view = (View) this.f2367OooO0OO;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z2 = false;
            if (((o0O0o00O) this.f2370OooO0o0) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (((o0O0o00O) this.f2371OooO0oO) == null) {
                    this.f2371OooO0oO = new o0O0o00O(0);
                }
                o0O0o00O o0o0o00o = (o0O0o00O) this.f2371OooO0oO;
                o0o0o00o.f2477OooO0OO = null;
                o0o0o00o.f2476OooO0O0 = false;
                o0o0o00o.f2478OooO0Oo = null;
                o0o0o00o.f2475OooO00o = false;
                WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
                ColorStateList OooO0oO2 = OooOooo.oo0oOO0.OooO0oO(view);
                if (OooO0oO2 != null) {
                    o0o0o00o.f2476OooO0O0 = true;
                    o0o0o00o.f2477OooO0OO = OooO0oO2;
                }
                PorterDuff.Mode OooO0oo2 = OooOooo.oo0oOO0.OooO0oo(view);
                if (OooO0oo2 != null) {
                    o0o0o00o.f2475OooO00o = true;
                    o0o0o00o.f2478OooO0Oo = OooO0oo2;
                }
                if (o0o0o00o.f2476OooO0O0 || o0o0o00o.f2475OooO00o) {
                    o0Oo0oo.OooO0o0(background, o0o0o00o, view.getDrawableState());
                    z2 = true;
                }
                if (z2) {
                    return;
                }
            }
            o0O0o00O o0o0o00o2 = (o0O0o00O) this.f2369OooO0o;
            if (o0o0o00o2 != null) {
                o0Oo0oo.OooO0o0(background, o0o0o00o2, view.getDrawableState());
                return;
            }
            o0O0o00O o0o0o00o3 = (o0O0o00O) this.f2370OooO0o0;
            if (o0o0o00o3 != null) {
                o0Oo0oo.OooO0o0(background, o0o0o00o3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList OooO0OO() {
        Object obj = this.f2369OooO0o;
        if (((o0O0o00O) obj) != null) {
            return (ColorStateList) ((o0O0o00O) obj).f2477OooO0OO;
        }
        return null;
    }

    public final PorterDuff.Mode OooO0Oo() {
        Object obj = this.f2369OooO0o;
        if (((o0O0o00O) obj) != null) {
            return (PorterDuff.Mode) ((o0O0o00O) obj).f2478OooO0Oo;
        }
        return null;
    }

    public final void OooO0o() {
        this.f2366OooO0O0 = -1;
        OooO0oo(null);
        OooO00o();
    }

    public final void OooO0o0(AttributeSet attributeSet, int i) {
        ColorStateList OooO0oo2;
        Object obj = this.f2367OooO0OO;
        View view = (View) obj;
        Context context = view.getContext();
        int[] iArr = OooO0OO.OooO00o.f40OooOoO;
        o0oO0O0o OooOOO0 = o0oO0O0o.OooOOO0(context, attributeSet, iArr, i);
        OooOooo.o0o0Oo.OooOO0O(view, view.getContext(), iArr, attributeSet, (TypedArray) OooOOO0.f2540OooO0O0, i);
        try {
            if (OooOOO0.OooOO0o(0)) {
                this.f2366OooO0O0 = OooOOO0.OooO(0, -1);
                o0Oo0oo o0oo0oo = (o0Oo0oo) this.f2368OooO0Oo;
                Context context2 = ((View) obj).getContext();
                int i2 = this.f2366OooO0O0;
                synchronized (o0oo0oo) {
                    OooO0oo2 = o0oo0oo.f2534OooO00o.OooO0oo(context2, i2);
                }
                if (OooO0oo2 != null) {
                    OooO0oo(OooO0oo2);
                }
            }
            if (OooOOO0.OooOO0o(1)) {
                OooOooo.oo0oOO0.OooOOo0((View) obj, OooOOO0.OooO0O0(1));
            }
            if (OooOOO0.OooOO0o(2)) {
                OooOooo.oo0oOO0.OooOOo((View) obj, o00O0OO0.OooO0O0(OooOOO0.OooO0oo(2, -1), null));
            }
        } finally {
            OooOOO0.OooOOOO();
        }
    }

    public final void OooO0oO(int i) {
        ColorStateList colorStateList;
        this.f2366OooO0O0 = i;
        o0Oo0oo o0oo0oo = (o0Oo0oo) this.f2368OooO0Oo;
        if (o0oo0oo != null) {
            Context context = ((View) this.f2367OooO0OO).getContext();
            synchronized (o0oo0oo) {
                colorStateList = o0oo0oo.f2534OooO00o.OooO0oo(context, i);
            }
        } else {
            colorStateList = null;
        }
        OooO0oo(colorStateList);
        OooO00o();
    }

    public final void OooO0oo(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((o0O0o00O) this.f2370OooO0o0) == null) {
                this.f2370OooO0o0 = new o0O0o00O(0);
            }
            Object obj = this.f2370OooO0o0;
            ((o0O0o00O) obj).f2477OooO0OO = colorStateList;
            ((o0O0o00O) obj).f2476OooO0O0 = true;
        } else {
            this.f2370OooO0o0 = null;
        }
        OooO00o();
    }

    public final void OooOO0(PorterDuff.Mode mode) {
        if (((o0O0o00O) this.f2369OooO0o) == null) {
            this.f2369OooO0o = new o0O0o00O(0);
        }
        o0O0o00O o0o0o00o = (o0O0o00O) this.f2369OooO0o;
        o0o0o00o.f2478OooO0Oo = mode;
        o0o0o00o.f2475OooO00o = true;
        OooO00o();
    }

    public final String toString() {
        switch (this.f2365OooO00o) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f2367OooO0OO) + ", mProviderPackage: " + ((String) this.f2368OooO0Oo) + ", mQuery: " + ((String) this.f2370OooO0o0) + ", mCertificates:");
                for (int i = 0; i < ((List) this.f2369OooO0o).size(); i++) {
                    sb.append(" [");
                    List list = (List) ((List) this.f2369OooO0o).get(i);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.f2366OooO0O0);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public o00Oo0(View view) {
        this.f2365OooO00o = 0;
        this.f2366OooO0O0 = -1;
        this.f2367OooO0OO = view;
        this.f2368OooO0Oo = o0Oo0oo.OooO00o();
    }

    public o00Oo0(String str, String str2, String str3, List list) {
        this.f2365OooO00o = 1;
        str.getClass();
        this.f2367OooO0OO = str;
        str2.getClass();
        this.f2368OooO0Oo = str2;
        this.f2370OooO0o0 = str3;
        list.getClass();
        this.f2369OooO0o = list;
        this.f2366OooO0O0 = 0;
        this.f2371OooO0oO = str + "-" + str2 + "-" + str3;
    }
}