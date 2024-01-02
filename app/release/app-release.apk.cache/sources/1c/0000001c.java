package OooO0Oo;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o0000 implements View.OnClickListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final View f92OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final String f93OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Method f94OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Context f95OooO0Oo;

    public o0000(View view, String str) {
        this.f92OooO00o = view;
        this.f93OooO0O0 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id;
        String str;
        Method method;
        if (this.f94OooO0OO == null) {
            View view2 = this.f92OooO00o;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f93OooO0O0;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f94OooO0OO = method;
                            this.f95OooO0Oo = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    if (view2.getId() == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
            }
        }
        try {
            this.f94OooO0OO.invoke(this.f95OooO0Oo, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}