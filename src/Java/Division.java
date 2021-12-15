package Java;
/**
 * Класс сущности Division
 * @author Осипова Валерия (3 курс 7 группа)
 */
public class Division {
    /** Поле id подразделения */
    private final int id;
    /** Поле название подразделения */
    private final String divName;
    /**
     * Конструктор
     * @param divName - название подразделения
     */
    public Division(String divName) {
        this.id = (int) divName.toCharArray()[0] - (int)'A' + 1;
        this.divName = divName;
    }
    /**
     * Метод получения id подразделения {@link Division#id}
     * @return возвращает id подразделения
     */
    private int getDivID() {
        return this.id;
    }
    /**
     * Метод получения названия подразделения {@link Division#divName}
     * @return возвращает название
     */
    private String getDivName() {
        return this.divName;
    }
    /**
     * Переопределение метода toString() для класса Division
     * @return строка с названием подразделения и его ID
     */
    @Override
    public String toString(){
        return " | DivisionName = " + getDivName() + " | DivisionID = " + getDivID();
    }
}
