package DesignPriciples_and_Patterns.codes.FactoryMethodPatternExample;

public class PdfDocumentFactory extends FileDocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}
