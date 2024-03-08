public class Main {
    public static void main(String[] args) {

        Product[] p = new Product[3];

        p[0] = new Product();
        p[1] = new Product();
        p[2] = new Product();

        p[0].setInfo("Яблоки");
        p[0].setExist(false);
        p[0].setPrice(5);
        WriteInfo.Info(p[0]);

        p[1].setInfo("Бананы", true);
        p[1].setPrice(4);
        WriteInfo.Info(p[1]);

        p[2].setInfo("Абрикосы",true,8);
        //p[2].Print();
        WriteInfo.Info(p[2]);

        System.out.println();
        System.out.println("Суммарная стоимость - " + Product.add1(p) + " рублей.");
        System.out.println("Товаров в наличии - " + Product.add2(p) + ".");
    }
}
