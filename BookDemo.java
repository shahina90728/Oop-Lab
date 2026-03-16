class Publisher {
    String pname;

    Publisher(String pname) {
        this.pname = pname;
    }
}

class Book extends Publisher {
    String bname;
    double price;

    Book(String pname, String bname, double price) {
        super(pname);
        this.bname = bname;
        this.price = price;
    }
}

class Literature extends Book {

    Literature(String pname, String bname, double price) {
        super(pname, bname, price);
    }

    void display() {
        System.out.println("Literature Book");
        System.out.println("Publisher: " + pname);
        System.out.println("Book Name: " + bname);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {

    Fiction(String pname, String bname, double price) {
        super(pname, bname, price);
    }

    void display() {
        System.out.println("Fiction Book");
        System.out.println("Publisher: " + pname);
        System.out.println("Book Name: " + bname);
        System.out.println("Price: " + price);
    }
}

public class BookDemo {
    public static void main(String[] args) {

        Literature l = new Literature("DC Books", "Malayalam Poems", 250);
        Fiction f = new Fiction("Penguin", "Harry Potter", 500);

        l.display();
        f.display();
    }
}
