package DesignPrinciples.DependencyInversionPrinciple;

// Low Level Class

public class MySQL implements Database {
    @Override
    public void insert() {
        System.out.println("MySQL: Inserting data...");
        // Actual MySQL specific insertion logic would go here
    }

    @Override
    public void update() {
        System.out.println("MySQL: Updating data...");
        // Actual MySQL specific update logic
    }

    @Override
    public void delete() {
        System.out.println("MySQL: Deleting data...");
        // Actual MySQL specific delete logic
    }
}
