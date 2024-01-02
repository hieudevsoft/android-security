package OoooO0O;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.emoji2.text.o0ooOOo;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o0000O implements Closeable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final File f1557OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final long f1558OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final File f1559OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final RandomAccessFile f1560OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final FileLock f1561OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final FileChannel f1562OooO0o0;

    public o0000O(File file, File file2) {
        file.getPath();
        file2.getPath();
        this.f1557OooO00o = file;
        this.f1559OooO0OO = file2;
        this.f1558OooO0O0 = OooOoO(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f1560OooO0Oo = randomAccessFile;
        try {
            try {
                FileChannel channel = randomAccessFile.getChannel();
                this.f1562OooO0o0 = channel;
                try {
                    file3.getPath();
                    this.f1561OooO0o = channel.lock();
                    file3.getPath();
                } catch (IOException e) {
                    e = e;
                    try {
                        this.f1562OooO0o0.close();
                    } catch (IOException unused) {
                    }
                    throw e;
                } catch (Error e2) {
                    e = e2;
                    this.f1562OooO0o0.close();
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    this.f1562OooO0o0.close();
                    throw e;
                }
            } catch (Error e4) {
                e = e4;
                try {
                    this.f1560OooO0Oo.close();
                } catch (IOException unused2) {
                }
                throw e;
            } catch (RuntimeException e5) {
                e = e5;
                this.f1560OooO0Oo.close();
                throw e;
            }
        } catch (IOException e6) {
            e = e6;
            this.f1560OooO0Oo.close();
            throw e;
        }
    }

    public static void OooOo(ZipFile zipFile, ZipEntry zipEntry, o000OO o000oo, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", o000oo.getParentFile());
        createTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                o000oo.getPath();
                if (createTempFile.renameTo(o000oo)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + o000oo.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + o000oo.getAbsolutePath() + "\")");
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            createTempFile.delete();
        }
    }

    public static long OooOoO(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            o0ooOOo ooOO2 = OooO00o.ooOO(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = ooOO2.f2726OooO0O0;
            randomAccessFile.seek(ooOO2.f2725OooO00o);
            int min = (int) Math.min(16384L, j);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = randomAccessFile.read(bArr, 0, min);
                if (read == -1) {
                    break;
                }
                crc32.update(bArr, 0, read);
                j -= read;
                if (j == 0) {
                    break;
                }
                min = (int) Math.min(16384L, j);
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            if (value == -1) {
                return value - 1;
            }
            return value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static long OooOoO0(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    public static void OooOooO(Context context, long j, long j2, ArrayList arrayList) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i = 2;
        while (it.hasNext()) {
            o000OO o000oo = (o000OO) it.next();
            edit.putLong(OooO0O0.OooO00o.OooO0O0("dex.crc.", i), o000oo.f1566OooO00o);
            edit.putLong("dex.time." + i, o000oo.lastModified());
            i++;
        }
        edit.commit();
    }

    public final ArrayList OooOoOO(Context context, boolean z) {
        ArrayList arrayList;
        boolean z2;
        File file = this.f1557OooO00o;
        file.getPath();
        if (this.f1561OooO0o.isValid()) {
            if (!z) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
                if (sharedPreferences.getLong("timestamp", -1L) == OooOoO0(file) && sharedPreferences.getLong("crc", -1L) == this.f1558OooO0O0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    try {
                        arrayList = OooOoo0(context);
                    } catch (IOException unused) {
                    }
                    arrayList.size();
                    return arrayList;
                }
            }
            ArrayList OooOoo2 = OooOoo();
            OooOooO(context, OooOoO0(file), this.f1558OooO0O0, OooOoo2);
            arrayList = OooOoo2;
            arrayList.size();
            return arrayList;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ed, code lost:
        throw new java.io.IOException("Could not create zip file " + r10.getAbsolutePath() + " for secondary dex (" + r8 + ")");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList OooOoo() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooO0O.o0000O.OooOoo():java.util.ArrayList");
    }

    public final ArrayList OooOoo0(Context context) {
        String str = this.f1557OooO00o.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        for (int i2 = 2; i2 <= i; i2++) {
            o000OO o000oo = new o000OO(this.f1559OooO0OO, str + i2 + ".zip");
            if (o000oo.isFile()) {
                o000oo.f1566OooO00o = OooOoO(o000oo);
                long j = sharedPreferences.getLong("dex.crc." + i2, -1L);
                long j2 = sharedPreferences.getLong("dex.time." + i2, -1L);
                long lastModified = o000oo.lastModified();
                if (j2 == lastModified && j == o000oo.f1566OooO00o) {
                    arrayList.add(o000oo);
                } else {
                    throw new IOException("Invalid extracted dex: " + o000oo + " (key \"\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + o000oo.f1566OooO00o);
                }
            } else {
                throw new IOException("Missing extracted secondary dex file '" + o000oo.getPath() + "'");
            }
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1561OooO0o.release();
        this.f1562OooO0o0.close();
        this.f1560OooO0Oo.close();
    }
}