package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public class oo0o0Oo extends EditText implements OooOooo.o00O000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00Oo0 f2574OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o00 f2575OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o0O0O00 f2576OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Oooo0.o00oO0o f2577OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public o0OO00O f2578OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final o0O0O00 f2579OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        o0O0o000.OooO00o(context);
        oo0OOoo.OooO00o(this, getContext());
        o00Oo0 o00oo0 = new o00Oo0(this);
        this.f2574OooO00o = o00oo0;
        o00oo0.OooO0o0(attributeSet, R.attr.editTextStyle);
        o00 o00Var = new o00(this);
        this.f2575OooO0O0 = o00Var;
        o00Var.OooO0o(attributeSet, R.attr.editTextStyle);
        o00Var.OooO0O0();
        this.f2576OooO0OO = new o0O0O00((TextView) this);
        this.f2577OooO0Oo = new Oooo0.o00oO0o();
        o0O0O00 o0o0o00 = new o0O0O00((EditText) this);
        this.f2579OooO0o0 = o0o0o00;
        o0o0o00.OooO0Oo(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener OooO00o2 = o0o0o00.OooO00o(keyListener);
            if (OooO00o2 != keyListener) {
                super.setKeyListener(OooO00o2);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private o0OO00O getSuperCaller() {
        if (this.f2578OooO0o == null) {
            this.f2578OooO0o = new o0OO00O(this);
        }
        return this.f2578OooO0o;
    }

    @Override // OooOooo.o00O000
    public final OooOooo.o000O00 OooO00o(OooOooo.o000O00 o000o00) {
        return this.f2577OooO0Oo.OooO00o(this, o000o00);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o00Oo0 o00oo0 = this.f2574OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO00o();
        }
        o00 o00Var = this.f2575OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o0000O00.OooO00o.o00O000(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o00Oo0 o00oo0 = this.f2574OooO00o;
        if (o00oo0 != null) {
            return o00oo0.OooO0OO();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o00Oo0 o00oo0 = this.f2574OooO00o;
        if (o00oo0 != null) {
            return o00oo0.OooO0Oo();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2575OooO0O0.OooO0Oo();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2575OooO0O0.OooO0o0();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        o0O0O00 o0o0o00;
        if (Build.VERSION.SDK_INT < 28 && (o0o0o00 = this.f2576OooO0OO) != null) {
            TextClassifier textClassifier = (TextClassifier) o0o0o00.f2441OooO0OO;
            if (textClassifier == null) {
                return o000O0.OooO00o((TextView) o0o0o00.f2440OooO0O0);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
        if (r1 != null) goto L18;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            androidx.appcompat.widget.o00 r1 = r7.f2575OooO0O0
            r1.getClass()
            androidx.appcompat.widget.o00.OooO0oo(r7, r0, r8)
            o0000O00.OooO00o.o000(r7, r8, r0)
            if (r0 == 0) goto L76
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L76
            java.lang.String[] r2 = OooOooo.o0o0Oo.OooO0o(r7)
            if (r2 == 0) goto L76
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            Oooo00o.OooO0o.OooO00o(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            Oooo00o.OooOO0 r2 = new Oooo00o.OooOO0
            r2.<init>(r7)
            if (r1 < r5) goto L4c
            Oooo00o.OooOO0O r1 = new Oooo00o.OooOO0O
            r1.<init>(r0, r2)
        L4a:
            r0 = r1
            goto L76
        L4c:
            java.lang.String[] r6 = o0000O00.OooO00o.f4126OooOOo0
            if (r1 < r5) goto L58
            java.lang.String[] r1 = Oooo00o.OooO0o.OooO0O0(r8)
            if (r1 == 0) goto L6c
        L56:
            r6 = r1
            goto L6c
        L58:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5d
            goto L6c
        L5d:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L69
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L69:
            if (r1 == 0) goto L6c
            goto L56
        L6c:
            int r1 = r6.length
            if (r1 != 0) goto L70
            goto L76
        L70:
            Oooo00o.OooOOO0 r1 = new Oooo00o.OooOOO0
            r1.<init>(r0, r2)
            goto L4a
        L76:
            androidx.appcompat.widget.o0O0O00 r1 = r7.f2579OooO0o0
            android.view.inputmethod.InputConnection r8 = r1.OooO0o(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.oo0o0Oo.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && OooOooo.o0o0Oo.OooO0o(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = o0000O00.OooO00o(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        OooOooo.o000O000 o000o0o;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 < 31 && OooOooo.o0o0Oo.OooO0o(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i2 >= 31) {
                    o000o0o = new OooOooo.o000(primaryClip, 1);
                } else {
                    o000o0o = new OooOooo.o000O0o(primaryClip, 1);
                }
                if (i != 16908322) {
                    i3 = 1;
                }
                o000o0o.OooO0o(i3);
                OooOooo.o0o0Oo.OooO0oo(this, o000o0o.OooO0o0());
            }
            i3 = 1;
        }
        if (i3 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o00Oo0 o00oo0 = this.f2574OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO0o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o00Oo0 o00oo0 = this.f2574OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO0oO(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00 o00Var = this.f2575OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00 o00Var = this.f2575OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o0000O00.OooO00o.o00O00O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((o0ooOO0.OooOOO0) ((Oooo0oO.o0oOO) this.f2579OooO0o0.f2441OooO0OO).f1509OooO0OO).OooOo0o(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2579OooO0o0.OooO00o(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o00Oo0 o00oo0 = this.f2574OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o00Oo0 o00oo0 = this.f2574OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooOO0(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o00 o00Var = this.f2575OooO0O0;
        o00Var.OooOO0o(colorStateList);
        o00Var.OooO0O0();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o00 o00Var = this.f2575OooO0O0;
        o00Var.OooOOO0(mode);
        o00Var.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00 o00Var = this.f2575OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0oO(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        o0O0O00 o0o0o00;
        if (Build.VERSION.SDK_INT >= 28 || (o0o0o00 = this.f2576OooO0OO) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            o0o0o00.f2441OooO0OO = textClassifier;
        }
    }
}