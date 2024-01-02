package OooO0Oo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.o0O0000O;
import androidx.appcompat.widget.o0OO00OO;
import androidx.appcompat.widget.o0OO0o00;
import hieubui.eup.android_app_security.MainActivity;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public abstract class Oooo000 extends androidx.fragment.app.o0ooOOo implements Oooo0 {

    /* renamed from: OooOo0  reason: collision with root package name */
    public o00000OO f91OooOo0;

    public Oooo000() {
        MainActivity mainActivity = (MainActivity) this;
        this.f1942OooO0o0.f1576OooO0O0.OooO0OO("androidx:appcompat", new OooOo00(mainActivity));
        OooOO0(new OooOo(mainActivity));
    }

    @Override // OooO0Oo.Oooo0
    public final void OooO0Oo() {
    }

    @Override // OooO0Oo.Oooo0
    public final void OooO0o() {
    }

    @Override // OooO0Oo.Oooo0
    public final void OooO0o0() {
    }

    public final void OooOOO() {
        View decorView = getWindow().getDecorView();
        OooO00o.OooOoo0(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        OooO00o.OooOoo0(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        OooO00o.OooOoo0(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        OooO00o.OooOoo0(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final o00Oo0 OooOOO0() {
        if (this.f91OooOo0 == null) {
            o000OO o000oo = o00Oo0.f234OooO00o;
            this.f91OooOo0 = new o00000OO(this, null, this, this);
        }
        return this.f91OooOo0;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        OooOOO();
        OooOOO0().OooO00o(view, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0208  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(final android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.Oooo000.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((o00000OO) OooOOO0()).OooOoo0();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // OooOo0.o00Oo0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((o00000OO) OooOOO0()).OooOoo0();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        o00000OO o00000oo2 = (o00000OO) OooOOO0();
        o00000oo2.OooOo0o();
        return o00000oo2.f124OooOO0o.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        o00000OO o00000oo2 = (o00000OO) OooOOO0();
        if (o00000oo2.f127OooOOOo == null) {
            o00000oo2.OooOoo0();
            o000O00O o000o00o = o00000oo2.f126OooOOOO;
            if (o000o00o != null) {
                context = o000o00o.OooOOo();
            } else {
                context = o00000oo2.f123OooOO0O;
            }
            o00000oo2.f127OooOOOo = new OooO0o.OooOo(context);
        }
        return o00000oo2.f127OooOOOo;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = o0OO0o00.f2515OooO00o;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        OooOOO0().OooO0O0();
    }

    @Override // androidx.fragment.app.o0ooOOo, androidx.activity.Oooo000, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o00000OO o00000oo2 = (o00000OO) OooOOO0();
        if (o00000oo2.f145Oooo000 && o00000oo2.f136OooOoO) {
            o00000oo2.OooOoo0();
            o000O00O o000o00o = o00000oo2.f126OooOOOO;
            if (o000o00o != null) {
                o000o00o.OooOo0(o000o00o.f197OooO00o.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        androidx.appcompat.widget.o0Oo0oo OooO00o2 = androidx.appcompat.widget.o0Oo0oo.OooO00o();
        Context context = o00000oo2.f123OooOO0O;
        synchronized (OooO00o2) {
            o0O0000O o0o0000o = OooO00o2.f2534OooO00o;
            synchronized (o0o0000o) {
                OooOO0.OooO0o oooO0o = (OooOO0.OooO0o) o0o0000o.f2418OooO0O0.get(context);
                if (oooO0o != null) {
                    oooO0o.OooO00o();
                }
            }
        }
        o00000oo2.f155OoooO0 = new Configuration(o00000oo2.f123OooOO0O.getResources().getConfiguration());
        o00000oo2.OooOOO(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.o0ooOOo, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        OooOOO0().OooO0o();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.o0ooOOo, androidx.activity.Oooo000, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent o000002;
        Intent component;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        o00000OO o00000oo2 = (o00000OO) OooOOO0();
        o00000oo2.OooOoo0();
        o000O00O o000o00o = o00000oo2.f126OooOOOO;
        if (menuItem.getItemId() == 16908332 && o000o00o != null && (((o0OO00OO) o000o00o.f202OooO0o0).f2491OooO0O0 & 4) != 0 && (o000002 = OooO00o.o00000(this)) != null) {
            if (OooOo0.oo000o.OooO0OO(this, o000002)) {
                ArrayList arrayList = new ArrayList();
                Intent o000003 = OooO00o.o00000(this);
                if (o000003 == null) {
                    o000003 = OooO00o.o00000(this);
                }
                if (o000003 != null) {
                    ComponentName component2 = o000003.getComponent();
                    if (component2 == null) {
                        component2 = o000003.resolveActivity(getPackageManager());
                    }
                    int size = arrayList.size();
                    while (true) {
                        try {
                            String o00000O02 = OooO00o.o00000O0(this, component2);
                            if (o00000O02 == null) {
                                component = null;
                            } else {
                                ComponentName componentName = new ComponentName(component2.getPackageName(), o00000O02);
                                if (OooO00o.o00000O0(this, componentName) == null) {
                                    component = Intent.makeMainActivity(componentName);
                                } else {
                                    component = new Intent().setComponent(componentName);
                                }
                            }
                            if (component == null) {
                                break;
                            }
                            arrayList.add(size, component);
                            component2 = component.getComponent();
                        } catch (PackageManager.NameNotFoundException e) {
                            throw new IllegalArgumentException(e);
                        }
                    }
                    arrayList.add(o000003);
                }
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    Object obj = OooOo0.Oooo000.f1139OooO00o;
                    OooOo0O.o00Oo0.OooO00o(this, intentArr, null);
                    try {
                        OooOo0.OooOo.OooO00o(this);
                        return true;
                    } catch (IllegalStateException unused) {
                        finish();
                        return true;
                    }
                }
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            OooOo0.oo000o.OooO0O0(this, o000002);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.o0ooOOo, androidx.activity.Oooo000, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((o00000OO) OooOOO0()).OooOo0o();
    }

    @Override // androidx.fragment.app.o0ooOOo, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        o00000OO o00000oo2 = (o00000OO) OooOOO0();
        o00000oo2.OooOoo0();
        o000O00O o000o00o = o00000oo2.f126OooOOOO;
        if (o000o00o != null) {
            o000o00o.f216OooOo00 = true;
        }
    }

    @Override // androidx.fragment.app.o0ooOOo, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((o00000OO) OooOOO0()).OooOOO(true, false);
    }

    @Override // androidx.fragment.app.o0ooOOo, android.app.Activity
    public final void onStop() {
        super.onStop();
        o00000OO o00000oo2 = (o00000OO) OooOOO0();
        o00000oo2.OooOoo0();
        o000O00O o000o00o = o00000oo2.f126OooOOOO;
        if (o000o00o != null) {
            o000o00o.f216OooOo00 = false;
            OooO0o.Oooo0 oooo0 = o000o00o.f213OooOOoo;
            if (oooo0 != null) {
                oooo0.OooO00o();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        OooOOO0().OooOOO0(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((o00000OO) OooOOO0()).OooOoo0();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        OooOOO();
        OooOOO0().OooO(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((o00000OO) OooOOO0()).f154OoooO = i;
    }

    @Override // androidx.activity.Oooo000, android.app.Activity
    public void setContentView(View view) {
        OooOOO();
        OooOOO0().OooOO0O(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        OooOOO();
        OooOOO0().OooOO0o(view, layoutParams);
    }
}