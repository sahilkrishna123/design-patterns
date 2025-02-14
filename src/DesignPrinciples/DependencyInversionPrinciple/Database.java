package DesignPrinciples.DependencyInversionPrinciple;

public interface Database {
    void insert();
    void update();
    void delete();
}