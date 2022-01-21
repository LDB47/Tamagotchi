package tamagotchi;

import java.util.Scanner;

/**
 *
 * @author laure
 */
public class TamagotchiMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donnez les caractéristiques du Tamagotchi: (Le nom, l'âge, la couleur, la taille, le poids)");
        Tamagotchi tama = new Tamagotchi();
        String name = scanner.nextLine();
        tama.setName(name);
        int age = scanner.nextInt();
        tama.setAge(age);
        String color = scanner.nextLine();
        tama.setColor(color);
        scanner.nextLine();
        int height = scanner.nextInt();
        tama.setHeight(height);
        int weight = scanner.nextInt();
        tama.setWeight(weight);

        boolean alive = false;
//        System.out.println(alive);
        System.out.println(tama.toString());
        do {
            System.out.println("Quelle action voulez-vous effectuer à votre Tamagotchi? 1 pour dormir, 2 pour manger, 3 pour marcher");
            int choiceUser = scanner.nextInt();
            switch (choiceUser) {
                case 1:
                    tama.sleep();
                    break;
                case 2:
                    tama.eat();
                    break;
                case 3:
                    tama.walk();
                    break;
                default:
                    System.out.println("Choisissez un chiffre correct!");
                    break;
            }
            if (tama.status(alive)) {
                alive = true;
            } else {
                alive = false;
            }
//            System.out.println(alive);
            System.out.println(tama.toString());
        } while (alive);

        System.out.println("C'est la fin!");

    }

}
