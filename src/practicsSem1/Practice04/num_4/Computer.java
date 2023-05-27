package practicsSem1.Practice04.num_4;

import java.util.Scanner;

public class Computer {
    Processor processor;
    Memory memory;
    Monitor monitor;
    Brand brand;

    Computer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Specifications of PROCESSOR: \n Enter the frequency and energy consumption: ");
        double proc_freq = sc.nextDouble();
        double proc_energy = sc.nextDouble();
        processor = new Processor(proc_freq, proc_energy);

        System.out.println("Specification of MEMORY: \n Enter the capacity: ");
        int mem_capacity = sc.nextInt();
        memory = new Memory(mem_capacity);

        System.out.println("Specifications of MONITOR: \n Enter the frequency and size: ");
        double mon_freq = sc.nextDouble();
        int mon_size = sc.nextInt();
        monitor = new Monitor(mon_freq, mon_size);

        System.out.println("Enter the BRAND of computer: \n1.Lenovo\n2.HP\n3.Asus\n4.XIAOMI\n5.HONOR");
        int menu = sc.nextInt();
        setBrand(menu);
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
    }

    public void setBrand(int num) {
        switch (num) {
            case 1:
                brand = Brand.LENOVO;
                break;
            case 2:
                brand = Brand.HP;
                break;
            case 3:
                brand = Brand.ASUS;
                break;
            case 4:
                brand = Brand.XIAOMI;
                break;
            case 5:
                brand = Brand.HONOR;
                break;
        }
    }

    enum Brand {
        LENOVO(1), HP(2), ASUS(3), XIAOMI(4), HONOR(5);
        int num;

        Brand(int num) {
            this.num = num;
        }
    }

    private class Processor {
        double frequency;
        double energy_use;

        Processor(double frequency, double energy_use) {
            this.frequency = frequency;
            this.energy_use = energy_use;
        }

        public double getEnergy_use() {
            return energy_use;
        }

        public double getFrequency() {
            return frequency;
        }
    }

    private class Memory {
        int capacity;

        Memory(int capacity) {
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    private class Monitor {
        double frequency;
        int size;

        public Monitor(double frequency, int size) {
            this.frequency = frequency;
            this.size = size;
        }

        public int getSize() {
            return size;
        }

        public double getFrequency() {
            return frequency;
        }
    }
}
