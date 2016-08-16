package list04_09;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("ミナト");
        Sword s = new Sword("はがねの剣");
        System.out.println("装備:" + s.getName());
        System.out.println("clone()で複製します");
        Hero h2 = h1.clone(s);       /* ここで複製 */
        System.out.println("コピー元の勇者の剣の名前を変えます");
        h1.setName("ひのきの棒");
        System.out.println("コピー元とコピー先の勇者の装備を表示します");
        System.out.println("コピー元:" + h1.getName() +
        "/コピー先:" + h2.getName());
    }
}