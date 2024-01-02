package OooOOo0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class OooOO0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final float f950OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final float f951OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final float f952OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final float f953OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f954OooO0o0;

    public OooOO0O(Context context, XmlResourceParser xmlResourceParser) {
        this.f950OooO00o = Float.NaN;
        this.f951OooO0O0 = Float.NaN;
        this.f952OooO0OO = Float.NaN;
        this.f953OooO0Oo = Float.NaN;
        this.f954OooO0o0 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), o00Ooo.f1083OooOO0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f954OooO0o0);
                this.f954OooO0o0 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o000oOoO().OooO0O0((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f953OooO0Oo = obtainStyledAttributes.getDimension(index, this.f953OooO0Oo);
            } else if (index == 2) {
                this.f951OooO0O0 = obtainStyledAttributes.getDimension(index, this.f951OooO0O0);
            } else if (index == 3) {
                this.f952OooO0OO = obtainStyledAttributes.getDimension(index, this.f952OooO0OO);
            } else if (index == 4) {
                this.f950OooO00o = obtainStyledAttributes.getDimension(index, this.f950OooO00o);
            }
        }
        obtainStyledAttributes.recycle();
    }
}