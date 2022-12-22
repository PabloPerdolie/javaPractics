package Practice04_1.num_2;

import java.util.Scanner;

public class Phone {

    String number;
    String model;
    String weight;
    Phone(String number, String model, String weight)
    {
        this(number, model);
        this.weight = weight;
    }
    Phone(String number, String model)
    {
        this.number = number;
        this.model = model;
        weight = "no info";
    }
    Phone()
    {
        number = "no info";
        model = "no info";
        weight = "no info";
    }
    public void receiveCall(String name)
    {
        System.out.printf(name + "is calling");
    }

    public void receiveCall(String name, String number)
    {
        receiveCall(name);
        System.out.printf(" " + number);
    }

    public String getNumber() { return number; }

    public void sendMessage(String ... nums)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message that u want to send: ");
        String message = sc.next();
        System.out.println("U send the message for: ");
        for(String num : nums)
            System.out.println(num);
    }
}
