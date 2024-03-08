
public class WriteInfo {
    static void Info(Product p1) {
        System.out.println();
        System.out.println("Название продукта: " + p1.getName() + ".");
        if(p1.isExist()){
            System.out.println("Есть в наличии.");
        }else{
            System.out.println("Нет в наличии.");
        }
        System.out.println("Цена: " + p1.getPrice() + " рублей.");
    }
}
