package hu.progmatic;

import java.util.Arrays;

public class TheTeam {
    private String[] actorNames;


    public TheTeam(String[] actorNames) {
        this.actorNames = actorNames;
    }



    public void setActor(String[] actorNames) {
        this.actorNames = actorNames;
    }

    public String[] getActorNames() {
        return actorNames;
    }

  /*  @Override
    public String toString() {
        return "TheTeam{" +
                "actor=" + Arrays.toString(actor) +
                '}';
    }*/

    /*static String[] team1 = new String[]{"Brad Pitt", "Gyula", "Laár András",
            "Szászi Móni"};*/
}
