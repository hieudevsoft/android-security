package OooO0Oo;

import android.content.Context;
import android.widget.ArrayAdapter;

/* loaded from: classes.dex */
public final class OooOO0O extends ArrayAdapter {
    public OooOO0O(Context context, int i) {
        super(context, i, 16908308, (Object[]) null);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}