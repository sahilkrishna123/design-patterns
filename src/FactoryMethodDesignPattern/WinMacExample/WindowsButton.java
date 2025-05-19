package FactoryMethodDesignPattern.WinMacExample;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Windows button rendered.");
    }

    @Override
    public void onClick(){
        System.out.println("Windows button clicked.");
    }
}
