import java.util.Scanner;
import java.io.*; 

public class Menu{
    boolean run = true; 
    Scanner user = new Scanner(System.in); 
    String name;
    String charName; 
    String charType; 
    String yesorno; 

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

    public void isEmpty(){
        if (name.length() == 0){
            System.out.println("File is empty");
        } 
    }

    public void isFormatted(){
        Scanner scanner = new Scanner(name);
        Scanner user2 = new Scanner(System.in); 
        String isTerminate; 

        while(){
            
        }        

        while(name.hasNext()){
            if(scanner.nextLine().split(",").length != 7){
                System.out.println("File erronoeus Wiping file.  Press x to abort"); 
                isTerminate = user2.next(); 
                if(isTerminate == "x" ){
                    System.exit(1); 
                }
                FileWriter fw = new FileWriter(name); 
                PrintWriter pw = new PrintWriter(fw); 
                pw.flush();
                pw.close();
                fw.close();
            } 
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
            char1.random(charType);
            charInit();
            Char char2 = new Char(charName, charType); 
            char2.random(charType);
            charInit();
            Char char3 = new Char(charName, charType); 
            char3.random(charType);
            charInit();
            Char char4 = new Char(charName, charType); 
            char4.random(charType);

            String CharStatsTotal = (char1.toString() + "\n" + char2.toString() + "\n" + char3.toString() + "\n" + char4.toString());

            System.out.println(CharStatsTotal); 
            System.out.println("Are you happy with your characters"); 
            yesorno = user.next();
            while(yesorno != "Yes" || yesorno != "No" ){
                System.out.println("plese enter a valid answer - make sure to capatalize the first lettre");
                yesorno = user.next(); 
            }

            while(yesorno != "Yes"){
                char1.random(charType);
                char2.random(charType);
                char3.random(charType);
                char4.random(charType);
                System.out.println("Are you happy with your characters"); 
            }
            if(yesorno == "Yes"){
                try{
                    FileWriter fw = new FileWriter(CharStatsTotal);
                    fw.write(CharStatsTotal);    
                    fw.close();     
                }catch(IOException e){
                    System.out.println("Error");    
                    e.printStackTrace();
                }
            }else{
                System.out.println("Error");  
            } 
        }else if(ans==2){
            isEmpty();
            isFormatted();
        }else if(ans==3){

            //I genuinly have no idea how to solve this error - the internet did not help at all :/
           char1.completeRandom(); 
           char2.completeRandom(); 
           char2.completeRandom();
           char2.completeRandom();
        }else if(ans ==4){
            user.close(); 
            System.out.println("Quitting"); 
            System.exit(1); 
        }else{
            System.out.println("please enter a valid input"); 
        }
         
    }
   


}

