
import java.util.*;
public class dz1 {
    public static void main(String[] args) {
        ArrayList<String> tele_number = new ArrayList();

        tele_number.add("111111");
        tele_number.add("222222");
        tele_number.add("333333");
        tele_number.add("444444");
        tele_number.add("555555");

        Map<String, String> spravochnik = new HashMap<>();

        spravochnik.put(tele_number.get(0),  "Иван"); 
        spravochnik.put(tele_number.get(1), "Василий");
        spravochnik.put(tele_number.get(2), "Анатолий");
        spravochnik.put(tele_number.get(3), "Анатолий");
        spravochnik.put(tele_number.get(4), "Евгений");

        for (Map.Entry entry : spravochnik.entrySet()) {
            System.out.println("Тел.: " + entry.getKey() + " Имя: "
                + entry.getValue());
        }
    }
}

