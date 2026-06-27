package DesignPriciples_and_Patterns.codes.FactoryMethodPatternExample;

public class WordDocumentFactory extends FileDocumentFactory {

    public Document createDocument() {
        return new WordDocument();
    }
}
