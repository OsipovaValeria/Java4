package Java;
/**
 * Класс Main для вывода списка, считанного из файла CSV
 * @author Осипова Валерия (3 курс 7 группа)
 */
public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\DNS\\Desktop\\foreign_names1.csv";
        try {
            System.out.println(ReaderCSV.ReaderToCSV(filePath));
        } catch (Exception exp){
            System.out.println(exp.getMessage());
        }
    }
}


