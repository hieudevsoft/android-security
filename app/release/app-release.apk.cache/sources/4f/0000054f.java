package o00000O0;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class o000oOoO extends ThreadLocal {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f4051OooO00o;

    public o000oOoO(o0OoOo0 o0oooo0) {
        this.f4051OooO00o = o0oooo0;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        o0OoOo0 o0oooo0 = this.f4051OooO00o;
        try {
            Mac mac = (Mac) OooOo.f4044OooO0o.OooO00o(o0oooo0.f4056OooO0O0);
            mac.init(o0oooo0.f4057OooO0OO);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}