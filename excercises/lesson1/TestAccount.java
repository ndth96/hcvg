package excercises.lesson1;

/**
 * 1.6
 */
public class TestAccount {

    public static void main(String[] args) {
        Account thai = new Account("100", "Thai", 4000);
        System.out.println(thai.toString());

        Account thang =  new Account("101", "Thai", 5000);
        System.out.println(thang.toString());

        System.out.println("Credit Thai's Account 2000. Thai' Balance=" + thai.credit(2000));
        System.out.println("\nTransfer Thai to Thang amount 1500. ");

        thai.transferTo(thang, 1500);
        System.out.println(thai.toString());
        System.out.println(thang.toString());

        System.out.println("\nTransfer Thai to Thang amount 6500. ");
        thai.transferTo(thang, 6500);
        System.out.println(thai.toString());
        System.out.println(thang.toString());
    }
}