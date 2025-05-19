package FactoryMethodDesignPattern.WinMacExample;

public class WinDialog extends Dialog{
    @Override
    public Button createButton(){
        return new WindowsButton();
    }
}
