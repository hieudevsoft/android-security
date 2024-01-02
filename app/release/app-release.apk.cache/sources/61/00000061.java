package OooO0oO;

import OooO0Oo.o0000OO0;
import OooOoO.o000oOoO;
import OooOoO0.o0OOO0o;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o00O00OO implements o000oOoO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f413OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f414OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f415OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f416OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public CharSequence f417OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public CharSequence f418OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public Intent f419OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public char f420OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public char f421OooOO0;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public Drawable f423OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final o00O00O f424OooOOO;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public o00OO f425OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f426OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public CharSequence f427OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public CharSequence f428OooOOo0;

    /* renamed from: OooOoO  reason: collision with root package name */
    public View f435OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public int f436OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public o00O00o0 f437OooOoOO;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public MenuItem.OnActionExpandListener f439OooOoo0;

    /* renamed from: OooO  reason: collision with root package name */
    public int f412OooO = 4096;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public int f422OooOO0O = 4096;
    public int OooOOO0 = 0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public ColorStateList f429OooOOoo = null;

    /* renamed from: OooOo00  reason: collision with root package name */
    public PorterDuff.Mode f432OooOo00 = null;

    /* renamed from: OooOo0  reason: collision with root package name */
    public boolean f431OooOo0 = false;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public boolean f433OooOo0O = false;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public boolean f434OooOo0o = false;

    /* renamed from: OooOo  reason: collision with root package name */
    public int f430OooOo = 16;

    /* renamed from: OooOoo  reason: collision with root package name */
    public boolean f438OooOoo = false;

    public o00O00OO(o00O00O o00o00o, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f424OooOOO = o00o00o;
        this.f413OooO00o = i2;
        this.f414OooO0O0 = i;
        this.f415OooO0OO = i3;
        this.f416OooO0Oo = i4;
        this.f418OooO0o0 = charSequence;
        this.f436OooOoO0 = i5;
    }

    public static void OooO0OO(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // OooOoO.o000oOoO
    public final o00O00o0 OooO00o() {
        return this.f437OooOoOO;
    }

    @Override // OooOoO.o000oOoO
    public final o000oOoO OooO0O0(o00O00o0 o00o00o0) {
        this.f435OooOoO = null;
        this.f437OooOoOO = o00o00o0;
        this.f424OooOOO.OooOOOo(true);
        o00O00o0 o00o00o02 = this.f437OooOoOO;
        if (o00o00o02 != null) {
            o00o00o02.OooO0Oo(new o0000OO0(3, this));
        }
        return this;
    }

    public final Drawable OooO0Oo(Drawable drawable) {
        if (drawable != null && this.f434OooOo0o && (this.f431OooOo0 || this.f433OooOo0O)) {
            drawable = drawable.mutate();
            if (this.f431OooOo0) {
                o0OOO0o.OooO0oo(drawable, this.f429OooOOoo);
            }
            if (this.f433OooOo0O) {
                o0OOO0o.OooO(drawable, this.f432OooOo00);
            }
            this.f434OooOo0o = false;
        }
        return drawable;
    }

    public final boolean OooO0o() {
        return (this.f430OooOo & 32) == 32;
    }

    public final boolean OooO0o0() {
        o00O00o0 o00o00o0;
        if ((this.f436OooOoO0 & 8) != 0) {
            if (this.f435OooOoO == null && (o00o00o0 = this.f437OooOoOO) != null) {
                this.f435OooOoO = o00o00o0.OooO0O0(this);
            }
            return this.f435OooOoO != null;
        }
        return false;
    }

    public final void OooO0oO(boolean z) {
        this.f430OooOo = z ? this.f430OooOo | 32 : this.f430OooOo & (-33);
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f436OooOoO0 & 8) == 0) {
            return false;
        }
        if (this.f435OooOoO == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f439OooOoo0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f424OooOOO.OooO0Oo(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (OooO0o0()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.f439OooOoo0;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f424OooOOO.OooO0o(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f435OooOoO;
        if (view != null) {
            return view;
        }
        o00O00o0 o00o00o0 = this.f437OooOoOO;
        if (o00o00o0 != null) {
            View OooO0O02 = o00o00o0.OooO0O0(this);
            this.f435OooOoO = OooO0O02;
            return OooO0O02;
        }
        return null;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f422OooOO0O;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f421OooOO0;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f428OooOOo0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f414OooO0O0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f423OooOO0o;
        if (drawable != null) {
            return OooO0Oo(drawable);
        }
        int i = this.OooOOO0;
        if (i != 0) {
            Drawable o0ooOoO2 = OooO00o.o0ooOoO(this.f424OooOOO.f390OooO00o, i);
            this.OooOOO0 = 0;
            this.f423OooOO0o = o0ooOoO2;
            return OooO0Oo(o0ooOoO2);
        }
        return null;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f429OooOOoo;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f432OooOo00;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f419OooO0oO;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f413OooO00o;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f412OooO;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f420OooO0oo;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f415OooO0OO;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f425OooOOOO;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f418OooO0o0;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f417OooO0o;
        return charSequence != null ? charSequence : this.f418OooO0o0;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f427OooOOo;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f425OooOOOO != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f438OooOoo;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f430OooOo & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f430OooOo & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f430OooOo & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o00O00o0 o00o00o0 = this.f437OooOoOO;
        return (o00o00o0 == null || !o00o00o0.OooO0OO()) ? (this.f430OooOo & 8) == 0 : (this.f430OooOo & 8) == 0 && this.f437OooOoOO.OooO00o();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        o00O00O o00o00o = this.f424OooOOO;
        Context context = o00o00o.f390OooO00o;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f435OooOoO = inflate;
        this.f437OooOoOO = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f413OooO00o) > 0) {
            inflate.setId(i2);
        }
        o00o00o.f399OooOO0O = true;
        o00o00o.OooOOOo(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f421OooOO0 == c) {
            return this;
        }
        this.f421OooOO0 = Character.toLowerCase(c);
        this.f424OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f430OooOo;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f430OooOo = i2;
        if (i != i2) {
            this.f424OooOOO.OooOOOo(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        boolean z2;
        int i;
        int i2 = this.f430OooOo;
        int i3 = i2 & 4;
        o00O00O o00o00o = this.f424OooOOO;
        int i4 = 2;
        if (i3 != 0) {
            o00o00o.getClass();
            ArrayList arrayList = o00o00o.f394OooO0o;
            int size = arrayList.size();
            o00o00o.OooOo0o();
            for (int i5 = 0; i5 < size; i5++) {
                o00O00OO o00o00oo = (o00O00OO) arrayList.get(i5);
                if (o00o00oo.f414OooO0O0 == this.f414OooO0O0) {
                    boolean z3 = true;
                    if ((o00o00oo.f430OooOo & 4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && o00o00oo.isCheckable()) {
                        if (o00o00oo != this) {
                            z3 = false;
                        }
                        int i6 = o00o00oo.f430OooOo;
                        int i7 = i6 & (-3);
                        if (z3) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        int i8 = i | i7;
                        o00o00oo.f430OooOo = i8;
                        if (i6 != i8) {
                            o00o00oo.f424OooOOO.OooOOOo(false);
                        }
                    }
                }
            }
            o00o00o.OooOo0O();
        } else {
            int i9 = i2 & (-3);
            if (!z) {
                i4 = 0;
            }
            int i10 = i4 | i9;
            this.f430OooOo = i10;
            if (i2 != i10) {
                o00o00o.OooOOOo(false);
            }
        }
        return this;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final o000oOoO setContentDescription(CharSequence charSequence) {
        this.f428OooOOo0 = charSequence;
        this.f424OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f430OooOo = z ? this.f430OooOo | 16 : this.f430OooOo & (-17);
        this.f424OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f423OooOO0o = null;
        this.OooOOO0 = i;
        this.f434OooOo0o = true;
        this.f424OooOOO.OooOOOo(false);
        return this;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f429OooOOoo = colorStateList;
        this.f431OooOo0 = true;
        this.f434OooOo0o = true;
        this.f424OooOOO.OooOOOo(false);
        return this;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f432OooOo00 = mode;
        this.f433OooOo0O = true;
        this.f434OooOo0o = true;
        this.f424OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f419OooO0oO = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f420OooO0oo == c) {
            return this;
        }
        this.f420OooO0oo = c;
        this.f424OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f439OooOoo0 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f426OooOOOo = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f420OooO0oo = c;
        this.f421OooOO0 = Character.toLowerCase(c2);
        this.f424OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f436OooOoO0 = i;
        o00O00O o00o00o = this.f424OooOOO;
        o00o00o.f399OooOO0O = true;
        o00o00o.OooOOOo(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f424OooOOO.f390OooO00o.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f417OooO0o = charSequence;
        this.f424OooOOO.OooOOOo(false);
        return this;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final o000oOoO setTooltipText(CharSequence charSequence) {
        this.f427OooOOo = charSequence;
        this.f424OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i;
        int i2 = this.f430OooOo;
        int i3 = i2 & (-9);
        boolean z2 = false;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.f430OooOo = i4;
        if (i2 != i4) {
            z2 = true;
        }
        if (z2) {
            o00O00O o00o00o = this.f424OooOOO;
            o00o00o.f397OooO0oo = true;
            o00o00o.OooOOOo(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f418OooO0o0;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f421OooOO0 == c && this.f422OooOO0O == i) {
            return this;
        }
        this.f421OooOO0 = Character.toLowerCase(c);
        this.f422OooOO0O = KeyEvent.normalizeMetaState(i);
        this.f424OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.OooOOO0 = 0;
        this.f423OooOO0o = drawable;
        this.f434OooOo0o = true;
        this.f424OooOOO.OooOOOo(false);
        return this;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f420OooO0oo == c && this.f412OooO == i) {
            return this;
        }
        this.f420OooO0oo = c;
        this.f412OooO = KeyEvent.normalizeMetaState(i);
        this.f424OooOOO.OooOOOo(false);
        return this;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f420OooO0oo = c;
        this.f412OooO = KeyEvent.normalizeMetaState(i);
        this.f421OooOO0 = Character.toLowerCase(c2);
        this.f422OooOO0O = KeyEvent.normalizeMetaState(i2);
        this.f424OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f418OooO0o0 = charSequence;
        this.f424OooOOO.OooOOOo(false);
        o00OO o00oo = this.f425OooOOOO;
        if (o00oo != null) {
            o00oo.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f435OooOoO = view;
        this.f437OooOoOO = null;
        if (view != null && view.getId() == -1 && (i = this.f413OooO00o) > 0) {
            view.setId(i);
        }
        o00O00O o00o00o = this.f424OooOOO;
        o00o00o.f399OooOO0O = true;
        o00o00o.OooOOOo(true);
        return this;
    }
}