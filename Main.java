

public class Main
{
    Person [] klasse11 = new Person[22];

    public Main()
    {

    }

    public void act()
    {
        klasse11[0] = new Person("Marvin-Joel", "Neufeld","16.06.2006", 16, 1);

        System.out.print("Die Nummer " + (14) + " auf der Klassenliste ist " + klasse11[0].name + " " + klasse11[0].nachname + " , die Person hat am " + klasse11[0].geburtstag + " Geburtstag ist " + klasse11[0].alter + " Jahre alt und hat " + klasse11[0].haustiere + " Haustier.");
        
    }

}
