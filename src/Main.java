import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    int x;
    LoanItem[] currentList;

    x = getUserInputInt("How many items would you like to borrow?");

    currentList = loanList(x);


    System.out.println("You borrowed;");
    for(int i = 0; i < currentList.length; i++){
        System.out.println(currentList[i].toString());
    }
    }

    public static LoanItem[] loanList(int x){
        LoanItem[] loanList = new LoanItem[x];
        String type;
        String title;
        int ID;

        for(int i = 0; i < loanList.length; i++){
            ID = (i + 1);
            System.out.println("Item " + (i + 1));
            do{
                type = getUserInputString("What are you borrowing(a Book or a Video)?");
            }while(!(type.equalsIgnoreCase("book") ^ type.equalsIgnoreCase("video")
                    ^ type.equalsIgnoreCase("v") ^ type.equalsIgnoreCase("b")));



            if(type.equalsIgnoreCase("book") || type.equalsIgnoreCase("b")){
                title = getUserInputString("What is the name of the borrowed book?");
                int pages = getUserInputInt("How many pages long is the book?");
                loanList[i] =  new Book("book", title, ID, pages);}
            else if(type.equalsIgnoreCase("video") || type.equalsIgnoreCase("v")){
                title = getUserInputString("What is the name of the borrowed video?");
                loanList[i] = new Video("video", title, ID);}


            System.out.println();
        }

        return loanList;
    }

    public static int getUserInputInt(String prompt){
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean check = true;
        System.out.println(prompt);
        do{
            if(scanner.hasNextInt()){
                userInput = scanner.nextInt();
                check = false;
            }
            else{
                System.out.println("Wrong input. Try again.");
                scanner.nextLine();
            }

        }while(check);
        return userInput;
    }

    public static String getUserInputString(String prompt){
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println(prompt);
        userInput = scanner.nextLine();

        return userInput;
    }

}


