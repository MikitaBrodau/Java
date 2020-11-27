package classes;

import java.util.List;

public interface DataBase <T> {
    void addIn_DB(Object obj);

    List<T> get_DB();

    void sortBy_FirstCondition(Object obj);

    void sortBy_SecondCondition(Object obj);

    void sortBy_ThirdCondition(Object obj);

    void sortBy_TwoConditions(Object o1, Object o2);
}
