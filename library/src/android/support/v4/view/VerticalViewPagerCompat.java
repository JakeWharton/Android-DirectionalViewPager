package android.support.v4.view;

public final class VerticalViewPagerCompat {
    private VerticalViewPagerCompat() {}

    public interface DataSetObserver extends PagerAdapter.DataSetObserver {}

    public static void setDataSetObserver(PagerAdapter adapter, DataSetObserver observer) {
        adapter.setDataSetObserver(observer);
    }
}
