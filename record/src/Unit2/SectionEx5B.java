package Unit2;


class Section {
    int[] arr;
    Section(int[] arr) {
        this.arr = arr;
    }
    void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
public class SectionEx5B {
    public static void main(String[] args) {
        int[] a = {33,4,5};
        Section s = new Section(a);
        s.display();
    }
}
