package FactoryMethodDesignPattern.WinMacExample;

public class MacButton implements Button{
    @Override
    public void render(){
        System.out.println("Mac button rendered.");

    }

    @Override
    public void onClick(){
        System.out.println("Mac button clicked.");

    }
}
