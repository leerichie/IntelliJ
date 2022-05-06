package GroupTwo.PodstawyB1.PodstawyB3;

public class MyShop {
    public static MyOrder[] orders;

    public static void main(String[] args) {
        init();
        filterByClientType(MyClientType.PRIVATE);
    }
    public static void filterByClientType(MyClientType clientType){
        for (MyOrder o : orders){
            if(o.getClientType().equals(clientType)){
                System.out.println(o);
            }
        }
    }

    public static void init(){
        MyOrder o1 = new MyOrder(MyClientType.ENTERPRISE);
        o1.addProduct(new MyProduct("bench", 10, 110.5, Country.FR));
        o1.addProduct(new MyProduct("table", 5, 89.45, Country.GB));

        MyOrder o2 = new MyOrder(MyClientType.PRIVATE);
        o2.addProduct(new MyProduct("apple", 7, 1.5, Country.PL));

        MyOrder o3 = new MyOrder(MyClientType.PRIVATE);
        o3.addProduct(new MyProduct("chair", 2, 210.5, Country.US));
        o3.addProduct(new MyProduct("sofa", 5, 897.05, Country.US));


        orders = new MyOrder[]{o1, o2, o3};
    }


}
