package org.example;

import modles.Actor;
import modles.Movie;
import modles.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Movie film1 = new Movie();
        film1.setTitle("Pulp Fiction");
        film1.setBudget(10.09);
        film1.setCategory('C');
        film1.setRating(100);
        film1.setMovieProzed(true);
        Movie topGun = new Movie("Top",30,'A',60.5,true);
        System.out.println(topGun.getBudget());
        System.out.println(topGun.getRating());
        double l1;
        l1 = film1.getBudget();
        System.out.println(l1);


        Actor tomCruise = new Actor("Tom","Cruise",15,false);
        Actor tomHanks = new Actor("Tom","Hanks",13,true);
        Actor piotrAdamczyk = new Actor("Piotr","Adamczyk",99,false);
        Actor sandraBoolock = new Actor("Sandra","Boolock",8,false);

       Movie avatar = new Movie("Avatar",1,'A',190.3, true);
       Movie ttopGun = new Movie("TopGun",12,'A',190.1,true);
       Movie klan = new Movie("klan",89,'A',190.1,true);
        int rankingTopgana;
        int rankingAvatara;
        int rankingKlanu;

        rankingAvatara = avatar.getRating();
        rankingTopgana = topGun.getRating();
        if (rankingAvatara<11) {
            System.out.println("To jest popularny film");
        }else if(rankingAvatara<51)
        {System.out.println("To nie film");
        }else{
            System.out.println("To nie jest popularny film");
        }
        System.out.println("Salma Hayek");
        System.out.println("Sandra Bullock ujdzie\n");
        System.out.println("Brad Pitt jes super");
        System.out.println("Krawczyk to dobry piosenkarz\n"+"Niemien jest jednak lepszy");


        String jakisText="Angelina Jolie jest ok";
        String jakisInnyText= "Monoroe jest najlepsza";
        System.out.println(jakisText + jakisInnyText);

        int wiek=45;
        int liczba=5;
        System.out.println("Salma Hayek ma "+wiek+" lat.");

        System.out.println(wiek+liczba);
//liczby powinny być jako int by się zliczało
        String liczba1 ="45";
        String liczba2="5";
        System.out.println(liczba1+liczba2);

        String liczba3 ="45";
        int liczba4=5;
        int zmienna;
        zmienna = liczba4 + Integer.parseInt(liczba3);
        System.out.println(zmienna);

        var nazwa = "Salma";
        var nazwa1 = true;
        System.out.println(nazwa);
        System.out.println(nazwa1);
        double budget = avatar.getBudget();
        System.out.println(budget);

        Double budzet;
        budzet = avatar.getBudget();
        System.out.println(budzet);

//alt+enter na słowie scanner zeby zaimportować
       // Scanner scanner = new Scanner(System.in);
        //System.out.println("Podaj swoje imię..");
       // String imie = scanner.nextLine();
       // System.out.println("Podaj swoje nazwisko..");
        //String nazwisko = scanner.nextLine();
       // System.out.println("Ile masz lat?");
        //int wiek5 = scanner.nextInt();
        //System.out.println("Witaj "+ imie + nazwisko + " . Bardzo dziękuję za zakup aplikacji." + "Wiem że masz " +wiek5 + " lat.");

        //2 razy shift - wyszukiwarka globalna
        //ctrl+shift+f - wyszukiwarka klas

       //Scanner scanner = new Scanner(System.in);
       // System.out.println("Podaj swoje imię..");
        //String imie = scanner.nextLine();

        //if (imie.equals("Donald"))
       // {
        //    System.out.println("Przykro mi nie znam Cię");
       // }
       // else if (imie.equals("Brad")){
         //   System.out.println("Witaj" + imie + "Miło Cię widzieć");}
        //else {
        //    System.out.println("Cześć " + imie);
       // }
        Person tomekHanks = new Person("Tom","Hanks");
        Person Angelina = new Person("Angelina","Jolie");
        int wynagrodzenieToma= tomekHanks.calculateSalary(30000,4);
        System.out.println("Wynagrodzenie Toma=" + wynagrodzenieToma);
        int wynagrodzenieAngeliny= Angelina.calculateSalary(60000,6);
        System.out.println("Wynagrodzenie Angeliny=" + wynagrodzenieAngeliny);

    }
}