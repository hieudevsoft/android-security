package androidx.emoji2.text;

import OooO0Oo.o0000OO0;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class OooOO0O extends o0000OO0 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public volatile o00Ooo f2674OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public volatile OooO0o.OooOOO0 f2675OooO0Oo;

    public OooOO0O(OooOo oooOo) {
        super(17, oooOo);
    }

    public final void OooOoo(EditorInfo editorInfo) {
        int i;
        Bundle bundle = editorInfo.extras;
        Oooo0o.o00Ooo o00ooo2 = (Oooo0o.o00Ooo) this.f2675OooO0Oo.f269OooO00o;
        int OooO00o2 = o00ooo2.OooO00o(4);
        if (OooO00o2 != 0) {
            i = ((ByteBuffer) o00ooo2.f1460OooO0Oo).getInt(OooO00o2 + o00ooo2.f1457OooO00o);
        } else {
            i = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
        Bundle bundle2 = editorInfo.extras;
        ((OooOo) this.f183OooO0O0).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0134, code lost:
        if (r5 != false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:7:0x001b, B:10:0x0020, B:12:0x0024, B:14:0x0031, B:19:0x0044, B:21:0x004c, B:23:0x004f, B:25:0x0053, B:27:0x005f, B:28:0x0062, B:30:0x006f, B:33:0x0077, B:38:0x0094, B:45:0x00a2, B:48:0x00ae, B:49:0x00b8, B:51:0x00cd, B:53:0x00d4, B:54:0x00d9, B:56:0x00e4, B:58:0x00ea, B:60:0x00ee, B:62:0x00f4, B:64:0x00f8, B:70:0x0105, B:73:0x0111, B:74:0x0117, B:76:0x012a, B:16:0x0039), top: B:89:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:7:0x001b, B:10:0x0020, B:12:0x0024, B:14:0x0031, B:19:0x0044, B:21:0x004c, B:23:0x004f, B:25:0x0053, B:27:0x005f, B:28:0x0062, B:30:0x006f, B:33:0x0077, B:38:0x0094, B:45:0x00a2, B:48:0x00ae, B:49:0x00b8, B:51:0x00cd, B:53:0x00d4, B:54:0x00d9, B:56:0x00e4, B:58:0x00ea, B:60:0x00ee, B:62:0x00f4, B:64:0x00f8, B:70:0x0105, B:73:0x0111, B:74:0x0117, B:76:0x012a, B:16:0x0039), top: B:89:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012a A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #0 {all -> 0x0141, blocks: (B:7:0x001b, B:10:0x0020, B:12:0x0024, B:14:0x0031, B:19:0x0044, B:21:0x004c, B:23:0x004f, B:25:0x0053, B:27:0x005f, B:28:0x0062, B:30:0x006f, B:33:0x0077, B:38:0x0094, B:45:0x00a2, B:48:0x00ae, B:49:0x00b8, B:51:0x00cd, B:53:0x00d4, B:54:0x00d9, B:56:0x00e4, B:58:0x00ea, B:60:0x00ee, B:62:0x00f4, B:64:0x00f8, B:70:0x0105, B:73:0x0111, B:74:0x0117, B:76:0x012a, B:16:0x0039), top: B:89:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence OooOoo0(java.lang.CharSequence r17, int r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.OooOO0O.OooOoo0(java.lang.CharSequence, int, int, boolean):java.lang.CharSequence");
    }
}