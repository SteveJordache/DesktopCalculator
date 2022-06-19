import java.util.Scanner;

class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public String getDetails() {
        return "title=\"" + title.trim() + "\"";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    // write your code here
    @Override
    public String getDetails() {
        return super.getDetails() + ", source=\"" + this.source.trim() + "\"";

    }

}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    // write your code here
    @Override
    public String getDetails() {
        return super.getDetails() + ", author=\"" + this.author.trim() + "\"";
    }


}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    // write your code here
    @Override
    public String getDetails() {
        return super.getDetails() + ", daysToExpire=" + daysToExpire;

    }

}
/*

class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] inputInfo = inputString.split(";");
        if (inputInfo[0].toLowerCase().equals("publication")) {
            Publication item = new Publication(inputInfo[1]);
            // System.out.println("title=\"" + item.getDetails() + "\"");
            System.out.println(item.getDetails());
        } else if (inputInfo[0].toLowerCase().equals("newspaper")) {
            Newspaper item1 = new Newspaper(inputInfo[1], inputInfo[2]);
            System.out.println(item1.getDetails());
        } else if (inputInfo[0].toLowerCase().equals("article")) {
            Article item2 = new Article(inputInfo[1], inputInfo[2]);
            System.out.println(item2.getDetails());
        } else if (inputInfo[0].toLowerCase().equals("announcement")) {
            Announcement item3 = new Announcement(inputInfo[1], Integer.parseInt(inputInfo[2].trim()));
            System.out.println(item3.getDetails());
        }
    }
}*/
