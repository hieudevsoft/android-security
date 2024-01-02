package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import hieubui.eup.android_app_security.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements OooO0o.OooO0o {

    /* renamed from: OooooO0  reason: collision with root package name */
    public static final o0oO0O0o f2152OooooO0;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public final SearchAutoComplete f2153OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public final View f2154OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final View f2155OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public final View f2156OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public final View f2157OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public final ImageView f2158OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public final ImageView f2159OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public final ImageView f2160OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public final ImageView f2161OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public final Rect f2162OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public o0O0OO0 f2163OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public final Rect f2164OooOoOO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public final int[] f2165OooOoo;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public final int[] f2166OooOoo0;

    /* renamed from: OooOooO  reason: collision with root package name */
    public final ImageView f2167OooOooO;

    /* renamed from: OooOooo  reason: collision with root package name */
    public final Drawable f2168OooOooo;

    /* renamed from: Oooo  reason: collision with root package name */
    public boolean f2169Oooo;

    /* renamed from: Oooo0  reason: collision with root package name */
    public final Intent f2170Oooo0;

    /* renamed from: Oooo000  reason: collision with root package name */
    public final int f2171Oooo000;

    /* renamed from: Oooo00O  reason: collision with root package name */
    public final int f2172Oooo00O;

    /* renamed from: Oooo00o  reason: collision with root package name */
    public final Intent f2173Oooo00o;

    /* renamed from: Oooo0O0  reason: collision with root package name */
    public final CharSequence f2174Oooo0O0;

    /* renamed from: Oooo0OO  reason: collision with root package name */
    public View.OnFocusChangeListener f2175Oooo0OO;

    /* renamed from: Oooo0o  reason: collision with root package name */
    public boolean f2176Oooo0o;

    /* renamed from: Oooo0o0  reason: collision with root package name */
    public View.OnClickListener f2177Oooo0o0;

    /* renamed from: Oooo0oO  reason: collision with root package name */
    public boolean f2178Oooo0oO;

    /* renamed from: Oooo0oo  reason: collision with root package name */
    public Oooo0O0.OooOOO f2179Oooo0oo;

    /* renamed from: OoooO  reason: collision with root package name */
    public int f2180OoooO;

    /* renamed from: OoooO0  reason: collision with root package name */
    public boolean f2181OoooO0;

    /* renamed from: OoooO00  reason: collision with root package name */
    public CharSequence f2182OoooO00;

    /* renamed from: OoooO0O  reason: collision with root package name */
    public boolean f2183OoooO0O;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public boolean f2184OoooOO0;

    /* renamed from: OoooOOO  reason: collision with root package name */
    public boolean f2185OoooOOO;

    /* renamed from: OoooOOo  reason: collision with root package name */
    public int f2186OoooOOo;

    /* renamed from: OoooOo0  reason: collision with root package name */
    public SearchableInfo f2187OoooOo0;
    public Bundle OoooOoO;

    /* renamed from: OoooOoo  reason: collision with root package name */
    public final o0O000o0 f2188OoooOoo;

    /* renamed from: Ooooo00  reason: collision with root package name */
    public final o0O000o0 f2189Ooooo00;

    /* renamed from: Ooooo0o  reason: collision with root package name */
    public final WeakHashMap f2190Ooooo0o;

    /* renamed from: o000oOoO  reason: collision with root package name */
    public CharSequence f2191o000oOoO;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends o00O0O {

        /* renamed from: OooO0o  reason: collision with root package name */
        public SearchView f2192OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        public int f2193OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        public boolean f2194OooO0oO;

        /* renamed from: OooO0oo  reason: collision with root package name */
        public final o0O0O0o0 f2195OooO0oo;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2195OooO0oo = new o0O0O0o0(this);
            this.f2193OooO0o0 = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                if (i < 600) {
                    return (i < 640 || i2 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        public final void OooO00o() {
            if (Build.VERSION.SDK_INT >= 29) {
                o0oO0Ooo.OooO0O0(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o0oO0O0o o0oo0o0o = SearchView.f2152OooooO0;
            o0oo0o0o.getClass();
            o0oO0O0o.OooOOO();
            Object obj = o0oo0o0o.f2541OooO0OO;
            if (((Method) obj) != null) {
                try {
                    ((Method) obj).invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f2193OooO0o0 <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.o00O0O, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2194OooO0oO) {
                o0O0O0o0 o0o0o0o0 = this.f2195OooO0oo;
                removeCallbacks(o0o0o0o0);
                post(o0o0o0o0);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f2192OooO0o;
            searchView.OooOoO0(searchView.f2178Oooo0oO);
            searchView.post(searchView.f2188OoooOoo);
            if (searchView.f2153OooOOOo.hasFocus()) {
                searchView.OooOOO();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2192OooO0o.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f2192OooO0o.hasFocus() && getVisibility() == 0) {
                boolean z2 = true;
                this.f2194OooO0oO = true;
                Context context = getContext();
                o0oO0O0o o0oo0o0o = SearchView.f2152OooooO0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z2 = false;
                }
                if (z2) {
                    OooO00o();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            o0O0O0o0 o0o0o0o0 = this.f2195OooO0oo;
            if (!z) {
                this.f2194OooO0oO = false;
                removeCallbacks(o0o0o0o0);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f2194OooO0oO = true;
            } else {
                this.f2194OooO0oO = false;
                removeCallbacks(o0o0o0o0);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f2192OooO0o = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f2193OooO0o0 = i;
        }
    }

    static {
        f2152OooooO0 = Build.VERSION.SDK_INT < 29 ? new o0oO0O0o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f2153OooOOOo;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // OooO0o.OooO0o
    public final void OooO00o() {
        if (this.f2185OoooOOO) {
            return;
        }
        this.f2185OoooOOO = true;
        SearchAutoComplete searchAutoComplete = this.f2153OooOOOo;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f2186OoooOOo = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // OooO0o.OooO0o
    public final void OooO0o0() {
        SearchAutoComplete searchAutoComplete = this.f2153OooOOOo;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f2191o000oOoO = "";
        clearFocus();
        OooOoO0(true);
        searchAutoComplete.setImeOptions(this.f2186OoooOOo);
        this.f2185OoooOOO = false;
    }

    public final Intent OooOO0o(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2191o000oOoO);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.OoooOoO;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f2187OoooOo0.getSearchActivity());
        return intent;
    }

    public final void OooOOO() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f2153OooOOOo;
        if (i >= 29) {
            o0oO0Ooo.OooO00o(searchAutoComplete);
            return;
        }
        o0oO0O0o o0oo0o0o = f2152OooooO0;
        o0oo0o0o.getClass();
        o0oO0O0o.OooOOO();
        Object obj = o0oo0o0o.f2539OooO00o;
        if (((Method) obj) != null) {
            try {
                ((Method) obj).invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        o0oo0o0o.getClass();
        o0oO0O0o.OooOOO();
        Object obj2 = o0oo0o0o.f2540OooO0O0;
        if (((Method) obj2) != null) {
            try {
                ((Method) obj2).invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final Intent OooOOO0(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.OoooOoO;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void OooOOOO() {
        SearchAutoComplete searchAutoComplete = this.f2153OooOOOo;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f2176Oooo0o) {
            clearFocus();
            OooOoO0(true);
        }
    }

    public final void OooOOOo(int i) {
        Uri parse;
        String OooO0oo2;
        Cursor cursor = this.f2179Oooo0oo.f1447OooO0OO;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                try {
                    int i2 = o0O0OOOo.f2455OooOo;
                    String OooO0oo3 = o0O0OOOo.OooO0oo(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (OooO0oo3 == null) {
                        OooO0oo3 = this.f2187OoooOo0.getSuggestIntentAction();
                    }
                    if (OooO0oo3 == null) {
                        OooO0oo3 = "android.intent.action.SEARCH";
                    }
                    String OooO0oo4 = o0O0OOOo.OooO0oo(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (OooO0oo4 == null) {
                        OooO0oo4 = this.f2187OoooOo0.getSuggestIntentData();
                    }
                    if (OooO0oo4 != null && (OooO0oo2 = o0O0OOOo.OooO0oo(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        OooO0oo4 = OooO0oo4 + "/" + Uri.encode(OooO0oo2);
                    }
                    if (OooO0oo4 == null) {
                        parse = null;
                    } else {
                        parse = Uri.parse(OooO0oo4);
                    }
                    intent = OooOO0o(OooO0oo3, parse, o0O0OOOo.OooO0oo(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), o0O0OOOo.OooO0oo(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                    cursor.getPosition();
                }
            } catch (RuntimeException unused2) {
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException unused3) {
                    intent.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f2153OooOOOo;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void OooOOo(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void OooOOo0(int i) {
        String OooO0OO2;
        Editable text = this.f2153OooOOOo.getText();
        Cursor cursor = this.f2179Oooo0oo.f1447OooO0OO;
        if (cursor != null) {
            if (cursor.moveToPosition(i) && (OooO0OO2 = this.f2179Oooo0oo.OooO0OO(cursor)) != null) {
                setQuery(OooO0OO2);
            } else {
                setQuery(text);
            }
        }
    }

    public final void OooOOoo() {
        SearchAutoComplete searchAutoComplete = this.f2153OooOOOo;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f2187OoooOo0 != null) {
                getContext().startActivity(OooOO0o("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001e, code lost:
        if (r2.f2184OoooOO0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOo(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f2169Oooo
            if (r0 == 0) goto L21
            r1 = 0
            if (r0 != 0) goto Lb
            boolean r0 = r2.f2184OoooOO0
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.f2178Oooo0oO
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f2184OoooOO0
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.f2158OooOo0
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.OooOo(boolean):void");
    }

    public final void OooOo0() {
        int[] iArr = this.f2153OooOOOo.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f2154OooOOo.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f2156OooOOoo.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void OooOo00() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2153OooOOOo.getText());
        if (!z2 && (!this.f2176Oooo0o || this.f2185OoooOOO)) {
            z = false;
        }
        int i = z ? 0 : 8;
        ImageView imageView = this.f2160OooOo0O;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void OooOo0O() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.f2176Oooo0o;
        SearchAutoComplete searchAutoComplete = this.f2153OooOOOo;
        if (z && (drawable = this.f2168OooOooo) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void OooOo0o() {
        boolean z;
        int i = 0;
        if ((this.f2169Oooo || this.f2184OoooOO0) && !this.f2178Oooo0oO) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (this.f2158OooOo0.getVisibility() != 0 && this.f2161OooOo0o.getVisibility() != 0)) {
            i = 8;
        }
        this.f2156OooOOoo.setVisibility(i);
    }

    public final void OooOoO0(boolean z) {
        int i;
        int i2;
        int i3;
        this.f2178Oooo0oO = z;
        int i4 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean z2 = !TextUtils.isEmpty(this.f2153OooOOOo.getText());
        this.f2159OooOo00.setVisibility(i);
        OooOo(z2);
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.f2155OooOOo0.setVisibility(i2);
        ImageView imageView = this.f2167OooOooO;
        if (imageView.getDrawable() != null && !this.f2176Oooo0o) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        OooOo00();
        boolean z3 = !z2;
        if (this.f2184OoooOO0 && !this.f2178Oooo0oO && z3) {
            this.f2158OooOo0.setVisibility(8);
        } else {
            i4 = 8;
        }
        this.f2161OooOo0o.setVisibility(i4);
        OooOo0o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f2183OoooO0O = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f2153OooOOOo;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f2183OoooO0O = false;
    }

    public int getImeOptions() {
        return this.f2153OooOOOo.getImeOptions();
    }

    public int getInputType() {
        return this.f2153OooOOOo.getInputType();
    }

    public int getMaxWidth() {
        return this.f2180OoooO;
    }

    public CharSequence getQuery() {
        return this.f2153OooOOOo.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f2182OoooO00;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f2187OoooOo0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f2174Oooo0O0 : getContext().getText(this.f2187OoooOo0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f2172Oooo00O;
    }

    public int getSuggestionRowLayout() {
        return this.f2171Oooo000;
    }

    public Oooo0O0.OooOOO getSuggestionsAdapter() {
        return this.f2179Oooo0oo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2188OoooOoo);
        post(this.f2189Ooooo00);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f2153OooOOOo;
            int[] iArr = this.f2166OooOoo0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f2165OooOoo;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            Rect rect = this.f2162OooOoO;
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.f2164OooOoOO;
            rect2.set(i7, 0, i8, i9);
            o0O0OO0 o0o0oo0 = this.f2163OooOoO0;
            if (o0o0oo0 == null) {
                o0O0OO0 o0o0oo02 = new o0O0OO0(rect2, rect, searchAutoComplete);
                this.f2163OooOoO0 = o0o0oo02;
                setTouchDelegate(o0o0oo02);
                return;
            }
            o0o0oo0.f2445OooO0O0.set(rect2);
            Rect rect3 = o0o0oo0.f2447OooO0Oo;
            rect3.set(rect2);
            int i10 = -o0o0oo0.f2449OooO0o0;
            rect3.inset(i10, i10);
            o0o0oo0.f2446OooO0OO.set(rect);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f2178Oooo0oO
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1b
            goto L37
        L1b:
            int r0 = r3.f2180OoooO
            if (r0 <= 0) goto L37
            goto L2e
        L20:
            int r4 = r3.f2180OoooO
            if (r4 <= 0) goto L25
            goto L37
        L25:
            int r4 = r3.getPreferredWidth()
            goto L37
        L2a:
            int r0 = r3.f2180OoooO
            if (r0 <= 0) goto L2f
        L2e:
            goto L33
        L2f:
            int r0 = r3.getPreferredWidth()
        L33:
            int r4 = java.lang.Math.min(r0, r4)
        L37:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L49
            if (r0 == 0) goto L44
            goto L51
        L44:
            int r5 = r3.getPreferredHeight()
            goto L51
        L49:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L51:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o0O0O0Oo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o0O0O0Oo o0o0o0oo = (o0O0O0Oo) parcelable;
        super.onRestoreInstanceState(o0o0o0oo.f1456OooO00o);
        OooOoO0(o0o0o0oo.f2442OooO0OO);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o0O0O0Oo o0o0o0oo = new o0O0O0Oo(super.onSaveInstanceState());
        o0o0o0oo.f2442OooO0OO = this.f2178Oooo0oO;
        return o0o0o0oo;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f2188OoooOoo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f2183OoooO0O || !isFocusable()) {
            return false;
        }
        if (!this.f2178Oooo0oO) {
            boolean requestFocus = this.f2153OooOOOo.requestFocus(i, rect);
            if (requestFocus) {
                OooOoO0(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    public void setAppSearchData(Bundle bundle) {
        this.OoooOoO = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            OooOOOO();
            return;
        }
        OooOoO0(false);
        SearchAutoComplete searchAutoComplete = this.f2153OooOOOo;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f2177Oooo0o0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f2176Oooo0o == z) {
            return;
        }
        this.f2176Oooo0o = z;
        OooOoO0(z);
        OooOo0O();
    }

    public void setImeOptions(int i) {
        this.f2153OooOOOo.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f2153OooOOOo.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f2180OoooO = i;
        requestLayout();
    }

    public void setOnCloseListener(o0O00o00 o0o00o00) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2175Oooo0OO = onFocusChangeListener;
    }

    public void setOnQueryTextListener(o0O00oO0 o0o00oo0) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2177Oooo0o0 = onClickListener;
    }

    public void setOnSuggestionListener(o0O0O0O o0o0o0o) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2182OoooO00 = charSequence;
        OooOo0O();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.f2181OoooO0 = z;
        Oooo0O0.OooOOO oooOOO = this.f2179Oooo0oo;
        if (oooOOO instanceof o0O0OOOo) {
            o0O0OOOo o0o0oooo = (o0O0OOOo) oooOOO;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            o0o0oooo.f2463OooOOOo = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (getContext().getPackageManager().resolveActivity(r3, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.f2187OoooOo0 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.f2153OooOOOo
            r1 = 1
            r2 = 65536(0x10000, float:9.1835E-41)
            r3 = 0
            if (r8 == 0) goto L68
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.f2187OoooOo0
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.f2187OoooOo0
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L34
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.f2187OoooOo0
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L34
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L34:
            r0.setInputType(r8)
            Oooo0O0.OooOOO r8 = r7.f2179Oooo0oo
            if (r8 == 0) goto L3e
            r8.OooO0O0(r3)
        L3e:
            android.app.SearchableInfo r8 = r7.f2187OoooOo0
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L65
            androidx.appcompat.widget.o0O0OOOo r8 = new androidx.appcompat.widget.o0O0OOOo
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.f2187OoooOo0
            java.util.WeakHashMap r6 = r7.f2190Ooooo0o
            r8.<init>(r4, r7, r5, r6)
            r7.f2179Oooo0oo = r8
            r0.setAdapter(r8)
            Oooo0O0.OooOOO r8 = r7.f2179Oooo0oo
            androidx.appcompat.widget.o0O0OOOo r8 = (androidx.appcompat.widget.o0O0OOOo) r8
            boolean r4 = r7.f2181OoooO0
            if (r4 == 0) goto L62
            r4 = 2
            goto L63
        L62:
            r4 = r1
        L63:
            r8.f2463OooOOOo = r4
        L65:
            r7.OooOo0O()
        L68:
            android.app.SearchableInfo r8 = r7.f2187OoooOo0
            if (r8 == 0) goto L98
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L98
            android.app.SearchableInfo r8 = r7.f2187OoooOo0
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L7d
            android.content.Intent r3 = r7.f2173Oooo00o
            goto L87
        L7d:
            android.app.SearchableInfo r8 = r7.f2187OoooOo0
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L87
            android.content.Intent r3 = r7.f2170Oooo0
        L87:
            if (r3 == 0) goto L98
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            r7.f2184OoooOO0 = r1
            if (r1 == 0) goto La2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        La2:
            boolean r8 = r7.f2178Oooo0oO
            r7.OooOoO0(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f2169Oooo = z;
        OooOoO0(this.f2178Oooo0oO);
    }

    public void setSuggestionsAdapter(Oooo0O0.OooOOO oooOOO) {
        this.f2179Oooo0oo = oooOOO;
        this.f2153OooOOOo.setAdapter(oooOOO);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2162OooOoO = new Rect();
        this.f2164OooOoOO = new Rect();
        this.f2166OooOoo0 = new int[2];
        this.f2165OooOoo = new int[2];
        this.f2188OoooOoo = new o0O000o0(this, 0);
        this.f2189Ooooo00 = new o0O000o0(this, 1);
        this.f2190Ooooo0o = new WeakHashMap();
        o0O00O0o o0o00o0o = new o0O00O0o(this);
        o0O00O o0o00o = new o0O00O(this);
        o0O00OO o0o00oo = new o0O00OO(this);
        o0O00OOO o0o00ooo = new o0O00OOO(this, 0);
        o00OOO00 o00ooo00 = new o00OOO00(1, this);
        o0O000Oo o0o000oo = new o0O000Oo(this, 0);
        int[] iArr = OooO0OO.OooO00o.f36OooOo0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        o0oO0O0o o0oo0o0o = new o0oO0O0o(context, obtainStyledAttributes);
        OooOooo.o0o0Oo.OooOO0O(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        LayoutInflater.from(context).inflate(o0oo0o0o.OooO(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f2153OooOOOo = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f2155OooOOo0 = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f2154OooOOo = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f2156OooOOoo = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f2159OooOo00 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f2158OooOo0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f2160OooOo0O = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f2161OooOo0o = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f2167OooOooO = imageView5;
        OooOooo.o00O0O0.OooOOo0(findViewById, o0oo0o0o.OooO0o0(20));
        OooOooo.o00O0O0.OooOOo0(findViewById2, o0oo0o0o.OooO0o0(25));
        imageView.setImageDrawable(o0oo0o0o.OooO0o0(23));
        imageView2.setImageDrawable(o0oo0o0o.OooO0o0(15));
        imageView3.setImageDrawable(o0oo0o0o.OooO0o0(12));
        imageView4.setImageDrawable(o0oo0o0o.OooO0o0(28));
        imageView5.setImageDrawable(o0oo0o0o.OooO0o0(23));
        this.f2168OooOooo = o0oo0o0o.OooO0o0(22);
        o0000O00.OooO00o.o000o0oO(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f2171Oooo000 = o0oo0o0o.OooO(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f2172Oooo00O = o0oo0o0o.OooO(13, 0);
        imageView.setOnClickListener(o0o00o0o);
        imageView3.setOnClickListener(o0o00o0o);
        imageView2.setOnClickListener(o0o00o0o);
        imageView4.setOnClickListener(o0o00o0o);
        searchAutoComplete.setOnClickListener(o0o00o0o);
        searchAutoComplete.addTextChangedListener(o0o000oo);
        searchAutoComplete.setOnEditorActionListener(o0o00oo);
        searchAutoComplete.setOnItemClickListener(o0o00ooo);
        searchAutoComplete.setOnItemSelectedListener(o00ooo00);
        searchAutoComplete.setOnKeyListener(o0o00o);
        searchAutoComplete.setOnFocusChangeListener(new o0O00(this));
        setIconifiedByDefault(o0oo0o0o.OooO00o(18, true));
        int OooO0Oo2 = o0oo0o0o.OooO0Oo(2, -1);
        if (OooO0Oo2 != -1) {
            setMaxWidth(OooO0Oo2);
        }
        this.f2174Oooo0O0 = o0oo0o0o.OooOO0O(14);
        this.f2182OoooO00 = o0oo0o0o.OooOO0O(21);
        int OooO0oo2 = o0oo0o0o.OooO0oo(6, -1);
        if (OooO0oo2 != -1) {
            setImeOptions(OooO0oo2);
        }
        int OooO0oo3 = o0oo0o0o.OooO0oo(5, -1);
        if (OooO0oo3 != -1) {
            setInputType(OooO0oo3);
        }
        setFocusable(o0oo0o0o.OooO00o(1, true));
        o0oo0o0o.OooOOOO();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f2173Oooo00o = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2170Oooo0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f2157OooOo = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new o0OoO00O(0, this));
        }
        OooOoO0(this.f2176Oooo0o);
        OooOo0O();
    }
}