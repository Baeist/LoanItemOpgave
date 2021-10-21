public class Book extends LoanItem {
    private int pages;

    Book(String type, String title, int ID, int pages){
        super(type, title, ID);
        this.pages = pages;
    }

    @Override
    public String toString(){
        return "ID#" + getID() + ". A " + getType() + " with " + pages + " pages, and with the title: " + getTitle() + ".";
    }
}
