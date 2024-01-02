package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* loaded from: classes.dex */
public final class OooO0o extends OooO0OO {
    @Override // o0ooOO0.OooOOO0
    public final Signature[] OooOO0O(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}