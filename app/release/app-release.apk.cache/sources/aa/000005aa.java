package o0000Oo;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o0000O00.OooO00o;
import o0OO00O.OooO0OO;

/* loaded from: classes.dex */
public final class o0OO00O {

    /* renamed from: OooO  reason: collision with root package name */
    public final boolean f4307OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0OoOo0 f4308OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooO0OO f4309OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ArrayList f4310OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final ArrayList f4311OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final boolean f4312OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final Oooo00o.OooOO0 f4313OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final OooO f4314OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final boolean f4315OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final o000oOoO f4316OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final o00O0O f4317OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final Proxy f4318OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final OooO f4319OooOOO;
    public final ProxySelector OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public final SocketFactory f4320OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public final SSLSocketFactory f4321OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public final List f4322OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final X509TrustManager f4323OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public final List f4324OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public int f4325OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public final OooOOO f4326OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public final HostnameVerifier f4327OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public final com.google.gson.internal.OooO0o f4328OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public int f4329OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public int f4330OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public int f4331OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public final int f4332OooOoOO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public final OooO0OO f4333OooOoo;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public final long f4334OooOoo0;

    public o0OO00O() {
        this.f4308OooO00o = new o0OoOo0();
        this.f4309OooO0O0 = new OooO0OO(9);
        this.f4310OooO0OO = new ArrayList();
        this.f4311OooO0Oo = new ArrayList();
        OooOoo.o0ooOOo o0ooooo = OooOoo.o0ooOOo.f1225OooO;
        byte[] bArr = o0000OoO.OooOO0O.f4403OooO00o;
        this.f4313OooO0o0 = new Oooo00o.OooOO0(o0ooooo);
        this.f4312OooO0o = true;
        OooOoo.o0ooOOo o0ooooo2 = OooO.f4167OooO00o;
        this.f4314OooO0oO = o0ooooo2;
        this.f4315OooO0oo = true;
        this.f4307OooO = true;
        this.f4316OooOO0 = o000oOoO.f4284OooO0O0;
        this.f4317OooOO0O = o00O0O.f4285OooO0OO;
        this.f4319OooOOO = o0ooooo2;
        SocketFactory socketFactory = SocketFactory.getDefault();
        OooO00o.OooOoOO(socketFactory, "getDefault()");
        this.f4320OooOOOO = socketFactory;
        this.f4322OooOOo = oo0o0Oo.f4355OooOooo;
        this.f4324OooOOoo = oo0o0Oo.f4354OooOooO;
        this.f4327OooOo00 = o000.OooO0OO.f3950OooO00o;
        this.f4326OooOo0 = OooOOO.f4192OooO0OO;
        this.f4325OooOo = 10000;
        this.f4331OooOoO0 = 10000;
        this.f4330OooOoO = 10000;
        this.f4334OooOoo0 = 1024L;
    }

    public o0OO00O(oo0o0Oo oo0o0oo) {
        this();
        this.f4308OooO00o = oo0o0oo.f4357OooO00o;
        this.f4309OooO0O0 = oo0o0oo.f4358OooO0O0;
        o0000.OooOo.o00O0Oo(oo0o0oo.f4359OooO0OO, this.f4310OooO0OO);
        o0000.OooOo.o00O0Oo(oo0o0oo.f4360OooO0Oo, this.f4311OooO0Oo);
        this.f4313OooO0o0 = oo0o0oo.f4362OooO0o0;
        this.f4312OooO0o = oo0o0oo.f4361OooO0o;
        this.f4314OooO0oO = oo0o0oo.f4363OooO0oO;
        this.f4315OooO0oo = oo0o0oo.f4364OooO0oo;
        this.f4307OooO = oo0o0oo.f4356OooO;
        this.f4316OooOO0 = oo0o0oo.f4365OooOO0;
        this.f4317OooOO0O = oo0o0oo.f4366OooOO0O;
        this.f4318OooOO0o = oo0o0oo.f4367OooOO0o;
        this.OooOOO0 = oo0o0oo.OooOOO0;
        this.f4319OooOOO = oo0o0oo.f4368OooOOO;
        this.f4320OooOOOO = oo0o0oo.f4369OooOOOO;
        this.f4321OooOOOo = oo0o0oo.f4370OooOOOo;
        this.f4323OooOOo0 = oo0o0oo.f4372OooOOo0;
        this.f4322OooOOo = oo0o0oo.f4371OooOOo;
        this.f4324OooOOoo = oo0o0oo.f4373OooOOoo;
        this.f4327OooOo00 = oo0o0oo.f4376OooOo00;
        this.f4326OooOo0 = oo0o0oo.f4375OooOo0;
        this.f4328OooOo0O = oo0o0oo.f4377OooOo0O;
        this.f4329OooOo0o = oo0o0oo.f4378OooOo0o;
        this.f4325OooOo = oo0o0oo.f4374OooOo;
        this.f4331OooOoO0 = oo0o0oo.f4380OooOoO0;
        this.f4330OooOoO = oo0o0oo.f4379OooOoO;
        this.f4332OooOoOO = oo0o0oo.f4381OooOoOO;
        this.f4334OooOoo0 = oo0o0oo.f4383OooOoo0;
        this.f4333OooOoo = oo0o0oo.f4382OooOoo;
    }
}