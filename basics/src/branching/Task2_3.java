package branching;

public class Task2_3 {
    public void Task2_3(int x1, int y1, int x2, int y2, int x3, int y3){
        if ((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3)){
            System.out.println("they are on 1 row");
        } else System.out.println("nope they not");
    }

}
