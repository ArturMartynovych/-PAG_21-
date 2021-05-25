package zad3_4;

public class Klient {
    private String name;
    private String surname;
    private Koszyk koszyk;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Koszyk getKoszyk() {
        return koszyk;
    }

    public void setKoszyk(Koszyk koszyk) {
        this.koszyk = koszyk;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Surname:  " + getSurname() + " , Koszyk: " + getKoszyk() ;
    }

    public Klient(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public void hi(){
        System.out.println("\n" + "Hi, my name is " + getName() + " " + getSurname() + "\n");
    }

}
