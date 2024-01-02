package OooO0Oo;

import OoooOOO.o0OO000;
import OoooOOO.o0OO000o;
import android.os.Bundle;
import hieubui.eup.android_app_security.MainActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class OooOo00 implements o0OO000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f89OooO00o = 1;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f90OooO0O0;

    public OooOo00(o0OO000o o0oo000o) {
        OooO00o.OooOoo0(o0oo000o, "registry");
        this.f90OooO0O0 = new LinkedHashSet();
        o0oo000o.OooO0OO("androidx.savedstate.Restarter", this);
    }

    @Override // OoooOOO.o0OO000
    public final Bundle OooO00o() {
        int i = this.f89OooO00o;
        Object obj = this.f90OooO0O0;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((Oooo000) obj).OooOOO0().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((Set) obj));
                return bundle2;
        }
    }

    public OooOo00(MainActivity mainActivity) {
        this.f90OooO0O0 = mainActivity;
    }
}