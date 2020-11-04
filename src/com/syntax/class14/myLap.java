package com.syntax.class14;

public class myLap {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.make="Mac";
        laptop.model="pro 16";
        laptop.storage=1;
        laptop.RAMCapacity=16;
        laptop.color="pink";
        laptop.processor="Core i7";
        laptop.GPU="Nvidia RTX 12GB DDR6x";
        laptop.playMovies();
        laptop.browseInternet();
        laptop.makeVideoCall("Mike");
        String model = laptop.getModel();
        System.out.println(model);
        System.out.println(laptop.getRAMCapacity());
        System.out.println(laptop.upgradeRam(1));
    }
}
