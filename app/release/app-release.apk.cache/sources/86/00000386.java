package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OooO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final /* synthetic */ int[] f3047OooO00o;

    static {
        int[] iArr = new int[OooOo.values().length];
        try {
            iArr[OooOo.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OooOo.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OooOo.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OooOo.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OooOo.ON_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[OooOo.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[OooOo.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f3047OooO00o = iArr;
    }
}