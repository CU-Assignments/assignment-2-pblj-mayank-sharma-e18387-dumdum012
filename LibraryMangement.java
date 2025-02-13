import java.util.*;


class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Book 1:");
        System.out.print("Type (Fiction/Non-Fiction): ");
        String type1 = scanner.nextLine();
        System.out.print("Title: ");
        String title1 = scanner.nextLine();
        System.out.print("Author: ");
        String author1 = scanner.nextLine();
        System.out.print("Price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        System.out.println("Book 2:");
        System.out.print("Type (Fiction/Non-Fiction): ");
        String type2 = scanner.nextLine();
        System.out.print("Title: ");
        String title2 = scanner.nextLine();
        System.out.print("Author: ");
        String author2 = scanner.nextLine();
        System.out.print("Price: ");
        double price2 = scanner.nextDouble();

        Book book1 = type1.equalsIgnoreCase("Fiction") ? new Fiction(title1, author1, price1) 
                                                        : new NonFiction(title1, author1, price1);
        Book book2 = type2.equalsIgnoreCase("Fiction") ? new Fiction(title2, author2, price2) 
                                                        : new NonFiction(title2, author2, price2);

        System.out.println();
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();

        scanner.close();
    }
}

// Medium Level: Library Management System
class Book {
    protected String title;
    protected String author;
    protected double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Fiction Class (Derived from Book)
class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
    }
}

// Non-Fiction Class (Derived from Book)
class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayDetails();
    }
}
