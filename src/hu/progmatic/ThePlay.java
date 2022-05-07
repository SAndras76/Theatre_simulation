package hu.progmatic;



public class ThePlay {
    private String author;
    private String title;
    private int partOf;
    private int roleNumber;

    public ThePlay() {
    }

    public ThePlay(String author, String title, int partOf, int roleNumber) {
        this.author = author;
        this.title = title;
        this.partOf = partOf;
        this.roleNumber = roleNumber;
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPartOf() {
        return partOf;
    }

    public void setPartOf(int partOf) {
        this.partOf = partOf;
    }

    public int getRoleNumber() {
        return roleNumber;
    }

    public void setRoles(Role roles) {
        this.roleNumber = roleNumber;
    }


}
