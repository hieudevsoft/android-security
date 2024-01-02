package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class o0ooOOo extends androidx.activity.Oooo000 {

    /* renamed from: OooOOOo  reason: collision with root package name */
    public final OooOo f3033OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public boolean f3034OooOOo;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public boolean f3036OooOOoo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final androidx.lifecycle.o00oO0o f3035OooOOo0 = new androidx.lifecycle.o00oO0o(this);

    /* renamed from: OooOo00  reason: collision with root package name */
    public boolean f3037OooOo00 = true;

    public o0ooOOo() {
        OooO0Oo.Oooo000 oooo000 = (OooO0Oo.Oooo000) this;
        this.f3033OooOOOo = new OooOo(2, new o00oO0o(oooo000));
        this.f1942OooO0o0.f1576OooO0O0.OooO0OO("android:support:fragments", new o00Ooo(oooo000));
        OooOO0(new oo000o(oooo000));
    }

    public static boolean OooOO0o(o0000oo o0000ooVar) {
        o0ooOOo o0ooooo;
        boolean z;
        boolean z2;
        boolean z3 = false;
        for (o00Oo0 o00oo0 : o0000ooVar.f2866OooO0OO.OooO0o()) {
            if (o00oo0 != null) {
                o00oO0o o00oo0o = o00oo0.f2967OooOOoo;
                if (o00oo0o == null) {
                    o0ooooo = null;
                } else {
                    o0ooooo = o00oo0o.f2996OoooOOo;
                }
                if (o0ooooo != null) {
                    z3 |= OooOO0o(o00oo0.OooO0oo());
                }
                o000OO00 o000oo00 = o00oo0.f2989Oooo0oO;
                androidx.lifecycle.Oooo000 oooo000 = androidx.lifecycle.Oooo000.STARTED;
                if (o000oo00 != null) {
                    o000oo00.OooO0o0();
                    if (o000oo00.f2927OooO0O0.f3092OooO0OO.compareTo(oooo000) >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        o00oo0.f2989Oooo0oO.f2927OooO0O0.OooO0oO();
                        z3 = true;
                    }
                }
                if (o00oo0.f2987Oooo0o.f3092OooO0OO.compareTo(oooo000) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    o00oo0.f2987Oooo0o.OooO0oO();
                    z3 = true;
                }
            }
        }
        return z3;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f3034OooOOo);
        printWriter.print(" mResumed=");
        printWriter.print(this.f3036OooOOoo);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3037OooOo00);
        if (getApplication() != null) {
            OooOO0.OooOo00 oooOo00 = ((OoooO0.o00oO0o) new androidx.activity.result.OooO0o(OooO0OO(), OoooO0.o00oO0o.f1550OooO0Oo, 0).OooO0oO(OoooO0.o00oO0o.class)).f1551OooO0OO;
            if (oooOo00.f546OooO0OO > 0) {
                printWriter.print(str2);
                printWriter.println("Loaders:");
                if (oooOo00.f546OooO0OO > 0) {
                    OooO0O0.OooO00o.OooO0oO(oooOo00.f545OooO0O0[0]);
                    printWriter.print(str2);
                    printWriter.print("  #");
                    printWriter.print(oooOo00.f544OooO00o[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((o00oO0o) this.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO.OooOo0(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.Oooo000, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f3033OooOOOo.OooO0o0();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.Oooo000, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        OooOo oooOo = this.f3033OooOOOo;
        oooOo.OooO0o0();
        super.onConfigurationChanged(configuration);
        ((o00oO0o) oooOo.f2791OooO0O0).f2995OoooOOO.OooO0oo(configuration);
    }

    @Override // androidx.activity.Oooo000, OooOo0.o00Oo0, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3035OooOOo0.OooO0o0(androidx.lifecycle.OooOo.ON_CREATE);
        o0000oo o0000ooVar = ((o00oO0o) this.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO;
        o0000ooVar.f2888OooOoOO = false;
        o0000ooVar.f2890OooOoo0 = false;
        o0000ooVar.f2896Oooo00o.f2855OooO0oo = false;
        o0000ooVar.OooOOoo(1);
    }

    @Override // androidx.activity.Oooo000, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        super.onCreatePanelMenu(i, menu);
        if (i != 0) {
            return true;
        }
        getMenuInflater();
        return ((o00oO0o) this.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO.OooOO0() | true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((o00oO0o) this.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO.f2868OooO0o.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((o00oO0o) this.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO.OooOO0O();
        this.f3035OooOOo0.OooO0o0(androidx.lifecycle.OooOo.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ((o00oO0o) this.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO.OooOO0o();
    }

    @Override // androidx.activity.Oooo000, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        OooOo oooOo = this.f3033OooOOOo;
        if (i != 0) {
            if (i != 6) {
                return false;
            }
            return ((o00oO0o) oooOo.f2791OooO0O0).f2995OoooOOO.OooO();
        }
        return ((o00oO0o) oooOo.f2791OooO0O0).f2995OoooOOO.OooOOO();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        ((o00oO0o) this.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO.OooOOO0(z);
    }

    @Override // androidx.activity.Oooo000, android.app.Activity
    public final void onNewIntent(Intent intent) {
        this.f3033OooOOOo.OooO0o0();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.Oooo000, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            ((o00oO0o) this.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO.OooOOOO();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f3036OooOOoo = false;
        ((o00oO0o) this.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO.OooOOoo(5);
        this.f3035OooOOo0.OooO0o0(androidx.lifecycle.OooOo.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        ((o00oO0o) this.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO.OooOOo0(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f3035OooOOo0.OooO0o0(androidx.lifecycle.OooOo.ON_RESUME);
        o0000oo o0000ooVar = ((o00oO0o) this.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO;
        o0000ooVar.f2888OooOoOO = false;
        o0000ooVar.f2890OooOoo0 = false;
        o0000ooVar.f2896Oooo00o.f2855OooO0oo = false;
        o0000ooVar.OooOOoo(7);
    }

    @Override // androidx.activity.Oooo000, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            super.onPreparePanel(0, view, menu);
            return ((o00oO0o) this.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO.OooOOo() | true;
        }
        super.onPreparePanel(i, view, menu);
        return true;
    }

    @Override // androidx.activity.Oooo000, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f3033OooOOOo.OooO0o0();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        OooOo oooOo = this.f3033OooOOOo;
        oooOo.OooO0o0();
        super.onResume();
        this.f3036OooOOoo = true;
        ((o00oO0o) oooOo.f2791OooO0O0).f2995OoooOOO.OooOo(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        OooOo oooOo = this.f3033OooOOOo;
        oooOo.OooO0o0();
        super.onStart();
        this.f3037OooOo00 = false;
        boolean z = this.f3034OooOOo;
        Object obj = oooOo.f2791OooO0O0;
        if (!z) {
            this.f3034OooOOo = true;
            o0000oo o0000ooVar = ((o00oO0o) obj).f2995OoooOOO;
            o0000ooVar.f2888OooOoOO = false;
            o0000ooVar.f2890OooOoo0 = false;
            o0000ooVar.f2896Oooo00o.f2855OooO0oo = false;
            o0000ooVar.OooOOoo(4);
        }
        ((o00oO0o) obj).f2995OoooOOO.OooOo(true);
        this.f3035OooOOo0.OooO0o0(androidx.lifecycle.OooOo.ON_START);
        o0000oo o0000ooVar2 = ((o00oO0o) obj).f2995OoooOOO;
        o0000ooVar2.f2888OooOoOO = false;
        o0000ooVar2.f2890OooOoo0 = false;
        o0000ooVar2.f2896Oooo00o.f2855OooO0oo = false;
        o0000ooVar2.OooOOoo(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f3033OooOOOo.OooO0o0();
    }

    @Override // android.app.Activity
    public void onStop() {
        OooOo oooOo;
        super.onStop();
        this.f3037OooOo00 = true;
        do {
            oooOo = this.f3033OooOOOo;
        } while (OooOO0o(((o00oO0o) oooOo.f2791OooO0O0).f2995OoooOOO));
        o0000oo o0000ooVar = ((o00oO0o) oooOo.f2791OooO0O0).f2995OoooOOO;
        o0000ooVar.f2890OooOoo0 = true;
        o0000ooVar.f2896Oooo00o.f2855OooO0oo = true;
        o0000ooVar.OooOOoo(4);
        this.f3035OooOOo0.OooO0o0(androidx.lifecycle.OooOo.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((o00oO0o) this.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO.f2868OooO0o.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}