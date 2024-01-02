package OooOOo0;

import OooOooo.o0O0OOOo;
import OooOooo.o0O0ooO;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.o0oO0O0o;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class OooOO0 implements o0O0ooO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f946OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f947OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Object f948OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Object f949OooO0Oo;

    public OooOO0(Context context, XmlResourceParser xmlResourceParser) {
        this.f948OooO0OO = new ArrayList();
        this.f947OooO0O0 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), o00Ooo.f1082OooO0oo);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f946OooO00o = obtainStyledAttributes.getResourceId(index, this.f946OooO00o);
            } else if (index == 1) {
                this.f947OooO0O0 = obtainStyledAttributes.getResourceId(index, this.f947OooO0O0);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f947OooO0O0);
                context.getResources().getResourceName(this.f947OooO0O0);
                if ("layout".equals(resourceTypeName)) {
                    o000oOoO o000oooo = new o000oOoO();
                    this.f949OooO0Oo = o000oooo;
                    o000oooo.OooO0O0((ConstraintLayout) LayoutInflater.from(context).inflate(this.f947OooO0O0, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // OooOooo.o0O0ooO
    public final o0O0OOOo OooO0oo(View view, o0O0OOOo o0o0oooo) {
        int i = o0o0oooo.OooO00o(7).f1111OooO0O0;
        int i2 = this.f946OooO00o;
        Object obj = this.f948OooO0OO;
        if (i2 >= 0) {
            View view2 = (View) obj;
            view2.getLayoutParams().height = this.f946OooO00o + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = (View) obj;
        view3.setPadding(view3.getPaddingLeft(), this.f947OooO0O0 + i, view3.getPaddingRight(), view3.getPaddingBottom());
        return o0o0oooo;
    }

    public OooOO0(com.google.android.material.datepicker.o000oOoO o000oooo, int i, View view, int i2) {
        this.f949OooO0Oo = o000oooo;
        this.f946OooO00o = i;
        this.f948OooO0OO = view;
        this.f947OooO0O0 = i2;
    }

    public OooOO0(o0OOO0o.Oooo0 oooo0, o0oO0O0o o0oo0o0o) {
        this.f948OooO0OO = new SparseArray();
        this.f949OooO0Oo = oooo0;
        this.f946OooO00o = o0oo0o0o.OooO(28, 0);
        this.f947OooO0O0 = o0oo0o0o.OooO(52, 0);
    }
}