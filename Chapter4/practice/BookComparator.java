package practice;

import java.util.Comparator;
import java.util.Date;

public class BookComparator implements Comparator<Book>{

    public int compare(Book a, Book b) {
        Date no1 = a.getPublishDate();
        Date no2 = b.getPublishDate();

        //こうすると社員番号の昇順でソートされる
        if (no1.getTime() > no2.getTime()) {
            return 1;

        } else if (no1.getTime() == no2.getTime()) {
            return 0;

        } else {
            return -1;

        }
    }
}
