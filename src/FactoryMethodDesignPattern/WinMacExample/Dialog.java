package FactoryMethodDesignPattern.WinMacExample;

public abstract class Dialog {
    // Factory Method
    public abstract Button createButton();

    // Business Logic
    public void renderButton(){
        Button button = createButton(); // Factor Method
        button.render();
        button.onClick();
    }
}
