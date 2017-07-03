import java.util.Scanner;

public class HomeWork1
{
    public static void main(String[] args)
    {
        int playerHp = 100;
        int monsterHp = 100;
        int playerMp = 0;
        int damageFromMonster = 15;
        int damageFromPlayer = 12;
        int choice;
        Scanner input;
        boolean playing = true;
        while (playing){
            choice = 0;
          System.out.println("You are fighting a goblin!");
          System.out.println("Player Hp : " + playerHp);
          System.out.println("Goblin Hp : " + monsterHp);
          System.out.println("Player Mp : " + playerMp);
          
          //get the user input
          while (choice < 1 || choice > 4 ){
          System.out.println("Combat Options: \n 1.) Sword Attack \n 2.) Cast Spell \n 3.) Charge Mana \n 4.) Run Away");
            try {
              input = new Scanner(System.in);
              choice = input.nextInt();
              
            }
          catch(Exception e){
              System.out.println("Invalid entry");
          }
          }
          if (choice == 1){
              monsterHp = monsterHp - damageFromPlayer;
              playerHp = playerHp - damageFromMonster;
              System.out.println("The player uses Sword Attack! The goblin strikes back!");
          }
          else if (choice == 2){
              if (playerMp >= 3){
              monsterHp = monsterHp /2;
              playerHp = playerHp - damageFromMonster;
              System.out.println("The player Cast Spell! The goblin attacks player!");
              }
              else {
                  playerHp = playerHp - damageFromMonster;
                  System.out.println("Player doesn't have enough Mana to Cast Spell!");
                  System.out.println("Goblin attacks!");
              }
          }
          else if (choice == 3){
              playerMp = playerMp + 3;
              playerHp = playerHp - damageFromMonster;
              System.out.println("The player Charges Mana! The goblin attacks! ");
              
          }
          else if (choice == 4){
              playing = false;
              System.out.println("The player Ran Away!");
          }
          if (monsterHp <= 0){
              System.out.println("The goblin is dead!");
              playing = false; 
              
          }
          if (playerHp <= 0){
              System.out.println("Game over!");
              playing = false;
          }
        }
    }
}