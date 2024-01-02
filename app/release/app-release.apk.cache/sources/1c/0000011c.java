package OooOoo0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

/* loaded from: classes.dex */
public abstract class o00000 {
    public static Cursor OooO00o(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
    }
}