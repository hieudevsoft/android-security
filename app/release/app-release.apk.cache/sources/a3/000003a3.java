package androidx.lifecycle;

/* loaded from: classes.dex */
public interface o0000O0O {
    default o0000O0 OooO00o(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    default o0000O0 OooO0O0(Class cls, OoooO00.OooO oooO) {
        return OooO00o(cls);
    }
}