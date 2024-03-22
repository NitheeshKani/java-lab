package Unit3;

class Media {
    String title;
    double price;

    Media(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println(title + " " + price);
    }
}

class Book extends Media {
    int pages;

    Book(String title, double price, int pages) {
        super(title, price);
        this.pages = pages;
    }
    
    void display() {
        System.out.println("Book: " + title + " " + price + " " + pages);
    }
}

class Tape extends Media {
    float time;

    Tape(String title, double price, float time) {
        super(title, price);
        this.time = time;
    }
    
    void display() {
        System.out.println("Tape: " + title + " " + price + " " + time);
    }
}

public class MediaClassEx2 {

    public static void main(String[] args) {

        Book b = new Book("Java", 100, 500);
        b.display();
        Tape t = new Tape("C++", 100, 5.5f);
        t.display();
    }
}
