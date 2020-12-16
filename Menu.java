import java.util.Scanner;
import java.io.*; 

public class Menu{
    boolean run = true; 
    Scanner user = new Scanner(System.in); 
    String name;
    

    String charName; 
    String charType; 
    // //char names
    // String c1; 
    // String c2; 
    // String c3; 
    // String c4; 

    // //char types
    // String c1Type; 
    // String c2Type; 
    // String c3Type;
    // String c4Type; 

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
              //in the future add warning do you want to over write
            }
        } catch (IOException e) {
            System.out.println("Error:");
            e.printStackTrace();
        }

        try{
            FileWriter fw=new FileWriter(name);
            fw.write(name);    
            fw.close();     
        }catch(IOException e){
            System.out.println("Error");    
            e.printStackTrace();
        }

        inUser.close();  
    }

    public void charInit(){

        //names
        System.out.println("What is your player one's name?");
        charName = user.next();
        

        //types: 
        System.out.println("Which character type do you want?");
        charType = user.next(); 
        
        //if invalid first time
        while(charType != "Peasant" || charType != "Knight" || charType != "Cleric" || charType != "Mage" ||charType != "Courtier"){
            System.out.println("Please enter a valid char type: [Knight, Peasant, Cleric, Mage, Courtier]"); 
            charType = user.next(); 

        }
     
    }

    //the big boy of things - the chonkster menu
    public void showMenu(){
        System.out.println("Press 1 to create a new game" + "\n" + "press 2 to validate a save" + "\n" + "press 3 to randomize" + "\n" + "press 4 to quit" ); 
        int ans = user.nextInt();

        if(ans == 1){
            run = false; 
            fileSetup();
            
            //class initialization of Char
            charInit();
            Char char1 = new Char(charName, charType); 
            charInit();
            Char char2 = new Char(charName, charType); 
            charInit();
            Char char3 = new Char(charName, charType); 
            charInit();
            Char char4 = new Char(charName, charType); 

          

        }else if(ans==2){
            //validate a save
        }else if(ans==3){
            //randomize
        }else if(ans ==4){
            System.exit(1); 
        }else{
            System.out.println("please enter a valid input"); 
        }
         
    }
   


}

