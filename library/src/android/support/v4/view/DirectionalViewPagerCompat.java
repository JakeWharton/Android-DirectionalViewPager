package android.support.v4.view;

public final class DirectionalViewPagerCompat {
    private DirectionalViewPagerCompat() {}

    public interface DataSetObserver extends PagerAdapter.DataSetObserver {}

    public static void setDataSetObserver(PagerAdapter adapter, DataSetObserver observer) {
        adapter.setDataSetObserver(observer);
    }
}
