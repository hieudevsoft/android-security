package OooOooo;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public final class o000 implements o000O000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ContentInfo.Builder f1269OooO00o;

    public o000(ClipData clipData, int i) {
        this.f1269OooO00o = o0000OO0.OooO0o0(clipData, i);
    }

    @Override // OooOooo.o000O000
    public final void OooO00o(Bundle bundle) {
        o0000OO0.OooOO0O(this.f1269OooO00o, bundle);
    }

    @Override // OooOooo.o000O000
    public final void OooO0O0(Uri uri) {
        o0000OO0.OooOO0(this.f1269OooO00o, uri);
    }

    @Override // OooOooo.o000O000
    public final void OooO0o(int i) {
        o0000OO0.OooO(this.f1269OooO00o, i);
    }

    @Override // OooOooo.o000O000
    public final o000O00 OooO0o0() {
        return new o000O00(new OooO0Oo.o0000OO0(o0000OO0.OooO0o(this.f1269OooO00o)));
    }
}