package library;

public class Patron {
    private String name;
    private Book []b = new Book[3];
    private int count;
    
    public Patron(String n){
    name =n;
    count = 0;
        for (int i = 0; i < 3; i++) {
            b[i]=null;
        }
    }
    public String getName(){
        return name;    
    }
    public boolean borrow(Book bb){
        if (count <3 && b[count] ==null){
            b[count] = bb;
            count++;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean returnBook(Book bb){
        int i = 0;
        for (int j = 0; j < 3; j++) {
            if (bb == b[j]){
                i=j;
            }
        }
        if (b[i] == bb){
            b[i] = null;
            count--;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean hasBook(Book bb){
        int i = 0;
        for (int j = 0; j < 3; j++) {
            if (bb == b[j]){
                i=j;
            }
        }
        if (b[i] == bb){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
