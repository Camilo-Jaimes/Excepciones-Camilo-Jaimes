import java.io.File;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Excepcion63 {
public static void main(String[] args) {
        String xmlFile = "entrada.xml";
        String xsltFile = "transformacion.xslt";
        String outputFile = "salida.html";

        try {
            transformarXML(xmlFile, xsltFile, outputFile);
            System.out.println("Transformación XML completada correctamente.");
        } catch (TransformerException e) {
            System.out.println("Error durante la transformación XML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void transformarXML(String xmlFile, String xsltFile, String outputFile) throws TransformerException {
        TransformerFactory factory = TransformerFactory.newInstance();
        Source xslt = new StreamSource(new File(xsltFile));
        Transformer transformer = factory.newTransformer(xslt);
        Source xml = new StreamSource(new File(xmlFile));
        transformer.transform(xml, new StreamResult(new File(outputFile)));
    }
}
