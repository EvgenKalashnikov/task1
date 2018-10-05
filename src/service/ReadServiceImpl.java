package service;

import model.HelloWorld;

import java.util.Scanner;

public class ReadServiceImpl implements ReadService {
    private Scanner scanner;
    private HelloWorld helloWorld;

    public ReadServiceImpl(Scanner scanner, HelloWorld helloWorld) {
        this.scanner = scanner;
        this.helloWorld = helloWorld;
    }

    public String read() {
        String token;
        while (true) {
            token = scanner.nextLine();
            if (token.equalsIgnoreCase("hello") || token.equalsIgnoreCase("world"))
                break;
        }
        return token;
    }



    @Override
    public HelloWorld createModel(String s) {
        while (true) {
            if (helloWorld.getHello() == null) {
                if (s.equalsIgnoreCase("hello")) {
                    helloWorld.setHello(s);
                    s=read();
                } else
                    s=read();
            } else {
                if (s.equalsIgnoreCase("world")) {
                    helloWorld.setWorld(s);
                    break;
                }
                else
                    s=read();
            }
        }
        return helloWorld;
    }

}
