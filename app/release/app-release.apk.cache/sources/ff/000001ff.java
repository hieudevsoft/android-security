package OoooOoo;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes.dex */
public final class o0OO0o extends Property {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Rect f1599OooO00o;

    public o0OO0o() {
        super(PointF.class, "boundsOrigin");
        this.f1599OooO00o = new Rect();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        Rect rect = this.f1599OooO00o;
        ((Drawable) obj).copyBounds(rect);
        return new PointF(rect.left, rect.top);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        Rect rect = this.f1599OooO00o;
        drawable.copyBounds(rect);
        rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(rect);
    }
}