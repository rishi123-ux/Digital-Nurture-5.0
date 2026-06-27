package DesignPriciples_and_Patterns.codes.FactoryMethodPatternExample;

public abstract class FileDocumentFactory {
    public abstract Document createDocument();

    public void displayDocument() {
        Document document = createDocument();
        document.open();
    }
}
