package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class o000OO0O implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ TextView f2310OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Typeface f2311OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ int f2312OooO0OO;

    public o000OO0O(TextView textView, Typeface typeface, int i) {
        this.f2310OooO00o = textView;
        this.f2311OooO0O0 = typeface;
        this.f2312OooO0OO = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2310OooO00o.setTypeface(this.f2311OooO0O0, this.f2312OooO0OO);
    }
}