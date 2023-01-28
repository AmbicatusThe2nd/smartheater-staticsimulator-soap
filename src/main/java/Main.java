import javax.xml.ws.Endpoint;
import services.SmartHome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "http://localhost:8080/SmartHeater";
            Endpoint endpoint = Endpoint.publish(url, new SmartHome());
            System.out.println("Service is available on: " + url);
            Scanner sc = new Scanner(System.in);
            System.out.println("Press an button to stop the service");
            sc.nextLine();
            endpoint.stop();
            System.out.println("Service is not available");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
