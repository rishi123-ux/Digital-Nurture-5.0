package DesignPriciples_and_Patterns.codes.FactoryMethodPatternExample;

public class ExcelDocument implements Document {
    public void open()
    {
        System.out.println("Excel Document is opening....");
    }
    
}
