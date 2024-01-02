package OooO0oO;

import OooO0Oo.o0000OO0;
import OooOooo.o0o0Oo;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.o0O00o0;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o00O0000 extends o00O0OO0 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Context f364OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f365OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f366OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final boolean f367OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f368OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final Handler f369OooO0oO;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public View f375OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public View f376OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public boolean f377OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public int f378OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public boolean f379OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public oo0oOO0 f380OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public int f381OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public int f382OooOo00;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public boolean f384OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public PopupWindow.OnDismissListener f385OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public ViewTreeObserver f386OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public boolean f387OooOoOO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final ArrayList f370OooO0oo = new ArrayList();

    /* renamed from: OooO  reason: collision with root package name */
    public final ArrayList f363OooO = new ArrayList();

    /* renamed from: OooOO0  reason: collision with root package name */
    public final o000O f371OooOO0 = new o000O(0, this);

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final o000OO00 f372OooOO0O = new o000OO00(0, this);

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final o0000OO0 f373OooOO0o = new o0000OO0(2, this);
    public int OooOOO0 = 0;

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f374OooOOO = 0;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public boolean f383OooOo0O = false;

    public o00O0000(Context context, View view, int i, int i2, boolean z) {
        this.f364OooO0O0 = context;
        this.f375OooOOOO = view;
        this.f366OooO0Oo = i;
        this.f368OooO0o0 = i2;
        this.f367OooO0o = z;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        this.f378OooOOo0 = OooOooo.o00O0O0O.OooO0Oo(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f365OooO0OO = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f369OooO0oO = new Handler();
    }

    @Override // OooO0oO.o00OO0OO
    public final void OooO() {
        if (OooO0O0()) {
            return;
        }
        ArrayList arrayList = this.f370OooO0oo;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OooOo0O((o00O00O) it.next());
        }
        arrayList.clear();
        View view = this.f375OooOOOO;
        this.f376OooOOOo = view;
        if (view != null) {
            boolean z = this.f386OooOoO0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f386OooOoO0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f371OooOO0);
            }
            this.f376OooOOOo.addOnAttachStateChangeListener(this.f372OooOO0O);
        }
    }

    @Override // OooO0oO.o00O
    public final void OooO00o(o00O00O o00o00o, boolean z) {
        int i;
        ArrayList arrayList = this.f363OooO;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (o00o00o == ((o00) arrayList.get(i2)).f326OooO0O0) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((o00) arrayList.get(i3)).f326OooO0O0.OooO0OO(false);
        }
        o00 o00Var = (o00) arrayList.remove(i2);
        o00Var.f326OooO0O0.OooOOo(this);
        boolean z2 = this.f387OooOoOO;
        o0 o0Var = o00Var.f325OooO00o;
        if (z2) {
            o0O00o0.OooO0O0(o0Var.f2397OooOoO, null);
            o0Var.f2397OooOoO.setAnimationStyle(0);
        }
        o0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            i = ((o00) arrayList.get(size2 - 1)).f327OooO0OO;
        } else {
            View view = this.f375OooOOOO;
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            if (OooOooo.o00O0O0O.OooO0Oo(view) == 1) {
                i = 0;
            } else {
                i = 1;
            }
        }
        this.f378OooOOo0 = i;
        if (size2 == 0) {
            dismiss();
            oo0oOO0 oo0ooo0 = this.f380OooOo;
            if (oo0ooo0 != null) {
                oo0ooo0.OooO00o(o00o00o, true);
            }
            ViewTreeObserver viewTreeObserver = this.f386OooOoO0;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f386OooOoO0.removeGlobalOnLayoutListener(this.f371OooOO0);
                }
                this.f386OooOoO0 = null;
            }
            this.f376OooOOOo.removeOnAttachStateChangeListener(this.f372OooOO0O);
            this.f385OooOoO.onDismiss();
        } else if (z) {
            ((o00) arrayList.get(0)).f326OooO0O0.OooO0OO(false);
        }
    }

    @Override // OooO0oO.o00OO0OO
    public final boolean OooO0O0() {
        ArrayList arrayList = this.f363OooO;
        return arrayList.size() > 0 && ((o00) arrayList.get(0)).f325OooO00o.OooO0O0();
    }

    @Override // OooO0oO.o00O
    public final void OooO0OO() {
        Iterator it = this.f363OooO.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((o00) it.next()).f325OooO00o.f2377OooO0OO.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((o00O000) adapter).notifyDataSetChanged();
        }
    }

    @Override // OooO0oO.o00O
    public final boolean OooO0o(o00OO o00oo) {
        Iterator it = this.f363OooO.iterator();
        while (it.hasNext()) {
            o00 o00Var = (o00) it.next();
            if (o00oo == o00Var.f326OooO0O0) {
                o00Var.f325OooO00o.f2377OooO0OO.requestFocus();
                return true;
            }
        }
        if (o00oo.hasVisibleItems()) {
            OooOO0o(o00oo);
            oo0oOO0 oo0ooo0 = this.f380OooOo;
            if (oo0ooo0 != null) {
                oo0ooo0.OooOOOO(o00oo);
            }
            return true;
        }
        return false;
    }

    @Override // OooO0oO.o00OO0OO
    public final androidx.appcompat.widget.o00OO000 OooO0o0() {
        ArrayList arrayList = this.f363OooO;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((o00) arrayList.get(arrayList.size() - 1)).f325OooO00o.f2377OooO0OO;
    }

    @Override // OooO0oO.o00O
    public final boolean OooO0oO() {
        return false;
    }

    @Override // OooO0oO.o00O
    public final void OooOO0(oo0oOO0 oo0ooo0) {
        this.f380OooOo = oo0ooo0;
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOO0o(o00O00O o00o00o) {
        o00o00o.OooO0O0(this, this.f364OooO0O0);
        if (OooO0O0()) {
            OooOo0O(o00o00o);
        } else {
            this.f370OooO0oo.add(o00o00o);
        }
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOOO(View view) {
        if (this.f375OooOOOO != view) {
            this.f375OooOOOO = view;
            int i = this.OooOOO0;
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            this.f374OooOOO = Gravity.getAbsoluteGravity(i, OooOooo.o00O0O0O.OooO0Oo(view));
        }
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOOOO(boolean z) {
        this.f383OooOo0O = z;
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOOOo(int i) {
        if (this.OooOOO0 != i) {
            this.OooOOO0 = i;
            View view = this.f375OooOOOO;
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            this.f374OooOOO = Gravity.getAbsoluteGravity(i, OooOooo.o00O0O0O.OooO0Oo(view));
        }
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOOo(PopupWindow.OnDismissListener onDismissListener) {
        this.f385OooOoO = onDismissListener;
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOOo0(int i) {
        this.f377OooOOo = true;
        this.f382OooOo00 = i;
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOOoo(boolean z) {
        this.f384OooOo0o = z;
    }

    @Override // OooO0oO.o00O0OO0
    public final void OooOo00(int i) {
        this.f379OooOOoo = true;
        this.f381OooOo0 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOo0O(OooO0oO.o00O00O r19) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0oO.o00O0000.OooOo0O(OooO0oO.o00O00O):void");
    }

    @Override // OooO0oO.o00OO0OO
    public final void dismiss() {
        ArrayList arrayList = this.f363OooO;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        o00[] o00VarArr = (o00[]) arrayList.toArray(new o00[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            o00 o00Var = o00VarArr[size];
            if (o00Var.f325OooO00o.OooO0O0()) {
                o00Var.f325OooO00o.dismiss();
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        o00 o00Var;
        ArrayList arrayList = this.f363OooO;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                o00Var = null;
                break;
            }
            o00Var = (o00) arrayList.get(i);
            if (!o00Var.f325OooO00o.OooO0O0()) {
                break;
            }
            i++;
        }
        if (o00Var != null) {
            o00Var.f326OooO0O0.OooO0OO(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }
}