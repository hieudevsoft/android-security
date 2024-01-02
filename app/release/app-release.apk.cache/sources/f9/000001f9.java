package OoooOOo;

import OooOO0o.o0OoOo0;
import android.content.SharedPreferences;
import android.util.ArraySet;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o00000O0.OooOO0;
import o0OO00O.OooO00o;
import o0OO00O.OooO0O0;

/* loaded from: classes.dex */
public final class o0OO0O0 implements SharedPreferences {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final SharedPreferences f1588OooO00o;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final OooO00o f1591OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final OooO0O0 f1592OooO0o0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final String f1590OooO0OO = "encrypted_shared_preference";

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ArrayList f1589OooO0O0 = new ArrayList();

    public o0OO0O0(SharedPreferences sharedPreferences, OooO00o oooO00o, OooO0O0 oooO0O0) {
        this.f1588OooO00o = sharedPreferences;
        this.f1591OooO0Oo = oooO00o;
        this.f1592OooO0o0 = oooO0O0;
    }

    public static boolean OooO0OO(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String OooO00o(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(OooOO0.OooO0O0(this.f1592OooO0o0.OooO00o(str.getBytes(StandardCharsets.UTF_8), this.f1590OooO0OO.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not encrypt key. " + e2.getMessage(), e2);
        }
    }

    public final Object OooO0O0(String str) {
        int i;
        if (!OooO0OO(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String OooO00o2 = OooO00o(str);
                String string = this.f1588OooO00o.getString(OooO00o2, null);
                if (string == null) {
                    return null;
                }
                ByteBuffer wrap = ByteBuffer.wrap(this.f1591OooO0Oo.OooO0O0(OooOO0.OooO00o(string), OooO00o2.getBytes(StandardCharsets.UTF_8)));
                boolean z = false;
                wrap.position(0);
                int i2 = wrap.getInt();
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        i = 0;
                                    } else {
                                        i = 6;
                                    }
                                } else {
                                    i = 5;
                                }
                            } else {
                                i = 4;
                            }
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 2;
                    }
                } else {
                    i = 1;
                }
                int OooO00o3 = o0OoOo0.OooO00o(i);
                if (OooO00o3 != 0) {
                    if (OooO00o3 != 1) {
                        if (OooO00o3 != 2) {
                            if (OooO00o3 != 3) {
                                if (OooO00o3 != 4) {
                                    if (OooO00o3 != 5) {
                                        return null;
                                    }
                                    if (wrap.get() != 0) {
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                                }
                                return Float.valueOf(wrap.getFloat());
                            }
                            return Long.valueOf(wrap.getLong());
                        }
                        return Integer.valueOf(wrap.getInt());
                    }
                    ArraySet arraySet = new ArraySet();
                    while (wrap.hasRemaining()) {
                        int i3 = wrap.getInt();
                        ByteBuffer slice = wrap.slice();
                        slice.limit(i3);
                        wrap.position(wrap.position() + i3);
                        arraySet.add(StandardCharsets.UTF_8.decode(slice).toString());
                    }
                    if (arraySet.size() == 1 && "__NULL__".equals(arraySet.valueAt(0))) {
                        return null;
                    }
                    return arraySet;
                }
                int i4 = wrap.getInt();
                ByteBuffer slice2 = wrap.slice();
                wrap.limit(i4);
                String charBuffer = StandardCharsets.UTF_8.decode(slice2).toString();
                if (charBuffer.equals("__NULL__")) {
                    return null;
                }
                return charBuffer;
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
            }
        }
        throw new SecurityException(OooO0O0.OooO00o.OooO0OO(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (!OooO0OO(str)) {
            return this.f1588OooO00o.contains(OooO00o(str));
        }
        throw new SecurityException(OooO0O0.OooO00o.OooO0OO(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new o0OO00OO(this, this.f1588OooO00o.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f1588OooO00o.getAll().entrySet()) {
            if (!OooO0OO(entry.getKey())) {
                try {
                    String str = new String(this.f1592OooO0o0.OooO0O0(OooOO0.OooO00o(entry.getKey()), this.f1590OooO0OO.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, OooO0O0(str));
                } catch (GeneralSecurityException e) {
                    throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
                }
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object OooO0O02 = OooO0O0(str);
        return (OooO0O02 == null || !(OooO0O02 instanceof Boolean)) ? z : ((Boolean) OooO0O02).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object OooO0O02 = OooO0O0(str);
        return (OooO0O02 == null || !(OooO0O02 instanceof Float)) ? f : ((Float) OooO0O02).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object OooO0O02 = OooO0O0(str);
        return (OooO0O02 == null || !(OooO0O02 instanceof Integer)) ? i : ((Integer) OooO0O02).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object OooO0O02 = OooO0O0(str);
        return (OooO0O02 == null || !(OooO0O02 instanceof Long)) ? j : ((Long) OooO0O02).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object OooO0O02 = OooO0O0(str);
        return (OooO0O02 == null || !(OooO0O02 instanceof String)) ? str2 : (String) OooO0O02;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object OooO0O02 = OooO0O0(str);
        Set arraySet = OooO0O02 instanceof Set ? (Set) OooO0O02 : new ArraySet();
        return arraySet.size() > 0 ? arraySet : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f1589OooO0O0.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f1589OooO0O0.remove(onSharedPreferenceChangeListener);
    }
}