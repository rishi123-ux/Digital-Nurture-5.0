package DesignPriciples_and_Patterns.codes.FactoryMethodPatternExample;

public class FactoryDemo {
    public static void main(String[] args) {
        FileDocumentFactory word = new WordDocumentFactory();
        word.displayDocument();

        FileDocumentFactory excel = new ExcelDocumentFactory();
        excel.displayDocument();

        FileDocumentFactory pdf = new PdfDocumentFactory();
        pdf.displayDocument();
    }
}
