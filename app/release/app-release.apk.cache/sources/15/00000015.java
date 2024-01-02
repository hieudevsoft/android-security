package OooO0Oo;

import OooO0OO.OooO00o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class OooOOO0 {

    /* renamed from: OooO  reason: collision with root package name */
    public NestedScrollView f62OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Context f63OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOOOO f64OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Window f65OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public CharSequence f66OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public Button f67OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public AlertController$RecycleListView f68OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public Button f69OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public Button f70OooO0oo;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public Drawable f72OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public ImageView f73OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public TextView f74OooOOO;
    public TextView OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public View f75OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public ListAdapter f76OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public final int f77OooOOo;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public final int f79OooOOoo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public final int f81OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public final int f82OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public final boolean f83OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public final OooOO0 f84OooOo0o;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int f71OooOO0 = 0;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public int f78OooOOo0 = -1;

    /* renamed from: OooOo  reason: collision with root package name */
    public final OooO0OO f80OooOo = new OooO0OO(0, this);

    public OooOOO0(Context context, OooOOOO oooOOOO, Window window) {
        this.f63OooO00o = context;
        this.f64OooO0O0 = oooOOOO;
        this.f65OooO0OO = window;
        this.f84OooOo0o = new OooOO0(oooOOOO);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, OooO00o.f23OooO0o0, R.attr.alertDialogStyle, 0);
        this.f77OooOOo = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f79OooOOoo = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f82OooOo00 = obtainStyledAttributes.getResourceId(7, 0);
        this.f81OooOo0 = obtainStyledAttributes.getResourceId(3, 0);
        this.f83OooOo0O = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        oooOOOO.OooOO0O().OooO0oo(1);
    }

    public static void OooO00o(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup OooO0O0(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}