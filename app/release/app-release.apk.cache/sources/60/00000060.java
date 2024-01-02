package OooO0oO;

import OooOo0.Oooo000;
import OooOo0O.o00Ooo;
import OooOoO.Oooo0;
import OooOooo.o00OOOOo;
import OooOooo.o00Oo00;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class o00O00O implements Oooo0 {

    /* renamed from: OooOoO0  reason: collision with root package name */
    public static final int[] f388OooOoO0 = {1, 4, 5, 3, 2, 0};

    /* renamed from: OooO  reason: collision with root package name */
    public final ArrayList f389OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Context f390OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Resources f391OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f392OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f393OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final ArrayList f394OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public o00O000o f395OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final ArrayList f396OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f397OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final ArrayList f398OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean f399OooOO0O;

    /* renamed from: OooOOO  reason: collision with root package name */
    public Drawable f401OooOOO;
    public CharSequence OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public View f402OooOOOO;

    /* renamed from: OooOo  reason: collision with root package name */
    public boolean f407OooOo;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public o00O00OO f410OooOo0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f400OooOO0o = 0;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public boolean f403OooOOOo = false;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public boolean f405OooOOo0 = false;

    /* renamed from: OooOOo  reason: collision with root package name */
    public boolean f404OooOOo = false;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public boolean f406OooOOoo = false;

    /* renamed from: OooOo00  reason: collision with root package name */
    public final ArrayList f409OooOo00 = new ArrayList();

    /* renamed from: OooOo0  reason: collision with root package name */
    public final CopyOnWriteArrayList f408OooOo0 = new CopyOnWriteArrayList();

    /* renamed from: OooOo0o  reason: collision with root package name */
    public boolean f411OooOo0o = false;

    public o00O00O(Context context) {
        boolean z;
        boolean z2 = false;
        this.f390OooO00o = context;
        Resources resources = context.getResources();
        this.f391OooO0O0 = resources;
        this.f394OooO0o = new ArrayList();
        this.f396OooO0oO = new ArrayList();
        this.f397OooO0oo = true;
        this.f389OooO = new ArrayList();
        this.f398OooOO0 = new ArrayList();
        this.f399OooOO0O = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = o00Oo00.f1306OooO00o;
            if (Build.VERSION.SDK_INT >= 28) {
                z = o00OOOOo.OooO0O0(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        this.f393OooO0Oo = z2;
    }

    public final void OooO() {
        ArrayList OooOO0o2 = OooOO0o();
        if (this.f399OooOO0O) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f408OooOo0;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                o00O o00o = (o00O) weakReference.get();
                if (o00o == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= o00o.OooO0oO();
                }
            }
            ArrayList arrayList = this.f389OooO;
            ArrayList arrayList2 = this.f398OooOO0;
            arrayList.clear();
            arrayList2.clear();
            if (z) {
                int size = OooOO0o2.size();
                for (int i = 0; i < size; i++) {
                    o00O00OO o00o00oo = (o00O00OO) OooOO0o2.get(i);
                    if (o00o00oo.OooO0o()) {
                        arrayList.add(o00o00oo);
                    } else {
                        arrayList2.add(o00o00oo);
                    }
                }
            } else {
                arrayList2.addAll(OooOO0o());
            }
            this.f399OooOO0O = false;
        }
    }

    public final o00O00OO OooO00o(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0 && i5 < 6) {
            int i6 = (f388OooOoO0[i5] << 16) | (65535 & i3);
            o00O00OO o00o00oo = new o00O00OO(this, i, i2, i3, i6, charSequence, this.f400OooOO0o);
            ArrayList arrayList = this.f394OooO0o;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((o00O00OO) arrayList.get(size)).f416OooO0Oo <= i6) {
                        i4 = size + 1;
                        break;
                    }
                } else {
                    i4 = 0;
                    break;
                }
            }
            arrayList.add(i4, o00o00oo);
            OooOOOo(true);
            return o00o00oo;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final void OooO0O0(o00O o00o, Context context) {
        this.f408OooOo0.add(new WeakReference(o00o));
        o00o.OooOO0O(context, this);
        this.f399OooOO0O = true;
    }

    public final void OooO0OO(boolean z) {
        if (this.f406OooOOoo) {
            return;
        }
        this.f406OooOOoo = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f408OooOo0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            o00O o00o = (o00O) weakReference.get();
            if (o00o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                o00o.OooO00o(this, z);
            }
        }
        this.f406OooOOoo = false;
    }

    public boolean OooO0Oo(o00O00OO o00o00oo) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f408OooOo0;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f410OooOo0O == o00o00oo) {
            OooOo0o();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                o00O o00o = (o00O) weakReference.get();
                if (o00o == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = o00o.OooO0Oo(o00o00oo);
                    if (z) {
                        break;
                    }
                }
            }
            OooOo0O();
            if (z) {
                this.f410OooOo0O = null;
            }
        }
        return z;
    }

    public boolean OooO0o(o00O00OO o00o00oo) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f408OooOo0;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        OooOo0o();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            o00O o00o = (o00O) weakReference.get();
            if (o00o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = o00o.OooO0oo(o00o00oo);
                if (z) {
                    break;
                }
            }
        }
        OooOo0O();
        if (z) {
            this.f410OooOo0O = o00o00oo;
        }
        return z;
    }

    public boolean OooO0o0(o00O00O o00o00o, MenuItem menuItem) {
        o00O000o o00o000o = this.f395OooO0o0;
        return o00o000o != null && o00o000o.OooO0o0(o00o00o, menuItem);
    }

    public final o00O00OO OooO0oO(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.f409OooOo00;
        arrayList.clear();
        OooO0oo(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (o00O00OO) arrayList.get(0);
        }
        boolean OooOOO2 = OooOOO();
        for (int i2 = 0; i2 < size; i2++) {
            o00O00OO o00o00oo = (o00O00OO) arrayList.get(i2);
            if (OooOOO2) {
                c = o00o00oo.f421OooOO0;
            } else {
                c = o00o00oo.f420OooO0oo;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (OooOOO2 && c == '\b' && i == 67))) {
                return o00o00oo;
            }
        }
        return null;
    }

    public final void OooO0oo(ArrayList arrayList, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean z;
        boolean OooOOO2 = OooOOO();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i != 67) {
            return;
        }
        ArrayList arrayList2 = this.f394OooO0o;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            o00O00OO o00o00oo = (o00O00OO) arrayList2.get(i3);
            if (o00o00oo.hasSubMenu()) {
                o00o00oo.f425OooOOOO.OooO0oo(arrayList, i, keyEvent);
            }
            if (OooOOO2) {
                c = o00o00oo.f421OooOO0;
            } else {
                c = o00o00oo.f420OooO0oo;
            }
            if (OooOOO2) {
                i2 = o00o00oo.f422OooOO0O;
            } else {
                i2 = o00o00oo.f412OooO;
            }
            if ((modifiers & 69647) == (i2 & 69647)) {
                z = true;
            } else {
                z = false;
            }
            if (z && c != 0) {
                char[] cArr = keyData.meta;
                if (c != cArr[0] && c != cArr[2]) {
                    if (OooOOO2 && c == '\b') {
                        if (i != 67) {
                        }
                    }
                }
                if (o00o00oo.isEnabled()) {
                    arrayList.add(o00o00oo);
                }
            }
        }
    }

    public String OooOO0() {
        return "android:menu:actionviewstates";
    }

    public o00O00O OooOO0O() {
        return this;
    }

    public final ArrayList OooOO0o() {
        boolean z = this.f397OooO0oo;
        ArrayList arrayList = this.f396OooO0oO;
        if (z) {
            arrayList.clear();
            ArrayList arrayList2 = this.f394OooO0o;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                o00O00OO o00o00oo = (o00O00OO) arrayList2.get(i);
                if (o00o00oo.isVisible()) {
                    arrayList.add(o00o00oo);
                }
            }
            this.f397OooO0oo = false;
            this.f399OooOO0O = true;
            return arrayList;
        }
        return arrayList;
    }

    public boolean OooOOO() {
        return this.f392OooO0OO;
    }

    public boolean OooOOO0() {
        return this.f411OooOo0o;
    }

    public boolean OooOOOO() {
        return this.f393OooO0Oo;
    }

    public final void OooOOOo(boolean z) {
        if (!this.f403OooOOOo) {
            if (z) {
                this.f397OooO0oo = true;
                this.f399OooOO0O = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f408OooOo0;
            if (!copyOnWriteArrayList.isEmpty()) {
                OooOo0o();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    o00O o00o = (o00O) weakReference.get();
                    if (o00o == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        o00o.OooO0OO();
                    }
                }
                OooOo0O();
                return;
            }
            return;
        }
        this.f405OooOOo0 = true;
        if (z) {
            this.f404OooOOo = true;
        }
    }

    public final void OooOOo(o00O o00o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f408OooOo0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            o00O o00o2 = (o00O) weakReference.get();
            if (o00o2 == null || o00o2 == o00o) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0064, code lost:
        if ((r9 & 1) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c3, code lost:
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c5, code lost:
        OooO0OO(true);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOOo0(android.view.MenuItem r7, OooO0oO.o00O r8, int r9) {
        /*
            r6 = this;
            OooO0oO.o00O00OO r7 = (OooO0oO.o00O00OO) r7
            r0 = 0
            if (r7 == 0) goto Lc9
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lc9
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f426OooOOOo
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L38
        L19:
            OooO0oO.o00O00O r1 = r7.f424OooOOO
            boolean r3 = r1.OooO0o0(r1, r7)
            if (r3 == 0) goto L22
            goto L38
        L22:
            android.content.Intent r3 = r7.f419OooO0oO
            if (r3 == 0) goto L2c
            android.content.Context r1 = r1.f390OooO00o     // Catch: android.content.ActivityNotFoundException -> L2c
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2c
            goto L38
        L2c:
            OooO0oO.o00O00o0 r1 = r7.f437OooOoOO
            if (r1 == 0) goto L3a
            android.view.ActionProvider r1 = r1.f440OooO00o
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L3a
        L38:
            r1 = r2
            goto L3b
        L3a:
            r1 = r0
        L3b:
            OooO0oO.o00O00o0 r3 = r7.f437OooOoOO
            if (r3 == 0) goto L49
            android.view.ActionProvider r4 = r3.f440OooO00o
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L49
            r4 = r2
            goto L4a
        L49:
            r4 = r0
        L4a:
            boolean r5 = r7.OooO0o0()
            if (r5 == 0) goto L59
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lc8
            goto Lc5
        L59:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L67
            if (r4 == 0) goto L62
            goto L67
        L62:
            r7 = r9 & 1
            if (r7 != 0) goto Lc8
            goto Lc5
        L67:
            r9 = r9 & 4
            if (r9 != 0) goto L6e
            r6.OooO0OO(r0)
        L6e:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L82
            OooO0oO.o00OO r9 = new OooO0oO.o00OO
            android.content.Context r5 = r6.f390OooO00o
            r9.<init>(r5, r6, r7)
            r7.f425OooOOOO = r9
            java.lang.CharSequence r5 = r7.f418OooO0o0
            r9.setHeaderTitle(r5)
        L82:
            OooO0oO.o00OO r7 = r7.f425OooOOOO
            if (r4 == 0) goto L90
            OooO0oO.o00O0O0O r9 = r3.f441OooO0O0
            r9.getClass()
            android.view.ActionProvider r9 = r3.f440OooO00o
            r9.onPrepareSubMenu(r7)
        L90:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f408OooOo0
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L99
            goto Lc2
        L99:
            if (r8 == 0) goto L9f
            boolean r0 = r8.OooO0o(r7)
        L9f:
            java.util.Iterator r8 = r9.iterator()
        La3:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lc2
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            OooO0oO.o00O r4 = (OooO0oO.o00O) r4
            if (r4 != 0) goto Lbb
            r9.remove(r3)
            goto La3
        Lbb:
            if (r0 != 0) goto La3
            boolean r0 = r4.OooO0o(r7)
            goto La3
        Lc2:
            r1 = r1 | r0
            if (r1 != 0) goto Lc8
        Lc5:
            r6.OooO0OO(r2)
        Lc8:
            return r1
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0oO.o00O00O.OooOOo0(android.view.MenuItem, OooO0oO.o00O, int):boolean");
    }

    public final void OooOOoo(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(OooOO0());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((o00OO) item.getSubMenu()).OooOOoo(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public final void OooOo0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f402OooOOOO = view;
            this.OooOOO0 = null;
            this.f401OooOOO = null;
        } else {
            if (i > 0) {
                this.OooOOO0 = this.f391OooO0O0.getText(i);
            } else if (charSequence != null) {
                this.OooOOO0 = charSequence;
            }
            if (i2 > 0) {
                Object obj = Oooo000.f1139OooO00o;
                this.f401OooOOO = o00Ooo.OooO0O0(this.f390OooO00o, i2);
            } else if (drawable != null) {
                this.f401OooOOO = drawable;
            }
            this.f402OooOOOO = null;
        }
        OooOOOo(false);
    }

    public final void OooOo00(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((o00OO) item.getSubMenu()).OooOo00(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(OooOO0(), sparseArray);
        }
    }

    public final void OooOo0O() {
        this.f403OooOOOo = false;
        if (this.f405OooOOo0) {
            this.f405OooOOo0 = false;
            OooOOOo(this.f404OooOOo);
        }
    }

    public final void OooOo0o() {
        if (this.f403OooOOOo) {
            return;
        }
        this.f403OooOOOo = true;
        this.f405OooOOo0 = false;
        this.f404OooOOo = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return OooO00o(0, 0, 0, this.f391OooO0O0.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f390OooO00o.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            o00O00OO OooO00o2 = OooO00o(i, i2, i3, resolveInfo.loadLabel(packageManager));
            OooO00o2.setIcon(resolveInfo.loadIcon(packageManager));
            OooO00o2.f419OooO0oO = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = OooO00o2;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f391OooO0O0.getString(i));
    }

    @Override // android.view.Menu
    public final void clear() {
        o00O00OO o00o00oo = this.f410OooOo0O;
        if (o00o00oo != null) {
            OooO0Oo(o00o00oo);
        }
        this.f394OooO0o.clear();
        OooOOOo(true);
    }

    public final void clearHeader() {
        this.f401OooOOO = null;
        this.OooOOO0 = null;
        this.f402OooOOOO = null;
        OooOOOo(false);
    }

    @Override // android.view.Menu
    public final void close() {
        OooO0OO(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            o00O00OO o00o00oo = (o00O00OO) this.f394OooO0o.get(i2);
            if (o00o00oo.f413OooO00o == i) {
                return o00o00oo;
            }
            if (o00o00oo.hasSubMenu() && (findItem = o00o00oo.f425OooOOOO.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f394OooO0o.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f407OooOo) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((o00O00OO) this.f394OooO0o.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return OooO0oO(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return OooOOo0(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        o00O00OO OooO0oO2 = OooO0oO(i, keyEvent);
        if (OooO0oO2 != null) {
            z = OooOOo0(OooO0oO2, null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            OooO0OO(true);
        }
        return z;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList;
        int size = size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            arrayList = this.f394OooO0o;
            if (i3 < size) {
                if (((o00O00OO) arrayList.get(i3)).f414OooO0O0 == i) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((o00O00OO) arrayList.get(i3)).f414OooO0O0 != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            OooOOOo(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList;
        int size = size();
        int i2 = 0;
        while (true) {
            arrayList = this.f394OooO0o;
            if (i2 < size) {
                if (((o00O00OO) arrayList.get(i2)).f413OooO00o == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0 && i2 < arrayList.size()) {
            arrayList.remove(i2);
            OooOOOo(true);
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int i2;
        ArrayList arrayList = this.f394OooO0o;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            o00O00OO o00o00oo = (o00O00OO) arrayList.get(i3);
            if (o00o00oo.f414OooO0O0 == i) {
                int i4 = o00o00oo.f430OooOo & (-5);
                if (z2) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                o00o00oo.f430OooOo = i4 | i2;
                o00o00oo.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f411OooOo0o = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f394OooO0o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o00O00OO o00o00oo = (o00O00OO) arrayList.get(i2);
            if (o00o00oo.f414OooO0O0 == i) {
                o00o00oo.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int i2;
        boolean z2;
        ArrayList arrayList = this.f394OooO0o;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            o00O00OO o00o00oo = (o00O00OO) arrayList.get(i3);
            if (o00o00oo.f414OooO0O0 == i) {
                int i4 = o00o00oo.f430OooOo;
                int i5 = i4 & (-9);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                int i6 = i5 | i2;
                o00o00oo.f430OooOo = i6;
                if (i4 != i6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            OooOOOo(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f392OooO0OO = z;
        OooOOOo(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f394OooO0o.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return OooO00o(i, i2, i3, this.f391OooO0O0.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f391OooO0O0.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return OooO00o(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        o00O00OO OooO00o2 = OooO00o(i, i2, i3, charSequence);
        o00OO o00oo = new o00OO(this.f390OooO00o, this, OooO00o2);
        OooO00o2.f425OooOOOO = o00oo;
        o00oo.setHeaderTitle(OooO00o2.f418OooO0o0);
        return o00oo;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return OooO00o(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}