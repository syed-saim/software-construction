package fig1;
import java.util.List;

public class Fig1Demo {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        Dropbox dropbox = new Dropbox();

        // Storage
        amazon.storeFile("report.pdf");
        System.out.println(amazon.getFile("report.pdf"));

        dropbox.storeFile("photo.png");
        System.out.println(dropbox.getFile("photo.png"));

        // Hosting + CDN
        amazon.createServer("us-east-1");
        amazon.createServer("us-east-1");
        List<String> servers = amazon.listServers("us-east-1");
        System.out.println("Amazon servers in us-east-1: " + servers);

        System.out.println("Amazon CDN address: " + amazon.getCDNAddress());
    }
}