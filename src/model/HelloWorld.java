package model;

public class HelloWorld {
    private String hello;
    private String world;

    public HelloWorld() {
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "hello='" + hello + '\'' +
                ", world='" + world + '\'' +
                '}';
    }
}
