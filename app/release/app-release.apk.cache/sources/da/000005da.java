package o0000o0o;

import java.net.Proxy;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o0000O0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final /* synthetic */ int[] f4537OooO00o;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f4537OooO00o = iArr;
    }
}