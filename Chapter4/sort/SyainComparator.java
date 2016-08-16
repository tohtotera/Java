package sort;

import java.util.Comparator;

public class SyainComparator implements Comparator<SyainClass>{
    //比較メソッド（データクラスを比較して-1, 0, 1を返すように記述する）
    public int compare(SyainClass a, SyainClass b) {
        int no1 = a.getSyainNo();
        int no2 = b.getSyainNo();

        //こうすると社員番号の昇順でソートされる
        if (no1 > no2) {
            return 1;

        } else if (no1 == no2) {
            return 0;

        } else {
            return -1;

        }
    }

}
