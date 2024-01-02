package o000O000;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o000oOoO implements OooOO0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final oo000o f4841OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOO0 f4842OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f4843OooO0OO;

    public o000oOoO(oo000o oo000oVar) {
        o0000O00.OooO00o.OooOoo0(oo000oVar, "sink");
        this.f4841OooO00o = oo000oVar;
        this.f4842OooO0O0 = new OooOO0();
    }

    @Override // o000O000.OooOO0O
    public final OooOO0O OooO(OooOOO oooOOO) {
        o0000O00.OooO00o.OooOoo0(oooOOO, "byteString");
        if (!this.f4843OooO0OO) {
            this.f4842OooO0O0.OooOooo(oooOOO);
            OooOo();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o000O000.oo000o
    public final o0Oo0oo OooO00o() {
        return this.f4841OooO00o.OooO00o();
    }

    @Override // o000O000.OooOO0O
    public final OooOO0O OooO0O0(byte[] bArr) {
        if (!this.f4843OooO0OO) {
            OooOO0 oooOO0 = this.f4842OooO0O0;
            oooOO0.getClass();
            oooOO0.Oooo000(bArr, 0, bArr.length);
            OooOo();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o000O000.OooOO0O
    public final OooOO0O OooO0OO(int i) {
        if (!this.f4843OooO0OO) {
            this.f4842OooO0O0.Oooo0O0(i);
            OooOo();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o000O000.OooOO0O
    public final OooOO0O OooO0oO(long j) {
        if (!this.f4843OooO0OO) {
            this.f4842OooO0O0.Oooo0(j);
            OooOo();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o000O000.OooOO0O
    public final OooOO0O OooOO0O(String str) {
        o0000O00.OooO00o.OooOoo0(str, "string");
        if (!this.f4843OooO0OO) {
            this.f4842OooO0O0.Oooo0o0(str);
            OooOo();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o000O000.OooOO0O
    public final OooOO0O OooOOOo(int i) {
        if (!this.f4843OooO0OO) {
            this.f4842OooO0O0.Oooo00o(i);
            OooOo();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o000O000.OooOO0O
    public final OooOO0O OooOOo(int i) {
        if (!this.f4843OooO0OO) {
            this.f4842OooO0O0.Oooo0OO(i);
            OooOo();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final OooOO0O OooOo() {
        int i;
        if (!this.f4843OooO0OO) {
            OooOO0 oooOO0 = this.f4842OooO0O0;
            long j = oooOO0.f4823OooO0O0;
            if (j == 0) {
                j = 0;
            } else {
                o00O0O o00o0o = oooOO0.f4822OooO00o;
                o0000O00.OooO00o.OooOo(o00o0o);
                o00O0O o00o0o2 = o00o0o.f4850OooO0oO;
                o0000O00.OooO00o.OooOo(o00o0o2);
                if (o00o0o2.f4846OooO0OO < 8192 && o00o0o2.f4849OooO0o0) {
                    j -= i - o00o0o2.f4845OooO0O0;
                }
            }
            if (j > 0) {
                this.f4841OooO00o.OooOo0(oooOO0, j);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o000O000.oo000o
    public final void OooOo0(OooOO0 oooOO0, long j) {
        o0000O00.OooO00o.OooOoo0(oooOO0, "source");
        if (!(!this.f4843OooO0OO)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f4842OooO0O0.OooOo0(oooOO0, j);
        OooOo();
    }

    public final OooOO0O OooOoO0(byte[] bArr, int i, int i2) {
        o0000O00.OooO00o.OooOoo0(bArr, "source");
        if (!this.f4843OooO0OO) {
            this.f4842OooO0O0.Oooo000(bArr, i, i2);
            OooOo();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o000O000.oo000o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        oo000o oo000oVar = this.f4841OooO00o;
        if (!this.f4843OooO0OO) {
            try {
                OooOO0 oooOO0 = this.f4842OooO0O0;
                long j = oooOO0.f4823OooO0O0;
                if (j > 0) {
                    oo000oVar.OooOo0(oooOO0, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                oo000oVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f4843OooO0OO = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // o000O000.OooOO0O, o000O000.oo000o, java.io.Flushable
    public final void flush() {
        if (!this.f4843OooO0OO) {
            OooOO0 oooOO0 = this.f4842OooO0O0;
            long j = oooOO0.f4823OooO0O0;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            oo000o oo000oVar = this.f4841OooO00o;
            if (i > 0) {
                oo000oVar.OooOo0(oooOO0, j);
            }
            oo000oVar.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4843OooO0OO;
    }

    public final String toString() {
        return "buffer(" + this.f4841OooO00o + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        o0000O00.OooO00o.OooOoo0(byteBuffer, "source");
        if (!this.f4843OooO0OO) {
            int write = this.f4842OooO0O0.write(byteBuffer);
            OooOo();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
}