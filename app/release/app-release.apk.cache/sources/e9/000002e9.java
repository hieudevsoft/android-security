package androidx.appcompat.widget;

import OooooOo.oO00OO0O;
import Ooooooo.oOo00ooO;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import hieubui.eup.android_app_security.MainActivity;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class o0O0O00 implements OooOooo.o0O0ooO, com.google.gson.internal.o000oOoO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2439OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Object f2440OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Object f2441OooO0OO;

    public o0O0O00(int i) {
        this.f2439OooO00o = 12;
        byte[] bArr = new byte[i];
        this.f2441OooO0OO = bArr;
        this.f2440OooO0O0 = new com.google.crypto.tink.shaded.protobuf.Oooo0(bArr, i);
    }

    public final byte[] OooO() {
        try {
            String string = ((SharedPreferences) this.f2440OooO0O0).getString((String) this.f2441OooO0OO, null);
            if (string != null) {
                return o0000O00.OooO00o.Ooooo00(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", (String) this.f2441OooO0OO));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", (String) this.f2441OooO0OO));
        }
    }

    public final KeyListener OooO00o(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            return ((o0ooOO0.OooOOO0) ((Oooo0oO.o0oOO) this.f2441OooO0OO).f1509OooO0OO).OooO(keyListener);
        }
        return keyListener;
    }

    @Override // com.google.gson.internal.o000oOoO
    public final Object OooO0O0() {
        try {
            return com.google.gson.internal.o0Oo0oo.f3923OooO00o.OooO0O0((Class) this.f2440OooO0O0);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + ((Class) this.f2440OooO0O0) + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    public final Object OooO0OO(com.google.crypto.tink.shaded.protobuf.OooOo oooOo) {
        try {
            return OooOO0(((OooO0oO.o000O0O0) this.f2440OooO0O0).OooOOo(oooOo));
        } catch (com.google.crypto.tink.shaded.protobuf.o00000O e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) ((OooO0oO.o000O0O0) this.f2440OooO0O0).f345OooO00o).getName()), e);
        }
    }

    public final void OooO0Oo(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.f2440OooO0O0).getContext().obtainStyledAttributes(attributeSet, OooO0OO.OooO00o.f17OooO, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            ((o0ooOO0.OooOOO0) ((Oooo0oO.o0oOO) this.f2441OooO0OO).f1509OooO0OO).OooOo0o(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection OooO0o(InputConnection inputConnection, EditorInfo editorInfo) {
        Oooo0oO.o0oOO o0ooo = (Oooo0oO.o0oOO) this.f2441OooO0OO;
        if (inputConnection == null) {
            o0ooo.getClass();
            return null;
        }
        return ((o0ooOO0.OooOOO0) o0ooo.f1509OooO0OO).OooOOo(inputConnection, editorInfo);
    }

    public final o00000.o0000O0O OooO0o0(com.google.crypto.tink.shaded.protobuf.OooOo oooOo) {
        try {
            oo0o0Oo.OooO OooOOOo2 = ((OooO0oO.o000O0O0) this.f2440OooO0O0).OooOOOo();
            com.google.crypto.tink.shaded.protobuf.o0O0O00 OooO0Oo2 = OooOOOo2.OooO0Oo(oooOo);
            OooOOOo2.OooO0o0(OooO0Oo2);
            com.google.crypto.tink.shaded.protobuf.o0O0O00 OooO00o2 = OooOOOo2.OooO00o(OooO0Oo2);
            o00000.o0000oo OooOo0o2 = o00000.o0000O0O.OooOo0o();
            String OooOOO0 = ((OooO0oO.o000O0O0) this.f2440OooO0O0).OooOOO0();
            OooOo0o2.OooO0OO();
            o00000.o0000O0O.OooOOOo((o00000.o0000O0O) OooOo0o2.f3737OooO0O0, OooOOO0);
            OooO00o2.getClass();
            try {
                o0O0O00 o0o0o00 = new o0O0O00(OooO00o2.OooO00o(), (Object) null);
                OooO00o2.OooO0o0((com.google.crypto.tink.shaded.protobuf.Oooo0) o0o0o00.f2440OooO0O0);
                com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0 = (com.google.crypto.tink.shaded.protobuf.Oooo0) o0o0o00.f2440OooO0O0;
                if (oooo0.f3633OooO0OO - oooo0.f3634OooO0Oo == 0) {
                    com.google.crypto.tink.shaded.protobuf.OooOo00 oooOo00 = new com.google.crypto.tink.shaded.protobuf.OooOo00((byte[]) o0o0o00.f2441OooO0OO);
                    OooOo0o2.OooO0OO();
                    o00000.o0000O0O.OooOOo0((o00000.o0000O0O) OooOo0o2.f3737OooO0O0, oooOo00);
                    o00000.o0000O0 OooOOo02 = ((OooO0oO.o000O0O0) this.f2440OooO0O0).OooOOo0();
                    OooOo0o2.OooO0OO();
                    o00000.o0000O0O.OooOOo((o00000.o0000O0O) OooOo0o2.f3737OooO0O0, OooOOo02);
                    return (o00000.o0000O0O) OooOo0o2.OooO00o();
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            } catch (IOException e) {
                throw new RuntimeException(OooO00o2.OooO0OO("ByteString"), e);
            }
        } catch (com.google.crypto.tink.shaded.protobuf.o00000O e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    public final void OooO0oO(OooOoo0.o00000OO o00000oo2) {
        boolean z;
        int i = o00000oo2.f1255OooO0O0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((Handler) this.f2441OooO0OO).post(new OooOoo0.o000OOo(this, (OooO0Oo.o0000OO0) this.f2440OooO0O0, o00000oo2.f1254OooO00o, 0));
        } else {
            ((Handler) this.f2441OooO0OO).post(new OooOoo0.o000000(i, 0, this, (OooO0Oo.o0000OO0) this.f2440OooO0O0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    @Override // OooOooo.o0O0ooO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final OooOooo.o0O0OOOo OooO0oo(android.view.View r17, OooOooo.o0O0OOOo r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.f2440OooO0O0
            OooOo0.o00Ooo r3 = (OooOo0.o00Ooo) r3
            java.lang.Object r4 = r0.f2441OooO0OO
            o000oOoO.o0000O00 r4 = (o000oOoO.o0000O00) r4
            int r5 = r4.f4958OooO00o
            int r6 = r4.f4960OooO0OO
            int r4 = r4.f4961OooO0Oo
            r3.getClass()
            r7 = 7
            OooOo.OooO0OO r7 = r2.OooO00o(r7)
            r8 = 32
            OooOo.OooO0OO r8 = r2.OooO00o(r8)
            java.lang.Object r9 = r3.f1149OooO0O0
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            int r10 = r7.f1111OooO0O0
            r9.f3276OooOo0o = r10
            boolean r10 = o0000O00.OooO00o.o0000O(r17)
            int r11 = r17.getPaddingBottom()
            int r12 = r17.getPaddingLeft()
            int r13 = r17.getPaddingRight()
            boolean r14 = r9.f3267OooOOOO
            if (r14 == 0) goto L45
            int r11 = r18.OooO0O0()
            r9.f3275OooOo0O = r11
            int r11 = r11 + r4
        L45:
            boolean r4 = r9.f3268OooOOOo
            int r15 = r7.f1110OooO00o
            if (r4 == 0) goto L52
            if (r10 == 0) goto L4f
            r4 = r6
            goto L50
        L4f:
            r4 = r5
        L50:
            int r12 = r4 + r15
        L52:
            boolean r4 = r9.f3270OooOOo0
            int r0 = r7.f1112OooO0OO
            if (r4 == 0) goto L5e
            if (r10 == 0) goto L5b
            goto L5c
        L5b:
            r5 = r6
        L5c:
            int r13 = r5 + r0
        L5e:
            android.view.ViewGroup$LayoutParams r4 = r17.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            boolean r5 = r9.f3271OooOOoo
            r6 = 1
            if (r5 == 0) goto L71
            int r5 = r4.leftMargin
            if (r5 == r15) goto L71
            r4.leftMargin = r15
            r5 = r6
            goto L72
        L71:
            r5 = 0
        L72:
            boolean r10 = r9.f3274OooOo00
            if (r10 == 0) goto L7d
            int r10 = r4.rightMargin
            if (r10 == r0) goto L7d
            r4.rightMargin = r0
            r5 = r6
        L7d:
            boolean r0 = r9.f3273OooOo0
            if (r0 == 0) goto L8a
            int r0 = r4.topMargin
            int r7 = r7.f1111OooO0O0
            if (r0 == r7) goto L8a
            r4.topMargin = r7
            goto L8b
        L8a:
            r6 = r5
        L8b:
            if (r6 == 0) goto L90
            r1.setLayoutParams(r4)
        L90:
            int r0 = r17.getPaddingTop()
            r1.setPadding(r12, r0, r13, r11)
            boolean r0 = r3.f1148OooO00o
            if (r0 == 0) goto L9f
            int r1 = r8.f1113OooO0Oo
            r9.OooOOO0 = r1
        L9f:
            if (r14 != 0) goto La3
            if (r0 == 0) goto La6
        La3:
            r9.Oooo0OO()
        La6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0O0O00.OooO0oo(android.view.View, OooOooo.o0O0OOOo):OooOooo.o0O0OOOo");
    }

    public final Object OooOO0(com.google.crypto.tink.shaded.protobuf.OooO0O0 oooO0O0) {
        if (Void.class.equals((Class) this.f2441OooO0OO)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        ((OooO0oO.o000O0O0) this.f2440OooO0O0).OooOo0(oooO0O0);
        return ((OooO0oO.o000O0O0) this.f2440OooO0O0).OooOOOO(oooO0O0, (Class) this.f2441OooO0OO);
    }

    public final String toString() {
        switch (this.f2439OooO00o) {
            case 4:
                return "Bounds{lower=" + ((OooOo.OooO0OO) this.f2440OooO0O0) + " upper=" + ((OooOo.OooO0OO) this.f2441OooO0OO) + "}";
            default:
                return super.toString();
        }
    }

    public o0O0O00(int i, int i2) {
        this.f2439OooO00o = 2;
        this.f2440OooO0O0 = new int[]{i, i2};
        this.f2441OooO0OO = new float[]{0.0f, 1.0f};
    }

    public o0O0O00(int i, int i2, int i3) {
        this.f2439OooO00o = 2;
        this.f2440OooO0O0 = new int[]{i, i2, i3};
        this.f2441OooO0OO = new float[]{0.0f, 0.5f, 1.0f};
    }

    public o0O0O00(int i, OooO0O0.OooO00o oooO00o) {
        this.f2439OooO00o = i;
        if (i != 9) {
            return;
        }
        this.f2440OooO0O0 = null;
        this.f2441OooO0OO = null;
        int i2 = o000000.OooO0o.f4010OooO0OO;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f2441OooO0OO = keyStore;
            keyStore.load(null);
        } catch (IOException | GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    public o0O0O00(int i, MainActivity mainActivity, String str) {
        this.f2439OooO00o = i;
        if (i != 11) {
            this.f2441OooO0OO = str;
            this.f2440OooO0O0 = mainActivity.getApplicationContext().getSharedPreferences("encrypted_shared_preference", 0);
            return;
        }
        this.f2441OooO0OO = str;
        this.f2440OooO0O0 = mainActivity.getApplicationContext().getSharedPreferences("encrypted_shared_preference", 0).edit();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0O0O00(int i, Object obj) {
        this(i);
        this.f2439OooO00o = 12;
    }

    public o0O0O00(OooO0oO.o000O0O0 o000o0o0, Class cls) {
        this.f2439OooO00o = 8;
        if (!((Map) o000o0o0.f346OooO0O0).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", o000o0o0.toString(), cls.getName()));
        }
        this.f2440OooO0O0 = o000o0o0;
        this.f2441OooO0OO = cls;
    }

    public o0O0O00(oO00OO0O oo00oo0o, Class cls) {
        this.f2439OooO00o = 13;
        this.f2441OooO0OO = oo00oo0o;
        this.f2440OooO0O0 = cls;
    }

    public o0O0O00(oOo00ooO ooo00ooo, oOo00ooO ooo00ooo2) {
        this.f2439OooO00o = 5;
        ooo00ooo.getClass();
        ooo00ooo2.getClass();
        if (!(0.0f <= 0.0f)) {
            throw new IllegalArgumentException();
        }
        this.f2440OooO0O0 = ooo00ooo;
        this.f2441OooO0OO = ooo00ooo2;
    }

    public o0O0O00(EditText editText) {
        this.f2439OooO00o = 0;
        this.f2440OooO0O0 = editText;
        this.f2441OooO0OO = new Oooo0oO.o0oOO(editText);
    }

    public o0O0O00(TextView textView) {
        this.f2439OooO00o = 1;
        textView.getClass();
        this.f2440OooO0O0 = textView;
    }

    public /* synthetic */ o0O0O00(Object obj, int i, Object obj2) {
        this.f2439OooO00o = i;
        this.f2440OooO0O0 = obj;
        this.f2441OooO0OO = obj2;
    }

    public o0O0O00(ArrayList arrayList, ArrayList arrayList2) {
        this.f2439OooO00o = 2;
        int size = arrayList.size();
        this.f2440OooO0O0 = new int[size];
        this.f2441OooO0OO = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f2440OooO0O0)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f2441OooO0OO)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }
}