package OoooO;

import OooO0oo.o00OOO00;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o000oOoO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Executor f1520OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o00O0O f1521OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final byte[] f1522OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final File f1523OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f1524OooO0o = false;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final String f1525OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public o0OoOo0[] f1526OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public byte[] f1527OooO0oo;

    public o000oOoO(AssetManager assetManager, o00OOO00 o00ooo00, o00O0O o00o0o, String str, File file) {
        byte[] bArr;
        this.f1520OooO00o = o00ooo00;
        this.f1521OooO0O0 = o00o0o;
        this.f1525OooO0o0 = str;
        this.f1523OooO0Oo = file;
        int i = Build.VERSION.SDK_INT;
        if (i <= 33) {
            switch (i) {
                case 24:
                case 25:
                    bArr = OooO00o.f4134OooOoO0;
                    break;
                case 26:
                    bArr = OooO00o.f4128OooOo;
                    break;
                case 27:
                    bArr = OooO00o.f4132OooOo0o;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = OooO00o.f4131OooOo0O;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = OooO00o.f4129OooOo0;
                    break;
            }
            this.f1522OooO0OO = bArr;
        }
        bArr = null;
        this.f1522OooO0OO = bArr;
    }

    public final FileInputStream OooO00o(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f1521OooO0O0.OooOO0o();
            }
            return null;
        }
    }

    public final void OooO0O0(int i, Serializable serializable) {
        this.f1520OooO00o.execute(new Oooo0(i, 0, this, serializable));
    }
}