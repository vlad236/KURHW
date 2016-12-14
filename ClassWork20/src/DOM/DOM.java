package DOM;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
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
		File f = new File("src/DOM/xy.xml");
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
		for(int i = 0; i < nList.getLength(); i++){
			if(nList.item(i) instanceof Element){
				Element el = (Element) nList.item(i);
				System.out.println(nList.item(i).getNodeName() + ": " + 
									el.getElementsByTagName("x").item(0).getTextContent() +
									el.getElementsByTagName("unit").item(0).getTextContent() + ", " +
									el.getElementsByTagName("y").item(0).getTextContent() +
									el.getElementsByTagName("unit").item(0).getTextContent());
				}
		}
	}
}
