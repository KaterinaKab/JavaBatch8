package javaclass13;

public class SmartPhone {

    String brand;
    String model;
    String color;
    int storage;
    int phoneNumber;
    String text;

    void call() {
        System.out.println("Calling "+phoneNumber);
    }
    void text() {
        System.out.println(brand+model+" sending text: "+text);
    }
    void pics(){
        System.out.println(brand+" can take a picture");
    }

    public static void main(String[] args) {
        SmartPhone myPhone=new SmartPhone();

        myPhone.brand="iPhone";
        myPhone.model="XS max";
        myPhone.color="Gold";
        myPhone.storage=256;
        myPhone.phoneNumber=987123;
        myPhone.text="Hello";
        myPhone.call();
        myPhone.text();
        myPhone.pics();

    }


}
