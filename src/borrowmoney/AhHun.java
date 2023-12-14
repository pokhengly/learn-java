package borrowmoney;

public class AhHun {

    Chhay chhay = new Chhay();

    public String getMoney() {
        return chhay.getMoney();
    }

    public static void main(String[] args) {
        AhHun ahHun = new AhHun();
        System.out.println("Ah Hun Tooul ban luy chom noun : " + ahHun.getMoney());
    }
}
