// verbesserte Version der Aufgabe

public class CheckMailTwo {

    public boolean isValidMailadress(String address) {
        // Prüfen, ob die Adresse null oder leer ist
        if (address == null || address.isEmpty()) {
            return false;
        }
        // Prüfen, ob ein @-Zeichen vorhanden ist und es mindestens ein Zeichen davor
        // gibt
        int atIndex = address.indexOf('@');
        if (atIndex <= 0) {
            return false;
        }
        // Prüfen, ob nach dem @-Zeichen ein Punkt vorhanden ist
        int dotIndex = address.indexOf('.', atIndex);
        if (dotIndex == -1 || dotIndex == address.length() - 1) {
            return false;
        }
        // Prüfen, ob zwischen @-Zeichen und Punkt etwas steht
        if (dotIndex - atIndex <= 1) {
            return false;
        }
        // Prüfen, ob nach dem Punkt noch mindestens 2 Zeichen stehen
        if (address.length() - dotIndex <= 2) {
            return false;
        }
        return true;
    }

}
