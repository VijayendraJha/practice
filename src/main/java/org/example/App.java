package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    IAdd iAdd;

    public App(IAdd iAdd) {
        this.iAdd = iAdd;
    }

    public int perform(int a, int b)
    {
        return(iAdd.add(a,b)*a);
    }
}
