package OooO0Oo;

import OooO0oO.o00O000o;
import OooO0oO.o00O00O;
import OooO0oO.o00oOoo;
import OooOooo.o0;
import OooOooo.o00O;
import OooOooo.o0O0OOOo;
import OooOooo.o0o0Oo;
import OooOooo.oo0o0O0;
import OooOooo.oo0oOO0;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.o00O0O0;
import androidx.appcompat.widget.o0OO00OO;
import androidx.appcompat.widget.o0OO0oO0;
import hieubui.eup.android_app_security.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o00000OO extends o00Oo0 implements o00O000o, LayoutInflater.Factory2 {

    /* renamed from: Oooooo  reason: collision with root package name */
    public static final OooOO0.OooOOOO f118Oooooo = new OooOO0.OooOOOO();

    /* renamed from: OoooooO  reason: collision with root package name */
    public static final int[] f119OoooooO = {16842836};

    /* renamed from: Ooooooo  reason: collision with root package name */
    public static final boolean f120Ooooooo = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: o0OoOo0  reason: collision with root package name */
    public static final boolean f121o0OoOo0 = true;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final Object f122OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final Context f123OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public Window f124OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final Oooo0 f125OooOOO;
    public o000OOo OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public o000O00O f126OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public OooO0o.OooOo f127OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public o00O0O0 f128OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public CharSequence f129OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public oo000o f130OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public o00Ooo f131OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public OooO0o.OooO0OO f132OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public oo000o f133OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public ActionBarContextView f134OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public PopupWindow f135OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public boolean f136OooOoO;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public ViewGroup f138OooOoOO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public View f139OooOoo;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public TextView f140OooOoo0;

    /* renamed from: OooOooO  reason: collision with root package name */
    public boolean f141OooOooO;

    /* renamed from: OooOooo  reason: collision with root package name */
    public boolean f142OooOooo;

    /* renamed from: Oooo  reason: collision with root package name */
    public boolean f143Oooo;

    /* renamed from: Oooo0  reason: collision with root package name */
    public boolean f144Oooo0;

    /* renamed from: Oooo000  reason: collision with root package name */
    public boolean f145Oooo000;

    /* renamed from: Oooo00O  reason: collision with root package name */
    public boolean f146Oooo00O;

    /* renamed from: Oooo00o  reason: collision with root package name */
    public boolean f147Oooo00o;

    /* renamed from: Oooo0O0  reason: collision with root package name */
    public boolean f148Oooo0O0;

    /* renamed from: Oooo0OO  reason: collision with root package name */
    public boolean f149Oooo0OO;

    /* renamed from: Oooo0o  reason: collision with root package name */
    public o00000O f150Oooo0o;

    /* renamed from: Oooo0o0  reason: collision with root package name */
    public o00000O[] f151Oooo0o0;

    /* renamed from: Oooo0oO  reason: collision with root package name */
    public boolean f152Oooo0oO;

    /* renamed from: Oooo0oo  reason: collision with root package name */
    public boolean f153Oooo0oo;

    /* renamed from: OoooO  reason: collision with root package name */
    public int f154OoooO;

    /* renamed from: OoooO0  reason: collision with root package name */
    public Configuration f155OoooO0;

    /* renamed from: OoooO00  reason: collision with root package name */
    public boolean f156OoooO00;

    /* renamed from: OoooO0O  reason: collision with root package name */
    public final int f157OoooO0O;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public int f158OoooOO0;

    /* renamed from: OoooOOO  reason: collision with root package name */
    public o000000 f159OoooOOO;

    /* renamed from: OoooOOo  reason: collision with root package name */
    public o000000 f160OoooOOo;

    /* renamed from: OoooOo0  reason: collision with root package name */
    public boolean f161OoooOo0;
    public int OoooOoO;

    /* renamed from: Ooooo00  reason: collision with root package name */
    public boolean f163Ooooo00;

    /* renamed from: Ooooo0o  reason: collision with root package name */
    public Rect f164Ooooo0o;

    /* renamed from: OooooO0  reason: collision with root package name */
    public Rect f165OooooO0;

    /* renamed from: OooooOO  reason: collision with root package name */
    public o0000O00 f166OooooOO;

    /* renamed from: OooooOo  reason: collision with root package name */
    public OnBackInvokedDispatcher f167OooooOo;

    /* renamed from: Oooooo0  reason: collision with root package name */
    public OnBackInvokedCallback f168Oooooo0;

    /* renamed from: o000oOoO  reason: collision with root package name */
    public boolean f169o000oOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public o0 f137OooOoO0 = null;

    /* renamed from: OoooOoo  reason: collision with root package name */
    public final o00Ooo f162OoooOoo = new o00Ooo(this, 0);

    public o00000OO(Context context, Window window, Oooo0 oooo0, Object obj) {
        Oooo000 oooo000;
        this.f157OoooO0O = -100;
        this.f123OooOO0O = context;
        this.f125OooOOO = oooo0;
        this.f122OooOO0 = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof Oooo000) {
                    oooo000 = (Oooo000) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            oooo000 = null;
            if (oooo000 != null) {
                this.f157OoooO0O = ((o00000OO) oooo000.OooOOO0()).f157OoooO0O;
            }
        }
        if (this.f157OoooO0O == -100) {
            OooOO0.OooOOOO oooOOOO = f118Oooooo;
            Integer num = (Integer) oooOOOO.getOrDefault(this.f122OooOO0.getClass().getName(), null);
            if (num != null) {
                this.f157OoooO0O = num.intValue();
                oooOOOO.remove(this.f122OooOO0.getClass().getName());
            }
        }
        if (window != null) {
            OooOOOO(window);
        }
        androidx.appcompat.widget.o0Oo0oo.OooO0Oo();
    }

    public static OooOoOO.o00000O0 OooOOOo(Context context) {
        OooOoOO.o00000O0 o00000o02;
        OooOoOO.o00000O0 o00000o03;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (o00000o02 = o00Oo0.f236OooO0OO) == null) {
            return null;
        }
        OooOoOO.o00000O0 OooO0O02 = o0OOO0o.OooO0O0(context.getApplicationContext().getResources().getConfiguration());
        OooOoOO.o00000O o00000o = o00000o02.f1207OooO00o;
        if (((OooOoOO.o00000OO) o00000o).f1208OooO00o.isEmpty()) {
            o00000o03 = OooOoOO.o00000O0.f1206OooO0O0;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < ((OooOoOO.o00000OO) OooO0O02.f1207OooO00o).f1208OooO00o.size() + ((OooOoOO.o00000OO) o00000o).f1208OooO00o.size(); i++) {
                if (i < ((OooOoOO.o00000OO) o00000o).f1208OooO00o.size()) {
                    locale = ((OooOoOO.o00000OO) o00000o).f1208OooO00o.get(i);
                } else {
                    locale = ((OooOoOO.o00000OO) OooO0O02.f1207OooO00o).f1208OooO00o.get(i - ((OooOoOO.o00000OO) o00000o).f1208OooO00o.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
            }
            o00000o03 = new OooOoOO.o00000O0(new OooOoOO.o00000OO(OooOoOO.o00000.OooO00o((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (!((OooOoOO.o00000OO) o00000o03.f1207OooO00o).f1208OooO00o.isEmpty()) {
            return o00000o03;
        }
        return OooO0O02;
    }

    public static Configuration OooOo00(Context context, int i, OooOoOO.o00000O0 o00000o02, Configuration configuration, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (o00000o02 != null) {
            o0OOO0o.OooO0Oo(configuration2, o00000o02);
        }
        return configuration2;
    }

    @Override // OooO0Oo.o00Oo0
    public final void OooO(int i) {
        OooOo0o();
        ViewGroup viewGroup = (ViewGroup) this.f138OooOoOO.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f123OooOO0O).inflate(i, viewGroup);
        this.OooOOO0.OooO00o(this.f124OooOO0o.getCallback());
    }

    @Override // OooO0Oo.o00Oo0
    public final void OooO00o(View view, ViewGroup.LayoutParams layoutParams) {
        OooOo0o();
        ((ViewGroup) this.f138OooOoOO.findViewById(16908290)).addView(view, layoutParams);
        this.OooOOO0.OooO00o(this.f124OooOO0o.getCallback());
    }

    @Override // OooO0Oo.o00Oo0
    public final void OooO0O0() {
        if (this.f126OooOOOO != null) {
            OooOoo0();
            this.f126OooOOOO.getClass();
            this.OoooOoO |= 1;
            if (!this.f161OoooOo0) {
                View decorView = this.f124OooOO0o.getDecorView();
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                OooOooo.o00O0O0.OooOOO0(decorView, this.f162OoooOoo);
                this.f161OoooOo0 = true;
            }
        }
    }

    @Override // OooO0Oo.o00Oo0
    public final void OooO0Oo() {
        String str;
        this.f153Oooo0oo = true;
        OooOOO(false, true);
        OooOo();
        Object obj = this.f122OooOO0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = OooO00o.o00000O0(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                o000O00O o000o00o = this.f126OooOOOO;
                if (o000o00o == null) {
                    this.f163Ooooo00 = true;
                } else {
                    o000o00o.OooOo00(true);
                }
            }
            synchronized (o00Oo0.f241OooO0oo) {
                o00Oo0.OooO0oO(this);
                o00Oo0.f240OooO0oO.add(new WeakReference(this));
            }
        }
        this.f155OoooO0 = new Configuration(this.f123OooOO0O.getResources().getConfiguration());
        this.f143Oooo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // OooO0Oo.o00Oo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0o() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f122OooOO0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = OooO0Oo.o00Oo0.f241OooO0oo
            monitor-enter(r0)
            OooO0Oo.o00Oo0.OooO0oO(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f161OoooOo0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f124OooOO0o
            android.view.View r0 = r0.getDecorView()
            OooO0Oo.o00Ooo r1 = r3.f162OoooOoo
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f156OoooO00 = r0
            int r0 = r3.f157OoooO0O
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f122OooOO0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            OooOO0.OooOOOO r0 = OooO0Oo.o00000OO.f118Oooooo
            java.lang.Object r1 = r3.f122OooOO0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f157OoooO0O
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            OooOO0.OooOOOO r0 = OooO0Oo.o00000OO.f118Oooooo
            java.lang.Object r1 = r3.f122OooOO0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            OooO0Oo.o000000 r0 = r3.f159OoooOOO
            if (r0 == 0) goto L63
            r0.OooO00o()
        L63:
            OooO0Oo.o000000 r0 = r3.f160OoooOOo
            if (r0 == 0) goto L6a
            r0.OooO00o()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.o00000OO.OooO0o():void");
    }

    @Override // OooO0oO.o00O000o
    public final boolean OooO0o0(o00O00O o00o00o, MenuItem menuItem) {
        int i;
        int i2;
        o00000O o00000o;
        Window.Callback OooOoOO2 = OooOoOO();
        if (OooOoOO2 != null && !this.f156OoooO00) {
            o00O00O OooOO0O2 = o00o00o.OooOO0O();
            o00000O[] o00000oArr = this.f151Oooo0o0;
            if (o00000oArr != null) {
                i = o00000oArr.length;
                i2 = 0;
            } else {
                i = 0;
                i2 = 0;
            }
            while (true) {
                if (i2 < i) {
                    o00000o = o00000oArr[i2];
                    if (o00000o != null && o00000o.f110OooO0oo == OooOO0O2) {
                        break;
                    }
                    i2++;
                } else {
                    o00000o = null;
                    break;
                }
            }
            if (o00000o != null) {
                return OooOoOO2.onMenuItemSelected(o00000o.f103OooO00o, menuItem);
            }
        }
        return false;
    }

    @Override // OooO0Oo.o00Oo0
    public final boolean OooO0oo(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f148Oooo0O0 && i == 108) {
            return false;
        }
        if (this.f145Oooo000 && i == 1) {
            this.f145Oooo000 = false;
        }
        if (i == 1) {
            Oooo00o();
            this.f148Oooo0O0 = true;
            return true;
        } else if (i == 2) {
            Oooo00o();
            this.f141OooOooO = true;
            return true;
        } else if (i == 5) {
            Oooo00o();
            this.f142OooOooo = true;
            return true;
        } else if (i == 10) {
            Oooo00o();
            this.f147Oooo00o = true;
            return true;
        } else if (i == 108) {
            Oooo00o();
            this.f145Oooo000 = true;
            return true;
        } else if (i != 109) {
            return this.f124OooOO0o.requestFeature(i);
        } else {
            Oooo00o();
            this.f146Oooo00O = true;
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        if (r6 == false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    @Override // OooO0oO.o00O000o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOO0(OooO0oO.o00O00O r6) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.o00000OO.OooOO0(OooO0oO.o00O00O):void");
    }

    @Override // OooO0Oo.o00Oo0
    public final void OooOO0O(View view) {
        OooOo0o();
        ViewGroup viewGroup = (ViewGroup) this.f138OooOoOO.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.OooOOO0.OooO00o(this.f124OooOO0o.getCallback());
    }

    @Override // OooO0Oo.o00Oo0
    public final void OooOO0o(View view, ViewGroup.LayoutParams layoutParams) {
        OooOo0o();
        ViewGroup viewGroup = (ViewGroup) this.f138OooOoOO.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.OooOOO0.OooO00o(this.f124OooOO0o.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x01b9, code lost:
        if (r1 != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01c2, code lost:
        if (r13.f156OoooO00 == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01c4, code lost:
        r14.onConfigurationChanged(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOOO(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.o00000OO.OooOOO(boolean, boolean):boolean");
    }

    @Override // OooO0Oo.o00Oo0
    public final void OooOOO0(CharSequence charSequence) {
        this.f129OooOOo0 = charSequence;
        o00O0O0 o00o0o0 = this.f128OooOOo;
        if (o00o0o0 != null) {
            o00o0o0.setWindowTitle(charSequence);
            return;
        }
        o000O00O o000o00o = this.f126OooOOOO;
        if (o000o00o != null) {
            o000o00o.OooOo0O(charSequence);
            return;
        }
        TextView textView = this.f140OooOoo0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void OooOOOO(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f124OooOO0o == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof o000OOo)) {
                o000OOo o000ooo = new o000OOo(this, callback);
                this.OooOOO0 = o000ooo;
                window.setCallback(o000ooo);
                int[] iArr = f119OoooooO;
                Context context = this.f123OooOO0O;
                OnBackInvokedDispatcher onBackInvokedDispatcher2 = null;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    androidx.appcompat.widget.o0Oo0oo OooO00o2 = androidx.appcompat.widget.o0Oo0oo.OooO00o();
                    synchronized (OooO00o2) {
                        drawable = OooO00o2.f2534OooO00o.OooO0o(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f124OooOO0o = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f167OooooOo) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f168Oooooo0) != null) {
                        o0O0O00.OooO0OO(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f168Oooooo0 = null;
                    }
                    Object obj = this.f122OooOO0;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            onBackInvokedDispatcher2 = o0O0O00.OooO00o(activity);
                        }
                    }
                    this.f167OooooOo = onBackInvokedDispatcher2;
                    Oooo0();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void OooOOo(o00O00O o00o00o) {
        androidx.appcompat.widget.Oooo000 oooo000;
        if (this.f149Oooo0OO) {
            return;
        }
        this.f149Oooo0OO = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f128OooOOo;
        actionBarOverlayLayout.OooOO0o();
        ActionMenuView actionMenuView = ((o0OO00OO) actionBarOverlayLayout.f2050OooO0o0).f2490OooO00o.f2197OooO00o;
        if (actionMenuView != null && (oooo000 = actionMenuView.f2076OooOo00) != null) {
            oooo000.OooO0o0();
            androidx.appcompat.widget.OooOOO0 oooOOO0 = oooo000.f2149OooOo00;
            if (oooOOO0 != null && oooOOO0.OooO0O0()) {
                oooOOO0.f458OooOO0.dismiss();
            }
        }
        Window.Callback OooOoOO2 = OooOoOO();
        if (OooOoOO2 != null && !this.f156OoooO00) {
            OooOoOO2.onPanelClosed(108, o00o00o);
        }
        this.f149Oooo0OO = false;
    }

    public final void OooOOo0(int i, o00000O o00000o, o00O00O o00o00o) {
        if (o00o00o == null) {
            if (o00000o == null && i >= 0) {
                o00000O[] o00000oArr = this.f151Oooo0o0;
                if (i < o00000oArr.length) {
                    o00000o = o00000oArr[i];
                }
            }
            if (o00000o != null) {
                o00o00o = o00000o.f110OooO0oo;
            }
        }
        if ((o00000o == null || o00000o.OooOOO0) && !this.f156OoooO00) {
            o000OOo o000ooo = this.OooOOO0;
            Window.Callback callback = this.f124OooOO0o.getCallback();
            o000ooo.getClass();
            try {
                o000ooo.f228OooO0Oo = true;
                callback.onPanelClosed(i, o00o00o);
            } finally {
                o000ooo.f228OooO0Oo = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOoo(OooO0Oo.o00000O r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L35
            int r2 = r6.f103OooO00o
            if (r2 != 0) goto L35
            androidx.appcompat.widget.o00O0O0 r2 = r5.f128OooOOo
            if (r2 == 0) goto L35
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.OooOO0o()
            androidx.appcompat.widget.o00O0O0O r2 = r2.f2050OooO0o0
            androidx.appcompat.widget.o0OO00OO r2 = (androidx.appcompat.widget.o0OO00OO) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f2490OooO00o
            androidx.appcompat.widget.ActionMenuView r2 = r2.f2197OooO00o
            if (r2 == 0) goto L2c
            androidx.appcompat.widget.Oooo000 r2 = r2.f2076OooOo00
            if (r2 == 0) goto L27
            boolean r2 = r2.OooO()
            if (r2 == 0) goto L27
            r2 = r0
            goto L28
        L27:
            r2 = r1
        L28:
            if (r2 == 0) goto L2c
            r2 = r0
            goto L2d
        L2c:
            r2 = r1
        L2d:
            if (r2 == 0) goto L35
            OooO0oO.o00O00O r6 = r6.f110OooO0oo
            r5.OooOOo(r6)
            return
        L35:
            android.content.Context r2 = r5.f123OooOO0O
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r3 = 0
            if (r2 == 0) goto L54
            boolean r4 = r6.OooOOO0
            if (r4 == 0) goto L54
            OooO0Oo.o00000O0 r4 = r6.f108OooO0o0
            if (r4 == 0) goto L54
            r2.removeView(r4)
            if (r7 == 0) goto L54
            int r7 = r6.f103OooO00o
            r5.OooOOo0(r7, r6, r3)
        L54:
            r6.f112OooOO0O = r1
            r6.f113OooOO0o = r1
            r6.OooOOO0 = r1
            r6.f107OooO0o = r3
            r6.f114OooOOO = r0
            OooO0Oo.o00000O r7 = r5.f150Oooo0o
            if (r7 != r6) goto L64
            r5.f150Oooo0o = r3
        L64:
            int r6 = r6.f103OooO00o
            if (r6 != 0) goto L6b
            r5.Oooo0()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.o00000OO.OooOOoo(OooO0Oo.o00000O, boolean):void");
    }

    public final void OooOo() {
        if (this.f124OooOO0o == null) {
            Object obj = this.f122OooOO0;
            if (obj instanceof Activity) {
                OooOOOO(((Activity) obj).getWindow());
            }
        }
        if (this.f124OooOO0o == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ff, code lost:
        if (r7 != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOo0(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.o00000OO.OooOo0(android.view.KeyEvent):boolean");
    }

    public final void OooOo0O(int i) {
        o00000O OooOoO2 = OooOoO(i);
        if (OooOoO2.f110OooO0oo != null) {
            Bundle bundle = new Bundle();
            OooOoO2.f110OooO0oo.OooOo00(bundle);
            if (bundle.size() > 0) {
                OooOoO2.f116OooOOOo = bundle;
            }
            OooOoO2.f110OooO0oo.OooOo0o();
            OooOoO2.f110OooO0oo.clear();
        }
        OooOoO2.f115OooOOOO = true;
        OooOoO2.f114OooOOO = true;
        if ((i == 108 || i == 0) && this.f128OooOOo != null) {
            o00000O OooOoO3 = OooOoO(0);
            OooOoO3.f112OooOO0O = false;
            Oooo00O(OooOoO3, null);
        }
    }

    public final void OooOo0o() {
        int i;
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f136OooOoO) {
            int[] iArr = OooO0OO.OooO00o.f26OooOO0;
            Context context2 = this.f123OooOO0O;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    OooO0oo(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    OooO0oo(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    OooO0oo(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    OooO0oo(10);
                }
                this.f144Oooo0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                OooOo();
                this.f124OooOO0o.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.f148Oooo0O0) {
                    if (this.f144Oooo0) {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.f146Oooo00O = false;
                        this.f145Oooo000 = false;
                    } else if (this.f145Oooo000) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new OooO0o.OooOO0(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                        o00O0O0 o00o0o0 = (o00O0O0) viewGroup.findViewById(R.id.decor_content_parent);
                        this.f128OooOOo = o00o0o0;
                        o00o0o0.setWindowCallback(OooOoOO());
                        if (this.f146Oooo00O) {
                            ((ActionBarOverlayLayout) this.f128OooOOo).OooOO0O(109);
                        }
                        if (this.f141OooOooO) {
                            ((ActionBarOverlayLayout) this.f128OooOOo).OooOO0O(2);
                        }
                        if (this.f142OooOooo) {
                            ((ActionBarOverlayLayout) this.f128OooOOo).OooOO0O(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    if (this.f147Oooo00o) {
                        i = R.layout.abc_screen_simple_overlay_action_mode;
                    } else {
                        i = R.layout.abc_screen_simple;
                    }
                    viewGroup = (ViewGroup) from.inflate(i, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    oo000o oo000oVar = new oo000o(this, 0);
                    WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                    oo0oOO0.OooOo0(viewGroup, oo000oVar);
                    if (this.f128OooOOo == null) {
                        this.f140OooOoo0 = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = o0OO0oO0.f2516OooO00o;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f124OooOO0o.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f124OooOO0o.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new oo000o(this, 2));
                    this.f138OooOoOO = viewGroup;
                    Object obj = this.f122OooOO0;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f129OooOOo0;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        o00O0O0 o00o0o02 = this.f128OooOOo;
                        if (o00o0o02 != null) {
                            o00o0o02.setWindowTitle(charSequence);
                        } else {
                            o000O00O o000o00o = this.f126OooOOOO;
                            if (o000o00o != null) {
                                o000o00o.OooOo0O(charSequence);
                            } else {
                                TextView textView = this.f140OooOoo0;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f138OooOoOO.findViewById(16908290);
                    View decorView = this.f124OooOO0o.getDecorView();
                    contentFrameLayout2.f2092OooO0oO.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
                    if (oo0o0O0.OooO0OO(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f136OooOoO = true;
                    o00000O OooOoO2 = OooOoO(0);
                    if (!this.f156OoooO00 && OooOoO2.f110OooO0oo == null) {
                        this.OoooOoO |= 4096;
                        if (!this.f161OoooOo0) {
                            OooOooo.o00O0O0.OooOOO0(this.f124OooOO0o.getDecorView(), this.f162OoooOoo);
                            this.f161OoooOo0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f145Oooo000 + ", windowActionBarOverlay: " + this.f146Oooo00O + ", android:windowIsFloating: " + this.f144Oooo0 + ", windowActionModeOverlay: " + this.f147Oooo00o + ", windowNoTitle: " + this.f148Oooo0O0 + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final o00000O OooOoO(int i) {
        o00000O[] o00000oArr = this.f151Oooo0o0;
        if (o00000oArr == null || o00000oArr.length <= i) {
            o00000O[] o00000oArr2 = new o00000O[i + 1];
            if (o00000oArr != null) {
                System.arraycopy(o00000oArr, 0, o00000oArr2, 0, o00000oArr.length);
            }
            this.f151Oooo0o0 = o00000oArr2;
            o00000oArr = o00000oArr2;
        }
        o00000O o00000o = o00000oArr[i];
        if (o00000o == null) {
            o00000O o00000o2 = new o00000O(i);
            o00000oArr[i] = o00000o2;
            return o00000o2;
        }
        return o00000o;
    }

    public final o00000 OooOoO0(Context context) {
        if (this.f159OoooOOO == null) {
            if (androidx.activity.result.OooO0o.f1980OooO0o0 == null) {
                Context applicationContext = context.getApplicationContext();
                androidx.activity.result.OooO0o.f1980OooO0o0 = new androidx.activity.result.OooO0o(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f159OoooOOO = new o000000(this, androidx.activity.result.OooO0o.f1980OooO0o0);
        }
        return this.f159OoooOOO;
    }

    public final Window.Callback OooOoOO() {
        return this.f124OooOO0o.getCallback();
    }

    public final int OooOoo(Context context, int i) {
        o00000 OooOoO02;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        if (this.f160OoooOOo == null) {
                            this.f160OoooOOo = new o000000(this, context);
                        }
                        OooOoO02 = this.f160OoooOOo;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                OooOoO02 = OooOoO0(context);
            }
            return OooOoO02.OooO0Oo();
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOoo0() {
        /*
            r3 = this;
            r3.OooOo0o()
            boolean r0 = r3.f145Oooo000
            if (r0 == 0) goto L32
            OooO0Oo.o000O00O r0 = r3.f126OooOOOO
            if (r0 == 0) goto Lc
            goto L32
        Lc:
            java.lang.Object r0 = r3.f122OooOO0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1c
            OooO0Oo.o000O00O r1 = new OooO0Oo.o000O00O
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.f146Oooo00O
            r1.<init>(r0, r2)
            goto L27
        L1c:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L29
            OooO0Oo.o000O00O r1 = new OooO0Oo.o000O00O
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
        L27:
            r3.f126OooOOOO = r1
        L29:
            OooO0Oo.o000O00O r0 = r3.f126OooOOOO
            if (r0 == 0) goto L32
            boolean r1 = r3.f163Ooooo00
            r0.OooOo00(r1)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.o00000OO.OooOoo0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOooO() {
        /*
            r5 = this;
            boolean r0 = r5.f152Oooo0oO
            r1 = 0
            r5.f152Oooo0oO = r1
            OooO0Oo.o00000O r2 = r5.OooOoO(r1)
            boolean r3 = r2.OooOOO0
            r4 = 1
            if (r3 == 0) goto L14
            if (r0 != 0) goto L13
            r5.OooOOoo(r2, r4)
        L13:
            return r4
        L14:
            OooO0o.OooO0OO r0 = r5.f132OooOo0
            if (r0 == 0) goto L1c
            r0.OooO00o()
            return r4
        L1c:
            r5.OooOoo0()
            OooO0Oo.o000O00O r0 = r5.f126OooOOOO
            if (r0 == 0) goto L50
            androidx.appcompat.widget.o00O0O0O r0 = r0.f202OooO0o0
            if (r0 == 0) goto L4c
            r2 = r0
            androidx.appcompat.widget.o0OO00OO r2 = (androidx.appcompat.widget.o0OO00OO) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f2490OooO00o
            androidx.appcompat.widget.o0OO000 r2 = r2.f2234Oooo0o0
            if (r2 == 0) goto L36
            OooO0oO.o00O00OO r2 = r2.f2485OooO0O0
            if (r2 == 0) goto L36
            r2 = r4
            goto L37
        L36:
            r2 = r1
        L37:
            if (r2 == 0) goto L4c
            androidx.appcompat.widget.o0OO00OO r0 = (androidx.appcompat.widget.o0OO00OO) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f2490OooO00o
            androidx.appcompat.widget.o0OO000 r0 = r0.f2234Oooo0o0
            if (r0 != 0) goto L43
            r0 = 0
            goto L45
        L43:
            OooO0oO.o00O00OO r0 = r0.f2485OooO0O0
        L45:
            if (r0 == 0) goto L4a
            r0.collapseActionView()
        L4a:
            r0 = r4
            goto L4d
        L4c:
            r0 = r1
        L4d:
            if (r0 == 0) goto L50
            return r4
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.o00000OO.OooOooO():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0151, code lost:
        if (r2 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0175, code lost:
        if (r2.f468OooO0o.getCount() > 0) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOooo(OooO0Oo.o00000O r19, android.view.KeyEvent r20) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.o00000OO.OooOooo(OooO0Oo.o00000O, android.view.KeyEvent):void");
    }

    public final void Oooo0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f167OooooOo != null && (OooOoO(0).OooOOO0 || this.f132OooOo0 != null)) {
                z = true;
            }
            if (z && this.f168Oooooo0 == null) {
                this.f168Oooooo0 = o0O0O00.OooO0O0(this.f167OooooOo, this);
            } else if (!z && (onBackInvokedCallback = this.f168Oooooo0) != null) {
                o0O0O00.OooO0OO(this.f167OooooOo, onBackInvokedCallback);
            }
        }
    }

    public final boolean Oooo000(o00000O o00000o, int i, KeyEvent keyEvent) {
        o00O00O o00o00o;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((o00000o.f112OooOO0O || Oooo00O(o00000o, keyEvent)) && (o00o00o = o00000o.f110OooO0oo) != null) {
            return o00o00o.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean Oooo00O(o00000O o00000o, KeyEvent keyEvent) {
        boolean z;
        o00O0O0 o00o0o0;
        o00O0O0 o00o0o02;
        Resources.Theme theme;
        int i;
        boolean z2;
        o00O0O0 o00o0o03;
        o00O0O0 o00o0o04;
        if (this.f156OoooO00) {
            return false;
        }
        if (o00000o.f112OooOO0O) {
            return true;
        }
        o00000O o00000o2 = this.f150Oooo0o;
        if (o00000o2 != null && o00000o2 != o00000o) {
            OooOOoo(o00000o2, false);
        }
        Window.Callback OooOoOO2 = OooOoOO();
        int i2 = o00000o.f103OooO00o;
        if (OooOoOO2 != null) {
            o00000o.f109OooO0oO = OooOoOO2.onCreatePanelView(i2);
        }
        if (i2 != 0 && i2 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (o00o0o04 = this.f128OooOOo) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) o00o0o04;
            actionBarOverlayLayout.OooOO0o();
            ((o0OO00OO) actionBarOverlayLayout.f2050OooO0o0).f2500OooOO0o = true;
        }
        if (o00000o.f109OooO0oO == null) {
            o00O00O o00o00o = o00000o.f110OooO0oo;
            if (o00o00o == null || o00000o.f115OooOOOO) {
                if (o00o00o == null) {
                    Context context = this.f123OooOO0O;
                    if ((i2 == 0 || i2 == 108) && this.f128OooOOo != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            OooO0o.OooOO0 oooOO0 = new OooO0o.OooOO0(context, 0);
                            oooOO0.getTheme().setTo(theme);
                            context = oooOO0;
                        }
                    }
                    o00O00O o00o00o2 = new o00O00O(context);
                    o00o00o2.f395OooO0o0 = this;
                    o00O00O o00o00o3 = o00000o.f110OooO0oo;
                    if (o00o00o2 != o00o00o3) {
                        if (o00o00o3 != null) {
                            o00o00o3.OooOOo(o00000o.f102OooO);
                        }
                        o00000o.f110OooO0oo = o00o00o2;
                        o00oOoo o00oooo = o00000o.f102OooO;
                        if (o00oooo != null) {
                            o00o00o2.OooO0O0(o00oooo, o00o00o2.f390OooO00o);
                        }
                    }
                    if (o00000o.f110OooO0oo == null) {
                        return false;
                    }
                }
                if (z && (o00o0o02 = this.f128OooOOo) != null) {
                    if (this.f130OooOOoo == null) {
                        this.f130OooOOoo = new oo000o(this, 3);
                    }
                    ((ActionBarOverlayLayout) o00o0o02).OooOOO0(o00000o.f110OooO0oo, this.f130OooOOoo);
                }
                o00000o.f110OooO0oo.OooOo0o();
                if (!OooOoOO2.onCreatePanelMenu(i2, o00000o.f110OooO0oo)) {
                    o00O00O o00o00o4 = o00000o.f110OooO0oo;
                    if (o00o00o4 != null) {
                        if (o00o00o4 != null) {
                            o00o00o4.OooOOo(o00000o.f102OooO);
                        }
                        o00000o.f110OooO0oo = null;
                    }
                    if (z && (o00o0o0 = this.f128OooOOo) != null) {
                        ((ActionBarOverlayLayout) o00o0o0).OooOOO0(null, this.f130OooOOoo);
                    }
                    return false;
                }
                o00000o.f115OooOOOO = false;
            }
            o00000o.f110OooO0oo.OooOo0o();
            Bundle bundle = o00000o.f116OooOOOo;
            if (bundle != null) {
                o00000o.f110OooO0oo.OooOOoo(bundle);
                o00000o.f116OooOOOo = null;
            }
            if (!OooOoOO2.onPreparePanel(0, o00000o.f109OooO0oO, o00000o.f110OooO0oo)) {
                if (z && (o00o0o03 = this.f128OooOOo) != null) {
                    ((ActionBarOverlayLayout) o00o0o03).OooOOO0(null, this.f130OooOOoo);
                }
                o00000o.f110OooO0oo.OooOo0O();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            o00000o.f110OooO0oo.setQwertyMode(z2);
            o00000o.f110OooO0oo.OooOo0O();
        }
        o00000o.f112OooOO0O = true;
        o00000o.f113OooOO0o = false;
        this.f150Oooo0o = o00000o;
        return true;
    }

    public final void Oooo00o() {
        if (this.f136OooOoO) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int Oooo0O0(o0O0OOOo o0o0oooo, Rect rect) {
        int i;
        boolean z;
        int OooO0OO2;
        int OooO0Oo2;
        boolean z2;
        int i2;
        int i3 = 0;
        if (o0o0oooo != null) {
            i = o0o0oooo.OooO0o0();
        } else if (rect != null) {
            i = rect.top;
        } else {
            i = 0;
        }
        ActionBarContextView actionBarContextView = this.f134OooOo0O;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f134OooOo0O.getLayoutParams();
            boolean z3 = true;
            if (this.f134OooOo0O.isShown()) {
                if (this.f164Ooooo0o == null) {
                    this.f164Ooooo0o = new Rect();
                    this.f165OooooO0 = new Rect();
                }
                Rect rect2 = this.f164Ooooo0o;
                Rect rect3 = this.f165OooooO0;
                if (o0o0oooo == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(o0o0oooo.OooO0OO(), o0o0oooo.OooO0o0(), o0o0oooo.OooO0Oo(), o0o0oooo.OooO0O0());
                }
                ViewGroup viewGroup = this.f138OooOoOO;
                Method method = o0OO0oO0.f2516OooO00o;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception unused) {
                    }
                }
                int i4 = rect2.top;
                int i5 = rect2.left;
                int i6 = rect2.right;
                ViewGroup viewGroup2 = this.f138OooOoOO;
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                o0O0OOOo OooO00o2 = o00O.OooO00o(viewGroup2);
                if (OooO00o2 == null) {
                    OooO0OO2 = 0;
                } else {
                    OooO0OO2 = OooO00o2.OooO0OO();
                }
                if (OooO00o2 == null) {
                    OooO0Oo2 = 0;
                } else {
                    OooO0Oo2 = OooO00o2.OooO0Oo();
                }
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z2 = true;
                }
                Context context = this.f123OooOO0O;
                if (i4 > 0 && this.f139OooOoo == null) {
                    View view = new View(context);
                    this.f139OooOoo = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = OooO0OO2;
                    layoutParams.rightMargin = OooO0Oo2;
                    this.f138OooOoOO.addView(this.f139OooOoo, -1, layoutParams);
                } else {
                    View view2 = this.f139OooOoo;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != OooO0OO2 || marginLayoutParams2.rightMargin != OooO0Oo2) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = OooO0OO2;
                            marginLayoutParams2.rightMargin = OooO0Oo2;
                            this.f139OooOoo.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f139OooOoo;
                if (view3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.f139OooOoo;
                    if ((OooOooo.o00O0O0.OooO0oO(view4) & 8192) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        Object obj = OooOo0.Oooo000.f1139OooO00o;
                        i2 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        Object obj2 = OooOo0.Oooo000.f1139OooO00o;
                        i2 = R.color.abc_decor_view_status_guard;
                    }
                    view4.setBackgroundColor(OooOo0O.oo000o.OooO00o(context, i2));
                }
                if (!this.f147Oooo00o && z) {
                    i = 0;
                }
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z3 = false;
                z = false;
            }
            if (z3) {
                this.f134OooOo0O.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view5 = this.f139OooOoo;
        if (view5 != null) {
            if (!z) {
                i3 = 8;
            }
            view5.setVisibility(i3);
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ee, code lost:
        if (r10.equals("ImageButton") == false) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01db A[Catch: all -> 0x01e5, Exception -> 0x01eb, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x01eb, all -> 0x01e5, blocks: (B:104:0x01b4, B:107:0x01c1, B:109:0x01c5, B:114:0x01db), top: B:147:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0168  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.o00000OO.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}