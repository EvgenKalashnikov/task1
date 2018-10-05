package service;

import model.HelloWorld;

public interface ReadService {
    String read();
    HelloWorld createModel(String s);
}