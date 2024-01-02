package com.google.android.material.internal;

import OooOooo.o0o0Oo;
import OooooOo.oO00O0oO;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.o000000;
import hieubui.eup.android_app_security.R;
import o00o0O.OooO0O0;

/* loaded from: classes.dex */
public class CheckableImageButton extends o000000 implements Checkable {

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final int[] f3452OooO0oO = {16842912};

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f3453OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f3454OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f3455OooO0o0;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        this.f3455OooO0o0 = true;
        this.f3454OooO0o = true;
        o0o0Oo.OooOO0o(this, new oO00O0oO(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3453OooO0Oo;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f3453OooO0Oo ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f3452OooO0oO) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof OooO0O0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        OooO0O0 oooO0O0 = (OooO0O0) parcelable;
        super.onRestoreInstanceState(oooO0O0.f1456OooO00o);
        setChecked(oooO0O0.f5204OooO0OO);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        OooO0O0 oooO0O0 = new OooO0O0(super.onSaveInstanceState());
        oooO0O0.f5204OooO0OO = this.f3453OooO0Oo;
        return oooO0O0;
    }

    public void setCheckable(boolean z) {
        if (this.f3455OooO0o0 != z) {
            this.f3455OooO0o0 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f3455OooO0o0 || this.f3453OooO0Oo == z) {
            return;
        }
        this.f3453OooO0Oo = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f3454OooO0o = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f3454OooO0o) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3453OooO0Oo);
    }
}