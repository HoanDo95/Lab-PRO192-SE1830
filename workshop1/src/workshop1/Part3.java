/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop1;
import java.util.Scanner;
/**
 *
 * @author HOAN DO
 */
public class Part3 {
    public static void main(String[] args) {
        String[] list = new String [10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the list of name: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Học Sinh " + (i+1) + ":");
            String name = sc.nextLine();
            list[i] = name;
        }
        System.out.println("Danh sach sau khi viet hoa: ");
        for (int i = 0; i < 10; i++) {
            String uppercase = list[i].substring(0, 1).toUpperCase();
            String lowercase = list[i].substring(1).toLowerCase();
            list[i]= (uppercase + lowercase);
            System.out.println(list[i]);
        }
    }
}
