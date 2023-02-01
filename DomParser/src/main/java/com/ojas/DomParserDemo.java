package com.ojas;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParserDemo {

	public static void main(String[] args) {
		try {
			File InputFile = new File("D:\\Javaneonworkspace\\DomParser\\src\\main\\resources\\input.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(InputFile);
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("student");
			System.out.println(nList.getLength());
			for (int i = 0; i < nList.getLength(); i++) {
				Node node = nList.item(i);
				
				if (node.getNodeType() == Node.ELEMENT_NODE)
					;
				{

					Element element = (Element) node;
					System.out.println("Student Id " + element.getElementsByTagName("id").item(0).getTextContent());
					System.out.println("Student Name: " + element.getElementsByTagName("name").item(0).getTextContent());
					System.out
							.println("Student Course : " + element.getElementsByTagName("course").item(0).getTextContent());
					System.out.println("-------------------------------------");
				}
			}
		} catch (DOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
