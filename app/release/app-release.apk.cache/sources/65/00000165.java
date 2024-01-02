package OooOooo;

import OooOo.OooO0OO;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public abstract class o0O0O0O extends o0O0OO0 {

    /* renamed from: OooO  reason: collision with root package name */
    public static Method f1338OooO = null;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static boolean f1339OooO0oo = false;

    /* renamed from: OooOO0  reason: collision with root package name */
    public static Class f1340OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public static Field f1341OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public static Field f1342OooOO0o;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final WindowInsets f1343OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public OooO0OO[] f1344OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public o0O0OOOo f1345OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public OooO0OO f1346OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public OooO0OO f1347OooO0oO;

    public o0O0O0O(o0O0OOOo o0o0oooo, WindowInsets windowInsets) {
        super(o0o0oooo);
        this.f1346OooO0o0 = null;
        this.f1343OooO0OO = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private OooO0OO OooOOo(int i, boolean z) {
        OooO0OO oooO0OO = OooO0OO.f1109OooO0o0;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                oooO0OO = OooO0OO.OooO00o(oooO0OO, OooOOoo(i2, z));
            }
        }
        return oooO0OO;
    }

    private OooO0OO OooOo0(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f1339OooO0oo) {
                OooOo0O();
            }
            Method method = f1338OooO;
            if (method != null && f1340OooOO0 != null && f1341OooOO0O != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) f1341OooOO0O.get(f1342OooOO0o.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return OooO0OO.OooO0O0(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e) {
                    e.getMessage();
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private OooO0OO OooOo00() {
        o0O0OOOo o0o0oooo = this.f1345OooO0o;
        if (o0o0oooo != null) {
            return o0o0oooo.f1355OooO00o.OooO0oo();
        }
        return OooO0OO.f1109OooO0o0;
    }

    @SuppressLint({"PrivateApi"})
    private static void OooOo0O() {
        try {
            f1338OooO = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f1340OooOO0 = cls;
            f1341OooOO0O = cls.getDeclaredField("mVisibleInsets");
            f1342OooOO0o = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f1341OooOO0O.setAccessible(true);
            f1342OooOO0o.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        f1339OooO0oo = true;
    }

    @Override // OooOooo.o0O0OO0
    public void OooO0Oo(View view) {
        OooO0OO OooOo02 = OooOo0(view);
        if (OooOo02 == null) {
            OooOo02 = OooO0OO.f1109OooO0o0;
        }
        OooOo0o(OooOo02);
    }

    @Override // OooOooo.o0O0OO0
    public OooO0OO OooO0o(int i) {
        return OooOOo(i, false);
    }

    @Override // OooOooo.o0O0OO0
    public final OooO0OO OooOO0() {
        if (this.f1346OooO0o0 == null) {
            WindowInsets windowInsets = this.f1343OooO0OO;
            this.f1346OooO0o0 = OooO0OO.OooO0O0(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f1346OooO0o0;
    }

    @Override // OooOooo.o0O0OO0
    public o0O0OOOo OooOO0o(int i, int i2, int i3, int i4) {
        o0O00oO0 o0o00ooo;
        o0O0OOOo OooO0oo2 = o0O0OOOo.OooO0oo(null, this.f1343OooO0OO);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            o0o00ooo = new o0O00o00(OooO0oo2);
        } else if (i5 >= 29) {
            o0o00ooo = new o0oO0Ooo(OooO0oo2);
        } else {
            o0o00ooo = new o0O00OOO(OooO0oo2);
        }
        o0o00ooo.OooO0oO(o0O0OOOo.OooO0o(OooOO0(), i, i2, i3, i4));
        o0o00ooo.OooO0o0(o0O0OOOo.OooO0o(OooO0oo(), i, i2, i3, i4));
        return o0o00ooo.OooO0O0();
    }

    @Override // OooOooo.o0O0OO0
    public boolean OooOOO() {
        return this.f1343OooO0OO.isRound();
    }

    @Override // OooOooo.o0O0OO0
    public void OooOOOO(OooO0OO[] oooO0OOArr) {
        this.f1344OooO0Oo = oooO0OOArr;
    }

    @Override // OooOooo.o0O0OO0
    public void OooOOOo(o0O0OOOo o0o0oooo) {
        this.f1345OooO0o = o0o0oooo;
    }

    public OooO0OO OooOOoo(int i, boolean z) {
        int i2;
        o000O0 OooO0o02;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (i != 1) {
            OooO0OO oooO0OO = null;
            if (i != 2) {
                OooO0OO oooO0OO2 = OooO0OO.f1109OooO0o0;
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i != 128) {
                                    return oooO0OO2;
                                }
                                o0O0OOOo o0o0oooo = this.f1345OooO0o;
                                if (o0o0oooo != null) {
                                    OooO0o02 = o0o0oooo.f1355OooO00o.OooO0o0();
                                } else {
                                    OooO0o02 = OooO0o0();
                                }
                                if (OooO0o02 != null) {
                                    int i7 = Build.VERSION.SDK_INT;
                                    DisplayCutout displayCutout = OooO0o02.f1274OooO00o;
                                    if (i7 >= 28) {
                                        i3 = o000O00O.OooO0Oo(displayCutout);
                                    } else {
                                        i3 = 0;
                                    }
                                    if (i7 >= 28) {
                                        i4 = o000O00O.OooO0o(displayCutout);
                                    } else {
                                        i4 = 0;
                                    }
                                    if (i7 >= 28) {
                                        i5 = o000O00O.OooO0o0(displayCutout);
                                    } else {
                                        i5 = 0;
                                    }
                                    if (i7 >= 28) {
                                        i6 = o000O00O.OooO0OO(displayCutout);
                                    }
                                    return OooO0OO.OooO0O0(i3, i4, i5, i6);
                                }
                                return oooO0OO2;
                            }
                            return OooOO0O();
                        }
                        return OooO0oO();
                    }
                    return OooO();
                }
                OooO0OO[] oooO0OOArr = this.f1344OooO0Oo;
                if (oooO0OOArr != null) {
                    oooO0OO = oooO0OOArr[OooO00o.o0000O00(8)];
                }
                if (oooO0OO != null) {
                    return oooO0OO;
                }
                OooO0OO OooOO02 = OooOO0();
                OooO0OO OooOo002 = OooOo00();
                int i8 = OooOO02.f1113OooO0Oo;
                if (i8 > OooOo002.f1113OooO0Oo) {
                    return OooO0OO.OooO0O0(0, 0, 0, i8);
                }
                OooO0OO oooO0OO3 = this.f1347OooO0oO;
                if (oooO0OO3 != null && !oooO0OO3.equals(oooO0OO2) && (i2 = this.f1347OooO0oO.f1113OooO0Oo) > OooOo002.f1113OooO0Oo) {
                    return OooO0OO.OooO0O0(0, 0, 0, i2);
                }
                return oooO0OO2;
            } else if (z) {
                OooO0OO OooOo003 = OooOo00();
                OooO0OO OooO0oo2 = OooO0oo();
                return OooO0OO.OooO0O0(Math.max(OooOo003.f1110OooO00o, OooO0oo2.f1110OooO00o), 0, Math.max(OooOo003.f1112OooO0OO, OooO0oo2.f1112OooO0OO), Math.max(OooOo003.f1113OooO0Oo, OooO0oo2.f1113OooO0Oo));
            } else {
                OooO0OO OooOO03 = OooOO0();
                o0O0OOOo o0o0oooo2 = this.f1345OooO0o;
                if (o0o0oooo2 != null) {
                    oooO0OO = o0o0oooo2.f1355OooO00o.OooO0oo();
                }
                int i9 = OooOO03.f1113OooO0Oo;
                if (oooO0OO != null) {
                    i9 = Math.min(i9, oooO0OO.f1113OooO0Oo);
                }
                return OooO0OO.OooO0O0(OooOO03.f1110OooO00o, 0, OooOO03.f1112OooO0OO, i9);
            }
        } else if (z) {
            return OooO0OO.OooO0O0(0, Math.max(OooOo00().f1111OooO0O0, OooOO0().f1111OooO0O0), 0, 0);
        } else {
            return OooO0OO.OooO0O0(0, OooOO0().f1111OooO0O0, 0, 0);
        }
    }

    public void OooOo0o(OooO0OO oooO0OO) {
        this.f1347OooO0oO = oooO0OO;
    }

    @Override // OooOooo.o0O0OO0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f1347OooO0oO, ((o0O0O0O) obj).f1347OooO0oO);
        }
        return false;
    }
}