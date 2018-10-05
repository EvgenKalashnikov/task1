package view;

import model.HelloWorld;

public class View {
    private HelloWorld helloWorld;

    public View(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void wright() {
        System.out.println(helloWorld.getHello()+" "+ helloWorld.getWorld());
    }

}
