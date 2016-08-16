package list04_04;

import java.util.HashSet;
import java.util.Set;

class Hero {
	public String name;
    public boolean equals(Object obj) {
    	if (this == obj && obj instanceof HashSet){
    		if (this.name == obj.getClass().getName())
    		return true;
    	}
    	return false;
    }    /* equals()をオーバーライドしている */
}
public class Main {
    public static void main(String[] args) {
        Set<Hero> list = new HashSet<Hero>();       /* HashSetを利用 */
        Hero h1 = new Hero();
        h1.name = "ミナト";
        list.add(h1);                               /* インスタンスを作って格納 */
        System.out.println("要素数=" + list.size());
        h1 = new Hero();
        h1.name = "ミナト";
        list.remove(h1);                            /* 名前が「ミナト」の勇者を削除 */
        System.out.println("要素数=" + list.size());
    }
}