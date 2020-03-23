package FactoryMethod;

public interface IFactoryMethod {

    IFactoryMethodBranch create();

    IFactoryMethodBranch create(String selectedBranch);
}
