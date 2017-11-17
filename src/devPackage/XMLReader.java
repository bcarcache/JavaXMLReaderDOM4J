package devPackage;

import java.util.Iterator;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XMLReader {

	public static void main(String[] args) {
		String xmlPath = "NewFile.xml";
		SAXReader reader = new SAXReader();
		Document document;
		
		try {
			document = reader.read(xmlPath);
			Element rootElement = document.getRootElement();
			
			for (Iterator<Element> i = rootElement.elementIterator(); i.hasNext();) {
				Element na = i.next();

				System.out.println("GET NAME");
				System.out.println(na.getName());

				System.out.println("GET STRING VALUE");
				System.out.println(na.getStringValue());
				
				for (Iterator<Element> j = na.elementIterator(); j.hasNext();) {
					Element nb = j.next();

					System.out.println("GET DATA 2");
					System.out.println(nb.getData());
					
					System.out.println("GET NAME 2");
					System.out.println(nb.getName());

					System.out.println("GET STRING VALUE 2");
					System.out.println(nb.getStringValue());
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
}
