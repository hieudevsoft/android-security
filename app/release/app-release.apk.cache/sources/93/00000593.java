package o0000Oo;

import java.util.concurrent.TimeUnit;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class OooOO0 {

    /* renamed from: OooOOO  reason: collision with root package name */
    public static final /* synthetic */ int f4179OooOOO = 0;

    /* renamed from: OooO  reason: collision with root package name */
    public final int f4180OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final boolean f4181OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final boolean f4182OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f4183OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f4184OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final boolean f4185OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final boolean f4186OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final boolean f4187OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final int f4188OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final boolean f4189OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final boolean f4190OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final boolean f4191OooOO0o;
    public String OooOOO0;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OooO00o.OooOoo0(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public OooOO0(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f4181OooO00o = z;
        this.f4182OooO0O0 = z2;
        this.f4183OooO0OO = i;
        this.f4184OooO0Oo = i2;
        this.f4186OooO0o0 = z3;
        this.f4185OooO0o = z4;
        this.f4187OooO0oO = z5;
        this.f4188OooO0oo = i3;
        this.f4180OooO = i4;
        this.f4189OooOO0 = z6;
        this.f4190OooOO0O = z7;
        this.f4191OooOO0o = z8;
        this.OooOOO0 = str;
    }

    public final String toString() {
        String str = this.OooOOO0;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f4181OooO00o) {
                sb.append("no-cache, ");
            }
            if (this.f4182OooO0O0) {
                sb.append("no-store, ");
            }
            int i = this.f4183OooO0OO;
            if (i != -1) {
                sb.append("max-age=");
                sb.append(i);
                sb.append(", ");
            }
            int i2 = this.f4184OooO0Oo;
            if (i2 != -1) {
                sb.append("s-maxage=");
                sb.append(i2);
                sb.append(", ");
            }
            if (this.f4186OooO0o0) {
                sb.append("private, ");
            }
            if (this.f4185OooO0o) {
                sb.append("public, ");
            }
            if (this.f4187OooO0oO) {
                sb.append("must-revalidate, ");
            }
            int i3 = this.f4188OooO0oo;
            if (i3 != -1) {
                sb.append("max-stale=");
                sb.append(i3);
                sb.append(", ");
            }
            int i4 = this.f4180OooO;
            if (i4 != -1) {
                sb.append("min-fresh=");
                sb.append(i4);
                sb.append(", ");
            }
            if (this.f4189OooOO0) {
                sb.append("only-if-cached, ");
            }
            if (this.f4190OooOO0O) {
                sb.append("no-transform, ");
            }
            if (this.f4191OooOO0o) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            OooO00o.OooOoOO(sb2, "StringBuilder().apply(builderAction).toString()");
            this.OooOOO0 = sb2;
            return sb2;
        }
        return str;
    }
}