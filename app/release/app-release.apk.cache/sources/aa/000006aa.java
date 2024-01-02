package o0OO00O;

import java.util.Arrays;
import o00000.o000OO;
import o00000.o0O0ooO;

/* loaded from: classes.dex */
public final class OooOOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f5306OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final byte[] f5307OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o000OO f5308OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o0O0ooO f5309OooO0Oo;

    public OooOOO0(Object obj, byte[] bArr, o000OO o000oo, o0O0ooO o0o0ooo) {
        this.f5306OooO00o = obj;
        this.f5307OooO0O0 = Arrays.copyOf(bArr, bArr.length);
        this.f5308OooO0OO = o000oo;
        this.f5309OooO0Oo = o0o0ooo;
    }

    public final byte[] OooO00o() {
        byte[] bArr = this.f5307OooO0O0;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}