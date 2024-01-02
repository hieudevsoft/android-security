package o0000oOo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o000O0Oo implements InvocationHandler {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final List f4765OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f4766OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public String f4767OooO0OO;

    public o000O0Oo(ArrayList arrayList) {
        this.f4765OooO00o = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        OooO00o.OooOoo0(obj, "proxy");
        OooO00o.OooOoo0(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (OooO00o.OooOOO0(name, "supports") && OooO00o.OooOOO0(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (OooO00o.OooOOO0(name, "unsupported") && OooO00o.OooOOO0(Void.TYPE, returnType)) {
            this.f4766OooO0O0 = true;
            return null;
        }
        boolean OooOOO0 = OooO00o.OooOOO0(name, "protocols");
        List list = this.f4765OooO00o;
        if (OooOOO0) {
            if (objArr.length == 0) {
                return list;
            }
        }
        if ((OooO00o.OooOOO0(name, "selectProtocol") || OooO00o.OooOOO0(name, "select")) && OooO00o.OooOOO0(String.class, returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                OooO00o.OooOoO0(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list2 = (List) obj2;
                int size = list2.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list2.get(i);
                        OooO00o.OooOoO0(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!list.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f4767OooO0OO = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) list.get(0);
                this.f4767OooO0OO = str2;
                return str2;
            }
        }
        if ((OooO00o.OooOOO0(name, "protocolSelected") || OooO00o.OooOOO0(name, "selected")) && objArr.length == 1) {
            Object obj4 = objArr[0];
            OooO00o.OooOoO0(obj4, "null cannot be cast to non-null type kotlin.String");
            this.f4767OooO0OO = (String) obj4;
            return null;
        }
        return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
    }
}