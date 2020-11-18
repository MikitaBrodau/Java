package classes;

import java.util.Comparator;
import java.util.List;

/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены
по времени отправления.
 */
public class Train implements Comparable<Train> {
    private String destinationPoint;
    private int trainNumber;
    private String dispatchTime;

    public Train(String destinationPoint, int trainNumber, String dispatchTime) {
        this.destinationPoint = destinationPoint;
        this.trainNumber = trainNumber;
        this.dispatchTime = dispatchTime;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getDispatchTime() {
        return dispatchTime;
    }

    public String toString(int n) {
        if (this.trainNumber == n)
            return "trainNumber = " + trainNumber + " Train destinationPoint = " + destinationPoint + " dispatchTime = " + dispatchTime + "\n";
        else return "";
    }

    @Override
    public String toString() {
        return "trainNumber = " + trainNumber + " Train destinationPoint = " + destinationPoint + " dispatchTime = " + dispatchTime + "\n";
    }


    @Override
    public int compareTo(Train train) {
        return train.getTrainNumber() - this.getTrainNumber();
    }

    public static String containsNumber(List<Train> list, final int trainNumber) {
        for (Train o : list) {
            if (o != null && o.trainNumber == trainNumber) {
                return "trainNumber = " + o.trainNumber + " Train destinationPoint = " + o.destinationPoint + "dispatchTime = " + o.dispatchTime + "\n";
            }
        }
        return null;
    }
}

class CompareTrain implements Comparator<Train> {

    @Override
    public int compare(Train o1, Train o2) {
        if (o1.getDestinationPoint().compareTo(o2.getDestinationPoint()) != 0)
            return o1.getDestinationPoint().compareTo(o2.getDestinationPoint());
        else return o1.getDispatchTime().compareTo(o2.getDispatchTime());
    }
}

