package OooO0Oo;

import OooO0O0.OooO00o;
import OooO0oO.o00;
import OooO0oO.o000OOo0;
import OooO0oO.o00O000o;
import OooO0oO.o00O00O;
import OooO0oO.o00O00OO;
import OooO0oO.o00OO;
import OooO0oO.oo0oOO0;
import OooOooo.o00O00;
import OooOooo.o00O0O0;
import OooOooo.o00O0O0O;
import OooOooo.o0O00OOO;
import OooOooo.o0O00o00;
import OooOooo.o0O0OO0;
import OooOooo.o0O0OOOo;
import OooOooo.o0O0ooO;
import OooOooo.o0o0Oo;
import OooOooo.o0oO0Ooo;
import OooOooo.oOO00O;
import Oooo0oO.o0O0000O;
import OoooooO.oO00Oo0;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsetsController;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.o00O0000;
import androidx.appcompat.widget.o0O0oo00;
import androidx.appcompat.widget.o0oOO;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class o0000OO0 implements o0oOO, oo0oOO0, o00O000o, o00O0000, o0O0ooO, OooOooo.o000Oo0, OoooO.o00O0O, Oooo000.o000OOo, oO00Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f182OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f183OooO0O0;

    public o0000OO0(int i) {
        this.f182OooO00o = i;
        if (i == 9) {
            this.f183OooO0O0 = new ConcurrentHashMap();
        } else if (i == 20) {
            this.f183OooO0O0 = new HashMap();
        } else if (i == 13) {
            int i2 = Build.VERSION.SDK_INT;
            this.f183OooO0O0 = i2 >= 30 ? new o0O00o00() : i2 >= 29 ? new o0oO0Ooo() : new o0O00OOO();
        } else if (i != 14) {
            this.f183OooO0O0 = new ArrayDeque();
        } else {
            this.f183OooO0O0 = Build.VERSION.SDK_INT >= 26 ? new Oooo000.o00Oo0(this) : new Oooo000.o00O0O(this);
        }
    }

    public static Object OooOo0O(Object[] objArr, int i, o0000oOO.o00000OO o00000oo2) {
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        int i5 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int i6 = o00000oo2.f4672OooO00o;
            switch (i6) {
                case 0:
                    i3 = ((OooOoo0.o0000) obj2).f1240OooO0OO;
                    break;
                default:
                    i3 = ((OooOo0o.o0O0O00) obj2).f1191OooO0O0;
                    break;
            }
            int abs = Math.abs(i3 - i2) * 2;
            switch (i6) {
                case 0:
                    z2 = ((OooOoo0.o0000) obj2).f1241OooO0Oo;
                    break;
                default:
                    z2 = ((OooOo0o.o0O0O00) obj2).f1192OooO0OO;
                    break;
            }
            if (z2 == z) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            int i7 = abs + i4;
            if (obj == null || i5 > i7) {
                obj = obj2;
                i5 = i7;
            }
        }
        return obj;
    }

    @Override // OooOooo.o000Oo0
    public final int OooO() {
        return OooOooo.o0000OO0.OooO0O0((ContentInfo) this.f183OooO0O0);
    }

    @Override // OooO0oO.oo0oOO0
    public final void OooO00o(o00O00O o00o00o, boolean z) {
        if (o00o00o instanceof o00OO) {
            o00o00o.OooOO0O().OooO0OO(false);
        }
        oo0oOO0 oo0ooo0 = ((androidx.appcompat.widget.Oooo000) this.f183OooO0O0).f2136OooO0o0;
        if (oo0ooo0 != null) {
            oo0ooo0.OooO00o(o00o00o, z);
        }
    }

    @Override // androidx.appcompat.widget.o00O0000
    public void OooO0O0(int i) {
    }

    @Override // OooOooo.o000Oo0
    public final int OooO0OO() {
        return OooOooo.o0000OO0.OooOO0o((ContentInfo) this.f183OooO0O0);
    }

    @Override // OooOooo.o000Oo0
    public final ClipData OooO0Oo() {
        return OooOooo.o0000OO0.OooO0Oo((ContentInfo) this.f183OooO0O0);
    }

    @Override // Oooo000.o000OOo
    public final boolean OooO0o(View view) {
        boolean z;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f183OooO0O0;
        boolean z2 = false;
        if (!swipeDismissBehavior.OooOOo(view)) {
            return false;
        }
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        if (o00O0O0O.OooO0Oo(view) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = swipeDismissBehavior.f3249OooO0Oo;
        if ((i == 0 && z) || (i == 1 && !z)) {
            z2 = true;
        }
        int width = view.getWidth();
        if (z2) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        swipeDismissBehavior.getClass();
        return true;
    }

    @Override // OooO0oO.o00O000o
    public final boolean OooO0o0(o00O00O o00o00o, MenuItem menuItem) {
        androidx.appcompat.widget.o0OoOo0 o0oooo0 = ((ActionMenuView) this.f183OooO0O0).f2081OooOoOO;
        if (o0oooo0 != null) {
            Iterator it = ((CopyOnWriteArrayList) ((o0O0oo00) o0oooo0).f2479OooO00o.f2229Oooo00O.f1983OooO0OO).iterator();
            if (it.hasNext()) {
                OooO00o.OooO0oO(it.next());
                throw null;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.o0oOO
    public final void OooO0oO(o00O00O o00o00o, MenuItem menuItem) {
        ((OooO0oO.o00O0000) this.f183OooO0O0).f369OooO0oO.removeCallbacksAndMessages(o00o00o);
    }

    @Override // OooOooo.o0O0ooO
    public final o0O0OOOo OooO0oo(View view, o0O0OOOo o0o0oooo) {
        boolean z;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f183OooO0O0;
        if (!OooOooO.o0000oo.OooO00o(coordinatorLayout.f2616OooOOO, o0o0oooo)) {
            coordinatorLayout.f2616OooOOO = o0o0oooo;
            boolean z2 = true;
            if (o0o0oooo.OooO0o0() > 0) {
                z = true;
            } else {
                z = false;
            }
            coordinatorLayout.f2617OooOOOO = z;
            coordinatorLayout.setWillNotDraw((z || coordinatorLayout.getBackground() != null) ? false : false);
            o0O0OO0 o0o0oo0 = o0o0oooo.f1355OooO00o;
            if (!o0o0oo0.OooOOO0()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                    if (o00O0O0.OooO0O0(childAt) && ((OooOOoo.o00oO0o) childAt.getLayoutParams()).f1087OooO00o != null && o0o0oo0.OooOOO0()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return o0o0oooo;
    }

    @Override // OooO0oO.o00O000o
    public final void OooOO0(o00O00O o00o00o) {
        o00O000o o00o000o = ((ActionMenuView) this.f183OooO0O0).f2077OooOo0O;
        if (o00o000o != null) {
            o00o000o.OooOO0(o00o00o);
        }
    }

    @Override // androidx.appcompat.widget.o0oOO
    public final void OooOO0O(o00O00O o00o00o, o00O00OO o00o00oo) {
        OooO0oO.o00O0000 o00o0000 = (OooO0oO.o00O0000) this.f183OooO0O0;
        o00o0000.f369OooO0oO.removeCallbacksAndMessages(null);
        int size = o00o0000.f363OooO.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (o00o00o == ((o00) o00o0000.f363OooO.get(i)).f326OooO0O0) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        o00o0000.f369OooO0oO.postAtTime(new o000OOo0(this, i2 < o00o0000.f363OooO.size() ? (o00) o00o0000.f363OooO.get(i2) : null, o00o00oo, o00o00o, 0), o00o00o, SystemClock.uptimeMillis() + 200);
    }

    @Override // OoooO.o00O0O
    public final void OooOO0o() {
    }

    @Override // OoooO.o00O0O
    public final void OooOOO(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
            Throwable th = (Throwable) obj;
        }
        ((ProfileInstallReceiver) this.f183OooO0O0).setResultCode(i);
    }

    @Override // OooOooo.o000Oo0
    public final ContentInfo OooOOO0() {
        return (ContentInfo) this.f183OooO0O0;
    }

    @Override // OooO0oO.oo0oOO0
    public final boolean OooOOOO(o00O00O o00o00o) {
        Object obj = this.f183OooO0O0;
        if (o00o00o == ((androidx.appcompat.widget.Oooo000) obj).f2133OooO0OO) {
            return false;
        }
        ((o00OO) o00o00o).f462OooOoOO.getClass();
        ((androidx.appcompat.widget.Oooo000) obj).getClass();
        oo0oOO0 oo0ooo0 = ((androidx.appcompat.widget.Oooo000) obj).f2136OooO0o0;
        if (oo0ooo0 == null) {
            return false;
        }
        return oo0ooo0.OooOOOO(o00o00o);
    }

    @Override // androidx.appcompat.widget.o00O0000
    public void OooOOOo(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface OooOOo(android.content.Context r10, OooOo0o.oo0o0Oo r11, android.content.res.Resources r12, int r13) {
        /*
            r9 = this;
            o0000oOO.o00000OO r0 = new o0000oOO.o00000OO
            r1 = 1
            r0.<init>(r1)
            OooOo0o.o0O0O00[] r2 = r11.f1200OooO00o
            java.lang.Object r0 = OooOo0O(r2, r13, r0)
            OooOo0o.o0O0O00 r0 = (OooOo0o.o0O0O00) r0
            if (r0 != 0) goto L12
            r10 = 0
            return r10
        L12:
            int r8 = r0.f1194OooO0o
            java.lang.String r0 = r0.f1190OooO00o
            OooO0Oo.o0000OO0 r2 = OooOo.OooOO0O.f1116OooO00o
            r3 = r10
            r4 = r12
            r5 = r8
            r6 = r0
            r7 = r13
            android.graphics.Typeface r10 = r2.OooOo0(r3, r4, r5, r6, r7)
            if (r10 == 0) goto L2d
            r2 = 0
            java.lang.String r12 = OooOo.OooOO0O.OooO0O0(r12, r8, r0, r2, r13)
            OooOO0.OooO r13 = OooOo.OooOO0O.f1117OooO0O0
            r13.OooO0O0(r12, r10)
        L2d:
            r12 = 0
            if (r10 != 0) goto L32
            goto L48
        L32:
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r2 = "native_instance"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L48
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L48
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L48
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L48
            goto L49
        L48:
            r0 = r12
        L49:
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 == 0) goto L58
            java.lang.Object r12 = r9.f183OooO0O0
            java.util.concurrent.ConcurrentHashMap r12 = (java.util.concurrent.ConcurrentHashMap) r12
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            r12.put(r13, r11)
        L58:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.o0000OO0.OooOOo(android.content.Context, OooOo0o.oo0o0Oo, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public Oooo000.o000oOoO OooOOo0(int i) {
        return null;
    }

    public Typeface OooOOoo(Context context, OooOoo0.o0000[] o0000VarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (o0000VarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(OooOo0o(i, o0000VarArr).f1238OooO00o);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface OooOo002 = OooOo00(context, inputStream);
            o0000O00.OooO00o.Oooo0(inputStream);
            return OooOo002;
        } catch (IOException unused2) {
            o0000O00.OooO00o.Oooo0(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            o0000O00.OooO00o.Oooo0(inputStream2);
            throw th;
        }
    }

    public Oooo000.o000oOoO OooOo(int i) {
        return null;
    }

    public Typeface OooOo0(Context context, Resources resources, int i, String str, int i2) {
        File o00000OO2 = o0000O00.OooO00o.o00000OO(context);
        if (o00000OO2 == null) {
            return null;
        }
        try {
            if (o0000O00.OooO00o.OoooO0O(o00000OO2, resources, i)) {
                return Typeface.createFromFile(o00000OO2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            o00000OO2.delete();
        }
    }

    public Typeface OooOo00(Context context, InputStream inputStream) {
        File o00000OO2 = o0000O00.OooO00o.o00000OO(context);
        if (o00000OO2 == null) {
            return null;
        }
        try {
            if (o0000O00.OooO00o.OoooO(o00000OO2, inputStream)) {
                return Typeface.createFromFile(o00000OO2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            o00000OO2.delete();
        }
    }

    public OooOoo0.o0000 OooOo0o(int i, OooOoo0.o0000[] o0000VarArr) {
        return (OooOoo0.o0000) OooOo0O(o0000VarArr, i, new o0000oOO.o00000OO(0));
    }

    public final long OooOoO() {
        return ((ByteBuffer) this.f183OooO0O0).getInt() & 4294967295L;
    }

    public boolean OooOoO0(int i, int i2, Bundle bundle) {
        return false;
    }

    public final void OooOoOO(int i) {
        Object obj = this.f183OooO0O0;
        ((ByteBuffer) obj).position(((ByteBuffer) obj).position() + i);
    }

    public final String toString() {
        switch (this.f182OooO00o) {
            case 11:
                return "ContentInfoCompat{" + ((ContentInfo) this.f183OooO0O0) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o0000OO0(int i, Object obj) {
        this.f182OooO00o = i;
        this.f183OooO0O0 = obj;
    }

    public o0000OO0(OooO0O0.OooO0O0 oooO0O0) {
        this.f182OooO00o = 8;
        this.f183OooO0O0 = oooO0O0;
    }

    public o0000OO0(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f182OooO00o = 15;
        this.f183OooO0O0 = Build.VERSION.SDK_INT >= 25 ? new Oooo00o.OooOOO(uri, clipDescription, uri2) : new androidx.activity.result.OooO0o(uri, clipDescription, uri2);
    }

    public o0000OO0(ContentInfo contentInfo) {
        this.f182OooO00o = 11;
        contentInfo.getClass();
        this.f183OooO0O0 = OooOooo.o0000OO0.OooO0oO(contentInfo);
    }

    public o0000OO0(View view, int i) {
        this.f182OooO00o = i;
        if (i != 23) {
            this.f183OooO0O0 = Build.VERSION.SDK_INT >= 30 ? new oOO00O(view) : new o00O00(view);
        } else {
            this.f183OooO0O0 = view.getOverlay();
        }
    }

    public o0000OO0(WindowInsetsController windowInsetsController) {
        this.f182OooO00o = 12;
        this.f183OooO0O0 = new oOO00O(windowInsetsController);
    }

    public o0000OO0(TextView textView) {
        this.f182OooO00o = 19;
        if (textView == null) {
            throw new NullPointerException("textView cannot be null");
        }
        this.f183OooO0O0 = new o0O0000O(textView);
    }

    public o0000OO0(SwipeDismissBehavior swipeDismissBehavior) {
        this.f182OooO00o = 29;
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.f3250OooO0o = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.f3252OooO0oO = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.f3249OooO0Oo = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0000OO0(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(25, materialButtonToggleGroup);
        this.f182OooO00o = 25;
    }

    public o0000OO0(ByteBuffer byteBuffer) {
        this.f182OooO00o = 18;
        this.f183OooO0O0 = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}