package OooOo;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public abstract class Oooo000 {
    public static ParcelFileDescriptor OooO00o(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) {
        return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
    }
}