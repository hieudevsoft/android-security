package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements ThreadFactory {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ String f2672OooO00o;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f2672OooO00o);
        thread.setPriority(10);
        return thread;
    }
}