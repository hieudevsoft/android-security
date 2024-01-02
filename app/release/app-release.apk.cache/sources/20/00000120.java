package OooOoo0;

import android.content.Context;
import androidx.appcompat.widget.o00Oo0;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class o00000O0 implements Callable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1249OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ String f1250OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Context f1251OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f1252OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ int f1253OooO0o0;

    public /* synthetic */ o00000O0(String str, Context context, o00Oo0 o00oo0, int i, int i2) {
        this.f1249OooO00o = i2;
        this.f1250OooO0O0 = str;
        this.f1251OooO0OO = context;
        this.f1252OooO0Oo = o00oo0;
        this.f1253OooO0o0 = i;
    }

    public final o00000OO OooO00o() {
        int i = this.f1249OooO00o;
        Context context = this.f1251OooO0OO;
        String str = this.f1250OooO0O0;
        int i2 = this.f1253OooO0o0;
        o00Oo0 o00oo0 = this.f1252OooO0Oo;
        switch (i) {
            case 0:
                return o0000Ooo.OooO00o(str, context, o00oo0, i2);
            default:
                try {
                    return o0000Ooo.OooO00o(str, context, o00oo0, i2);
                } catch (Throwable unused) {
                    return new o00000OO(-3);
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f1249OooO00o) {
            case 0:
                return OooO00o();
            default:
                return OooO00o();
        }
    }
}