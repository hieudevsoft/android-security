package androidx.appcompat.view.menu;

import OooO0OO.OooO00o;
import OooO0oO.o00O00OO;
import OooO0oO.o00OO000;
import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.o0oO0O0o;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements o00OO000, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: OooO  reason: collision with root package name */
    public LinearLayout f1999OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public o00O00OO f2000OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public ImageView f2001OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public RadioButton f2002OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public TextView f2003OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public TextView f2004OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public CheckBox f2005OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public ImageView f2006OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public ImageView f2007OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final Drawable f2008OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final int f2009OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final Context f2010OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final Drawable f2011OooOOO;
    public boolean OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public final boolean f2012OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public LayoutInflater f2013OooOOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public boolean f2014OooOOo0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o0oO0O0o OooOOO0 = o0oO0O0o.OooOOO0(getContext(), attributeSet, OooO00o.f32OooOOo, R.attr.listMenuViewStyle);
        this.f2008OooOO0 = OooOOO0.OooO0o0(5);
        this.f2009OooOO0O = OooOOO0.OooO(1, -1);
        this.OooOOO0 = OooOOO0.OooO00o(7, false);
        this.f2010OooOO0o = context;
        this.f2011OooOOO = OooOOO0.OooO0o0(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f2012OooOOOO = obtainStyledAttributes.hasValue(0);
        OooOOO0.OooOOOO();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f2013OooOOOo == null) {
            this.f2013OooOOOo = LayoutInflater.from(getContext());
        }
        return this.f2013OooOOOo;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f2006OooO0oO;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r0 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    @Override // OooO0oO.o00OO000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0Oo(OooO0oO.o00O00OO r11) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.OooO0Oo(OooO0oO.o00O00OO):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2007OooO0oo;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2007OooO0oo.getLayoutParams();
        rect.top = this.f2007OooO0oo.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // OooO0oO.o00OO000
    public o00O00OO getItemData() {
        return this.f2000OooO00o;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        o00O0O0.OooOOo0(this, this.f2008OooOO0);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f2003OooO0Oo = textView;
        int i = this.f2009OooOO0O;
        if (i != -1) {
            textView.setTextAppearance(this.f2010OooOO0o, i);
        }
        this.f2004OooO0o = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f2006OooO0oO = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2011OooOOO);
        }
        this.f2007OooO0oo = (ImageView) findViewById(R.id.group_divider);
        this.f1999OooO = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f2001OooO0O0 != null && this.OooOOO0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2001OooO0O0.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        boolean z2;
        CompoundButton compoundButton;
        View view;
        if (!z && this.f2002OooO0OO == null && this.f2005OooO0o0 == null) {
            return;
        }
        if ((this.f2000OooO00o.f430OooOo & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.f2002OooO0OO == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f2002OooO0OO = radioButton;
                LinearLayout linearLayout = this.f1999OooO;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f2002OooO0OO;
            view = this.f2005OooO0o0;
        } else {
            if (this.f2005OooO0o0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f2005OooO0o0 = checkBox;
                LinearLayout linearLayout2 = this.f1999OooO;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f2005OooO0o0;
            view = this.f2002OooO0OO;
        }
        if (z) {
            compoundButton.setChecked(this.f2000OooO00o.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f2005OooO0o0;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f2002OooO0OO;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        boolean z2;
        CompoundButton compoundButton;
        if ((this.f2000OooO00o.f430OooOo & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.f2002OooO0OO == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f2002OooO0OO = radioButton;
                LinearLayout linearLayout = this.f1999OooO;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f2002OooO0OO;
        } else {
            if (this.f2005OooO0o0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f2005OooO0o0 = checkBox;
                LinearLayout linearLayout2 = this.f1999OooO;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f2005OooO0o0;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f2014OooOOo0 = z;
        this.OooOOO0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f2007OooO0oo;
        if (imageView != null) {
            imageView.setVisibility((this.f2012OooOOOO || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2000OooO00o.f424OooOOO.getClass();
        boolean z = this.f2014OooOOo0;
        if (!z && !this.OooOOO0) {
            return;
        }
        ImageView imageView = this.f2001OooO0O0;
        if (imageView == null && drawable == null && !this.OooOOO0) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f2001OooO0O0 = imageView2;
            LinearLayout linearLayout = this.f1999OooO;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.OooOOO0) {
            this.f2001OooO0O0.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f2001OooO0O0;
        if (!z) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f2001OooO0O0.getVisibility() != 0) {
            this.f2001OooO0O0.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f2003OooO0Oo.setText(charSequence);
            if (this.f2003OooO0Oo.getVisibility() == 0) {
                return;
            }
            textView = this.f2003OooO0Oo;
            i = 0;
        } else {
            i = 8;
            if (this.f2003OooO0Oo.getVisibility() == 8) {
                return;
            }
            textView = this.f2003OooO0Oo;
        }
        textView.setVisibility(i);
    }
}