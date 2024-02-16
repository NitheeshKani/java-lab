import java.util.ArrayList;

public class App {
    
    public static ArrayList<Integer> findLeapYears(int year){
        int _year = year;
        ArrayList<Integer> leapYears = new ArrayList<>();
        int count = 0;
        while (count < 15){
            if ((_year % 4 == 0 && _year % 100 != 0) || _year % 400 == 0 ) {
                leapYears.add( _year);
                count++;
            }
            _year++;
        }
        return leapYears;
    }
     
    public static void main(String[] args) {
        int year = 2000;
        ArrayList<Integer> leapYears;
        leapYears=findLeapYears(year);
        for ( int index = 0; index<leapYears.size(); index++ ) {
            System.out.println(leapYears.get(index));
        }
     }
}
