package Java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Класс для считывания данных из файла CSV и их запись в List
 * @author Осипова Валерия (3 курс 7 группа)
 */
public class ReaderCSV {
    /**
     * Метод считывания данных из файла CSV и их запись в List
     * @param filePath - путь к файлу csv
     * @return возвращает список типа Human
     * @throws IOException генерирует исключение, если не удается считать файл
     */
    public static List<Human> ReaderToCSV(String filePath) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        // считываем построчно
        String line;
        Scanner scanner;
        List<Human> HumanList = new ArrayList<>();
        line = reader.readLine();
        while ((line = reader.readLine()) != null) {
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            try {
                int id = scanner.nextInt();
                String name = scanner.next();
                String gender = scanner.next();
                String birthDate = scanner.next();
                Division division = new Division(scanner.next());
                int salary = scanner.nextInt();
                Human human = new Human(id, name, gender, birthDate, division, salary);

                HumanList.add(human);
            } catch (Exception exp){
                throw new Exception("Файл не формата CSV или данные некорректны'!");
            }
        }
        reader.close();
        if (HumanList.isEmpty())
            throw new Exception("Файл пуст!");
        return HumanList;
    }
}
