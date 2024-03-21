package Unit2;

class ModSection {
    int[] arr;

    ModSection(int[] arr) {
        this.arr = arr;
    }

    int sum() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    double avg() {
        double avg = sum() / arr.length;
        return avg;
    }
}

public class SectionEx5C {
    public static void main(String[] args) {
        int[] a = {2,-9,0,5,12,-25,22,9,8,12};
        ModSection s = new ModSection(a);
        System.out.println(s.sum());
        System.out.println(s.avg());
    }
}
