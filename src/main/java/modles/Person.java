package modles;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // - moje własne metody
    // 2 etapy:
    //1. Co mam robic metoda?
    //wyliczać wynagordzenie aktora
    //stawka * iloscFilmówWRoku
    //jak mam to zrobic

    //deklaracje metody
    public int calculateSalary(int stawka, int iloscFilmow) {
        int rezultat = stawka * iloscFilmow;
        return rezultat;
    }

    public int giveBonus(int rating, int salary) {
        int rezultat;
        if (rating < 11) {
            rezultat = salary * 2;
        } else {
            rezultat = salary;
        }
        return rezultat;
    }

    //używanie
}
