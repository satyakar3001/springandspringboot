package com.sattu.springApp;

public class dev2forAutowiring {
    private Computer comp;

    public dev2forAutowiring() {
        System.out.println("Dev2 Default Constructor Called");
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public dev2forAutowiring(Computer comp) {
        this.comp = comp;
    }

    public void build() {
        System.out.println("dev2 object created");

        if (comp != null) {
            System.out.println("Dtype of object created is: " + comp.getClass().getSimpleName());
        } else {
            System.out.println("Computer object is null. Please check autowiring.");
        }
    }
}
