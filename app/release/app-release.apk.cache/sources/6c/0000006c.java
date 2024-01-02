package OooO0oO;

import OooOO0.OooOOOO;
import OooOoO.Oooo0;
import OooOoO.o000oOoO;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
public class o00OO0O0 extends o000O0O0 implements Menu {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Oooo0 f463OooO0Oo;

    public o00OO0O0(Context context, Oooo0 oooo0) {
        super(context);
        if (oooo0 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f463OooO0Oo = oooo0;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return OooOOO(((o00O00O) this.f463OooO0Oo).add(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((o00O00O) this.f463OooO0Oo).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = OooOOO(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return ((o00O00O) this.f463OooO0Oo).addSubMenu(i);
    }

    @Override // android.view.Menu
    public final void clear() {
        OooOOOO oooOOOO = (OooOOOO) this.f346OooO0O0;
        if (oooOOOO != null) {
            oooOOOO.clear();
        }
        OooOOOO oooOOOO2 = (OooOOOO) this.f347OooO0OO;
        if (oooOOOO2 != null) {
            oooOOOO2.clear();
        }
        ((o00O00O) this.f463OooO0Oo).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((o00O00O) this.f463OooO0Oo).OooO0OO(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return OooOOO(((o00O00O) this.f463OooO0Oo).findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return OooOOO(((o00O00O) this.f463OooO0Oo).getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((o00O00O) this.f463OooO0Oo).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((o00O00O) this.f463OooO0Oo).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return ((o00O00O) this.f463OooO0Oo).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((o00O00O) this.f463OooO0Oo).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((OooOOOO) this.f346OooO0O0) != null) {
            int i2 = 0;
            while (true) {
                OooOOOO oooOOOO = (OooOOOO) this.f346OooO0O0;
                if (i2 >= oooOOOO.f542OooO0OO) {
                    break;
                }
                if (((o000oOoO) oooOOOO.OooO0oo(i2)).getGroupId() == i) {
                    ((OooOOOO) this.f346OooO0O0).OooO(i2);
                    i2--;
                }
                i2++;
            }
        }
        ((o00O00O) this.f463OooO0Oo).removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((OooOOOO) this.f346OooO0O0) != null) {
            int i2 = 0;
            while (true) {
                OooOOOO oooOOOO = (OooOOOO) this.f346OooO0O0;
                if (i2 >= oooOOOO.f542OooO0OO) {
                    break;
                } else if (((o000oOoO) oooOOOO.OooO0oo(i2)).getItemId() == i) {
                    ((OooOOOO) this.f346OooO0O0).OooO(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        ((o00O00O) this.f463OooO0Oo).removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ((o00O00O) this.f463OooO0Oo).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ((o00O00O) this.f463OooO0Oo).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ((o00O00O) this.f463OooO0Oo).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f463OooO0Oo.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((o00O00O) this.f463OooO0Oo).size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return OooOOO(((o00O00O) this.f463OooO0Oo).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return ((o00O00O) this.f463OooO0Oo).addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return OooOOO(((o00O00O) this.f463OooO0Oo).OooO00o(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return ((o00O00O) this.f463OooO0Oo).addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((o00O00O) this.f463OooO0Oo).addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return OooOOO(((o00O00O) this.f463OooO0Oo).OooO00o(0, 0, 0, charSequence));
    }
}