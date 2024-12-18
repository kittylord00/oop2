
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        HashSet<String> names = new HashSet<>();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введіть імена студентів: ");
//
//        while(true){
//            String name = scanner.nextLine();
//            if(names.size() == 4){
//                break;
//            }
//            names.add(name);
//        }
//        System.out.println("Кількість унікальні імен: " + names.size());
//        System.out.println("Унікальні імена" + names);


        //task 2
//        LinkedHashSet<String> names = new LinkedHashSet<>();
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("Введіть імена студентів: ");
//
//        while(true) {
//            String name = scanner.nextLine();
//            if (names.size() == 4) {
//                break;
//            }
//            names.add(name);
//        }
//
//        System.out.println("Список імен в порядку введення");
//        for(String name : names){
//            System.out.println(name);
//        }
//
//        System.out.println("Введіть ваше ім'я ля перевірки наявності в списку: ");
//        String myName = scanner.nextLine();
//        if(names.contains(myName)){
//            System.out.println("Ваше ім'я присутнє в списку");
//        }else{
//            System.out.println("Вашого імені немає в списку");
//        }


        //task 3
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        phoneBook.put("Коля", "0979563614");
        phoneBook.put("Назар", "0734658932");
        phoneBook.put("Віка", "0976519975");
        phoneBook.put("Лєра", "0968665340");
        phoneBook.put("Денис", "0970465593");

        System.out.print("Введіть ім'я для пошуку номера: ");
        String search = scanner.nextLine();
        String phoneNumber = phoneBook.get(search);
        if (phoneNumber == null){
            System.out.println("Абонент не знайдений");
        }else{
            System.out.println("Номер телефону контакту " + search + " - " + phoneNumber);
        }

        System.out.println("Введіть ім'я для видалення контакту: ");
        String delete = scanner.nextLine();
        String deleteNumber = phoneBook.remove(delete);
        if (deleteNumber == null){
            System.out.println("Абонент не знайдений");
        }else{
            System.out.println("Видалення контаку " + delete);
        }
        System.out.println("Оновлений список контаків: ");
        for(String key : phoneBook.keySet()){
            String value = phoneBook.get(key);
            System.out.println(key + " - " + value);
        }

    }
}

