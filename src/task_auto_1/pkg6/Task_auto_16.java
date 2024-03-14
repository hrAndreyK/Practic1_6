/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task_auto_1.pkg6;

import java.util.Scanner;

public class Task_auto_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите марку автомобиля: ");
        String brand = scanner.nextLine();
        AutoService car = new AutoService(brand);
        car.modify();
        System.out.println(car.toString());
        System.out.print("Хохлов Андрей РИБО-03-22");
    }
}
