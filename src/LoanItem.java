public class LoanItem {
    private String type;
    private String title;
    private int ID;

    LoanItem(String type, String title, int ID){
        this.type = type;
        this.title = title;
        this.ID = ID;
    }

    public String getType(){
        return type;
    }
    public String getTitle(){return title;}
    public int getID(){return ID;}

    public String toString(){
        return "ID#" + ID + ". A " + type + " with the title: " + title + ".";
    }
}
