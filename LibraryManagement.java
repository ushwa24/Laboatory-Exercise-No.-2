import java.util.Scanner; 

public class LibraryManagement {
    private DynamicArray<String> library; 

    public LibraryManagement() {     
        library = new DynamicArray<>();      
    }     

    public void displayBook(int index) { //mem4 
        String book = library.get(index);
        System.out.println("Book at index " + index + ": " + book); 
    }    

    public void insertBook(int index, String book) { //me5       
        library.insert(index, book);    
        System.out.println("Book inserted at index " + index + ": " + book);    
    }   
                      
    public void removeBook(int index) { //mem3   
        String removedBook = library.get(index);    
        library.remove(index);    
        System.out.println("Book removed: " + removedBook);     
    }    

     public void displayBook(int index) { //mem4 
        String book = library.get(index);
        System.out.println("Book at index " + index + ": " + book); 
    }

    public void displayBook(int index) { //mem4 
        String book = library.get(index);
        System.out.println("Book at index " + index + ": " + book); 
    }

    public static void main(String[] args) { //cj
        LibraryManagement lms = new LibraryManagement();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Insert Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Display Book");
            System.out.println("5. Display Total Books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

  
            }
        }
    }
}

