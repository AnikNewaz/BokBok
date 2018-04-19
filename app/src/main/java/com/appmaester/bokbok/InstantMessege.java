package your package name here;

/**
 * Created by Nik on 4/18/2018.
 */

public class InstantMessege {
    private String messege;
    private String author;

    public InstantMessege(String messege, String author) {
        this.messege = messege;
        this.author = author;
    }

    public InstantMessege() {
    }

    public String getMessege() {
        return messege;
    }

    public String getAuthor() {
        return author;
    }
}
