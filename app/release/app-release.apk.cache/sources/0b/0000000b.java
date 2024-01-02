package OooO0O0;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import o0000.OooOOOO;
import o0000.o00O0O;

/* loaded from: classes.dex */
public final class OooO0OO extends OooO0O0 {
    @Override // OooO0O0.OooO0O0
    public Object OooOOO(Intent intent, int i) {
        boolean z;
        o00O0O o00o0o = o00O0O.f3968OooO00o;
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    if (i2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(Boolean.valueOf(z));
                }
                ArrayList o00O0OOO = OooOOOO.o00O0OOO(stringArrayExtra);
                Iterator it = o00O0OOO.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(OooOOOO.o00O0O0o(o00O0OOO), OooOOOO.o00O0O0o(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new o00000oo.o00O0O(it.next(), it2.next()));
                }
                return OooOOOO.o00O0Oo0(arrayList2);
            }
            return o00o0o;
        }
        return o00o0o;
    }
}