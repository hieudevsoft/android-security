package OooOo0O;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public abstract class o00Ooo {
    public static File OooO00o(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable OooO0O0(Context context, int i) {
        return context.getDrawable(i);
    }

    public static File OooO0OO(Context context) {
        return context.getNoBackupFilesDir();
    }
}