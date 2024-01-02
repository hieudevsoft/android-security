package Oooo0;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class oo000o implements ActionMode.Callback {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ActionMode.Callback f1413OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final TextView f1414OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Class f1415OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Method f1416OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f1417OooO0o = false;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f1418OooO0o0;

    public oo000o(ActionMode.Callback callback, TextView textView) {
        this.f1413OooO00o = callback;
        this.f1414OooO0O0 = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f1413OooO00o.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f1413OooO00o.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f1413OooO00o.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009f A[SYNTHETIC] */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo0.oo000o.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}