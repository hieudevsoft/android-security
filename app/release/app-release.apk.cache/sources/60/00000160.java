package OooOooo;

import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class o0O00OO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final Field f1326OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final Field f1327OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final Field f1328OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final boolean f1329OooO0Oo;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f1326OooO00o = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f1327OooO0O0 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f1328OooO0OO = declaredField3;
            declaredField3.setAccessible(true);
            f1329OooO0Oo = true;
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
    }
}