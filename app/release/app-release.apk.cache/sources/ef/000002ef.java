package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import hieubui.eup.android_app_security.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0O0OOOo extends Oooo0O0.OooOOO implements View.OnClickListener {

    /* renamed from: OooOo  reason: collision with root package name */
    public static final /* synthetic */ int f2455OooOo = 0;

    /* renamed from: OooO  reason: collision with root package name */
    public final int f2456OooO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final int f2457OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final LayoutInflater f2458OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final SearchView f2459OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final SearchableInfo f2460OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final WeakHashMap f2461OooOOO;
    public final Context OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public final int f2462OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public int f2463OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public int f2464OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public ColorStateList f2465OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public int f2466OooOOoo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public int f2467OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public int f2468OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public int f2469OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public int f2470OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context);
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f2456OooO = suggestionRowLayout;
        this.f2457OooO0oo = suggestionRowLayout;
        this.f2458OooOO0 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f2463OooOOOo = 1;
        this.f2464OooOOo = -1;
        this.f2466OooOOoo = -1;
        this.f2468OooOo00 = -1;
        this.f2467OooOo0 = -1;
        this.f2469OooOo0O = -1;
        this.f2470OooOo0o = -1;
        this.f2459OooOO0O = searchView;
        this.f2460OooOO0o = searchableInfo;
        this.f2462OooOOOO = searchView.getSuggestionCommitIconResId();
        this.OooOOO0 = context;
        this.f2461OooOOO = weakHashMap;
    }

    public static String OooO0oo(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    @Override // Oooo0O0.OooOOO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0O0OOOo.OooO00o(android.view.View, android.database.Cursor):void");
    }

    @Override // Oooo0O0.OooOOO
    public final void OooO0O0(Cursor cursor) {
        try {
            super.OooO0O0(cursor);
            if (cursor != null) {
                this.f2464OooOOo = cursor.getColumnIndex("suggest_text_1");
                this.f2466OooOOoo = cursor.getColumnIndex("suggest_text_2");
                this.f2468OooOo00 = cursor.getColumnIndex("suggest_text_2_url");
                this.f2467OooOo0 = cursor.getColumnIndex("suggest_icon_1");
                this.f2469OooOo0O = cursor.getColumnIndex("suggest_icon_2");
                this.f2470OooOo0o = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // Oooo0O0.OooOOO
    public final String OooO0OO(Cursor cursor) {
        String OooO0oo2;
        String OooO0oo3;
        if (cursor == null) {
            return null;
        }
        String OooO0oo4 = OooO0oo(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (OooO0oo4 != null) {
            return OooO0oo4;
        }
        SearchableInfo searchableInfo = this.f2460OooOO0o;
        if (searchableInfo.shouldRewriteQueryFromData() && (OooO0oo3 = OooO0oo(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return OooO0oo3;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (OooO0oo2 = OooO0oo(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return OooO0oo2;
    }

    @Override // Oooo0O0.OooOOO
    public final View OooO0Oo(ViewGroup viewGroup) {
        View inflate = this.f2458OooOO0.inflate(this.f2457OooO0oo, viewGroup, false);
        inflate.setTag(new o0O0OOO0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f2462OooOOOO);
        return inflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable OooO0o(java.lang.String r9) {
        /*
            r8 = this;
            java.util.WeakHashMap r0 = r8.f2461OooOOO
            android.content.Context r1 = r8.OooOOO0
            java.lang.String r2 = "android.resource://"
            r3 = 0
            if (r9 == 0) goto Ld6
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto Ld6
            java.lang.String r4 = "0"
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L19
            goto Ld6
        L19:
            int r4 = java.lang.Integer.parseInt(r9)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
            r5.<init>(r2)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
            java.lang.String r2 = r1.getPackageName()     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
            r5.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
            java.lang.String r2 = "/"
            r5.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
            r5.append(r4)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
            java.lang.String r2 = r5.toString()     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
            java.lang.Object r5 = r0.get(r2)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
            if (r5 != 0) goto L3f
            r5 = r3
            goto L43
        L3f:
            android.graphics.drawable.Drawable r5 = r5.newDrawable()     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
        L43:
            if (r5 == 0) goto L46
            return r5
        L46:
            java.lang.Object r5 = OooOo0.Oooo000.f1139OooO00o     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
            android.graphics.drawable.Drawable r4 = OooOo0O.o00Ooo.OooO0O0(r1, r4)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
            if (r4 == 0) goto L55
            android.graphics.drawable.Drawable$ConstantState r5 = r4.getConstantState()     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
            r0.put(r2, r5)     // Catch: android.content.res.Resources.NotFoundException -> L56 java.lang.NumberFormatException -> L57
        L55:
            return r4
        L56:
            return r3
        L57:
            java.lang.Object r2 = r0.get(r9)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L61
            r2 = r3
            goto L65
        L61:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L65:
            if (r2 == 0) goto L68
            return r2
        L68:
            android.net.Uri r2 = android.net.Uri.parse(r9)
            java.lang.String r4 = "Failed to open "
            java.lang.String r5 = "Resource does not exist: "
            java.lang.String r6 = r2.getScheme()     // Catch: java.io.FileNotFoundException -> Lc6
            java.lang.String r7 = "android.resource"
            boolean r6 = r7.equals(r6)     // Catch: java.io.FileNotFoundException -> Lc6
            if (r6 == 0) goto L94
            android.graphics.drawable.Drawable r1 = r8.OooO0o0(r2)     // Catch: android.content.res.Resources.NotFoundException -> L82 java.io.FileNotFoundException -> Lc6
            r3 = r1
            goto Lcd
        L82:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Lc6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Lc6
            r4.<init>(r5)     // Catch: java.io.FileNotFoundException -> Lc6
            r4.append(r2)     // Catch: java.io.FileNotFoundException -> Lc6
            java.lang.String r4 = r4.toString()     // Catch: java.io.FileNotFoundException -> Lc6
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> Lc6
            throw r1     // Catch: java.io.FileNotFoundException -> Lc6
        L94:
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.FileNotFoundException -> Lc6
            java.io.InputStream r1 = r1.openInputStream(r2)     // Catch: java.io.FileNotFoundException -> Lc6
            if (r1 == 0) goto Lb4
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r1, r3)     // Catch: java.lang.Throwable -> Lab
            r1.close()     // Catch: java.io.IOException -> La6
            goto La9
        La6:
            r2.toString()     // Catch: java.io.FileNotFoundException -> Lc6
        La9:
            r3 = r4
            goto Lcd
        Lab:
            r4 = move-exception
            r1.close()     // Catch: java.io.IOException -> Lb0
            goto Lb3
        Lb0:
            r2.toString()     // Catch: java.io.FileNotFoundException -> Lc6
        Lb3:
            throw r4     // Catch: java.io.FileNotFoundException -> Lc6
        Lb4:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Lc6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Lc6
            r5.<init>(r4)     // Catch: java.io.FileNotFoundException -> Lc6
            r5.append(r2)     // Catch: java.io.FileNotFoundException -> Lc6
            java.lang.String r4 = r5.toString()     // Catch: java.io.FileNotFoundException -> Lc6
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> Lc6
            throw r1     // Catch: java.io.FileNotFoundException -> Lc6
        Lc6:
            r1 = move-exception
            java.util.Objects.toString(r2)
            r1.getMessage()
        Lcd:
            if (r3 == 0) goto Ld6
            android.graphics.drawable.Drawable$ConstantState r1 = r3.getConstantState()
            r0.put(r9, r1)
        Ld6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0O0OOOo.OooO0o(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Drawable OooO0o0(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.OooOOO0.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final Cursor OooO0oO(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.OooOOO0.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // Oooo0O0.OooOOO, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View inflate = this.f2458OooOO0.inflate(this.f2456OooO, viewGroup, false);
            if (inflate != null) {
                ((o0O0OOO0) inflate.getTag()).f2450OooO00o.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // Oooo0O0.OooOOO, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View OooO0Oo2 = OooO0Oo(viewGroup);
            ((o0O0OOO0) OooO0Oo2.getTag()).f2450OooO00o.setText(e.toString());
            return OooO0Oo2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f1447OooO0OO;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f1447OooO0OO;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2459OooOO0O.OooOOo((CharSequence) tag);
        }
    }
}