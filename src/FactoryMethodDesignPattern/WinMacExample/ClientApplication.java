package FactoryMethodDesignPattern.WinMacExample;

public class ClientApplication {
    public static void main (String[] args){
        Dialog dialog;

        // Dynamically decide what button to use
        dialog = new WinDialog();
        dialog.renderButton();

        dialog = new MacDialog();
        dialog.renderButton();


    }
}
