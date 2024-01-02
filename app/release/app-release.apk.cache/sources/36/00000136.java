package OooOooo;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* loaded from: classes.dex */
public final class o000O0o implements o000O000, o000Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1276OooO00o = 1;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ClipData f1277OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f1278OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f1279OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public Bundle f1280OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public Uri f1281OooO0o0;

    public o000O0o(o000O0o o000o0o) {
        ClipData clipData = o000o0o.f1277OooO0O0;
        clipData.getClass();
        this.f1277OooO0O0 = clipData;
        int i = o000o0o.f1278OooO0OO;
        if (i < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }
        if (i <= 5) {
            this.f1278OooO0OO = i;
            int i2 = o000o0o.f1279OooO0Oo;
            if ((i2 & 1) == i2) {
                this.f1279OooO0Oo = i2;
                this.f1281OooO0o0 = o000o0o.f1281OooO0o0;
                this.f1280OooO0o = o000o0o.f1280OooO0o;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
    }

    @Override // OooOooo.o000Oo0
    public final int OooO() {
        return this.f1279OooO0Oo;
    }

    @Override // OooOooo.o000O000
    public final void OooO00o(Bundle bundle) {
        this.f1280OooO0o = bundle;
    }

    @Override // OooOooo.o000O000
    public final void OooO0O0(Uri uri) {
        this.f1281OooO0o0 = uri;
    }

    @Override // OooOooo.o000Oo0
    public final int OooO0OO() {
        return this.f1278OooO0OO;
    }

    @Override // OooOooo.o000Oo0
    public final ClipData OooO0Oo() {
        return this.f1277OooO0O0;
    }

    @Override // OooOooo.o000O000
    public final void OooO0o(int i) {
        this.f1279OooO0Oo = i;
    }

    @Override // OooOooo.o000O000
    public final o000O00 OooO0o0() {
        return new o000O00(new o000O0o(this));
    }

    @Override // OooOooo.o000Oo0
    public final ContentInfo OooOOO0() {
        return null;
    }

    public final String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f1276OooO00o) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f1277OooO0O0.getDescription());
                sb.append(", source=");
                int i = this.f1278OooO0OO;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        str = String.valueOf(i);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb.append(str);
                sb.append(", flags=");
                int i2 = this.f1279OooO0Oo;
                if ((i2 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i2);
                }
                sb.append(valueOf);
                String str3 = "";
                if (this.f1281OooO0o0 == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + this.f1281OooO0o0.toString().length() + ")";
                }
                sb.append(str2);
                if (this.f1280OooO0o != null) {
                    str3 = ", hasExtras";
                }
                sb.append(str3);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public o000O0o(ClipData clipData, int i) {
        this.f1277OooO0O0 = clipData;
        this.f1278OooO0OO = i;
    }
}