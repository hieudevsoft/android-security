package o0ooOO0;

import OooO0oO.o00O00O;
import OooO0oO.oo0oOO0;
import OoooOOO.oo0oO0;
import OoooOOO.oo0ooO;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.pm.PackageManager;
import android.graphics.Path;
import android.os.Build;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.o00000O;
import androidx.lifecycle.o00000OO;
import java.lang.reflect.Field;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import o00000.o000;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public class OooOOO0 implements oo0oOO0, OoooO.o00O0O, o00000O0.Oooo000, com.google.gson.internal.o000oOoO {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static OooOOO0 f5487OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static Field f5488OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static boolean f5489OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static OooOOO0 f5490OooO0o0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f5491OooO00o;

    public /* synthetic */ OooOOO0() {
        this.f5491OooO00o = 21;
    }

    public static void OooO0OO(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public static void OooO0Oo(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public static void OooO0o(Activity activity, androidx.lifecycle.OooOo oooOo) {
        OooO00o.OooOoo0(activity, "activity");
        OooO00o.OooOoo0(oooOo, "event");
        if (activity instanceof androidx.lifecycle.o00Ooo) {
            androidx.lifecycle.o00oO0o OooO0oO2 = ((androidx.lifecycle.o00Ooo) activity).OooO0oO();
            if (OooO0oO2 instanceof androidx.lifecycle.o00oO0o) {
                OooO0oO2.OooO0o0(oooOo);
            }
        }
    }

    public static oo0oO0 OooO0o0(oo0ooO oo0ooo) {
        OooO00o.OooOoo0(oo0ooo, "owner");
        return new oo0oO0(oo0ooo);
    }

    public static Path OooOO0(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0080, code lost:
        if (r11 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x008d, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean OooOOO0(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0ooOO0.OooOOO0.OooOOO0(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static void OooOOOo(Activity activity) {
        OooO00o.OooOoo0(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            o00000O.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new o00000O());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new o00000OO(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o0000Oo.OooOO0 OooOOoo(o0000Oo.oo000o r27) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0ooOO0.OooOOO0.OooOOoo(o0000Oo.oo000o):o0000Oo.OooOO0");
    }

    public KeyListener OooO(KeyListener keyListener) {
        return keyListener;
    }

    @Override // OooO0oO.oo0oOO0
    public void OooO00o(o00O00O o00o00o, boolean z) {
    }

    @Override // com.google.gson.internal.o000oOoO
    public Object OooO0O0() {
        switch (this.f5491OooO00o) {
            case 12:
                return new TreeSet();
            case 13:
                return new LinkedHashSet();
            case 14:
                return new ArrayDeque();
            case 15:
                return new ArrayList();
            case 16:
                return new ConcurrentSkipListMap();
            case 17:
                return new ConcurrentHashMap();
            case 18:
                return new TreeMap();
            case 19:
                return new LinkedHashMap();
            default:
                return new com.google.gson.internal.Oooo0(true);
        }
    }

    public InputFilter[] OooO0oO(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    public Object OooO0oo(String str, Provider provider) {
        switch (this.f5491OooO00o) {
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                if (provider == null) {
                    return Cipher.getInstance(str);
                }
                return Cipher.getInstance(str, provider);
            case 6:
                if (provider == null) {
                    return KeyAgreement.getInstance(str);
                }
                return KeyAgreement.getInstance(str, provider);
            case 7:
                if (provider == null) {
                    return KeyFactory.getInstance(str);
                }
                return KeyFactory.getInstance(str, provider);
            case 8:
                if (provider == null) {
                    return KeyPairGenerator.getInstance(str);
                }
                return KeyPairGenerator.getInstance(str, provider);
            case 9:
                if (provider == null) {
                    return Mac.getInstance(str);
                }
                return Mac.getInstance(str, provider);
            case 10:
                if (provider == null) {
                    return MessageDigest.getInstance(str);
                }
                return MessageDigest.getInstance(str, provider);
            default:
                if (provider == null) {
                    return Signature.getInstance(str);
                }
                return Signature.getInstance(str, provider);
        }
    }

    public android.content.pm.Signature[] OooOO0O(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // OoooO.o00O0O
    public void OooOO0o() {
    }

    @Override // OoooO.o00O0O
    public void OooOOO(int i, Object obj) {
        switch (this.f5491OooO00o) {
            case 23:
                return;
            default:
                if (i == 6 || i == 7 || i == 8) {
                    Throwable th = (Throwable) obj;
                    return;
                }
                return;
        }
    }

    @Override // OooO0oO.oo0oOO0
    public boolean OooOOOO(o00O00O o00o00o) {
        return false;
    }

    public InputConnection OooOOo(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }

    public boolean OooOOo0(Spannable spannable) {
        return false;
    }

    public void OooOo(View view, int i) {
        if (!f5489OooO0Oo) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f5488OooO0OO = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5489OooO0Oo = true;
        }
        Field field = f5488OooO0OO;
        if (field != null) {
            try {
                f5488OooO0OO.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void OooOo0(boolean z) {
    }

    public void OooOo00(boolean z) {
    }

    public void OooOo0O(boolean z) {
    }

    public void OooOo0o(boolean z) {
    }

    public void OooOoO() {
    }

    public void OooOoO0() {
    }

    public /* synthetic */ OooOOO0(int i) {
        this.f5491OooO00o = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OooOOO0(int i, int i2) {
        this(0);
        this.f5491OooO00o = i;
        if (i != 1) {
        } else {
            this(1);
        }
    }

    public /* synthetic */ OooOOO0(int i, Object obj) {
        this.f5491OooO00o = i;
    }
}