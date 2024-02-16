public class Calculator {
    double x,y,z;
    double findAverage(int x, int y , int z){
        this.x = x;
        this.y = y;
        this.z = z;
        double avg = (this.x+this.y+this.z)/3;
        return (Math.round(avg*100.0)/100.0);
    }
}
