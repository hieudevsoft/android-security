package OooO0o;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class o000oOoO {
    public static boolean OooO00o(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode OooO0O0(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}