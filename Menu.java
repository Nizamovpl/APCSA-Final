import java.util.Scanner; 

public class Menu{
    boolean run = true; 
    Scanner user = new Scanner(System.in); 

    // public static File gameSetup(){
    //     Scanner inUser = new Scanner(System.in); 
    //     System.out.println("What is your new game name?");
    //     String name = inUser.next(); 
    //     File file = new File(name); 
    //     inUser.close();  
    //     return file; 
    // }
    public void showMenu(){
        while(run){ 
            System.out.println("Press 1 to create a new game" + "\n" + "press 2 to validate a save" + "\n" + "press 3 to randomize" + "\n" + "press 4 to quit" ); 
            int ans = user.nextInt();

            if(ans == 1){
                //gameSetup();
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

