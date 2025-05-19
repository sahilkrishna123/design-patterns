package FactoryMethodDesignPattern.WinMacExample;

public class MacDialog extends Dialog{
    @Override
    public Button createButton(){
        return new MacButton();
    }
}
