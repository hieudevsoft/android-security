package androidx.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.o000000O;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class OooOOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final HashMap f1922OooO00o = new HashMap();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final HashMap f1923OooO0O0 = new HashMap();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final HashMap f1924OooO0OO = new HashMap();

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public ArrayList f1925OooO0Oo = new ArrayList();

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final transient HashMap f1927OooO0o0 = new HashMap();

    /* renamed from: OooO0o  reason: collision with root package name */
    public final HashMap f1926OooO0o = new HashMap();

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final Bundle f1928OooO0oO = new Bundle();

    public final boolean OooO00o(int i, int i2, Intent intent) {
        androidx.activity.result.OooO0OO oooO0OO;
        String str = (String) this.f1922OooO00o.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        androidx.activity.result.OooO oooO = (androidx.activity.result.OooO) this.f1927OooO0o0.get(str);
        if (oooO != null && (oooO0OO = oooO.f1975OooO00o) != null && this.f1925OooO0Oo.contains(str)) {
            ((o000000O) oooO0OO).OooO0O0(oooO.f1976OooO0O0.OooOOO(intent, i2));
            this.f1925OooO0Oo.remove(str);
        } else {
            this.f1926OooO0o.remove(str);
            this.f1928OooO0oO.putParcelable(str, new androidx.activity.result.OooO0O0(intent, i2));
        }
        return true;
    }

    public final androidx.activity.result.OooO0o OooO0O0(String str, OooO0O0.OooO0O0 oooO0O0, o000000O o000000o2) {
        int nextInt;
        HashMap hashMap;
        HashMap hashMap2 = this.f1923OooO0O0;
        if (((Integer) hashMap2.get(str)) == null) {
            do {
                o0000O.OooO0o.f4107OooO00o.getClass();
                nextInt = o0000O.OooO0o.f4108OooO0O0.OooO00o().nextInt(2147418112) + 65536;
                hashMap = this.f1922OooO00o;
            } while (hashMap.containsKey(Integer.valueOf(nextInt)));
            hashMap.put(Integer.valueOf(nextInt), str);
            hashMap2.put(str, Integer.valueOf(nextInt));
        }
        this.f1927OooO0o0.put(str, new androidx.activity.result.OooO(o000000o2, oooO0O0));
        HashMap hashMap3 = this.f1926OooO0o;
        if (hashMap3.containsKey(str)) {
            Object obj = hashMap3.get(str);
            hashMap3.remove(str);
            o000000o2.OooO0O0(obj);
        }
        Bundle bundle = this.f1928OooO0oO;
        androidx.activity.result.OooO0O0 oooO0O02 = (androidx.activity.result.OooO0O0) bundle.getParcelable(str);
        if (oooO0O02 != null) {
            bundle.remove(str);
            o000000o2.OooO0O0(oooO0O0.OooOOO(oooO0O02.f1979OooO0O0, oooO0O02.f1978OooO00o));
        }
        return new androidx.activity.result.OooO0o(this, str, oooO0O0);
    }
}