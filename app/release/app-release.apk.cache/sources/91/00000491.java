package com.google.gson.internal.bind;

import com.google.gson.OooOo;
import com.google.gson.OooOo00;
import com.google.gson.Oooo0;
import com.google.gson.o000oOoO;
import com.google.gson.o0OoOo0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import o0000Ooo.OooOOO;

/* loaded from: classes.dex */
public final class OooO0O0 extends OooOOO {

    /* renamed from: OooOOOO  reason: collision with root package name */
    public static final OooO00o f3874OooOOOO = new OooO00o();

    /* renamed from: OooOOOo  reason: collision with root package name */
    public static final o0OoOo0 f3875OooOOOo = new o0OoOo0("closed");

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final ArrayList f3876OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public OooOo f3877OooOOO;
    public String OooOOO0;

    public OooO0O0() {
        super(f3874OooOOOO);
        this.f3876OooOO0o = new ArrayList();
        this.f3877OooOOO = Oooo0.f3762OooO00o;
    }

    @Override // o0000Ooo.OooOOO
    public final void OooOoO() {
        o000oOoO o000oooo = new o000oOoO();
        OoooO00(o000oooo);
        this.f3876OooOO0o.add(o000oooo);
    }

    @Override // o0000Ooo.OooOOO
    public final void OooOoO0() {
        OooOo00 oooOo00 = new OooOo00();
        OoooO00(oooOo00);
        this.f3876OooOO0o.add(oooOo00);
    }

    @Override // o0000Ooo.OooOOO
    public final void OooOoo() {
        ArrayList arrayList = this.f3876OooOO0o;
        if (arrayList.isEmpty() || this.OooOOO0 != null) {
            throw new IllegalStateException();
        }
        if (!(Oooo() instanceof o000oOoO)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // o0000Ooo.OooOOO
    public final void OooOoo0() {
        ArrayList arrayList = this.f3876OooOO0o;
        if (arrayList.isEmpty() || this.OooOOO0 != null) {
            throw new IllegalStateException();
        }
        if (!(Oooo() instanceof OooOo00)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // o0000Ooo.OooOOO
    public final void OooOooO(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f3876OooOO0o.isEmpty() || this.OooOOO0 != null) {
            throw new IllegalStateException();
        }
        if (!(Oooo() instanceof o000oOoO)) {
            throw new IllegalStateException();
        }
        this.OooOOO0 = str;
    }

    public final OooOo Oooo() {
        ArrayList arrayList = this.f3876OooOO0o;
        return (OooOo) arrayList.get(arrayList.size() - 1);
    }

    @Override // o0000Ooo.OooOOO
    public final void Oooo0(double d) {
        if (!this.f4418OooO0o0 && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        OoooO00(new o0OoOo0(Double.valueOf(d)));
    }

    @Override // o0000Ooo.OooOOO
    public final OooOOO Oooo000() {
        OoooO00(Oooo0.f3762OooO00o);
        return this;
    }

    @Override // o0000Ooo.OooOOO
    public final void Oooo0O0(long j) {
        OoooO00(new o0OoOo0(Long.valueOf(j)));
    }

    @Override // o0000Ooo.OooOOO
    public final void Oooo0OO(Boolean bool) {
        if (bool == null) {
            OoooO00(Oooo0.f3762OooO00o);
        } else {
            OoooO00(new o0OoOo0(bool));
        }
    }

    @Override // o0000Ooo.OooOOO
    public final void Oooo0o(String str) {
        if (str == null) {
            OoooO00(Oooo0.f3762OooO00o);
        } else {
            OoooO00(new o0OoOo0(str));
        }
    }

    @Override // o0000Ooo.OooOOO
    public final void Oooo0o0(Number number) {
        if (number == null) {
            OoooO00(Oooo0.f3762OooO00o);
            return;
        }
        if (!this.f4418OooO0o0) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        OoooO00(new o0OoOo0(number));
    }

    @Override // o0000Ooo.OooOOO
    public final void Oooo0oO(boolean z) {
        OoooO00(new o0OoOo0(Boolean.valueOf(z)));
    }

    public final void OoooO00(OooOo oooOo) {
        if (this.OooOOO0 != null) {
            if (!(oooOo instanceof Oooo0) || this.f4420OooO0oo) {
                ((o000oOoO) Oooo()).f3938OooO00o.put(this.OooOOO0, oooOo);
            }
            this.OooOOO0 = null;
        } else if (this.f3876OooOO0o.isEmpty()) {
            this.f3877OooOOO = oooOo;
        } else {
            OooOo Oooo2 = Oooo();
            if (Oooo2 instanceof OooOo00) {
                ((OooOo00) Oooo2).f3761OooO00o.add(oooOo);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // o0000Ooo.OooOOO, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f3876OooOO0o;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f3875OooOOOo);
    }

    @Override // o0000Ooo.OooOOO, java.io.Flushable
    public final void flush() {
    }
}