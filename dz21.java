
// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу,
//  которая найдет и выведет повторяющиеся имена с количеством повторений.
//  Отсортировать по убыванию популярности.
import java.util.*;

public class dz21 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Иван");
        list.add("Петр");
        list.add("Антон");
        list.add("Антон");
        list.add("Петр");
        list.add("Петр");
        list.add("Антон");
        list.add("Иван");
        list.add("Евгений");
        list.add("Антон");
        System.out.println(list.toString());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count = count + 1;
                    map.put(list.get(i), count);
                }
            }

        }

        ArrayList<String> valuelist = new ArrayList();

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Имя:" + entry.getKey() + "; Кол-во повторений: "
                    + entry.getValue());
            valuelist.add(entry.getValue().toString());
        }

        valuelist.toArray();
        valuelist.sort(null);
        
        System.out.println(valuelist);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        System.out.println(entryList);




        for (int i = 0; i < valuelist.size(); i++) {

            for (int j = 0; j < entryList.size(); j++) {
                
                String s = entryList.get(j).toString();
                String key = s.substring(s.length() - 1, s.length());
                if (valuelist.get(i).toString().equals(key)) {

                    System.out.println(entryList.get(i));
                }

            }
        }


    }
}
