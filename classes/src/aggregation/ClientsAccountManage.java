package aggregation;

import java.math.BigDecimal;
import java.util.List;

public interface ClientsAccountManage<T> {
    List<T> getPosBalance();
    List<T> getNegBalance();
    double getAllCardBalance();
    void sortCardsByBalance();
    void searchByBalanceInterval(double min, double max);
    void searchByValueType(String type);
}
