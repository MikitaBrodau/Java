package aggregation;

public interface ClientsAccountManage {
    void getPosBalance();
    void getNegBalance();
    void getAllCardBalance();
    void sortCardsByBalance();
    void searchByBalanceInterval(int min,int max);
    void searchByValueType(String type);
}
