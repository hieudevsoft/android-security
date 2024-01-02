package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0O0000O {

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static o0O0000O f2415OooO0oO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public WeakHashMap f2417OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final WeakHashMap f2418OooO0O0 = new WeakHashMap(0);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public TypedValue f2419OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f2420OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public o0OOO0o f2421OooO0o0;

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final PorterDuff.Mode f2414OooO0o = PorterDuff.Mode.SRC_IN;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static final o0O00000 f2416OooO0oo = new o0O00000();

    public static synchronized o0O0000O OooO0OO() {
        o0O0000O o0o0000o;
        synchronized (o0O0000O.class) {
            if (f2415OooO0oO == null) {
                f2415OooO0oO = new o0O0000O();
            }
            o0o0000o = f2415OooO0oO;
        }
        return o0o0000o;
    }

    public static synchronized PorterDuffColorFilter OooO0oO(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (o0O0000O.class) {
            o0O00000 o0o00000 = f2416OooO0oo;
            o0o00000.getClass();
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) o0o00000.OooO00o(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                o0o00000.getClass();
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) o0o00000.OooO0O0(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            androidx.appcompat.widget.o0OOO0o r0 = r6.f2421OooO0o0
            r1 = 0
            if (r0 == 0) goto L74
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.o0Oo0oo.f2532OooO0O0
            java.lang.Object r3 = r0.f2519OooO0O0
            int[] r3 = (int[]) r3
            boolean r3 = androidx.appcompat.widget.o0OOO0o.OooO00o(r3, r8)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L17
            r8 = 2130903289(0x7f0300f9, float:1.7413392E38)
            goto L4e
        L17:
            java.lang.Object r3 = r0.f2521OooO0Oo
            int[] r3 = (int[]) r3
            boolean r3 = androidx.appcompat.widget.o0OOO0o.OooO00o(r3, r8)
            if (r3 == 0) goto L25
            r8 = 2130903287(0x7f0300f7, float:1.7413388E38)
            goto L4e
        L25:
            java.lang.Object r0 = r0.f2523OooO0o0
            int[] r0 = (int[]) r0
            boolean r0 = androidx.appcompat.widget.o0OOO0o.OooO00o(r0, r8)
            if (r0 == 0) goto L32
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L4b
        L32:
            r0 = 2131165262(0x7f07004e, float:1.7944736E38)
            if (r8 != r0) goto L46
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r2
            r2 = r0
            r0 = r8
            r8 = r4
            goto L56
        L46:
            r0 = 2131165244(0x7f07003c, float:1.79447E38)
            if (r8 != r0) goto L51
        L4b:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L4e:
            r0 = r8
            r8 = r4
            goto L53
        L51:
            r8 = r1
            r0 = r8
        L53:
            r3 = r2
            r2 = r0
            r0 = r5
        L56:
            if (r8 == 0) goto L70
            int[] r8 = androidx.appcompat.widget.o00O0OO0.f2334OooO00o
            android.graphics.drawable.Drawable r8 = r9.mutate()
            int r7 = androidx.appcompat.widget.oo0OOoo.OooO0OO(r7, r2)
            android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.o0Oo0oo.OooO0OO(r7, r3)
            r8.setColorFilter(r7)
            if (r0 == r5) goto L6e
            r8.setAlpha(r0)
        L6e:
            r7 = r4
            goto L71
        L70:
            r7 = r1
        L71:
            if (r7 == 0) goto L74
            r1 = r4
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0O0000O.OooO(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    public final synchronized void OooO00o(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            OooOO0.OooO0o oooO0o = (OooOO0.OooO0o) this.f2418OooO0O0.get(context);
            if (oooO0o == null) {
                oooO0o = new OooOO0.OooO0o();
                this.f2418OooO0O0.put(context, oooO0o);
            }
            oooO0o.OooO0o0(j, new WeakReference(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable OooO0O0(android.content.Context r12, int r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0O0000O.OooO0O0(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable OooO0Oo(Context context, long j) {
        OooOO0.OooO0o oooO0o = (OooOO0.OooO0o) this.f2418OooO0O0.get(context);
        if (oooO0o == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) oooO0o.OooO0Oo(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int OooOOo02 = o0000O00.OooO00o.OooOOo0(oooO0o.f521OooO0O0, oooO0o.f523OooO0Oo, j);
            if (OooOOo02 >= 0) {
                Object[] objArr = oooO0o.f522OooO0OO;
                Object obj = objArr[OooOOo02];
                Object obj2 = OooOO0.OooO0o.f519OooO0o0;
                if (obj != obj2) {
                    objArr[OooOOo02] = obj2;
                    oooO0o.f520OooO00o = true;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        OooOoO0.o0OOO0o.OooO(r12, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable OooO0o(android.content.Context r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0O0000O.OooO0o(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable OooO0o0(Context context, int i) {
        return OooO0o(context, i, false);
    }

    public final synchronized ColorStateList OooO0oo(Context context, int i) {
        ColorStateList colorStateList;
        OooOO0.OooOo00 oooOo00;
        try {
            WeakHashMap weakHashMap = this.f2417OooO00o;
            ColorStateList colorStateList2 = null;
            if (weakHashMap != null && (oooOo00 = (OooOO0.OooOo00) weakHashMap.get(context)) != null) {
                colorStateList = (ColorStateList) oooOo00.OooO0OO(i, null);
            } else {
                colorStateList = null;
            }
            if (colorStateList == null) {
                o0OOO0o o0ooo0o = this.f2421OooO0o0;
                if (o0ooo0o != null) {
                    colorStateList2 = o0ooo0o.OooO0OO(context, i);
                }
                if (colorStateList2 != null) {
                    if (this.f2417OooO00o == null) {
                        this.f2417OooO00o = new WeakHashMap();
                    }
                    OooOO0.OooOo00 oooOo002 = (OooOO0.OooOo00) this.f2417OooO00o.get(context);
                    if (oooOo002 == null) {
                        oooOo002 = new OooOO0.OooOo00();
                        this.f2417OooO00o.put(context, oooOo002);
                    }
                    oooOo002.OooO00o(i, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }
}