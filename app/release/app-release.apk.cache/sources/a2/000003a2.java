package androidx.lifecycle;

import OoooOOO.o0OO000;
import OoooOOO.o0OO000o;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class o0000O00 implements o0OO000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0OO000o f3082OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f3083OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Bundle f3084OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o00000oo.o00Oo0 f3085OooO0Oo;

    public o0000O00(o0OO000o o0oo000o, androidx.fragment.app.o0ooOOo o0ooooo) {
        o0000O00.OooO00o.OooOoo0(o0oo000o, "savedStateRegistry");
        this.f3082OooO00o = o0oo000o;
        this.f3085OooO0Oo = new o00000oo.o00Oo0(new o0000(0, o0ooooo));
    }

    @Override // OoooOOO.o0OO000
    public final Bundle OooO00o() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3084OooO0OO;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((o0000oo) this.f3085OooO0Oo.OooO00o()).f3088OooO0OO.entrySet().iterator();
        if (!it.hasNext()) {
            this.f3083OooO0O0 = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        String str = (String) entry.getKey();
        OooO0O0.OooO00o.OooO0oO(entry.getValue());
        throw null;
    }
}