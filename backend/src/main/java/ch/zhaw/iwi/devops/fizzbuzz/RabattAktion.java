package ch.zhaw.iwi.devops.fizzbuzz;

public class RabattAktion {

    public String convert (int i) {
        if (i < 5) {
            return "Kein Mengenrabatt erhalten";
        } else if ( i == 5 || i > 5 && i < 10 ) {
            return "1 % Mengenrabatt erhalten";
        } else if ( i == 10 || i > 10 && i < 15 ) {
            return "2 % Mengenrabatt erhalten";
        } else if ( i == 15 || i > 15 && i < 20 ) {
            return "3 % Mengenrabatt erhalten";
        } else if ( i == 20 || i > 20 && i < 25 ) {
            return "4 % Mengenrabatt erhalten";
        } else if ( i == 25 || i > 25 && i < 30 ) {
            return "5 % Mengenrabatt erhalten";
        } else if ( i == 30 || i > 30 && i < 35 ) {
            return "6 % Mengenrabatt erhalten";
        } else if ( i == 35 || i > 35 && i < 40 ) {
            return "7 % Mengenrabatt erhalten";
        } else if ( i == 40 || i > 40 && i < 45 ) {
            return "8 % Mengenrabatt erhalten";
        } else if ( i == 45 || i > 45 && i < 50 ) {
            return "9 % Mengenrabatt erhalten";
        } else if ( i == 50 || i > 50 && i < 55 ) {
            return "10 % Mengenrabatt erhalten";
        } else if ( i > 100) {
            return "Menge nicht bestellbar";
        return String.valueOf(i);
    }
}

