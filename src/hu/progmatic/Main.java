package hu.progmatic;
import hu.progmatic.TheShow;
import hu.progmatic.ThePlay;
import hu.progmatic.TheTeam;

import javax.management.relation.Role;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //System.out.println();
        String[] actorNames = {
                "Brad Pitt",
                "Jennifer Lawrence",
                "Gyula",
                "Laár András",
                "Vágási Feri",
                "Szászi Móni"
        };
        TheTeam theTeam = new TheTeam(actorNames);


        //thePlay show1 = new thePlay("Nepp József","Macskafogó", 3,4);
        ThePlay play = new ThePlay("Horváth Ádám", "Szomszédok", 5, 4);


        //theShow macskafogo = new theShow("Macskafogó", "theBest",
        //new String[]{"Brad Pitt", "Gyula", "Laár András", "Szászi Móni"});
        TheShow theShow = new TheShow(theTeam, play);
        theShow.Rehersal();
    }

    /*static String[] role = {
            "Etus",
            "Magenheim",
            "Vágási Feri",
            "Virág doktor",
            "Taki bá",
            "Gábor Gábor"
    };*/









}
