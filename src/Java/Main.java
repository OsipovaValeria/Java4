package Java;

import java.util.List;

/**
 * Класс Main для вывода списка, считанного из файла CSV
 * @author Осипова Валерия (3 курс 7 группа)
 */
public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\DNS\\Desktop\\foreign_names.csv";
        try {
            List<Human> HumanList = ReaderCSV.ReaderToCSV(filePath);
            System.out.println(HumanList);
        } catch (Exception exp){
            System.out.println(exp.getMessage());
        }
    }
}


