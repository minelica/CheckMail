public class CheckMail {

    String address;

    public static void main(String[] args) {
        isValidMailAddress("name@server.de");
    }

    public static boolean isValidMailAddress(String address) {
        char atSign = '@';
        char dot = '.';
        int indexOfAtSign = address.indexOf(atSign, 0);
        int indexOfdot = address.indexOf(dot, indexOfAtSign);

        if ((address.substring(0, indexOfAtSign).length() > 0) && (indexOfAtSign < indexOfdot)
                && (address.substring(indexOfAtSign, indexOfdot).length() - 1 > 1) && (address.length() > 0)) {
            System.out.println("Die E-Mail Addresse ist gültig.");
            return true;
        } else {
            System.out.println("Die E-Mail Addresse ist ungültig.");
            return false;
        }
    }
}