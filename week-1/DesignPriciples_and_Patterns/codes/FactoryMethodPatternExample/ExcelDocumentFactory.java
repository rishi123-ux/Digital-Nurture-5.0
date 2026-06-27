package DesignPriciples_and_Patterns.codes.FactoryMethodPatternExample;

public class ExcelDocumentFactory extends FileDocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}
