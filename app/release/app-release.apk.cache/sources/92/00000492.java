package com.google.gson.internal.bind;

import com.google.gson.OooOOOO;
import com.google.gson.Oooo000;
import com.google.gson.o0OOO0o;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00000o0.o00oO0o;
import o0000Ooo.OooOOO;

/* loaded from: classes.dex */
public final class OooO0OO {

    /* renamed from: OooO  reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f3878OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final String f3879OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Field f3880OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final String f3881OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final boolean f3882OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ boolean f3883OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final boolean f3884OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final /* synthetic */ Method f3885OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final /* synthetic */ boolean f3886OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final /* synthetic */ OooOOOO f3887OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final /* synthetic */ o00oO0o f3888OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final /* synthetic */ boolean f3889OooOO0o;
    public final /* synthetic */ boolean OooOOO0;

    public OooO0OO(String str, Field field, boolean z, boolean z2, boolean z3, Method method, boolean z4, o0OOO0o o0ooo0o, OooOOOO oooOOOO, o00oO0o o00oo0o, boolean z5, boolean z6) {
        this.f3883OooO0o = z3;
        this.f3885OooO0oO = method;
        this.f3886OooO0oo = z4;
        this.f3878OooO = o0ooo0o;
        this.f3887OooOO0 = oooOOOO;
        this.f3888OooOO0O = o00oo0o;
        this.f3889OooOO0o = z5;
        this.OooOOO0 = z6;
        this.f3879OooO00o = str;
        this.f3880OooO0O0 = field;
        this.f3881OooO0OO = field.getName();
        this.f3882OooO0Oo = z;
        this.f3884OooO0o0 = z2;
    }

    public final void OooO00o(OooOOO oooOOO, Object obj) {
        Object obj2;
        if (!this.f3882OooO0Oo) {
            return;
        }
        boolean z = this.f3883OooO0o;
        Field field = this.f3880OooO0O0;
        Method method = this.f3885OooO0oO;
        if (z) {
            if (method == null) {
                ReflectiveTypeAdapterFactory.OooO0O0(obj, field);
            } else {
                ReflectiveTypeAdapterFactory.OooO0O0(obj, method);
            }
        }
        if (method != null) {
            try {
                obj2 = method.invoke(obj, new Object[0]);
            } catch (InvocationTargetException e) {
                throw new Oooo000(OooO0O0.OooO00o.OooO0Oo("Accessor ", o00000Oo.OooO0o.OooO0Oo(method, false), " threw exception"), e.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        oooOOO.OooOooO(this.f3879OooO00o);
        boolean z2 = this.f3886OooO0oo;
        o0OOO0o o0ooo0o = this.f3878OooO;
        if (!z2) {
            o0ooo0o = new TypeAdapterRuntimeTypeWrapper(this.f3887OooOO0, o0ooo0o, this.f3888OooOO0O.f4066OooO0O0);
        }
        o0ooo0o.OooO0OO(oooOOO, obj2);
    }
}