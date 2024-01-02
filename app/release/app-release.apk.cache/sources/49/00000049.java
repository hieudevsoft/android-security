package OooO0o;

import OooO0oO.o00O00OO;
import OooO0oO.o00O00o0;
import OooO0oO.o00O0O0O;
import OooOooo.o000O;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class OooOo00 {

    /* renamed from: OooO  reason: collision with root package name */
    public int f282OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Menu f283OooO00o;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f290OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int f291OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public CharSequence f292OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public CharSequence f293OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public char f294OooOOO;
    public int OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public int f295OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public char f296OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public int f297OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public int f298OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public boolean f299OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public String f300OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public boolean f301OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public boolean f302OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public int f303OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public int f304OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public o00O00o0 f305OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public String f306OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public CharSequence f307OooOoOO;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public CharSequence f309OooOoo0;

    /* renamed from: OooOooo  reason: collision with root package name */
    public final /* synthetic */ OooOo f311OooOooo;

    /* renamed from: OooOoo  reason: collision with root package name */
    public ColorStateList f308OooOoo = null;

    /* renamed from: OooOooO  reason: collision with root package name */
    public PorterDuff.Mode f310OooOooO = null;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f284OooO0O0 = 0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f285OooO0OO = 0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f286OooO0Oo = 0;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f288OooO0o0 = 0;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f287OooO0o = true;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f289OooO0oO = true;

    public OooOo00(OooOo oooOo, Menu menu) {
        this.f311OooOooo = oooOo;
        this.f283OooO00o = menu;
    }

    public final void OooO00o(MenuItem menuItem) {
        boolean z;
        Object obj;
        MenuItem enabled = menuItem.setChecked(this.f299OooOOoo).setVisible(this.f302OooOo00).setEnabled(this.f301OooOo0);
        boolean z2 = false;
        if (this.f297OooOOo >= 1) {
            z = true;
        } else {
            z = false;
        }
        enabled.setCheckable(z).setTitleCondensed(this.f293OooOO0o).setIcon(this.OooOOO0);
        int i = this.f303OooOo0O;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f306OooOoO0;
        OooOo oooOo = this.f311OooOooo;
        if (str != null) {
            if (!oooOo.f280OooO0OO.isRestricted()) {
                if (oooOo.f281OooO0Oo == null) {
                    oooOo.f281OooO0Oo = OooOo.OooO00o(oooOo.f280OooO0OO);
                }
                menuItem.setOnMenuItemClickListener(new OooOOOO(oooOo.f281OooO0Oo, this.f306OooOoO0));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f297OooOOo >= 2) {
            if (menuItem instanceof o00O00OO) {
                o00O00OO o00o00oo = (o00O00OO) menuItem;
                o00o00oo.f430OooOo = (o00o00oo.f430OooOo & (-5)) | 4;
            } else if (menuItem instanceof o00O0O0O) {
                o00O0O0O o00o0o0o = (o00O0O0O) menuItem;
                try {
                    Method method = o00o0o0o.f447OooO0o0;
                    OooOoO.o000oOoO o000oooo = o00o0o0o.f446OooO0Oo;
                    if (method == null) {
                        o00o0o0o.f447OooO0o0 = o000oooo.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    o00o0o0o.f447OooO0o0.invoke(o000oooo, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str2 = this.f300OooOo;
        if (str2 != null) {
            Class<?>[] clsArr = OooOo.f277OooO0o0;
            Object[] objArr = oooOo.f278OooO00o;
            try {
                Constructor<?> constructor = Class.forName(str2, false, oooOo.f280OooO0OO.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                obj = constructor.newInstance(objArr);
            } catch (Exception unused2) {
                obj = null;
            }
            menuItem.setActionView((View) obj);
            z2 = true;
        }
        int i2 = this.f304OooOo0o;
        if (i2 > 0 && !z2) {
            menuItem.setActionView(i2);
        }
        o00O00o0 o00o00o0 = this.f305OooOoO;
        if (o00o00o0 != null && (menuItem instanceof OooOoO.o000oOoO)) {
            ((OooOoO.o000oOoO) menuItem).OooO0O0(o00o00o0);
        }
        CharSequence charSequence = this.f307OooOoOO;
        boolean z3 = menuItem instanceof OooOoO.o000oOoO;
        if (z3) {
            ((OooOoO.o000oOoO) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            o000O.OooO0oo(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f309OooOoo0;
        if (z3) {
            ((OooOoO.o000oOoO) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            o000O.OooOOO0(menuItem, charSequence2);
        }
        char c = this.f294OooOOO;
        int i3 = this.f295OooOOOO;
        if (z3) {
            ((OooOoO.o000oOoO) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            o000O.OooO0oO(menuItem, c, i3);
        }
        char c2 = this.f296OooOOOo;
        int i4 = this.f298OooOOo0;
        if (z3) {
            ((OooOoO.o000oOoO) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            o000O.OooOO0O(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.f310OooOooO;
        if (mode != null) {
            if (z3) {
                ((OooOoO.o000oOoO) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                o000O.OooOO0(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f308OooOoo;
        if (colorStateList != null) {
            if (z3) {
                ((OooOoO.o000oOoO) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                o000O.OooO(menuItem, colorStateList);
            }
        }
    }
}