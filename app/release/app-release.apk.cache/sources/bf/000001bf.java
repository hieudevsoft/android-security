package Oooo0O0;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import androidx.emoji2.text.o00oO0o;

/* loaded from: classes.dex */
public final class OooOOO0 extends ContentObserver {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1452OooO00o = 0;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f1453OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(OooOOO oooOOO) {
        super(new Handler());
        this.f1453OooO0O0 = oooOOO;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.f1452OooO00o) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        switch (this.f1452OooO00o) {
            case 0:
                OooOOO oooOOO = (OooOOO) this.f1453OooO0O0;
                if (!oooOOO.f1446OooO0O0 || (cursor = oooOOO.f1447OooO0OO) == null || cursor.isClosed()) {
                    return;
                }
                oooOOO.f1445OooO00o = oooOOO.f1447OooO0OO.requery();
                return;
            default:
                super.onChange(z);
                return;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        switch (this.f1452OooO00o) {
            case 1:
                ((o00oO0o) this.f1453OooO0O0).OooO0OO();
                return;
            default:
                super.onChange(z, uri);
                return;
        }
    }
}