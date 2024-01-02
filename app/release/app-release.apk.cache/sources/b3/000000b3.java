package OooOOo0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class OooO00o extends OooO0OO {

    /* renamed from: OooO  reason: collision with root package name */
    public int f928OooO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f929OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public OooOOO.OooO00o f930OooOO0;

    public OooO00o(Context context) {
        super(context);
        setVisibility(8);
    }

    @Override // OooOOo0.OooO0OO
    public final void OooO0oO(AttributeSet attributeSet) {
        super.OooO0oO(attributeSet);
        this.f930OooOO0 = new OooOOO.OooO00o();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o00Ooo.f1076OooO0O0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f930OooOO0.f684o00oO0O = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f930OooOO0.f685o0ooOO0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f941OooO0Oo = this.f930OooOO0;
        OooO();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r0 == 6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r0 == 6) goto L11;
     */
    @Override // OooOOo0.OooO0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oo(OooOOO.OooO r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f929OooO0oo
            r3.f928OooO = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto Le
            if (r0 != r2) goto Lb
            goto L14
        Lb:
            if (r0 != r1) goto L17
            goto L10
        Le:
            if (r0 != r2) goto L12
        L10:
            r5 = 0
            goto L15
        L12:
            if (r0 != r1) goto L17
        L14:
            r5 = 1
        L15:
            r3.f928OooO = r5
        L17:
            boolean r5 = r4 instanceof OooOOO.OooO00o
            if (r5 == 0) goto L21
            OooOOO.OooO00o r4 = (OooOOO.OooO00o) r4
            int r5 = r3.f928OooO
            r4.o00oO0o = r5
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOOo0.OooO00o.OooO0oo(OooOOO.OooO, boolean):void");
    }

    public boolean getAllowsGoneWidget() {
        return this.f930OooOO0.f684o00oO0O;
    }

    public int getMargin() {
        return this.f930OooOO0.f685o0ooOO0;
    }

    public int getType() {
        return this.f929OooO0oo;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f930OooOO0.f684o00oO0O = z;
    }

    public void setDpMargin(int i) {
        this.f930OooOO0.f685o0ooOO0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f930OooOO0.f685o0ooOO0 = i;
    }

    public void setType(int i) {
        this.f929OooO0oo = i;
    }
}