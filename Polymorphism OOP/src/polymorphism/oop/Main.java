/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.oop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msg, cmdChoice;
        int dist;
        ArrayList<Hero> soldiers = new ArrayList<Hero>();
        soldiers.add(new Zombie("Brand"));
        soldiers.add(new Archer("Varus"));
        soldiers.add(new Skeleton("Cho'Gath"));
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Hero name and what to do (For an example - Brand move):");
        msg = scan.nextLine();
        String[] cmds = msg.split(" ");
        if("Brand".equals(cmds[0]))
        {
            if("hit".equals(cmds[1]))
            {
                soldiers.get(0).hit();
            }else if("move".equals(cmds[1]))
            {
                System.out.print("Enter how much to move and distance (For an example - 5 South):");
                cmdChoice = scan.nextLine();
                String[] moving = cmdChoice.split(" ");
                dist = Integer.parseInt(moving[0]);
                soldiers.get(0).move(dist, moving[1]);
            }
        }else if("Varus".equals(cmds[0]))
        {
            if("hit".equals(cmds[1]))
            {
                soldiers.get(1).hit();
            }else if("move".equals(cmds[1]))
            {
                System.out.print("Enter how much to move and distance (For an example - 5 South):");
                cmdChoice = scan.nextLine();
                String[] moving = cmdChoice.split(" ");
                dist = Integer.parseInt(moving[0]);
                soldiers.get(1).move(dist, moving[1]);
            }
        }else if("Cho'Gath".equals(cmds[0]))
        {
            if("hit".equals(cmds[1]))
            {
                soldiers.get(2).hit();
            }else if("move".equals(cmds[1]))
            {
                System.out.print("Enter how much to move and distance (For an example - 5 South):");
                cmdChoice = scan.nextLine();
                String[] moving = cmdChoice.split(" ");
                dist = Integer.parseInt(moving[0]);
                soldiers.get(2).move(dist, moving[1]);
            }
        }
    }
}
