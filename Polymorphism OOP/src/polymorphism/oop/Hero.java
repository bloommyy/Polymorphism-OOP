/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.oop;

/**
 *
 * @author user
 */
public abstract class Hero {
    protected String name;
    
    public Hero(String name)
    {
        this.name = name;
    }
    
    public void move(int len, String d)
    {
        System.out.printf("%s moved %d on %s.\n", this.name, len, d);
    }
    
    public abstract void hit();
    
    
}
