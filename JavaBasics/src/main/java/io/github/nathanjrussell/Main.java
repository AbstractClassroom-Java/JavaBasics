package io.github.nathanjrussell;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cooler mySwapCoolerClass = new Cooler();
        System.out.println(mySwapCoolerClass.getBirthYear());
        mySwapCoolerClass.setBirthYear(2007);
        System.out.println(mySwapCoolerClass.getBirthYear());

    }
}