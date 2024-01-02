package Oooo0O0;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.o0O0OOOo;

/* loaded from: classes.dex */
public final class OooOo00 extends Filter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOOO f1454OooO00o;

    public OooOo00(OooOOOO oooOOOO) {
        this.f1454OooO00o = oooOOOO;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((o0O0OOOo) this.f1454OooO00o).OooO0OO((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            Oooo0O0.OooOOOO r0 = r4.f1454OooO00o
            androidx.appcompat.widget.o0O0OOOo r0 = (androidx.appcompat.widget.o0O0OOOo) r0
            if (r5 != 0) goto L9
            java.lang.String r5 = ""
            goto L10
        L9:
            r0.getClass()
            java.lang.String r5 = r5.toString()
        L10:
            androidx.appcompat.widget.SearchView r1 = r0.f2459OooOO0O
            int r2 = r1.getVisibility()
            r3 = 0
            if (r2 != 0) goto L2c
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L20
            goto L2c
        L20:
            android.app.SearchableInfo r1 = r0.f2460OooOO0o     // Catch: java.lang.RuntimeException -> L2c
            android.database.Cursor r5 = r0.OooO0oO(r1, r5)     // Catch: java.lang.RuntimeException -> L2c
            if (r5 == 0) goto L2c
            r5.getCount()     // Catch: java.lang.RuntimeException -> L2c
            goto L2d
        L2c:
            r5 = r3
        L2d:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L3d
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L42
        L3d:
            r5 = 0
            r0.count = r5
            r0.values = r3
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo0O0.OooOo00.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        OooOOOO oooOOOO = this.f1454OooO00o;
        Cursor cursor = ((OooOOO) oooOOOO).f1447OooO0OO;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((o0O0OOOo) oooOOOO).OooO0O0((Cursor) obj);
        }
    }
}