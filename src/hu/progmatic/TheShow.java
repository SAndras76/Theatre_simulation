package hu.progmatic;

import java.util.Arrays;

    public class TheShow {
    private TheTeam theTeam;
    private ThePlay play;


    private String[] actorOnShow;
   // private String[] role;
    private String actorNames;
        public TheShow(TheTeam theTeam, ThePlay play) {
            this.theTeam = theTeam;
            this.play = play;

        }

        public  void Rehersal() {

            System.out.println("*******ON AIR -ON AIR -ON AIR********\n \n");
            System.out.println(" *********************************\n");
            System.out.println("Title: " + play.getTitle());
            System.out.println("-----------------------------------\n");
            System.out.println("Acting now: " );
            for (String actorNames : actorOnShow) {
                System.out.println(" ** \n" + actorNames);
            }
        }
        private void addRole(){
            int roleCounter = play.getRoleNumber();
            int indexOfActor =0;

            actorOnShow = new String[roleCounter];
            while (roleCounter > 0) {
            addOneRole(roleCounter - 1, theTeam.getActorNames()[indexOfActor]);
            roleCounter--;

            if (indexOfActor == theTeam.getActorNames().length - 1) {
                indexOfActor = 0;
            }else{
                indexOfActor++;
            }
            }
        }
        private void addOneRole(int index, String actorName) {

            actorOnShow[index] = actorName;
        }



    public TheTeam getTheTeam() {
        return theTeam;
    }

    public void setTheTeam(TheTeam theTeam) {
        this.theTeam = theTeam;
    }

    public ThePlay getPlay() {
        return play;
    }

    public void setPlay(ThePlay play) {
        this.play = play;
    }

    public String[] getActorOnShow() {
        return actorOnShow;
    }

    public void setActorOnShow(String[] actorOnShow) {
        this.actorOnShow = actorOnShow;
    }










}


