

public class Person
{
    int alter;
    String name;
    String nachname;
    int haustiere;
    String geburtstag;

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getHaustiere() {
        return haustiere;
    }

    public void setHaustiere(int haustiere) {
        this.haustiere = haustiere;
    }

    public String getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(String geburtstag) {
        this.geburtstag = geburtstag;
    }

    public Person(String pName, String pNachname, String pGeburtstag, int pAlter, int pHaustiere)
    {
       alter = pAlter;
       name = pName;
       nachname = pNachname;
       haustiere = pHaustiere;
       geburtstag = pGeburtstag;
    }

}
