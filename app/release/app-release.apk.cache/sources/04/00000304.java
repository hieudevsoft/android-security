package androidx.appcompat.widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class o0OoO00O implements View.OnLayoutChangeListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2535OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f2536OooO0O0;

    public /* synthetic */ o0OoO00O(int i, Object obj) {
        this.f2535OooO00o = i;
        this.f2536OooO0O0 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f2535OooO00o;
        Object obj = this.f2536OooO0O0;
        switch (i9) {
            case 0:
                SearchView searchView = (SearchView) obj;
                View view2 = searchView.f2157OooOo;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f2154OooOOo.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean OooO00o2 = o0OO0oO0.OooO00o(searchView);
                    int dimensionPixelSize = searchView.f2176Oooo0o ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f2153OooOOOo;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(OooO00o2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
            default:
                ((BottomAppBar$Behavior) obj).getClass();
                throw null;
        }
    }
}