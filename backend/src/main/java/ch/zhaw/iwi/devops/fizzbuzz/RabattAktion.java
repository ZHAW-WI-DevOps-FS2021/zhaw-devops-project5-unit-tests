package ch.zhaw.iwi.devops.fizzbuzz;

public class RabattAktion {

    public String convert (int i) {
        if (i < 5) {
            return "Kein Mengenrabatt erhalten";
        } else {
            return (i / 5) + " % Mengenrabatt erhalten";
        }
    }
}