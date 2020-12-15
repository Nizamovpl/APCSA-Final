import java.util.Scanner;
import java.io.*; 

public class Menu{
    boolean run = true; 
    Scanner user = new Scanner(System.in); 
    String name; 

    //file set up
    public void fileSetup(){
        Scanner inUser = new Scanner(System.in); 
        System.out.println("What is your new game name?");
        name = inUser.next() + ".csv";    
        
        try {
            File file = new File(name);

            if (file.createNewFile()) {
              System.out.println("Game has been created");
            } else {
              System.out.println("Please choose a new save name");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        inUser.close();  
    }

    //the big boy of things - the chonkster menu
    public void showMenu(){
        while(run){ 
            System.out.println("Press 1 to create a new game" + "\n" + "press 2 to validate a save" + "\n" + "press 3 to randomize" + "\n" + "press 4 to quit" ); 
            int ans = user.nextInt();

            if(ans == 1){
                run = false; 
                fileSetup();
                //run = true; 
            }else if(ans==2){
                //validate a save
            }else if(ans==3){
                //randomize
            }else if(ans ==4){
                //quit
                System.exit(1); 
            }else{
                System.out.println("please enter a valid input"); 
            }
           
        }
    }
   


}

