package OooO0o;

import OooO0oO.o00O00O;
import OooO0oO.o00O0O0O;
import OooO0oO.o00OO0O0;
import OooOoOO.o000OOo;
import Oooo0o.o00Oo0;
import Oooo0o.o00Ooo;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.o0OOO0o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class OooOOO0 implements OooO0O0, o000OOo {

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static OooOOO0 f268OooO0o0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f269OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f270OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Object f271OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Object f272OooO0Oo;

    public OooOOO0(int i) {
        if (i == 2) {
            this.f269OooO00o = new OooOO0o.Oooo000(10, 1);
            this.f272OooO0Oo = new OooOO0.OooOOOO();
            this.f271OooO0OO = new ArrayList();
            this.f270OooO0O0 = new HashSet();
        } else if (i == 5) {
            this.f269OooO00o = new OooOO0.OooO0O0();
            this.f270OooO0O0 = new SparseArray();
            this.f271OooO0OO = new OooOO0.OooO0o();
            this.f272OooO0Oo = new OooOO0.OooO0O0();
        } else if (i == 6) {
            this.f269OooO00o = new Object();
            this.f270OooO0O0 = new Handler(Looper.getMainLooper(), new o0ooOoO.OooOOO(this));
        } else {
            this.f269OooO00o = new OooOO0o.Oooo000(256, 0);
            this.f270OooO0O0 = new OooOO0o.Oooo000(256, 0);
            this.f271OooO0OO = new OooOO0o.Oooo000(256, 0);
            this.f272OooO0Oo = new OooOO0o.o00O0O[32];
        }
    }

    @Override // OooO0o.OooO0O0
    public final boolean OooO00o(OooO0OO oooO0OO, o00O00O o00o00o) {
        return ((ActionMode.Callback) this.f269OooO00o).onPrepareActionMode(OooO0oO(oooO0OO), OooO0oo(o00o00o));
    }

    @Override // OooO0o.OooO0O0
    public final boolean OooO0O0(OooO0OO oooO0OO, o00O00O o00o00o) {
        return ((ActionMode.Callback) this.f269OooO00o).onCreateActionMode(OooO0oO(oooO0OO), OooO0oo(o00o00o));
    }

    @Override // OooOoOO.o000OOo
    public final void OooO0OO() {
        Object obj = this.f269OooO00o;
        ((View) obj).clearAnimation();
        ((ViewGroup) this.f270OooO0O0).endViewTransition((View) obj);
        ((androidx.fragment.app.OooOO0O) this.f271OooO0OO).OooO0O0();
    }

    @Override // OooO0o.OooO0O0
    public final void OooO0Oo(OooO0OO oooO0OO) {
        ((ActionMode.Callback) this.f269OooO00o).onDestroyActionMode(OooO0oO(oooO0OO));
    }

    public final void OooO0o(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((OooOO0.OooOOOO) this.f272OooO0Oo).getOrDefault(obj, null);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    OooO0o(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    @Override // OooO0o.OooO0O0
    public final boolean OooO0o0(OooO0OO oooO0OO, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f269OooO00o).onActionItemClicked(OooO0oO(oooO0OO), new o00O0O0O((Context) this.f270OooO0O0, (OooOoO.o000oOoO) menuItem));
    }

    public final OooOOO OooO0oO(OooO0OO oooO0OO) {
        ArrayList arrayList = (ArrayList) this.f271OooO0OO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OooOOO oooOOO = (OooOOO) arrayList.get(i);
            if (oooOOO != null && oooOOO.f267OooO0O0 == oooO0OO) {
                return oooOOO;
            }
        }
        OooOOO oooOOO2 = new OooOOO((Context) this.f270OooO0O0, oooO0OO);
        arrayList.add(oooOOO2);
        return oooOOO2;
    }

    public final Menu OooO0oo(o00O00O o00o00o) {
        Menu menu = (Menu) ((OooOO0.OooOOOO) this.f272OooO0Oo).getOrDefault(o00o00o, null);
        if (menu == null) {
            o00OO0O0 o00oo0o0 = new o00OO0O0((Context) this.f270OooO0O0, o00o00o);
            ((OooOO0.OooOOOO) this.f272OooO0Oo).put(o00o00o, o00oo0o0);
            return o00oo0o0;
        }
        return menu;
    }

    public OooOOO0(Context context, ActionMode.Callback callback) {
        this.f270OooO0O0 = context;
        this.f269OooO00o = callback;
        this.f271OooO0OO = new ArrayList();
        this.f272OooO0Oo = new OooOO0.OooOOOO();
    }

    public OooOOO0(Typeface typeface, o00Ooo o00ooo2) {
        int i;
        int i2;
        this.f272OooO0Oo = typeface;
        this.f269OooO00o = o00ooo2;
        this.f271OooO0OO = new o0OOO0o(1024);
        int OooO00o2 = o00ooo2.OooO00o(6);
        if (OooO00o2 != 0) {
            int i3 = OooO00o2 + o00ooo2.f1457OooO00o;
            i = ((ByteBuffer) o00ooo2.f1460OooO0Oo).getInt(((ByteBuffer) o00ooo2.f1460OooO0Oo).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f270OooO0O0 = new char[i * 2];
        int OooO00o3 = o00ooo2.OooO00o(6);
        if (OooO00o3 != 0) {
            int i4 = OooO00o3 + o00ooo2.f1457OooO00o;
            i2 = ((ByteBuffer) o00ooo2.f1460OooO0Oo).getInt(((ByteBuffer) o00ooo2.f1460OooO0Oo).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            androidx.emoji2.text.o00O0O o00o0o = new androidx.emoji2.text.o00O0O(this, i5);
            o00Oo0 OooO0OO2 = o00o0o.OooO0OO();
            int OooO00o4 = OooO0OO2.OooO00o(4);
            Character.toChars(OooO00o4 != 0 ? ((ByteBuffer) OooO0OO2.f1460OooO0Oo).getInt(OooO00o4 + OooO0OO2.f1457OooO00o) : 0, (char[]) this.f270OooO0O0, i5 * 2);
            o0000O00.OooO00o.OooOo00("invalid metadata codepoint length", o00o0o.OooO0O0() > 0);
            ((o0OOO0o) this.f271OooO0OO).OooO00o(o00o0o, 0, o00o0o.OooO0O0() - 1);
        }
    }

    public OooOOO0(View view, ViewGroup viewGroup, androidx.fragment.app.OooOO0O oooOO0O, androidx.fragment.app.OooOOO oooOOO) {
        this.f272OooO0Oo = oooOOO;
        this.f269OooO00o = view;
        this.f270OooO0O0 = viewGroup;
        this.f271OooO0OO = oooOO0O;
    }
}