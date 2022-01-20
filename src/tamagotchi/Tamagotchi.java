package tamagotchi;

import java.util.Scanner;

/**
 *
 * @author laure
 */
public class Tamagotchi {
    Scanner scanner = new Scanner(System.in);
    
    private String name;
    private int age;
    private int height;
    private double weight;
    private double energy = 10;
    private String color;

    public Tamagotchi() {
    }

    public Tamagotchi(String name, int age, int height, double weight, double energy, String color) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.energy = energy;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        energy -= 2;
        weight += 2;
    }
    
    public void walk() {
        energy -= 5;
        weight -= 1;
    }
    
    public void sleep() {
        energy += 1;
        System.out.println("Voulez-vous que votre Tamagotchi continue de dormir? Entrez oui ou non.");
        String continueSleep = scanner.nextLine();
        if (continueSleep.equals("oui")) {
            energy += 1;
        } else {
            System.out.println("Votre Tamagotchi est réveillé! Il est prêt pour de nouvelles aventures!");
        }
    }
    
    public boolean status(boolean bool) {
        
        if (energy < 0 || energy == 0) {
            energy = 0;
            bool = false;
            System.out.println("Oh no!! Le tamagotchi " + this.name + " est MORT!!! Il n'avait plus d'énergie!");
        } else if (weight > 15) {
            bool = false;
            System.out.println("Oh no!! Le tamagotchi " + this.name + " est MORT!!! Il était obèse!");
        } else {
            bool = true;
        }
        System.out.println(bool);
        return bool;
    }

    @Override
    public String toString() {
        return "Votre tamagotchi s'appelle " + name + ", est de couleur " + 
                color + ", il a " + age + " ans, il mesure " + height + " cm, "
                + "il pèse " + weight + " kg, a " + energy + " d'énergie." + '}';
    }
}
