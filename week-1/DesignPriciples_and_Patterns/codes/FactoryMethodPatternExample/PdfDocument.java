package DesignPriciples_and_Patterns.codes.FactoryMethodPatternExample;

public class PdfDocument implements Document {
    public void open()
    {
        System.out.println("PDF Document is opening....");
    }
}
