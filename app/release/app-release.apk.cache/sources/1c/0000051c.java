package o00000;

/* loaded from: classes.dex */
public enum o000OO implements com.google.crypto.tink.shaded.protobuf.o000000 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f3992OooO00o;

    o000OO(int i) {
        this.f3992OooO00o = i;
    }

    public final int OooO00o() {
        if (this != UNRECOGNIZED) {
            return this.f3992OooO00o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}