import controller.Controller;
import service.ReadServiceImpl;
import model.HelloWorld;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ReadServiceImpl p = new ReadServiceImpl(new Scanner(System.in),new HelloWorld());
        Controller controller = new Controller(p);
        controller.doStart();

    }

}
