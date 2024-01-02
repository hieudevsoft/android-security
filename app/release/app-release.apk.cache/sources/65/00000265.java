package androidx.activity;

import OooOoo0.o00000O;
import OoooOOO.o0OO000;
import OoooOOO.o0OO000o;
import OoooOOO.oo0oO0;
import OoooOOO.oo0ooO;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.o00000OO;
import androidx.lifecycle.o0000O;
import androidx.lifecycle.o0000O00;
import androidx.lifecycle.o000OO;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class Oooo000 extends OooOo0.o00Oo0 implements o0000O, androidx.lifecycle.OooOOO0, oo0ooO, o0OO00O, androidx.activity.result.OooOO0 {

    /* renamed from: OooO */
    public final o000oOoO f1937OooO;

    /* renamed from: OooO0O0 */
    public final OooO00o.OooO00o f1938OooO0O0 = new OooO00o.OooO00o();

    /* renamed from: OooO0OO */
    public final androidx.activity.result.OooO0o f1939OooO0OO = new androidx.activity.result.OooO0o(new OooO0o(0, this));

    /* renamed from: OooO0Oo */
    public final androidx.lifecycle.o00oO0o f1940OooO0Oo;

    /* renamed from: OooO0o */
    public o000OO f1941OooO0o;

    /* renamed from: OooO0o0 */
    public final oo0oO0 f1942OooO0o0;

    /* renamed from: OooO0oO */
    public o0Oo0oo f1943OooO0oO;

    /* renamed from: OooO0oo */
    public final OooOo f1944OooO0oo;

    /* renamed from: OooOO0 */
    public final OooOOO0 f1945OooOO0;

    /* renamed from: OooOO0O */
    public final CopyOnWriteArrayList f1946OooOO0O;

    /* renamed from: OooOO0o */
    public final CopyOnWriteArrayList f1947OooOO0o;

    /* renamed from: OooOOO */
    public final CopyOnWriteArrayList f1948OooOOO;
    public final CopyOnWriteArrayList OooOOO0;

    /* renamed from: OooOOOO */
    public final CopyOnWriteArrayList f1949OooOOOO;

    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.activity.OooO] */
    public Oooo000() {
        boolean z = false;
        androidx.lifecycle.o00oO0o o00oo0o = new androidx.lifecycle.o00oO0o(this);
        this.f1940OooO0Oo = o00oo0o;
        oo0oO0 OooO0o02 = o0ooOO0.OooOOO0.OooO0o0(this);
        this.f1942OooO0o0 = OooO0o02;
        o0OO000 o0oo000 = null;
        this.f1943OooO0oO = null;
        final androidx.fragment.app.o0ooOOo o0ooooo = (androidx.fragment.app.o0ooOOo) this;
        OooOo oooOo = new OooOo(o0ooooo);
        this.f1944OooO0oo = oooOo;
        this.f1937OooO = new o000oOoO(oooOo, new o0000O0O.OooO00o() { // from class: androidx.activity.OooO
            @Override // o0000O0O.OooO00o
            public final Object OooO00o() {
                o0ooooo.reportFullyDrawn();
                return null;
            }
        });
        new AtomicInteger();
        this.f1945OooOO0 = new OooOOO0();
        this.f1946OooOO0O = new CopyOnWriteArrayList();
        this.f1947OooOO0o = new CopyOnWriteArrayList();
        this.OooOOO0 = new CopyOnWriteArrayList();
        this.f1948OooOOO = new CopyOnWriteArrayList();
        this.f1949OooOOOO = new CopyOnWriteArrayList();
        o00oo0o.OooO00o(new androidx.lifecycle.o00O0O() { // from class: androidx.activity.ComponentActivity$2
            @Override // androidx.lifecycle.o00O0O
            public final void OooO0O0(androidx.lifecycle.o00Ooo o00ooo2, androidx.lifecycle.OooOo oooOo2) {
                View view;
                if (oooOo2 == androidx.lifecycle.OooOo.ON_STOP) {
                    Window window = o0ooooo.getWindow();
                    if (window != null) {
                        view = window.peekDecorView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            }
        });
        o00oo0o.OooO00o(new androidx.lifecycle.o00O0O() { // from class: androidx.activity.ComponentActivity$3
            @Override // androidx.lifecycle.o00O0O
            public final void OooO0O0(androidx.lifecycle.o00Ooo o00ooo2, androidx.lifecycle.OooOo oooOo2) {
                if (oooOo2 == androidx.lifecycle.OooOo.ON_DESTROY) {
                    o0ooooo.f1938OooO0O0.f16OooO0O0 = null;
                    if (!o0ooooo.isChangingConfigurations()) {
                        o0ooooo.OooO0OO().OooO00o();
                    }
                    OooOo oooOo3 = o0ooooo.f1944OooO0oo;
                    Oooo000 oooo000 = oooOo3.f1932OooO0Oo;
                    oooo000.getWindow().getDecorView().removeCallbacks(oooOo3);
                    oooo000.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(oooOo3);
                }
            }
        });
        o00oo0o.OooO00o(new androidx.lifecycle.o00O0O() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.o00O0O
            public final void OooO0O0(androidx.lifecycle.o00Ooo o00ooo2, androidx.lifecycle.OooOo oooOo2) {
                Oooo000 oooo000 = o0ooooo;
                if (oooo000.f1941OooO0o == null) {
                    OooOo00 oooOo00 = (OooOo00) oooo000.getLastNonConfigurationInstance();
                    if (oooOo00 != null) {
                        oooo000.f1941OooO0o = oooOo00.f1933OooO00o;
                    }
                    if (oooo000.f1941OooO0o == null) {
                        oooo000.f1941OooO0o = new o000OO();
                    }
                }
                oooo000.f1940OooO0Oo.OooO0O0(this);
            }
        });
        OooO0o02.OooO00o();
        androidx.lifecycle.Oooo000 oooo000 = o00oo0o.f3092OooO0OO;
        if ((oooo000 == androidx.lifecycle.Oooo000.INITIALIZED || oooo000 == androidx.lifecycle.Oooo000.CREATED) ? true : true) {
            o0OO000o o0oo000o = OooO0o02.f1576OooO0O0;
            o0oo000o.getClass();
            Iterator it = o0oo000o.f1569OooO00o.iterator();
            while (true) {
                OooO.OooO oooO = (OooO.OooO) it;
                if (!oooO.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) oooO.next();
                o0000O00.OooO00o.OooOoOO(entry, "components");
                o0OO000 o0oo0002 = (o0OO000) entry.getValue();
                if (o0000O00.OooO00o.OooOOO0((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    o0oo000 = o0oo0002;
                    break;
                }
            }
            if (o0oo000 == null) {
                o0000O00 o0000o00 = new o0000O00(this.f1942OooO0o0.f1576OooO0O0, o0ooooo);
                this.f1942OooO0o0.f1576OooO0O0.OooO0OO("androidx.lifecycle.internal.SavedStateHandlesProvider", o0000o00);
                this.f1940OooO0Oo.OooO00o(new SavedStateHandleAttacher(o0000o00));
            }
            this.f1942OooO0o0.f1576OooO0O0.OooO0OO("android:support:activity-result", new o0OO000() { // from class: androidx.activity.OooOO0
                @Override // OoooOOO.o0OO000
                public final Bundle OooO00o() {
                    Oooo000 oooo0002 = o0ooooo;
                    oooo0002.getClass();
                    Bundle bundle = new Bundle();
                    OooOOO0 oooOOO0 = oooo0002.f1945OooOO0;
                    oooOOO0.getClass();
                    HashMap hashMap = oooOOO0.f1923OooO0O0;
                    bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                    bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                    bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(oooOOO0.f1925OooO0Oo));
                    bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) oooOOO0.f1928OooO0oO.clone());
                    return bundle;
                }
            });
            OooOO0(new OooO00o.OooO0O0() { // from class: androidx.activity.OooOO0O
                @Override // OooO00o.OooO0O0
                public final void OooO00o() {
                    Oooo000 oooo0002 = o0ooooo;
                    Bundle OooO00o2 = oooo0002.f1942OooO0o0.f1576OooO0O0.OooO00o("android:support:activity-result");
                    if (OooO00o2 != null) {
                        OooOOO0 oooOOO0 = oooo0002.f1945OooOO0;
                        oooOOO0.getClass();
                        ArrayList<Integer> integerArrayList = OooO00o2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                        ArrayList<String> stringArrayList = OooO00o2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                        if (stringArrayList != null && integerArrayList != null) {
                            oooOOO0.f1925OooO0Oo = OooO00o2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                            Bundle bundle = OooO00o2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                            Bundle bundle2 = oooOOO0.f1928OooO0oO;
                            bundle2.putAll(bundle);
                            for (int i = 0; i < stringArrayList.size(); i++) {
                                String str = stringArrayList.get(i);
                                HashMap hashMap = oooOOO0.f1923OooO0O0;
                                boolean containsKey = hashMap.containsKey(str);
                                HashMap hashMap2 = oooOOO0.f1922OooO00o;
                                if (containsKey) {
                                    Integer num = (Integer) hashMap.remove(str);
                                    if (!bundle2.containsKey(str)) {
                                        hashMap2.remove(num);
                                    }
                                }
                                int intValue = integerArrayList.get(i).intValue();
                                String str2 = stringArrayList.get(i);
                                hashMap2.put(Integer.valueOf(intValue), str2);
                                hashMap.put(str2, Integer.valueOf(intValue));
                            }
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static /* synthetic */ void OooO(Oooo000 oooo000) {
        super.onBackPressed();
    }

    @Override // androidx.lifecycle.OooOOO0
    public final OoooO00.OooO0OO OooO00o() {
        OoooO00.OooO oooO = new OoooO00.OooO(OoooO00.OooO0O0.f1552OooO0O0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = oooO.f1553OooO00o;
        if (application != null) {
            linkedHashMap.put(OooOoo.o0ooOOo.f1226OooO0o, getApplication());
        }
        linkedHashMap.put(o0000O00.OooO00o.f4152OoooO00, this);
        linkedHashMap.put(o0000O00.OooO00o.f4151OoooO0, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(o0000O00.OooO00o.f4153OoooO0O, getIntent().getExtras());
        }
        return oooO;
    }

    @Override // OoooOOO.oo0ooO
    public final o0OO000o OooO0O0() {
        return this.f1942OooO0o0.f1576OooO0O0;
    }

    @Override // androidx.lifecycle.o0000O
    public final o000OO OooO0OO() {
        if (getApplication() != null) {
            if (this.f1941OooO0o == null) {
                OooOo00 oooOo00 = (OooOo00) getLastNonConfigurationInstance();
                if (oooOo00 != null) {
                    this.f1941OooO0o = oooOo00.f1933OooO00o;
                }
                if (this.f1941OooO0o == null) {
                    this.f1941OooO0o = new o000OO();
                }
            }
            return this.f1941OooO0o;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.lifecycle.o00Ooo
    public final androidx.lifecycle.o00oO0o OooO0oO() {
        return this.f1940OooO0Oo;
    }

    public final void OooOO0(OooO00o.OooO0O0 oooO0O0) {
        OooO00o.OooO00o oooO00o = this.f1938OooO0O0;
        oooO00o.getClass();
        if (oooO00o.f16OooO0O0 != null) {
            oooO0O0.OooO00o();
        }
        oooO00o.f15OooO00o.add(oooO0O0);
    }

    public final o0Oo0oo OooOO0O() {
        if (this.f1943OooO0oO == null) {
            this.f1943OooO0oO = new o0Oo0oo(new OooOOO(0, this));
            this.f1940OooO0Oo.OooO00o(new androidx.lifecycle.o00O0O() { // from class: androidx.activity.ComponentActivity$6
                @Override // androidx.lifecycle.o00O0O
                public final void OooO0O0(androidx.lifecycle.o00Ooo o00ooo2, androidx.lifecycle.OooOo oooOo) {
                    if (oooOo == androidx.lifecycle.OooOo.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                        o0Oo0oo o0oo0oo = Oooo000.this.f1943OooO0oO;
                        OnBackInvokedDispatcher OooO00o2 = OooOOOO.OooO00o((Oooo000) o00ooo2);
                        o0oo0oo.getClass();
                        o0000O00.OooO00o.OooOoo0(OooO00o2, "invoker");
                        o0oo0oo.f1965OooO0o0 = OooO00o2;
                        o0oo0oo.OooO0OO(o0oo0oo.f1966OooO0oO);
                    }
                }
            });
        }
        return this.f1943OooO0oO;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f1945OooOO0.OooO00o(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        OooOO0O().OooO0O0();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f1946OooOO0O.iterator();
        while (it.hasNext()) {
            ((o00000O) ((OooOooO.o0000O00) it.next())).OooO0O0(configuration);
        }
    }

    @Override // OooOo0.o00Oo0, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1942OooO0o0.OooO0O0(bundle);
        OooO00o.OooO00o oooO00o = this.f1938OooO0O0;
        oooO00o.getClass();
        oooO00o.f16OooO0O0 = this;
        Iterator it = oooO00o.f15OooO00o.iterator();
        while (it.hasNext()) {
            ((OooO00o.OooO0O0) it.next()).OooO00o();
        }
        super.onCreate(bundle);
        int i = o00000OO.f3078OooO0O0;
        o0ooOO0.OooOOO0.OooOOOo(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.f1939OooO0OO.f1983OooO0OO).iterator();
            if (it.hasNext()) {
                OooO0O0.OooO00o.OooO0oO(it.next());
                throw null;
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f1939OooO0OO.f1983OooO0OO).iterator();
            if (it.hasNext()) {
                OooO0O0.OooO00o.OooO0oO(it.next());
                throw null;
            }
            return false;
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        super.onMultiWindowModeChanged(z, configuration);
        Iterator it = this.f1948OooOOO.iterator();
        while (it.hasNext()) {
            ((o00000O) ((OooOooO.o0000O00) it.next())).OooO0O0(new OooOo0.o00Ooo(z, configuration));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.OooOOO0.iterator();
        while (it.hasNext()) {
            ((o00000O) ((OooOooO.o0000O00) it.next())).OooO0O0(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f1939OooO0OO.f1983OooO0OO).iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            OooO0O0.OooO00o.OooO0oO(it.next());
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        super.onPictureInPictureModeChanged(z, configuration);
        Iterator it = this.f1949OooOOOO.iterator();
        while (it.hasNext()) {
            ((o00000O) ((OooOooO.o0000O00) it.next())).OooO0O0(new OooOo0.o00Ooo(z, configuration));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.f1939OooO0OO.f1983OooO0OO).iterator();
            if (it.hasNext()) {
                OooO0O0.OooO00o.OooO0oO(it.next());
                throw null;
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f1945OooOO0.OooO00o(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        OooOo00 oooOo00;
        o000OO o000oo = this.f1941OooO0o;
        if (o000oo == null && (oooOo00 = (OooOo00) getLastNonConfigurationInstance()) != null) {
            o000oo = oooOo00.f1933OooO00o;
        }
        if (o000oo == null) {
            return null;
        }
        OooOo00 oooOo002 = new OooOo00();
        oooOo002.f1933OooO00o = o000oo;
        return oooOo002;
    }

    @Override // OooOo0.o00Oo0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.o00oO0o o00oo0o = this.f1940OooO0Oo;
        if (o00oo0o instanceof androidx.lifecycle.o00oO0o) {
            o00oo0o.OooO0oO();
        }
        super.onSaveInstanceState(bundle);
        this.f1942OooO0o0.OooO0OO(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f1947OooOO0o.iterator();
        while (it.hasNext()) {
            ((o00000O) ((OooOooO.o0000O00) it.next())).OooO0O0(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (o0000O00.OooO00o.o0000O0O()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f1937OooO.OooO00o();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        View decorView = getWindow().getDecorView();
        o0000O00.OooO00o.OooOoo0(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        o0000O00.OooO00o.OooOoo0(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        o0000O00.OooO00o.OooOoo0(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        o0000O00.OooO00o.OooOoo0(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        o0000O00.OooO00o.OooOoo0(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        OooOo oooOo = this.f1944OooO0oo;
        if (!oooOo.f1931OooO0OO) {
            oooOo.f1931OooO0OO = true;
            decorView6.getViewTreeObserver().addOnDrawListener(oooOo);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}