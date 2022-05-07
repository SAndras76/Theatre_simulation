package hu.progmatic;

import java.util.Arrays;

public class TheTeam {
    private String[] actor;


    public TheTeam(String[] actor) {
        this.actor = actor;
    }



    public void setActor(String[] actor) {
        this.actor = actor;
    }

    public String[] getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return "TheTeam{" +
                "actor=" + Arrays.toString(actor) +
                '}';
    }

    /*static String[] team1 = new String[]{"Brad Pitt", "Gyula", "Laár András",
            "Szászi Móni"};*/
}
