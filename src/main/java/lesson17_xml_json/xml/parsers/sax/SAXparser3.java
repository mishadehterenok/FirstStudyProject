package lesson17_xml_json.xml.parsers.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SAXparser3 {
    private static boolean isFound;

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        SearchingXMLHandler handler = new SearchingXMLHandler("root");
        parser.parse(new File("src/lesson17_xml_json/xml/parsers/sax/XMLfile3.xml"), handler);

        if (!isFound)
            System.out.println("Элемент не был найден.");
    }

    private static class SearchingXMLHandler extends DefaultHandler {
        private String element;
        private boolean isEntered;

        public SearchingXMLHandler(String element) {
            this.element = element;
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (isEntered) {
                System.out.printf("Найден элемент <%s>, его атрибуты:\n", qName);

                int length = attributes.getLength();
                for(int i = 0; i < length; i++)
                    System.out.printf("Имя атрибута: %s, его значение: %s\n", attributes.getQName(i), attributes.getValue(i));
            }

            if (qName.equals(element)) {
                isEntered = true;
                isFound = true;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if (qName.equals(element))
                isEntered = false;
        }
    }
}
