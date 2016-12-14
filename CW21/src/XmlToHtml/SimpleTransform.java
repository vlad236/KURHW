package XmlToHtml;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class SimpleTransform {
	public static void main(String[] args) {
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			// установка используемого XSL-преобразования
			Transformer transformer = tf.newTransformer(new StreamSource("src/XmlToHtml/Table.xsl"));
			// установка исходного XML-документа и конечного XML-файла
			transformer.transform(new StreamSource("src/XmlToHtml/Table.xml"),	new StreamResult("new_Table.html"));
			System.out.println("Transform " + " complete");

		} catch (TransformerException e) {
			System.err.println("Impossible transform file " + " : " + e);
		}
	}
}
