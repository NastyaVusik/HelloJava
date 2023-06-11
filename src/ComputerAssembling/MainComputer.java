package ComputerAssembling;// Task 1. Addition homework

import ComputerAssembling.Computer;
import ComputerAssembling.ComputerHdd;
import ComputerAssembling.ComputerRam;

public class MainComputer {
    public static void main(String[] args) {

        //This object uses fields ComputerAssembling.ComputerRam and ComputerAssembling.ComputerHdd with default constructor
        Computer computer1 = new Computer(600, "Asus F515EA-BQ1993W");

        //??????This object uses fields ComputerAssembling.ComputerRam and ComputerAssembling.ComputerHdd with default constructor. But I'm not sure...
        Computer computer1_0 = new Computer(600, "Asus F515EA-BQ1993W",
                new ComputerRam("Unknown", 0),
                new ComputerHdd("Unknown", 0, "Unknown"));

        //This object uses fields ComputerAssembling.ComputerRam and ComputerAssembling.ComputerHdd with constructor with four parameters
        Computer computer2 = new Computer(1000, "Ноутбук HP ProBook 455 G8",
                new ComputerRam("6189V-1GDDR2 ALLEN-BRADLEY", 1024),
                new ComputerHdd("Toshiba MQ01ABF 500GB", 500, "internal"));


        System.out.println(computer1.getComputerInfo1());                   //I created second getter of info in class ComputerAssembling.Computer. But I think, that itn't convenient
        System.out.println("\n*****************************************\n");
        System.out.println(computer1_0.getComputerInfo());
        System.out.println("\n*****************************************\n");
        System.out.println(computer2.getComputerInfo());

    }
}
