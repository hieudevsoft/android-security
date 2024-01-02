package com.google.android.material.textfield;

import OooooO0.o0000O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.oo0o0Oo;
import com.google.gson.internal.OooO0o;
import hieubui.eup.android_app_security.R;
import java.util.Locale;

/* loaded from: classes.dex */
public class TextInputEditText extends oo0o0Oo {

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final Rect f3494OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f3495OooO0oo;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(OooO0o.OooOo0o(context, attributeSet, R.attr.editTextStyle, 0), attributeSet);
        this.f3494OooO0oO = new Rect();
        TypedArray OooOOOO2 = OooO0o.OooOOOO(context, attributeSet, o0000O.f1809OooOoO, R.attr.editTextStyle, 2131755833, new int[0]);
        setTextInputLayoutFocusedRectEnabled(OooOOOO2.getBoolean(0, false));
        OooOOOO2.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        boolean z;
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f3495OooO0oo) {
            z = true;
        } else {
            z = false;
        }
        if (z && rect != null) {
            Rect rect2 = this.f3494OooO0oO;
            textInputLayout.getFocusedRect(rect2);
            rect.bottom = rect2.bottom;
        }
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean z;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f3495OooO0oo) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
            if (globalVisibleRect && point != null) {
                point.offset(-getScrollX(), -getScrollY());
            }
            return globalVisibleRect;
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f3525OooOooo) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f3525OooOooo && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // androidx.appcompat.widget.oo0o0Oo, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean z;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f3495OooO0oo) {
            z = true;
        } else {
            z = false;
        }
        if (z && rect != null) {
            int height = textInputLayout.getHeight() - getHeight();
            int i = rect.left;
            int i2 = rect.top;
            int i3 = rect.right;
            int i4 = rect.bottom + height;
            Rect rect2 = this.f3494OooO0oO;
            rect2.set(i, i2, i3, i4);
            return super.requestRectangleOnScreen(rect2);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f3495OooO0oo = z;
    }
}