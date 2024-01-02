package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class o0ooOOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2544OooO00o;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f2548OooO0o;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final TextView f2550OooO0oO;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public ColorStateList f2545OooO0O0 = null;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public PorterDuff.Mode f2546OooO0OO = null;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f2547OooO0Oo = false;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f2549OooO0o0 = false;

    public /* synthetic */ o0ooOOo(TextView textView, int i) {
        this.f2544OooO00o = i;
        this.f2550OooO0oO = textView;
    }

    public final void OooO00o() {
        TextView textView = this.f2550OooO0oO;
        Drawable OooO00o2 = Oooo0.OooO0OO.OooO00o((CompoundButton) textView);
        if (OooO00o2 != null) {
            if (this.f2547OooO0Oo || this.f2549OooO0o0) {
                Drawable mutate = OooO00o2.mutate();
                if (this.f2547OooO0Oo) {
                    OooOoO0.o0OOO0o.OooO0oo(mutate, this.f2545OooO0O0);
                }
                if (this.f2549OooO0o0) {
                    OooOoO0.o0OOO0o.OooO(mutate, this.f2546OooO0OO);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CompoundButton) textView).getDrawableState());
                }
                ((CompoundButton) textView).setButtonDrawable(mutate);
            }
        }
    }

    public final void OooO0O0() {
        TextView textView = this.f2550OooO0oO;
        Drawable checkMarkDrawable = ((CheckedTextView) textView).getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2547OooO0Oo || this.f2549OooO0o0) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f2547OooO0Oo) {
                    OooOoO0.o0OOO0o.OooO0oo(mutate, this.f2545OooO0O0);
                }
                if (this.f2549OooO0o0) {
                    OooOoO0.o0OOO0o.OooO(mutate, this.f2546OooO0OO);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CheckedTextView) textView).getDrawableState());
                }
                ((CheckedTextView) textView).setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:6:0x0032, B:8:0x0038, B:10:0x003e, B:14:0x0053, B:16:0x0059, B:18:0x005f, B:19:0x0070, B:21:0x0076, B:22:0x0080, B:24:0x0086), top: B:59:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:6:0x0032, B:8:0x0038, B:10:0x003e, B:14:0x0053, B:16:0x0059, B:18:0x005f, B:19:0x0070, B:21:0x0076, B:22:0x0080, B:24:0x0086), top: B:59:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd A[Catch: all -> 0x011e, TryCatch #3 {all -> 0x011e, blocks: (B:31:0x00b9, B:33:0x00bf, B:35:0x00c5, B:39:0x00da, B:41:0x00e0, B:43:0x00e6, B:44:0x00f7, B:46:0x00fd, B:47:0x0107, B:49:0x010d), top: B:63:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d A[Catch: all -> 0x011e, TRY_LEAVE, TryCatch #3 {all -> 0x011e, blocks: (B:31:0x00b9, B:33:0x00bf, B:35:0x00c5, B:39:0x00da, B:41:0x00e0, B:43:0x00e6, B:44:0x00f7, B:46:0x00fd, B:47:0x0107, B:49:0x010d), top: B:63:0x00b9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0OO(android.util.AttributeSet r17, int r18) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0ooOOo.OooO0OO(android.util.AttributeSet, int):void");
    }
}