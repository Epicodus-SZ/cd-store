import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args){
    // console object so we can collect data from user
    Console myConsole = System.console();

    //escape out of app tracker
    Boolean exit = false;

    //create our CD data
    List<Cd> inventory = new ArrayList<Cd>();
    Cd cd1 = new Cd("Pink Floyd","Darkside of the Moon",1973,33);
    Cd cd2 = new Cd("The Beatles","Sgt. Pepper's Lonely Hearts Club Band",1969,29);
    Cd cd3 = new Cd("Led Zeppelin","Led Zeppelin IV (aka ZOSO)",1981,25);
    Cd cd4 = new Cd("The Beatles","Abbey Road",1972,23);
    Cd cd5 = new Cd("Michael Jackson","Thriller",1990,14);
    Cd cd6 = new Cd("Nirvana","Nevermind",1993,17);

    inventory.add(cd1); //add to inventory
    inventory.add(cd2); //add to inventory
    inventory.add(cd3); //add to inventory
    inventory.add(cd4); //add to inventory
    inventory.add(cd5); //add to inventory
    inventory.add(cd6); //add to inventory

    //String intName, String intAlbum,int intReleaseYear, int intPrice
    System.out.println(inventory.get(2).album);

   //running while loop
   while(!exit){
     System.out.println("Commands:\n(C) Create a CD\n(L) List all CD's\n(R) Search by Release year\n(P) Search by price\n(A) Search by artist\n(exit) to end");
     String choice = myConsole.readLine();

     if (choice.equals("exit")) {
       exit = true;
     } else if (choice.equals("L")){
       for (Cd eachCd : inventory){
         System.out.println("Album: " + eachCd.album + ", " + eachCd.artist);
       }

     }

   } // end of while loop

  }
}
