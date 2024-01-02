package androidx.core.graphics.drawable;

import OooOoO0.o0OO00O;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import o00000.o000;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: OooOO0O  reason: collision with root package name */
    public static final PorterDuff.Mode f2628OooOO0O = PorterDuff.Mode.SRC_IN;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Object f2631OooO0O0;

    /* renamed from: OooOO0  reason: collision with root package name */
    public String f2638OooOO0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f2630OooO00o = -1;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public byte[] f2632OooO0OO = null;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Parcelable f2633OooO0Oo = null;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f2635OooO0o0 = 0;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f2634OooO0o = 0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public ColorStateList f2636OooO0oO = null;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public PorterDuff.Mode f2637OooO0oo = f2628OooOO0O;

    /* renamed from: OooO  reason: collision with root package name */
    public String f2629OooO = null;

    public final String toString() {
        String str;
        int height;
        int i;
        if (this.f2630OooO00o == -1) {
            return String.valueOf(this.f2631OooO0O0);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2630OooO00o) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f2630OooO00o) {
            case 1:
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2631OooO0O0).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f2631OooO0O0).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2638OooOO0);
                sb.append(" id=");
                Object[] objArr = new Object[1];
                int i2 = this.f2630OooO00o;
                if (i2 == -1) {
                    int i3 = Build.VERSION.SDK_INT;
                    Object obj = this.f2631OooO0O0;
                    if (i3 >= 28) {
                        i = o0OO00O.OooO00o(obj);
                    } else {
                        try {
                            i = ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                            i = 0;
                        }
                    }
                } else if (i2 == 2) {
                    i = this.f2635OooO0o0;
                } else {
                    throw new IllegalStateException("called getResId() on " + this);
                }
                objArr[0] = Integer.valueOf(i);
                sb.append(String.format("0x%08x", objArr));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2635OooO0o0);
                if (this.f2634OooO0o != 0) {
                    sb.append(" off=");
                    height = this.f2634OooO0o;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2631OooO0O0);
                break;
        }
        if (this.f2636OooO0oO != null) {
            sb.append(" tint=");
            sb.append(this.f2636OooO0oO);
        }
        if (this.f2637OooO0oo != f2628OooOO0O) {
            sb.append(" mode=");
            sb.append(this.f2637OooO0oo);
        }
        sb.append(")");
        return sb.toString();
    }
}