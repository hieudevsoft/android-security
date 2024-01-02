package OoooOoo;

import OooO0O0.OooO00o;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class oO000O0O {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final View f1669OooO0O0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final HashMap f1668OooO00o = new HashMap();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ArrayList f1670OooO0OO = new ArrayList();

    public oO000O0O(View view) {
        this.f1669OooO0O0 = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oO000O0O) {
            oO000O0O oo000o0o = (oO000O0O) obj;
            return this.f1669OooO0O0 == oo000o0o.f1669OooO0O0 && this.f1668OooO00o.equals(oo000o0o.f1668OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1668OooO00o.hashCode() + (this.f1669OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        HashMap hashMap;
        String OooO0OO2 = OooO00o.OooO0OO(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1669OooO0O0 + "\n", "    values:");
        for (String str : this.f1668OooO00o.keySet()) {
            OooO0OO2 = OooO0OO2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return OooO0OO2;
    }
}