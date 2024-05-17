import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;

public class Excepcion54 {
public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("ruta/al/archivo.txt");

            PrintService defaultPrinter = PrintServiceLookup.lookupDefaultPrintService();

            PrintRequestAttributeSet printAttributes = new HashPrintRequestAttributeSet();
            printAttributes.add(new Copies(1)); 

            DocPrintJob printJob = defaultPrinter.createPrintJob();
            Doc doc = new SimpleDoc(fileInputStream, DocFlavor.INPUT_STREAM.AUTOSENSE, null);

            printJob.print(doc, printAttributes);

            System.out.println("Documento impreso correctamente.");
        } catch (PrintException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
