package aggregation;

import java.util.List;

public interface ClientsAccountManage<T> {
    List<T> getPosBalance();
    List<T> getNegBalance();
    double getAllCardBalance();
    void sortCardsByBalance();
    void searchByBalanceInterval(int min,int max);
    void searchByValueType(String type);
}
