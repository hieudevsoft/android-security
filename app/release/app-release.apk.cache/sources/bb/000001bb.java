package Oooo00o;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class OooOOO implements OooOOOO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final InputContentInfo f1443OooO00o;

    public OooOOO(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f1443OooO00o = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // Oooo00o.OooOOOO
    public final ClipDescription OooO00o() {
        return this.f1443OooO00o.getDescription();
    }

    @Override // Oooo00o.OooOOOO
    public final void OooO0O0() {
        this.f1443OooO00o.requestPermission();
    }

    @Override // Oooo00o.OooOOOO
    public final Uri OooO0OO() {
        return this.f1443OooO00o.getLinkUri();
    }

    @Override // Oooo00o.OooOOOO
    public final Object OooO0Oo() {
        return this.f1443OooO00o;
    }

    @Override // Oooo00o.OooOOOO
    public final Uri OooO0o0() {
        return this.f1443OooO00o.getContentUri();
    }

    public OooOOO(Object obj) {
        this.f1443OooO00o = (InputContentInfo) obj;
    }
}