package com.google.android.material.snackbar;

import OooOooo.o00O0O0O;
import OooOooo.o0o0Oo;
import OooooOO.oO00O0o0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: OooO00o  reason: collision with root package name */
    public TextView f3491OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Button f3492OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f3493OooO0OO;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO00o.o000Oooo(context, R.attr.motionEasingEmphasizedInterpolator, oO00O0o0.f1816OooO0O0);
    }

    public final boolean OooO00o(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f3491OooO00o.getPaddingTop() == i2 && this.f3491OooO00o.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f3491OooO00o;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        if (o00O0O0O.OooO0oO(textView)) {
            o00O0O0O.OooOO0O(textView, o00O0O0O.OooO0o(textView), i2, o00O0O0O.OooO0o0(textView), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f3492OooO0O0;
    }

    public TextView getMessageView() {
        return this.f3491OooO00o;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3491OooO00o = (TextView) findViewById(R.id.snackbar_text);
        this.f3492OooO0O0 = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (OooO00o(1, r0, r0 - r2) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (OooO00o(0, r0, r0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131099783(0x7f060087, float:1.7811929E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131099782(0x7f060086, float:1.7811927E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f3491OooO00o
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L32
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L32
            r3 = r1
            goto L33
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L4c
            int r5 = r7.f3493OooO0OO
            if (r5 <= 0) goto L4c
            android.widget.Button r5 = r7.f3492OooO0O0
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f3493OooO0OO
            if (r5 <= r6) goto L4c
            int r2 = r0 - r2
            boolean r0 = r7.OooO00o(r1, r0, r2)
            if (r0 == 0) goto L57
            goto L58
        L4c:
            if (r3 == 0) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            boolean r0 = r7.OooO00o(r4, r0, r0)
            if (r0 == 0) goto L57
            goto L58
        L57:
            r1 = r4
        L58:
            if (r1 == 0) goto L5d
            super.onMeasure(r8, r9)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f3493OooO0OO = i;
    }
}