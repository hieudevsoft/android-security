package androidx.fragment.app;

import OoooOOO.o0OO000o;
import OoooOOO.oo0oO0;
import OoooOOO.oo0ooO;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hieubui.eup.android_app_security.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class o00Oo0 implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.o00Ooo, androidx.lifecycle.o0000O, androidx.lifecycle.OooOOO0, oo0ooO {

    /* renamed from: OoooO0  reason: collision with root package name */
    public static final Object f2949OoooO0 = new Object();

    /* renamed from: OooO  reason: collision with root package name */
    public int f2950OooO;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Bundle f2952OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public SparseArray f2953OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Bundle f2954OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public Bundle f2955OooO0o;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public o00Oo0 f2957OooO0oO;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean f2960OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public boolean f2961OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public boolean f2962OooOOO;
    public boolean OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public boolean f2963OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public boolean f2964OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public o0000oo f2965OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public int f2966OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public o00oO0o f2967OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public String f2968OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public o00Oo0 f2969OooOo0;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public int f2971OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public int f2972OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public boolean f2973OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public boolean f2974OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public boolean f2975OooOoOO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public boolean f2976OooOoo;

    /* renamed from: OooOooO  reason: collision with root package name */
    public ViewGroup f2978OooOooO;

    /* renamed from: OooOooo  reason: collision with root package name */
    public View f2979OooOooo;

    /* renamed from: Oooo  reason: collision with root package name */
    public oo0oO0 f2980Oooo;

    /* renamed from: Oooo0  reason: collision with root package name */
    public boolean f2981Oooo0;

    /* renamed from: Oooo000  reason: collision with root package name */
    public boolean f2982Oooo000;

    /* renamed from: Oooo00o  reason: collision with root package name */
    public o0OoOo0 f2984Oooo00o;

    /* renamed from: Oooo0O0  reason: collision with root package name */
    public float f2985Oooo0O0;

    /* renamed from: Oooo0OO  reason: collision with root package name */
    public boolean f2986Oooo0OO;

    /* renamed from: Oooo0o  reason: collision with root package name */
    public androidx.lifecycle.o00oO0o f2987Oooo0o;

    /* renamed from: Oooo0oO  reason: collision with root package name */
    public o000OO00 f2989Oooo0oO;

    /* renamed from: OoooO00  reason: collision with root package name */
    public final ArrayList f2991OoooO00;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f2951OooO00o = -1;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public String f2956OooO0o0 = UUID.randomUUID().toString();

    /* renamed from: OooO0oo  reason: collision with root package name */
    public String f2958OooO0oo = null;

    /* renamed from: OooOO0  reason: collision with root package name */
    public Boolean f2959OooOO0 = null;

    /* renamed from: OooOo00  reason: collision with root package name */
    public o0000oo f2970OooOo00 = new o0000oo();

    /* renamed from: OooOoo0  reason: collision with root package name */
    public final boolean f2977OooOoo0 = true;

    /* renamed from: Oooo00O  reason: collision with root package name */
    public boolean f2983Oooo00O = true;

    /* renamed from: Oooo0o0  reason: collision with root package name */
    public androidx.lifecycle.Oooo000 f2988Oooo0o0 = androidx.lifecycle.Oooo000.RESUMED;

    /* renamed from: Oooo0oo  reason: collision with root package name */
    public final androidx.lifecycle.o0OO00O f2990Oooo0oo = new androidx.lifecycle.o0OO00O();

    public o00Oo0() {
        new AtomicInteger();
        this.f2991OoooO00 = new ArrayList();
        this.f2987Oooo0o = new androidx.lifecycle.o00oO0o(this);
        this.f2980Oooo = o0ooOO0.OooOOO0.OooO0o0(this);
    }

    public final Context OooO() {
        o00oO0o o00oo0o = this.f2967OooOOoo;
        if (o00oo0o == null) {
            return null;
        }
        return o00oo0o.f2994OoooOO0;
    }

    @Override // OoooOOO.oo0ooO
    public final o0OO000o OooO0O0() {
        return this.f2980Oooo.f1576OooO0O0;
    }

    @Override // androidx.lifecycle.o0000O
    public final androidx.lifecycle.o000OO OooO0OO() {
        if (this.f2965OooOOo != null) {
            if (OooOO0() != 1) {
                HashMap hashMap = this.f2965OooOOo.f2896Oooo00o.f2853OooO0o0;
                androidx.lifecycle.o000OO o000oo = (androidx.lifecycle.o000OO) hashMap.get(this.f2956OooO0o0);
                if (o000oo == null) {
                    androidx.lifecycle.o000OO o000oo2 = new androidx.lifecycle.o000OO();
                    hashMap.put(this.f2956OooO0o0, o000oo2);
                    return o000oo2;
                }
                return o000oo;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public o0000O00.OooO00o OooO0Oo() {
        return new o000oOoO(this);
    }

    public final o0OoOo0 OooO0o() {
        if (this.f2984Oooo00o == null) {
            this.f2984Oooo00o = new o0OoOo0();
        }
        return this.f2984Oooo00o;
    }

    public final void OooO0o0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        View view;
        View view2;
        int i5;
        int i6;
        int i7;
        int i8;
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2971OooOo0O));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2972OooOo0o));
        printWriter.print(" mTag=");
        printWriter.println(this.f2968OooOo);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2951OooO00o);
        printWriter.print(" mWho=");
        printWriter.print(this.f2956OooO0o0);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2966OooOOo0);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2960OooOO0O);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2961OooOO0o);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.OooOOO0);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2962OooOOO);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f2974OooOoO0);
        printWriter.print(" mDetached=");
        printWriter.print(this.f2973OooOoO);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f2977OooOoo0);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f2975OooOoOO);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f2983Oooo00O);
        if (this.f2965OooOOo != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2965OooOOo);
        }
        if (this.f2967OooOOoo != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2967OooOOoo);
        }
        if (this.f2969OooOo0 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2969OooOo0);
        }
        if (this.f2955OooO0o != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2955OooO0o);
        }
        if (this.f2952OooO0O0 != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2952OooO0O0);
        }
        if (this.f2953OooO0OO != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2953OooO0OO);
        }
        if (this.f2954OooO0Oo != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2954OooO0Oo);
        }
        o00Oo0 o00oo0 = this.f2957OooO0oO;
        if (o00oo0 == null) {
            o0000oo o0000ooVar = this.f2965OooOOo;
            if (o0000ooVar != null && (str2 = this.f2958OooO0oo) != null) {
                o00oo0 = o0000ooVar.OooOoO(str2);
            } else {
                o00oo0 = null;
            }
        }
        if (o00oo0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(o00oo0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2950OooO);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        o0OoOo0 o0oooo0 = this.f2984Oooo00o;
        if (o0oooo0 == null) {
            z = false;
        } else {
            z = o0oooo0.f3022OooO0OO;
        }
        printWriter.println(z);
        o0OoOo0 o0oooo02 = this.f2984Oooo00o;
        if (o0oooo02 == null) {
            i = 0;
        } else {
            i = o0oooo02.f3023OooO0Oo;
        }
        if (i != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            o0OoOo0 o0oooo03 = this.f2984Oooo00o;
            if (o0oooo03 == null) {
                i8 = 0;
            } else {
                i8 = o0oooo03.f3023OooO0Oo;
            }
            printWriter.println(i8);
        }
        o0OoOo0 o0oooo04 = this.f2984Oooo00o;
        if (o0oooo04 == null) {
            i2 = 0;
        } else {
            i2 = o0oooo04.f3025OooO0o0;
        }
        if (i2 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            o0OoOo0 o0oooo05 = this.f2984Oooo00o;
            if (o0oooo05 == null) {
                i7 = 0;
            } else {
                i7 = o0oooo05.f3025OooO0o0;
            }
            printWriter.println(i7);
        }
        o0OoOo0 o0oooo06 = this.f2984Oooo00o;
        if (o0oooo06 == null) {
            i3 = 0;
        } else {
            i3 = o0oooo06.f3024OooO0o;
        }
        if (i3 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            o0OoOo0 o0oooo07 = this.f2984Oooo00o;
            if (o0oooo07 == null) {
                i6 = 0;
            } else {
                i6 = o0oooo07.f3024OooO0o;
            }
            printWriter.println(i6);
        }
        o0OoOo0 o0oooo08 = this.f2984Oooo00o;
        if (o0oooo08 == null) {
            i4 = 0;
        } else {
            i4 = o0oooo08.f3026OooO0oO;
        }
        if (i4 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            o0OoOo0 o0oooo09 = this.f2984Oooo00o;
            if (o0oooo09 == null) {
                i5 = 0;
            } else {
                i5 = o0oooo09.f3026OooO0oO;
            }
            printWriter.println(i5);
        }
        if (this.f2978OooOooO != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f2978OooOooO);
        }
        if (this.f2979OooOooo != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f2979OooOooo);
        }
        o0OoOo0 o0oooo010 = this.f2984Oooo00o;
        if (o0oooo010 == null) {
            view = null;
        } else {
            view = o0oooo010.f3020OooO00o;
        }
        if (view != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            o0OoOo0 o0oooo011 = this.f2984Oooo00o;
            if (o0oooo011 == null) {
                view2 = null;
            } else {
                view2 = o0oooo011.f3020OooO00o;
            }
            printWriter.println(view2);
        }
        if (OooO() != null) {
            OooOO0.OooOo00 oooOo00 = ((OoooO0.o00oO0o) new androidx.activity.result.OooO0o(OooO0OO(), OoooO0.o00oO0o.f1550OooO0Oo, 0).OooO0oO(OoooO0.o00oO0o.class)).f1551OooO0OO;
            if (oooOo00.f546OooO0OO > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                if (oooOo00.f546OooO0OO > 0) {
                    OooO0O0.OooO00o.OooO0oO(oooOo00.f545OooO0O0[0]);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(oooOo00.f544OooO00o[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2970OooOo00 + ":");
        this.f2970OooOo00.OooOo0(OooO0O0.OooO00o.OooO0OO(str, "  "), fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.lifecycle.o00Ooo
    public final androidx.lifecycle.o00oO0o OooO0oO() {
        return this.f2987Oooo0o;
    }

    public final o0000oo OooO0oo() {
        if (this.f2967OooOOoo != null) {
            return this.f2970OooOo00;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final int OooOO0() {
        androidx.lifecycle.Oooo000 oooo000 = this.f2988Oooo0o0;
        return (oooo000 == androidx.lifecycle.Oooo000.INITIALIZED || this.f2969OooOo0 == null) ? oooo000.ordinal() : Math.min(oooo000.ordinal(), this.f2969OooOo0.OooOO0());
    }

    public final o0000oo OooOO0O() {
        o0000oo o0000ooVar = this.f2965OooOOo;
        if (o0000ooVar != null) {
            return o0000ooVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Object OooOO0o() {
        Object obj;
        o0OoOo0 o0oooo0 = this.f2984Oooo00o;
        if (o0oooo0 == null || (obj = o0oooo0.f3030OooOO0o) == f2949OoooO0) {
            return null;
        }
        return obj;
    }

    public final Object OooOOO() {
        Object obj;
        o0OoOo0 o0oooo0 = this.f2984Oooo00o;
        if (o0oooo0 == null || (obj = o0oooo0.OooOOO0) == f2949OoooO0) {
            return null;
        }
        return obj;
    }

    public final Object OooOOO0() {
        Object obj;
        o0OoOo0 o0oooo0 = this.f2984Oooo00o;
        if (o0oooo0 == null || (obj = o0oooo0.f3029OooOO0O) == f2949OoooO0) {
            return null;
        }
        return obj;
    }

    public final boolean OooOOOO() {
        o00Oo0 o00oo0 = this.f2969OooOo0;
        if (o00oo0 != null && (o00oo0.f2961OooOO0o || o00oo0.OooOOOO())) {
            return true;
        }
        return false;
    }

    public void OooOOOo(Context context) {
        Activity activity;
        this.f2976OooOoo = true;
        o00oO0o o00oo0o = this.f2967OooOOoo;
        if (o00oo0o == null) {
            activity = null;
        } else {
            activity = o00oo0o.f2993OoooO;
        }
        if (activity != null) {
            this.f2976OooOoo = true;
        }
    }

    public View OooOOo(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void OooOOo0(Bundle bundle) {
        boolean z;
        Parcelable parcelable;
        this.f2976OooOoo = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f2970OooOo00.Oooo(parcelable);
            o0000oo o0000ooVar = this.f2970OooOo00;
            o0000ooVar.f2888OooOoOO = false;
            o0000ooVar.f2890OooOoo0 = false;
            o0000ooVar.f2896Oooo00o.f2855OooO0oo = false;
            o0000ooVar.OooOOoo(1);
        }
        o0000oo o0000ooVar2 = this.f2970OooOo00;
        if (o0000ooVar2.f2876OooOOOO >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            o0000ooVar2.f2888OooOoOO = false;
            o0000ooVar2.f2890OooOoo0 = false;
            o0000ooVar2.f2896Oooo00o.f2855OooO0oo = false;
            o0000ooVar2.OooOOoo(1);
        }
    }

    public void OooOOoo() {
        this.f2976OooOoo = true;
    }

    public void OooOo() {
        this.f2976OooOoo = true;
    }

    public LayoutInflater OooOo0(Bundle bundle) {
        o00oO0o o00oo0o = this.f2967OooOOoo;
        if (o00oo0o != null) {
            o0ooOOo o0ooooo = o00oo0o.f2996OoooOOo;
            LayoutInflater cloneInContext = o0ooooo.getLayoutInflater().cloneInContext(o0ooooo);
            cloneInContext.setFactory2(this.f2970OooOo00.f2868OooO0o);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void OooOo00() {
        this.f2976OooOoo = true;
    }

    public abstract void OooOo0O(Bundle bundle);

    public void OooOo0o() {
        this.f2976OooOoo = true;
    }

    public void OooOoO(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2970OooOo00.Oooo0OO();
        boolean z = true;
        this.f2964OooOOOo = true;
        this.f2989Oooo0oO = new o000OO00(OooO0OO());
        View OooOOo2 = OooOOo(layoutInflater, viewGroup);
        this.f2979OooOooo = OooOOo2;
        if (OooOOo2 != null) {
            this.f2989Oooo0oO.OooO0o0();
            View view = this.f2979OooOooo;
            o000OO00 o000oo00 = this.f2989Oooo0oO;
            o0000O00.OooO00o.OooOoo0(view, "<this>");
            view.setTag(R.id.view_tree_lifecycle_owner, o000oo00);
            View view2 = this.f2979OooOooo;
            o000OO00 o000oo002 = this.f2989Oooo0oO;
            o0000O00.OooO00o.OooOoo0(view2, "<this>");
            view2.setTag(R.id.view_tree_view_model_store_owner, o000oo002);
            View view3 = this.f2979OooOooo;
            o000OO00 o000oo003 = this.f2989Oooo0oO;
            o0000O00.OooO00o.OooOoo0(view3, "<this>");
            view3.setTag(R.id.view_tree_saved_state_registry_owner, o000oo003);
            this.f2990Oooo0oo.OooO0o0(this.f2989Oooo0oO);
            return;
        }
        if (this.f2989Oooo0oO.f2927OooO0O0 == null) {
            z = false;
        }
        if (!z) {
            this.f2989Oooo0oO = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void OooOoO0(Bundle bundle) {
        this.f2976OooOoo = true;
    }

    public final void OooOoOO() {
        boolean z;
        this.f2970OooOo00.OooOOoo(1);
        if (this.f2979OooOooo != null) {
            o000OO00 o000oo00 = this.f2989Oooo0oO;
            o000oo00.OooO0o0();
            if (o000oo00.f2927OooO0O0.f3092OooO0OO.compareTo(androidx.lifecycle.Oooo000.CREATED) >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f2989Oooo0oO.OooO0Oo(androidx.lifecycle.OooOo.ON_DESTROY);
            }
        }
        this.f2951OooO00o = 1;
        this.f2976OooOoo = false;
        OooOOoo();
        if (this.f2976OooOoo) {
            OooOO0.OooOo00 oooOo00 = ((OoooO0.o00oO0o) new androidx.activity.result.OooO0o(OooO0OO(), OoooO0.o00oO0o.f1550OooO0Oo, 0).OooO0oO(OoooO0.o00oO0o.class)).f1551OooO0OO;
            if (oooOo00.f546OooO0OO <= 0) {
                this.f2964OooOOOo = false;
                return;
            } else {
                OooO0O0.OooO00o.OooO0oO(oooOo00.f545OooO0O0[0]);
                throw null;
            }
        }
        throw new o00O000o("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public final View OooOoo() {
        View view = this.f2979OooOooo;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final Context OooOoo0() {
        Context OooO2 = OooO();
        if (OooO2 != null) {
            return OooO2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final void OooOooO(int i, int i2, int i3, int i4) {
        if (this.f2984Oooo00o == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        OooO0o().f3023OooO0Oo = i;
        OooO0o().f3025OooO0o0 = i2;
        OooO0o().f3024OooO0o = i3;
        OooO0o().f3026OooO0oO = i4;
    }

    public final void OooOooo(Bundle bundle) {
        boolean z;
        o0000oo o0000ooVar = this.f2965OooOOo;
        if (o0000ooVar != null) {
            if (!o0000ooVar.f2888OooOoOO && !o0000ooVar.f2890OooOoo0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f2955OooO0o = bundle;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f2976OooOoo = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        o0ooOOo o0ooooo;
        o00oO0o o00oo0o = this.f2967OooOOoo;
        if (o00oo0o == null) {
            o0ooooo = null;
        } else {
            o0ooooo = (o0ooOOo) o00oo0o.f2993OoooO;
        }
        if (o0ooooo != null) {
            o0ooooo.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f2976OooOoo = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f2956OooO0o0);
        if (this.f2971OooOo0O != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2971OooOo0O));
        }
        if (this.f2968OooOo != null) {
            sb.append(" tag=");
            sb.append(this.f2968OooOo);
        }
        sb.append(")");
        return sb.toString();
    }
}