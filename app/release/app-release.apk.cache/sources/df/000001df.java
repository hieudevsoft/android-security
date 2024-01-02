package OoooO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o0OOO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f1534OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f1535OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final long f1536OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final long f1537OooO0Oo;

    public o0OOO0o(int i, int i2, long j, long j2) {
        this.f1534OooO00o = i;
        this.f1535OooO0O0 = i2;
        this.f1536OooO0OO = j;
        this.f1537OooO0Oo = j2;
    }

    public static o0OOO0o OooO00o(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            o0OOO0o o0ooo0o = new o0OOO0o(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return o0ooo0o;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void OooO0O0(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1534OooO00o);
            dataOutputStream.writeInt(this.f1535OooO0O0);
            dataOutputStream.writeLong(this.f1536OooO0OO);
            dataOutputStream.writeLong(this.f1537OooO0Oo);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o0OOO0o)) {
            return false;
        }
        o0OOO0o o0ooo0o = (o0OOO0o) obj;
        return this.f1535OooO0O0 == o0ooo0o.f1535OooO0O0 && this.f1536OooO0OO == o0ooo0o.f1536OooO0OO && this.f1534OooO00o == o0ooo0o.f1534OooO00o && this.f1537OooO0Oo == o0ooo0o.f1537OooO0Oo;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1535OooO0O0), Long.valueOf(this.f1536OooO0OO), Integer.valueOf(this.f1534OooO00o), Long.valueOf(this.f1537OooO0Oo));
    }
}