package OooOooo;

import OooOo.OooO0OO;
import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class o0O00OOO extends o0O00oO0 {

    /* renamed from: OooO0o  reason: collision with root package name */
    public static boolean f1330OooO0o = false;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static Field f1331OooO0o0 = null;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static Constructor f1332OooO0oO = null;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static boolean f1333OooO0oo = false;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public WindowInsets f1334OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public OooO0OO f1335OooO0Oo;

    public o0O00OOO() {
        this.f1334OooO0OO = OooO();
    }

    private static WindowInsets OooO() {
        if (!f1330OooO0o) {
            try {
                f1331OooO0o0 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f1330OooO0o = true;
        }
        Field field = f1331OooO0o0;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f1333OooO0oo) {
            try {
                f1332OooO0oO = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f1333OooO0oo = true;
        }
        Constructor constructor = f1332OooO0oO;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // OooOooo.o0O00oO0
    public o0O0OOOo OooO0O0() {
        OooO00o();
        o0O0OOOo OooO0oo2 = o0O0OOOo.OooO0oo(null, this.f1334OooO0OO);
        OooO0OO[] oooO0OOArr = this.f1337OooO0O0;
        o0O0OO0 o0o0oo0 = OooO0oo2.f1355OooO00o;
        o0o0oo0.OooOOOO(oooO0OOArr);
        o0o0oo0.OooOOo0(this.f1335OooO0Oo);
        return OooO0oo2;
    }

    @Override // OooOooo.o0O00oO0
    public void OooO0o0(OooO0OO oooO0OO) {
        this.f1335OooO0Oo = oooO0OO;
    }

    @Override // OooOooo.o0O00oO0
    public void OooO0oO(OooO0OO oooO0OO) {
        WindowInsets windowInsets = this.f1334OooO0OO;
        if (windowInsets != null) {
            this.f1334OooO0OO = windowInsets.replaceSystemWindowInsets(oooO0OO.f1110OooO00o, oooO0OO.f1111OooO0O0, oooO0OO.f1112OooO0OO, oooO0OO.f1113OooO0Oo);
        }
    }

    public o0O00OOO(o0O0OOOo o0o0oooo) {
        super(o0o0oooo);
        this.f1334OooO0OO = o0o0oooo.OooO0oO();
    }
}