public class praktik3 {
    static class Book {
    int price;
    int pages;

    // Method untuk mengatur harga dan jumlah halaman buku
    public void set(int price, int pages) {
        this.price = price;
        this.pages = pages;
    }

    // Method untuk menampilkan informasi buku
    public void show() {
        System.out.println("Book Information");
        System.out.println("Book Price: " + price);
        System.out.println("Number of Pages: " + pages);
    }
}

// Kelas utama untuk menjalankan program
public class Buku {
    public static void main(String[] args) {
        Book javaBook = new Book();  
        javaBook.set(60000, 100);
        javaBook.show();            
    }
}

}

