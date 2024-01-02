package OooO0Oo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.o00oOoo;
import hieubui.eup.android_app_security.R;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class o0000O00 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object[] f178OooO00o = new Object[2];

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final Class[] f171OooO0O0 = {Context.class, AttributeSet.class};

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final int[] f172OooO0OO = {16843375};

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final int[] f173OooO0Oo = {16844160};

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final int[] f175OooO0o0 = {16844156};

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final int[] f174OooO0o = {16844148};

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final String[] f176OooO0oO = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static final OooOO0.OooOOOO f177OooO0oo = new OooOO0.OooOOOO();

    public androidx.appcompat.widget.o00O0O OooO00o(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.o00O0O(context, attributeSet);
    }

    public androidx.appcompat.widget.o00Ooo OooO0O0(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.o00Ooo(context, attributeSet, R.attr.buttonStyle);
    }

    public androidx.appcompat.widget.oo000o OooO0OO(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.oo000o(context, attributeSet, R.attr.checkboxStyle);
    }

    public androidx.appcompat.widget.o0000Ooo OooO0Oo(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.o0000Ooo(context, attributeSet);
    }

    public final View OooO0o(Context context, String str, String str2) {
        String concat;
        OooOO0.OooOOOO oooOOOO = f177OooO0oo;
        Constructor constructor = (Constructor) oooOOOO.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f171OooO0O0);
            oooOOOO.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f178OooO00o);
    }

    public o00oOoo OooO0o0(Context context, AttributeSet attributeSet) {
        return new o00oOoo(context, attributeSet);
    }
}