package hu.progmatic;
import hu.progmatic.TheShow;
import hu.progmatic.ThePlay;
import hu.progmatic.TheTeam;

import javax.management.relation.Role;

public class Main {

    public static void main(String[] args) {

        //System.out.println();
        String[] actor = {
                "Brad Pitt",
                "Jennifer Lawrence",
                "Gyula",
                "Laár András",
                "Vágási Feri",
                "Szászi Móni"
        };
        TheTeam theTeam = new TheTeam(actor);


        //thePlay show1 = new thePlay("Nepp József","Macskafogó", 3,4);
        ThePlay show2 = new ThePlay("Horváth Ádám", "Szomszédok", 5, role);


        //theShow macskafogo = new theShow("Macskafogó", "theBest",
        //new String[]{"Brad Pitt", "Gyula", "Laár András", "Szászi Móni"});
    }

    static String[] role = {
            "Etus",
            "Magenheim",
            "Vágási Feri",
            "Virág doktor",
            "Taki bá",
            "Gábor Gábor"
    };







}
