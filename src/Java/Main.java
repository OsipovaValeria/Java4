package Java;

import java.util.List;
import java.util.Scanner;

/**
 * Класс Main для вывода списка, считанного из файла CSV
 * @author Осипова Валерия (3 курс 7 группа)
 */
public class Main {
    public static void main(String[] args) {
        String exit = "";
        do {
            System.out.println("Введите путь к файлу в формате - C:\\...\\file_name.csv");
            Scanner console1 = new Scanner(System.in);
            String filePath = console1.nextLine();
            //String filePath = "C:\\Users\\DNS\\Desktop\\foreign_names.csv";
            try {
                List<Human> HumanList = ReaderCSV.ReaderToCSV(filePath);
                System.out.println(HumanList);
            } catch (Exception exp){
                System.out.println(exp.getMessage());
            }
            System.out.println("\nЧтобы продолжить, нажмите любую клавишу. \nЕсли хотите выйти - a.");
            Scanner console2 = new Scanner(System.in);
            exit = console2.nextLine();
        } while(!exit.equals("a"));
    }
}


