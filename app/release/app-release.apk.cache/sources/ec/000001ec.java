package OoooO0O;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes.dex */
public final class o0000O0O implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}