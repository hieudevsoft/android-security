package OoooOOo;

import OooO0O0.OooO00o;
import android.content.SharedPreferences;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import o00000O0.OooOO0;

/* loaded from: classes.dex */
public final class o0OO00OO implements SharedPreferences.Editor {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0OO0O0 f1581OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final SharedPreferences.Editor f1582OooO0O0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final AtomicBoolean f1584OooO0Oo = new AtomicBoolean(false);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final CopyOnWriteArrayList f1583OooO0OO = new CopyOnWriteArrayList();

    public o0OO00OO(o0OO0O0 o0oo0o0, SharedPreferences.Editor editor) {
        this.f1581OooO00o = o0oo0o0;
        this.f1582OooO0O0 = editor;
    }

    public final void OooO00o() {
        if (this.f1584OooO0Oo.getAndSet(false)) {
            o0OO0O0 o0oo0o0 = this.f1581OooO00o;
            for (String str : ((HashMap) o0oo0o0.getAll()).keySet()) {
                if (!this.f1583OooO0OO.contains(str) && !o0OO0O0.OooO0OO(str)) {
                    this.f1582OooO0O0.remove(o0oo0o0.OooO00o(str));
                }
            }
        }
    }

    public final void OooO0O0() {
        o0OO0O0 o0oo0o0 = this.f1581OooO00o;
        Iterator it = o0oo0o0.f1589OooO0O0.iterator();
        while (it.hasNext()) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
            Iterator it2 = this.f1583OooO0OO.iterator();
            while (it2.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(o0oo0o0, (String) it2.next());
            }
        }
    }

    public final void OooO0OO(String str, byte[] bArr) {
        o0OO0O0 o0oo0o0 = this.f1581OooO00o;
        o0oo0o0.getClass();
        if (!o0OO0O0.OooO0OO(str)) {
            this.f1583OooO0OO.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String OooO00o2 = o0oo0o0.OooO00o(str);
                try {
                    Pair pair = new Pair(OooO00o2, new String(OooOO0.OooO0O0(o0oo0o0.f1591OooO0Oo.OooO00o(bArr, OooO00o2.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                    this.f1582OooO0O0.putString((String) pair.first, (String) pair.second);
                    return;
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError(e);
                }
            } catch (GeneralSecurityException e2) {
                throw new SecurityException("Could not encrypt data: " + e2.getMessage(), e2);
            }
        }
        throw new SecurityException(OooO00o.OooO0OO(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        OooO00o();
        this.f1582OooO0O0.apply();
        OooO0O0();
        this.f1583OooO0OO.clear();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f1584OooO0Oo.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1583OooO0OO;
        OooO00o();
        try {
            return this.f1582OooO0O0.commit();
        } finally {
            OooO0O0();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.putInt(5);
        allocate.put(z ? (byte) 1 : (byte) 0);
        OooO0OO(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(4);
        allocate.putFloat(f);
        OooO0OO(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(2);
        allocate.putInt(i);
        OooO0OO(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.putInt(3);
        allocate.putLong(j);
        OooO0OO(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 8);
        allocate.putInt(0);
        allocate.putInt(length);
        allocate.put(bytes);
        OooO0OO(str, allocate.array());
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r6 = r6;
     */
    @Override // android.content.SharedPreferences.Editor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.SharedPreferences.Editor putStringSet(java.lang.String r5, java.util.Set r6) {
        /*
            r4 = this;
            if (r6 != 0) goto Lc
            android.util.ArraySet r6 = new android.util.ArraySet
            r6.<init>()
            java.lang.String r0 = "__NULL__"
            r6.add(r0)
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            int r1 = r6.size()
            int r1 = r1 * 4
            java.util.Iterator r6 = r6.iterator()
        L1f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r2.getBytes(r3)
            r0.add(r2)
            int r2 = r2.length
            int r1 = r1 + r2
            goto L1f
        L37:
            int r1 = r1 + 4
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r1)
            r1 = 1
            r6.putInt(r1)
            java.util.Iterator r0 = r0.iterator()
        L45:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            byte[] r1 = (byte[]) r1
            int r2 = r1.length
            r6.putInt(r2)
            r6.put(r1)
            goto L45
        L59:
            byte[] r6 = r6.array()
            r4.OooO0OO(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOo.o0OO00OO.putStringSet(java.lang.String, java.util.Set):android.content.SharedPreferences$Editor");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        o0OO0O0 o0oo0o0 = this.f1581OooO00o;
        o0oo0o0.getClass();
        if (!o0OO0O0.OooO0OO(str)) {
            this.f1582OooO0O0.remove(o0oo0o0.OooO00o(str));
            this.f1583OooO0OO.remove(str);
            return this;
        }
        throw new SecurityException(OooO00o.OooO0OO(str, " is a reserved key for the encryption keyset."));
    }
}