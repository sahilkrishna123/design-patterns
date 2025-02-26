package FactoryMethodDesignPattern;

public class DialogFactory {
}




// Step 1: Define the Product interface
interface Button {
    void render();
    void onClick();
}

// Step 2: Implement Concrete Products
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows-style button.");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button clicked! Performing action...");
    }
}

class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering an HTML button.");
    }

    @Override
    public void onClick() {
        System.out.println("HTML button clicked! Performing action...");
    }
}

// Step 3: Define the Creator (Factory) class
abstract class Dialog {
    // Factory Method
    abstract Button createButton();

    // Business logic using the product
    public void render() {
        Button okButton = createButton(); // Factory Method Call
        okButton.onClick(); // Attach event listener
        okButton.render(); // Render the button
    }
}

// Step 4: Implement Concrete Factories
class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}

class WebDialog extends Dialog {
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}

// Step 5: Application Class to use the Factory
class Application {
    private Dialog dialog;

    public void initialize(String OS) {
        if (OS.equalsIgnoreCase("Windows")) {
            dialog = new WindowsDialog();
        } else if (OS.equalsIgnoreCase("Web")) {
            dialog = new WebDialog();
        } else {
            throw new RuntimeException("Error! Unknown operating system.");
        }
    }

    public void run() {
        dialog.render();
    }

    public static void main(String[] args) {
        Application app = new Application();

        // Simulating user choosing the environment (e.g., Windows or Web)
        String OS = "Windows"; // Change to "Web" to test WebDialog

        app.initialize(OS);
        app.run();
    }
}
