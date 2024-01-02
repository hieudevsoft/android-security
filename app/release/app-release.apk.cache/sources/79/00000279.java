package androidx.appcompat.app;

import OooO0OO.OooO00o;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f1985OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f1986OooO0O0;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO00o.f37OooOo00);
        this.f1986OooO0O0 = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1985OooO00o = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}