package controller;

import model.HelloWorld;
import service.ReadService;
import view.View;

public class Controller {
    private ReadService service;

    public Controller(ReadService service) {
        this.service = service;
    }
    public void doStart(){
        HelloWorld model = service.createModel(service.read());
        View view = new View(model);
        view.wright();
    }
}
