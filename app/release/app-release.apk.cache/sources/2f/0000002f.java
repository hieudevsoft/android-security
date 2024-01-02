package OooO0Oo;

import OooO0O0.OooO00o;
import OooO0oO.o00O00O;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o000OOo implements Window.Callback {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Window.Callback f225OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f226OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f227OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f228OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ o00000OO f229OooO0o0;

    public o000OOo(o00000OO o00000oo2, Window.Callback callback) {
        this.f229OooO0o0 = o00000oo2;
        if (callback != null) {
            this.f225OooO00o = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    @Override // android.view.Window.Callback
    /* renamed from: OooO */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f225OooO00o.onActionModeStarted(actionMode);
    }

    public final void OooO00o(Window.Callback callback) {
        try {
            this.f226OooO0O0 = true;
            callback.onContentChanged();
        } finally {
            this.f226OooO0O0 = false;
        }
    }

    @Override // android.view.Window.Callback
    /* renamed from: OooO0O0 */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f225OooO00o.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean OooO0OO(KeyEvent keyEvent) {
        return this.f225OooO00o.dispatchKeyEvent(keyEvent);
    }

    public final boolean OooO0Oo(KeyEvent keyEvent) {
        return this.f225OooO00o.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: OooO0o */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f225OooO00o.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: OooO0o0 */
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f225OooO00o.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: OooO0oO */
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f225OooO00o.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: OooO0oo */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f225OooO00o.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: OooOO0 */
    public final void onAttachedToWindow() {
        this.f225OooO00o.onAttachedToWindow();
    }

    public final boolean OooOO0O(int i, Menu menu) {
        return this.f225OooO00o.onCreatePanelMenu(i, menu);
    }

    public final View OooOO0o(int i) {
        return this.f225OooO00o.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    /* renamed from: OooOOO */
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f225OooO00o.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    /* renamed from: OooOOO0 */
    public final void onDetachedFromWindow() {
        this.f225OooO00o.onDetachedFromWindow();
    }

    public final boolean OooOOOO(int i, Menu menu) {
        return this.f225OooO00o.onMenuOpened(i, menu);
    }

    public final void OooOOOo(int i, Menu menu) {
        this.f225OooO00o.onPanelClosed(i, menu);
    }

    public final boolean OooOOo(int i, View view, Menu menu) {
        return this.f225OooO00o.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    /* renamed from: OooOOo0 */
    public final void onPointerCaptureChanged(boolean z) {
        OooO0o.o00O0O.OooO00o(this.f225OooO00o, z);
    }

    public final void OooOOoo(List list, Menu menu, int i) {
        OooO0o.o0OoOo0.OooO00o(this.f225OooO00o, list, menu, i);
    }

    public final ActionMode OooOo(ActionMode.Callback callback, int i) {
        return OooO0o.o000oOoO.OooO0O0(this.f225OooO00o, callback, i);
    }

    @Override // android.view.Window.Callback
    /* renamed from: OooOo0 */
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return OooO0o.o000oOoO.OooO00o(this.f225OooO00o, searchEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: OooOo00 */
    public final boolean onSearchRequested() {
        return this.f225OooO00o.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    /* renamed from: OooOo0O */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f225OooO00o.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    /* renamed from: OooOo0o */
    public final void onWindowFocusChanged(boolean z) {
        this.f225OooO00o.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f227OooO0OO ? this.f225OooO00o.dispatchKeyEvent(keyEvent) : this.f229OooO0o0.OooOo0(keyEvent) || OooO0OO(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r0 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
        if (r7 != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.OooO0Oo(r7)
            r1 = 1
            if (r0 != 0) goto L6e
            int r0 = r7.getKeyCode()
            OooO0Oo.o00000OO r2 = r6.f229OooO0o0
            r2.OooOoo0()
            OooO0Oo.o000O00O r3 = r2.f126OooOOOO
            r4 = 0
            if (r3 == 0) goto L3b
            OooO0Oo.o000O00 r3 = r3.f196OooO
            if (r3 != 0) goto L1a
            goto L37
        L1a:
            OooO0oO.o00O00O r3 = r3.f186OooO0Oo
            if (r3 == 0) goto L37
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L2e
            r5 = r1
            goto L2f
        L2e:
            r5 = r4
        L2f:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
            goto L38
        L37:
            r0 = r4
        L38:
            if (r0 == 0) goto L3b
            goto L67
        L3b:
            OooO0Oo.o00000O r0 = r2.f150Oooo0o
            if (r0 == 0) goto L50
            int r3 = r7.getKeyCode()
            boolean r0 = r2.Oooo000(r0, r3, r7)
            if (r0 == 0) goto L50
            OooO0Oo.o00000O r7 = r2.f150Oooo0o
            if (r7 == 0) goto L67
            r7.f113OooOO0o = r1
            goto L67
        L50:
            OooO0Oo.o00000O r0 = r2.f150Oooo0o
            if (r0 != 0) goto L69
            OooO0Oo.o00000O r0 = r2.OooOoO(r4)
            r2.Oooo00O(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.Oooo000(r0, r3, r7)
            r0.f112OooOO0O = r4
            if (r7 == 0) goto L69
        L67:
            r7 = r1
            goto L6a
        L69:
            r7 = r4
        L6a:
            if (r7 == 0) goto L6d
            goto L6e
        L6d:
            r1 = r4
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.o000OOo.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f226OooO0O0) {
            this.f225OooO00o.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof o00O00O)) {
            return OooOO0O(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return OooOO0o(i);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        OooOOOO(i, menu);
        o00000OO o00000oo2 = this.f229OooO0o0;
        if (i == 108) {
            o00000oo2.OooOoo0();
            o000O00O o000o00o = o00000oo2.f126OooOOOO;
            if (o000o00o != null && true != o000o00o.f207OooOO0o) {
                o000o00o.f207OooOO0o = true;
                ArrayList arrayList = o000o00o.OooOOO0;
                if (arrayList.size() > 0) {
                    OooO00o.OooO0oO(arrayList.get(0));
                    throw null;
                }
            }
        } else {
            o00000oo2.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f228OooO0Oo) {
            this.f225OooO00o.onPanelClosed(i, menu);
            return;
        }
        OooOOOo(i, menu);
        o00000OO o00000oo2 = this.f229OooO0o0;
        if (i == 108) {
            o00000oo2.OooOoo0();
            o000O00O o000o00o = o00000oo2.f126OooOOOO;
            if (o000o00o != null && o000o00o.f207OooOO0o) {
                o000o00o.f207OooOO0o = false;
                ArrayList arrayList = o000o00o.OooOOO0;
                if (arrayList.size() > 0) {
                    OooO00o.OooO0oO(arrayList.get(0));
                    throw null;
                }
            }
        } else if (i == 0) {
            o00000O OooOoO2 = o00000oo2.OooOoO(i);
            if (OooOoO2.OooOOO0) {
                o00000oo2.OooOOoo(OooOoO2, false);
            }
        } else {
            o00000oo2.getClass();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        o00O00O o00o00o;
        if (menu instanceof o00O00O) {
            o00o00o = (o00O00O) menu;
        } else {
            o00o00o = null;
        }
        if (i == 0 && o00o00o == null) {
            return false;
        }
        if (o00o00o != null) {
            o00o00o.f407OooOo = true;
        }
        boolean OooOOo2 = OooOOo(i, view, menu);
        if (o00o00o != null) {
            o00o00o.f407OooOo = false;
        }
        return OooOOo2;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        o00O00O o00o00o = this.f229OooO0o0.OooOoO(0).f110OooO0oo;
        if (o00o00o != null) {
            OooOOoo(list, o00o00o, i);
        } else {
            OooOOoo(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c9  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0Oo.o000OOo.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }
}