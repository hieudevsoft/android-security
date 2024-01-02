package androidx.emoji2.text;

import OooOoo0.o000000;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class OooOo {

    /* renamed from: OooO  reason: collision with root package name */
    public static final Object f2679OooO = new Object();

    /* renamed from: OooOO0  reason: collision with root package name */
    public static volatile OooOo f2680OooOO0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ReentrantReadWriteLock f2681OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOO0.OooO0OO f2682OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public volatile int f2683OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Handler f2684OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final OooOo00 f2685OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final OooOO0O f2686OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final int f2687OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final OooO f2688OooO0oo;

    public OooOo(Oooo000 oooo000) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f2681OooO00o = reentrantReadWriteLock;
        this.f2683OooO0OO = 3;
        this.f2685OooO0o = oooo000.f2676OooO00o;
        int i = oooo000.f2677OooO0O0;
        this.f2687OooO0oO = i;
        this.f2688OooO0oo = oooo000.f2678OooO0OO;
        this.f2684OooO0Oo = new Handler(Looper.getMainLooper());
        this.f2682OooO0O0 = new OooOO0.OooO0OO();
        OooOO0O oooOO0O = new OooOO0O(this);
        this.f2686OooO0o0 = oooOO0O;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f2683OooO0OO = 0;
            } catch (Throwable th) {
                this.f2681OooO00o.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (OooO0O0() == 0) {
            try {
                this.f2685OooO0o.OooO00o(new OooOO0(oooOO0O));
            } catch (Throwable th2) {
                OooO0Oo(th2);
            }
        }
    }

    public static OooOo OooO00o() {
        OooOo oooOo;
        boolean z;
        synchronized (f2679OooO) {
            oooOo = f2680OooOO0;
            if (oooOo != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return oooOo;
    }

    public final int OooO0O0() {
        this.f2681OooO00o.readLock().lock();
        try {
            return this.f2683OooO0OO;
        } finally {
            this.f2681OooO00o.readLock().unlock();
        }
    }

    public final void OooO0OO() {
        boolean z;
        boolean z2 = true;
        if (this.f2687OooO0oO == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (OooO0O0() != 1) {
                z2 = false;
            }
            if (z2) {
                return;
            }
            this.f2681OooO00o.writeLock().lock();
            try {
                if (this.f2683OooO0OO == 0) {
                    return;
                }
                this.f2683OooO0OO = 0;
                this.f2681OooO00o.writeLock().unlock();
                OooOO0O oooOO0O = this.f2686OooO0o0;
                Object obj = oooOO0O.f183OooO0O0;
                try {
                    ((OooOo) obj).f2685OooO0o.OooO00o(new OooOO0(oooOO0O));
                    return;
                } catch (Throwable th) {
                    ((OooOo) obj).OooO0Oo(th);
                    return;
                }
            } finally {
                this.f2681OooO00o.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void OooO0Oo(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2681OooO00o.writeLock().lock();
        try {
            this.f2683OooO0OO = 2;
            arrayList.addAll(this.f2682OooO0O0);
            this.f2682OooO0O0.clear();
            this.f2681OooO00o.writeLock().unlock();
            this.f2684OooO0Oo.post(new o000000(arrayList, this.f2683OooO0OO, th));
        } catch (Throwable th2) {
            this.f2681OooO00o.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence OooO0o(int i, int i2, CharSequence charSequence) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (OooO0O0() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i <= i2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    o0000O00.OooO00o.OooOo00("start should be <= than end", z2);
                    if (charSequence == null) {
                        return null;
                    }
                    if (i <= charSequence.length()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    o0000O00.OooO00o.OooOo00("start should be < than charSequence length", z3);
                    if (i2 > charSequence.length()) {
                        z4 = false;
                    }
                    o0000O00.OooO00o.OooOo00("end should be < than charSequence length", z4);
                    if (charSequence.length() != 0 && i != i2) {
                        return this.f2686OooO0o0.OooOoo0(charSequence, i, i2, false);
                    }
                    return charSequence;
                }
                throw new IllegalArgumentException("end cannot be negative");
            }
            throw new IllegalArgumentException("start cannot be negative");
        }
        throw new IllegalStateException("Not initialized yet");
    }

    public final void OooO0o0() {
        ArrayList arrayList = new ArrayList();
        this.f2681OooO00o.writeLock().lock();
        try {
            this.f2683OooO0OO = 1;
            arrayList.addAll(this.f2682OooO0O0);
            this.f2682OooO0O0.clear();
            this.f2681OooO00o.writeLock().unlock();
            this.f2684OooO0Oo.post(new o000000(this.f2683OooO0OO, arrayList));
        } catch (Throwable th) {
            this.f2681OooO00o.writeLock().unlock();
            throw th;
        }
    }

    public final void OooO0oO(OooOOOO oooOOOO) {
        if (oooOOOO != null) {
            this.f2681OooO00o.writeLock().lock();
            try {
                if (this.f2683OooO0OO != 1 && this.f2683OooO0OO != 2) {
                    this.f2682OooO0O0.add(oooOOOO);
                    return;
                }
                this.f2684OooO0Oo.post(new o000000(oooOOOO, this.f2683OooO0OO));
                return;
            } finally {
                this.f2681OooO00o.writeLock().unlock();
            }
        }
        throw new NullPointerException("initCallback cannot be null");
    }
}