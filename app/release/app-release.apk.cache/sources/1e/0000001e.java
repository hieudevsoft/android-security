package OooO0Oo;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class o000000 extends o00000 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ int f98OooO0OO = 0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ o00000OO f99OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final Object f100OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(o00000OO o00000oo2, Context context) {
        super(o00000oo2);
        this.f99OooO0Oo = o00000oo2;
        this.f100OooO0o0 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // OooO0Oo.o00000
    public final IntentFilter OooO0OO() {
        switch (this.f98OooO0OO) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011e  */
    @Override // OooO0Oo.o00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0Oo() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.o000000.OooO0Oo():int");
    }

    @Override // OooO0Oo.o00000
    public final void OooO0o() {
        int i = this.f98OooO0OO;
        o00000OO o00000oo2 = this.f99OooO0Oo;
        switch (i) {
            case 0:
                o00000oo2.OooOOO(true, true);
                return;
            default:
                o00000oo2.OooOOO(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(o00000OO o00000oo2, androidx.activity.result.OooO0o oooO0o) {
        super(o00000oo2);
        this.f99OooO0Oo = o00000oo2;
        this.f100OooO0o0 = oooO0o;
    }
}