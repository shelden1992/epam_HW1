package org.courses.part6;

public class HelloDependence {
    private HelloIndependence helloIndependence;


    public HelloDependence(HelloIndependence helloIndependence) {
        this.helloIndependence = helloIndependence;
    }

    public static void main(String[] args) {
        System.out.println(new HelloDependence(new HelloIndependence()).sayDependenceHello("Hello from dependence"));

    }

    public HelloIndependence getHelloIndependence() {
        return helloIndependence;
    }

    public void setHelloIndependence(HelloIndependence helloIndependence) {
        this.helloIndependence = helloIndependence;
    }

    public String sayDependenceHello(String str) {
        if (str.isEmpty()) {

            throw new IllegalArgumentException("String is empty");


        }
        return helloIndependence.sayIndependencyHello(str);
    }
}