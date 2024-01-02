package OooOO0o;

/* loaded from: classes.dex */
public class Oooo000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f600OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object[] f601OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f602OooO0OO;

    public Oooo000(int i, int i2) {
        this.f600OooO00o = i2;
        if (i2 != 1) {
            if (i > 0) {
                this.f601OooO0O0 = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else if (i > 0) {
            this.f601OooO0O0 = new Object[i];
        } else {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    public Object OooO00o() {
        int i = this.f600OooO00o;
        Object[] objArr = this.f601OooO0O0;
        switch (i) {
            case 0:
                int i2 = this.f602OooO0OO;
                if (i2 <= 0) {
                    return null;
                }
                int i3 = i2 - 1;
                Object obj = objArr[i3];
                objArr[i3] = null;
                this.f602OooO0OO = i3;
                return obj;
            default:
                int i4 = this.f602OooO0OO;
                if (i4 <= 0) {
                    return null;
                }
                int i5 = i4 - 1;
                Object obj2 = objArr[i5];
                objArr[i5] = null;
                this.f602OooO0OO = i5;
                return obj2;
        }
    }

    public boolean OooO0O0(Object obj) {
        int i;
        boolean z;
        int i2 = this.f600OooO00o;
        Object[] objArr = this.f601OooO0O0;
        switch (i2) {
            case 0:
                int i3 = this.f602OooO0OO;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.f602OooO0OO = i3 + 1;
                return true;
            default:
                int i4 = 0;
                while (true) {
                    i = this.f602OooO0OO;
                    if (i4 < i) {
                        if (objArr[i4] == obj) {
                            z = true;
                        } else {
                            i4++;
                        }
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    if (i >= objArr.length) {
                        return false;
                    }
                    objArr[i] = obj;
                    this.f602OooO0OO = i + 1;
                    return true;
                }
                throw new IllegalStateException("Already in the pool!");
        }
    }
}