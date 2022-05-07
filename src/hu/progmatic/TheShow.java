package hu.progmatic;

import java.util.Arrays;

public class TheShow {

    private ThePlay play;
    private TheTeam theTeam;

    private String[] actor;
    private String[] role;



    public TheShow() {
    }



    public TheShow(ThePlay play, TheTeam theTeam, String[] actor, String[] role) {
        this.play = play;
        this.theTeam = theTeam;
        this.actor = actor;
        this.role = role;
    }

    public TheShow(ThePlay thePlay, String[] team1, String[] role) {
    }

    public String[] addRole(String[] actor, String[] role) {
        String[] roleOfActors = new String[role.length];
        for (int i = 0; i < roleOfActors.length; i++) {
            roleOfActors[i] = role[i] + " " + getRandomActortoShow(actor);
        }
        return roleOfActors;
    }
    public String getRandomActortoShow(String[] actors) {
        int random = (int) (Math.random()*actors.length);
        return actors[random];
    }
    public void Rehersal() {


        System.out.println(" *********************************\n");
                System.out.println("Title: " + play.getTitle());
        System.out.println("-----------------------------------\n");
        System.out.println("Acting now: " + Arrays.toString(addRole(actor, role)));
        System.out.println("*******ON AIR -ON AIR -ON AIR********\n \n");

    }

    @Override
    public String toString() {
        return "TheShow{" +
                "play=" + play +
                ", theTeam=" + theTeam +
                ", actor=" + Arrays.toString(actor) +
                ", role=" + Arrays.toString(role) +
                '}';
    }

    public ThePlay getPlay() {
        return play;
    }

    public void setPlay(ThePlay play) {
        this.play = play;
    }

    public hu.progmatic.TheTeam getTheTeam() {
        return theTeam;
    }

    public void setTheTeam(hu.progmatic.TheTeam theTeam) {
        this.theTeam = theTeam;
    }

    public String[] getActor() {
        return actor;
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

    public String[] getRole() {
        return role;
    }

    public void setRole(String[] role) {
        this.role = role;
    }
}


