package com.google.gson.internal;

import java.util.Map;

/* loaded from: classes.dex */
public final class Oooo000 implements Map.Entry {

    /* renamed from: OooO  reason: collision with root package name */
    public int f3816OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public Oooo000 f3817OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Oooo000 f3818OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Oooo000 f3819OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Oooo000 f3820OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final Object f3821OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public Oooo000 f3822OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final boolean f3823OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public Object f3824OooO0oo;

    public Oooo000(boolean z) {
        this.f3821OooO0o = null;
        this.f3823OooO0oO = z;
        this.f3822OooO0o0 = this;
        this.f3820OooO0Oo = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f3821OooO0o;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f3824OooO0oo;
            Object value = entry.getValue();
            if (obj3 == null) {
                if (value != null) {
                    return false;
                }
            } else if (!obj3.equals(value)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3821OooO0o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3824OooO0oo;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f3821OooO0o;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3824OooO0oo;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj != null || this.f3823OooO0oO) {
            Object obj2 = this.f3824OooO0oo;
            this.f3824OooO0oo = obj;
            return obj2;
        }
        throw new NullPointerException("value == null");
    }

    public final String toString() {
        return this.f3821OooO0o + "=" + this.f3824OooO0oo;
    }

    public Oooo000(boolean z, Oooo000 oooo000, Object obj, Oooo000 oooo0002, Oooo000 oooo0003) {
        this.f3817OooO00o = oooo000;
        this.f3821OooO0o = obj;
        this.f3823OooO0oO = z;
        this.f3816OooO = 1;
        this.f3820OooO0Oo = oooo0002;
        this.f3822OooO0o0 = oooo0003;
        oooo0003.f3820OooO0Oo = this;
        oooo0002.f3822OooO0o0 = this;
    }
}