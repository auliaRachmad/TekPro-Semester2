//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Role[] roleList;

        roleList = new Role[8];

        roleList[0] = new Hero("Mike", 10, 20, 500, 1000, 5);
        roleList[1] = new Archer("Sylph", 5, 30, 700, 200, 10);
        roleList[2] = new Mage("Megumin", 5, 40, 800, 100, 100);
        roleList[3] = new Assassin("Jin Woo", 7, 45, 300, 400, 40);
        roleList[4] = new Mage("Silva", 5, 25, 100, 800, 80);
        roleList[5] = new Archer("Tessia", 10, 30, 800, 200, 30);

        Role[] monsterList;

        monsterList = new Role[4];

        monsterList[0] = new DemonLord("Diablo", 20, 10,1000,1000, 10);
        monsterList[1] = new Goblin("Steven", 10, 10, 100, 200, 10);
        monsterList[2] = new Ogre("Balmond", 20, 10, 300, 400);
        monsterList[3] = new Licth("Tusk", 20, 40, 600, 200, 40);

        System.out.println("===============");
        System.out.println("INFO ADVENTURER");
        System.out.println("===============\n");

        for (int i = 0; i < roleList.length - 1; i++){

            if(roleList[i] != null){
                System.out.println(roleList[i]);

                int power = roleList[i].powerTotal();

                System.out.println("Power: "+ power);

                if (power > 300000){
                    System.out.println("Rank : SS");
                } else if (power > 120000){
                    System.out.println("Rank : S");
                }else if (power > 80000){
                    System.out.println("Rank : A");
                }else if (power > 60000){
                    System.out.println("Rank : B");
                }else if (power > 40000){
                    System.out.println("Rank : C");
                }else {
                    System.out.println("Rank : D");
                }
                System.out.println("-------------");
            }else {
                break;
            }
        }

        System.out.println("\n\n===============");
        System.out.println("  INFO MONSTER");
        System.out.println("===============\n");

        for (int i = 0; i < monsterList.length-1; i++){

            if(monsterList[i] != null){
                System.out.println(monsterList[i]);

                int power = monsterList[i].powerTotal();

                System.out.println("Power: "+ power);
                if (power > 300000){
                    System.out.println("Rank : SS");
                } else if (power > 120000){
                    System.out.println("Rank : S");
                }else if (power > 80000){
                    System.out.println("Rank : A");
                }else if (power > 60000){
                    System.out.println("Rank : B");
                }else if (power > 40000){
                    System.out.println("Rank : C");
                }else {
                    System.out.println("Rank : D");
                }
                System.out.println("-------------");
            }else {
                break;
            }
        }

    }
}
