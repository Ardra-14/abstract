public class Main {
    public static void main(String[] args){
        user u = new user();
        u.browseProduct();
        u.addToCart();
        u.checkOut();
        System.out.println();
        PremiumUser p = new PremiumUser();
        p.payment();
        p.addToCart();
        p.checkOut();
    }
}