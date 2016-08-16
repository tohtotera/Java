package list04_03;

import java.util.ArrayList;
import java.util.List;

class Hero {
	public String name;
}


public class Main {
	public static List<Hero> list = new ArrayList();

    public static void main(String[] args) {
        list = new ArrayList<Hero>();
        Hero h1 = new Hero();
        h1.name = "ミナト";
        list.add(h1);               /* インスタンスを作って格納 */
        System.out.println("要素数=" + list.size());
        h1 = new Hero();
        list.remove(h1);            /* 名前が「ミナト」の勇者を削除 */
        System.out.println("要素数=" + list.size());
    }

    public void remove(Hero h){
    	if (h.name.equals(list.iterator().next().name)){
    		list.remove(h);
    	}
    }

}