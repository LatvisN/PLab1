public class Product {
    private String name;
    private boolean exist;
    private int price;

    public static float add1(Product[] array) {
        float sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 = sum1 + array[i].price;
        }
        return sum1;
    }
    public static int add2(Product[] array) {
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].exist){
                sum2 = sum2 + 1;
            }
        }
        return sum2;
    }
    public void setInfo(String name){
        this.name = name;
    }
    public void setInfo(String name, boolean exist){
        this.name = name;
        this.exist = exist;
    }
    public void setInfo(String name, boolean exist, int price){
        this.name = name;
        this.exist = exist;
        this.price = price;
    }
    public void setExist(boolean exist){
        this.exist = exist;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public boolean isExist() {
        return exist;
    }
    public int getPrice() {
        return price;
    }

    //public void Print() {
      //  System.out.println();
        //System.out.println("Название продукта: " + name + ".");
        //if(exist){
          //  System.out.println("Есть в наличии.");
        //}else{
          //  System.out.println("Нет в наличии.");
        //}
        //System.out.println("Цена: " + price + " рублей.");
    //}
}
