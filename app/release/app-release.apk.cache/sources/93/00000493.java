package com.google.gson.internal.bind;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class OooO0o implements PrivilegedAction {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ Class f3890OooO00o;

    public OooO0o(Class cls) {
        this.f3890OooO00o = cls;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Field[] declaredFields = this.f3890OooO00o.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(fieldArr, true);
        return fieldArr;
    }
}