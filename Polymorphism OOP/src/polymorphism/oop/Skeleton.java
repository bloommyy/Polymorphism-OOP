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
public class Skeleton extends Hero{
    
    public Skeleton(String name)
    {
        super(name);
    }
    
    @Override
    public void hit()
    {
        System.out.println(super.name + " bit the enemy!");
    }
}
