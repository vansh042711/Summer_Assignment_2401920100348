interface LibraryUser {
    void registerAccount(int age);
    void requestBook(String bookType);
}
class KidUser implements LibraryUser {
    int age;
    String bookType;
    @Override
    public void registerAccount(int age) {
        this.age = age;
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }
    @Override
    public void requestBook(String bookType) {
        this.bookType = bookType;
        if(bookType.equals("Kids")){
            System.out.println("Book Issued successfully, return the book within 10 days");
        }
        else{
            System.out.println("Sorry, you are allowed to take only kids books");
        }
    }
}
class AdultUser implements LibraryUser {
    int age;
    String bookType;
    @Override
    public void registerAccount(int age) {
        this.age = age;
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }
    @Override
    public void requestBook(String bookType) {
        this.bookType = bookType;
        if(bookType.equals("Fiction")){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Sorry, you are allowed to take only adult Fiction books");
        }
    } 
}
class LibraryInterfaceDemo {
    public static void main(String args[]) {
        KidUser kid = new KidUser();
        AdultUser adult = new AdultUser();
        kid.registerAccount(10);
        kid.registerAccount(18);
        kid.requestBook("Kids");
        kid.requestBook("Fiction");
        adult.registerAccount(5);
        adult.registerAccount(23);
        adult.requestBook("Kids");
        adult.requestBook("Fiction");
    }
}