
package android.support.v4.view;

import android.database.DataSetObserver;

public final class VerticalViewPagerCompat {
    private VerticalViewPagerCompat() {
    }

    public static void setDataSetObserver(PagerAdapter adapter, DataSetObserver observer) {
        adapter.registerDataSetObserver(observer);
    }
}
