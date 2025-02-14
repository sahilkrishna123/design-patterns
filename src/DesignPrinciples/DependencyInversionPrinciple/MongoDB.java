package DesignPrinciples.DependencyInversionPrinciple;

// Low Level Class

public class MongoDB implements Database {
    @Override
    public void insert() {
        System.out.println("MongoDB: Inserting data...");
        // Actual MongoDB specific insertion logic would go here
    }

    @Override
    public void update() {
        System.out.println("MongoDB: Updating data...");
        // Actual MongoDB specific update logic
    }

    @Override
    public void delete() {
        System.out.println("MongoDB: Deleting data...");
        // Actual MongoDB specific delete logic
    }
}