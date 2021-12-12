package Java;
/**
 * Класс сущности Human
 * @author Осипова Валерия (3 курс 7 группа)
 */
public class Human {
    /** Поле id */
    private final int id;
    /** Поле имя */
    private final String name;
    /** Поле пол */
    private final String gender;
    /** Поле дата рождения */
    private final String birthDate;
    /** Поле подразделение */
    private final Division division;
    /** Поле зарплата */
    private final int salary;

    /**
     * Конструктор
     * @param id - id
     * @param name - имя
     * @param gender - пол
     * @param birthDate - дата рождения
     * @param division - подразделение
     * @param salary - зарплата
     */
    public Human(int id, String name, String gender, String birthDate, Division division, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.division = division;
        this.salary = salary;
    }
    /**
     * Метод получения id {@link Human#id}
     * @return возвращает id
     */
    private int getId() {
        return id;
    }
    /**
     * Метод получения имени {@link Human#name}
     * @return возвращает имя
     */
    private String getName() {
        return name;
    }
    /**
     * Метод получения пола {@link Human#gender}
     * @return возвращает пол
     */
    private String getGender() {
        return gender;
    }
    /**
     * Метод получения даты рождения {@link Human#birthDate}
     * @return возвращает дату рождения
     */
    private String getBirthDate() {
        return birthDate;
    }
    /**
     * Метод получения данных о подразделении {@link Human#division}
     * @return возвращает id и название подразделения
     */
    private Division getDivision() {
        return division;
    }
    /**
     * Метод получения зарплаты {@link Human#salary}
     * @return возвращает зарплату
     */
    private int getSalary() {
        return salary;
    }
    /**
     * Переопределение метода toString() для класса Human
     * @return строку с данными о человеке
     */
    @Override
    public String toString(){
        return "\nID = " + getId() + " | Name = " + getName() + " | Gender = " + getGender()
                + " | BirthDate = " + getBirthDate() + getDivision() + " | Salary = " + getSalary();
    }
}
