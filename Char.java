import java.util.Random;

public class Char{

    private int strength,toughness,intelligence, magic, influence; 
    private String charName, charType; 
    
    private int total = 0; 
    Random random = new Random(); 
    //constructur

    public Char(String charName, String charType){
       this.charName = charName; 
       this.charType = charType; 
    }   

    //setter
    public void random(String charType){
        if(charType == "Peasant"){

            while(total <= 28 && total > 8){
                toughness = random.nextInt(3) + 7;
                strength = random.nextInt(6);
                intelligence = random.nextInt(6);
                magic = random.nextInt(6);
                influence = random.nextInt(6);
            }
          
        }else if(charType == "Knight"){

            while(total <= 28 && total > 8){
                strength = random.nextInt(3) + 7;
                toughness = random.nextInt(6);
                intelligence = random.nextInt(6);
                magic = random.nextInt(6);
                influence = random.nextInt(6);
            }  

        }else if(charType == "Cleric"){
            while(total <= 28 && total > 8){
                intelligence = random.nextInt(3) + 7;
                toughness = random.nextInt(6);
                magic = random.nextInt(6);
                strength = random.nextInt(6);
                influence = random.nextInt(6);
            }  
        }else if(charType == "Mage"){
            while(total <= 28 && total > 8){
                magic = random.nextInt(3) + 7;
                toughness = random.nextInt(6);
                intelligence = random.nextInt(6);
                strength = random.nextInt(6);
                influence = random.nextInt(6);
            }
        }else if(charType == "Courtier"){
            while(total <= 28 && total > 8){
                influence= random.nextInt(3) + 7;
                toughness = random.nextInt(6);
                intelligence = random.nextInt(6);
                strength = random.nextInt(6);
                magic = random.nextInt(6);
            }
         
        }else{
            System.out.println("404 Error: please rerun code"); 
        } 
    } 

    public String toString() {
        return charType + "," + charName + "," + strength + "," + toughness + ","+ intelligence + "," + magic + "," + influence ;
    }
}

// Knight - Strength
// Peasant - Toughness
// Cleric - Intelligence
// Mage - Magic
// Courtier - Influence
