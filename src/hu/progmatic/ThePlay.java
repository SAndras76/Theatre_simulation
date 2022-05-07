package hu.progmatic;



public class ThePlay {
    private String author;
    private String title;
    private int partOf;
    private Role roles;

    public ThePlay() {
    }

    public ThePlay(String author, String title, int partOf, Role roles) {
        this.author = author;
        this.title = title;
        this.partOf = partOf;
        this.roles = roles;
    }

    public ThePlay(String horváth_ádám, String szomszédok, int partOf, String[] roles) {
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

    public Role getRoles() {
        return roles;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "ThePlay{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", partOf=" + partOf +
                ", roles=" + roles +
                '}';
    }
}
