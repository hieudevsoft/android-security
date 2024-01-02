package androidx.appcompat.widget;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class o00O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final Field f2322OooO00o;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f2322OooO00o = field;
    }
}