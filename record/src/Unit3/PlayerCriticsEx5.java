package Unit3;

class PlayerRating {

    int postion;
    String name;
    float avgRating;
    char category;

    PlayerRating(String name, int postion) {
        this.name = name;
        this.postion = postion;
    }

    float CalculateAvgRating(float c1Rating, float c2Rating, float c3Rating) {
        avgRating = (c1Rating + c2Rating + c3Rating) / 3;
        return avgRating;
    }

    float CalculateAvgRating(float c1Rating, float c2Rating) {
        avgRating = (c1Rating + c2Rating) / 2;
        return avgRating;
    }

    char CalculateCategory() {
        if (avgRating > 8) {
            category = 'A';
        } else if (avgRating > 5) {
            category = 'B';
        } else if (avgRating > 0) {
            category = 'C';
        } else {
            category = 'F';
        }
        return category;
    }

}

public class PlayerCriticsEx5 {

    public static void main(String[] args) {
        PlayerRating r1 = new PlayerRating("Sachin", 1);
        System.out.println(r1.CalculateAvgRating(10, 7, 5));
        System.out.println(r1.CalculateCategory());
    }

}
