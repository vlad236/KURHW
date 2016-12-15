
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOM {

	public static void main(String args[]) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document doc = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		File f = new File("Flowers.xml");
		try {
			doc = builder.parse(f);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Element root = doc.getDocumentElement();
		System.out.println(root.getTagName());
		NodeList nList = root.getChildNodes();
		for(int i = 0; i < nList.getLength(); i++)
		{
			Node nNode = nList.item(i);
			if(nList.item(i) instanceof Element) {
				Element elem = (Element) nList.item(i);
				System.out.println(nList.item(i).getNodeName() + " " + elem.getElementsByTagName("name").item(0).getTextContent() + ": ");
				System.out.println(elem.getElementsByTagName("soil").item(0).getTextContent() + "; ");
				System.out.println(elem.getElementsByTagName("origin").item(0).getTextContent() + "; ");
				System.out.println(elem.getElementsByTagName("StemColor").item(0).getTextContent() + "; ");
				System.out.println(elem.getElementsByTagName("averageSize").item(0).getTextContent() + "; ");
				System.out.println(elem.getElementsByTagName("temperature").item(0).getTextContent() + "; ");
				System.out.println(elem.getElementsByTagName("watering").item(0).getTextContent() + "; ");
				System.out.println(elem.getElementsByTagName("Multiplying").item(0).getTextContent() + ".\n");
			}
		 } 
	}
}
