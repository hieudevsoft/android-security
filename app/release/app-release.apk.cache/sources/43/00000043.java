package OooO0o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class OooOO0 extends ContextWrapper {

    /* renamed from: OooO0o  reason: collision with root package name */
    public static Configuration f254OooO0o;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f255OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Resources.Theme f256OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public LayoutInflater f257OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Configuration f258OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public Resources f259OooO0o0;

    public OooOO0(Context context, int i) {
        super(context);
        this.f255OooO00o = i;
    }

    public final void OooO00o(Configuration configuration) {
        if (this.f259OooO0o0 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f258OooO0Oo != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f258OooO0Oo = new Configuration(configuration);
    }

    public final void OooO0O0() {
        boolean z;
        if (this.f256OooO0O0 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f256OooO0O0 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f256OooO0O0.setTo(theme);
            }
        }
        this.f256OooO0O0.applyStyle(this.f255OooO00o, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r0.equals(OooO0o.OooOO0.f254OooO0o) != false) goto L14;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f259OooO0o0
            if (r0 != 0) goto L36
            android.content.res.Configuration r0 = r3.f258OooO0Oo
            if (r0 == 0) goto L30
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = OooO0o.OooOO0.f254OooO0o
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            OooO0o.OooOO0.f254OooO0o = r1
        L1c:
            android.content.res.Configuration r1 = OooO0o.OooOO0.f254OooO0o
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L30
        L25:
            android.content.res.Configuration r0 = r3.f258OooO0Oo
            android.content.Context r0 = OooO0o.OooO.OooO00o(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            goto L34
        L30:
            android.content.res.Resources r0 = super.getResources()
        L34:
            r3.f259OooO0o0 = r0
        L36:
            android.content.res.Resources r0 = r3.f259OooO0o0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0o.OooOO0.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f257OooO0OO == null) {
                this.f257OooO0OO = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f257OooO0OO;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f256OooO0O0;
        if (theme != null) {
            return theme;
        }
        if (this.f255OooO00o == 0) {
            this.f255OooO00o = 2131755547;
        }
        OooO0O0();
        return this.f256OooO0O0;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f255OooO00o != i) {
            this.f255OooO00o = i;
            OooO0O0();
        }
    }
}