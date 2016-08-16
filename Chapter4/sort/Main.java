package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String args[]) {

        //ArrayListを生成する
        ArrayList<SyainClass> al = new ArrayList<SyainClass>();

        //Integer型の数値を追加する
        al.add(new SyainClass(1, "太郎"));
        al.add(new SyainClass(5, "次郎"));
        al.add(new SyainClass(3, "三郎"));
        al.add(new SyainClass(9, "四郎"));
        al.add(new SyainClass(7, "五郎"));

        //SyainComparatorクラスの条件に従いソートする
        Collections.sort(al, new SyainComparator());

        //結果を画面表示する
        Iterator<SyainClass> it = al.iterator();
        while (it.hasNext()) {
            SyainClass data = it.next();
            System.out.println(data.getSyainNo() + ":" + data.getSyainName());
        }

    }
}
