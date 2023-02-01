package com.ojas.JaxB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmltoJava {

	public static void main(String[] args) {
		try {
			File inputFile=new File("D:\\Javaneonworkspace\\DomParser\\src\\main\\resources\\Xmltojava.xml");
			JAXBContext jaxbContext=JAXBContext.newInstance(Employee.class);
			Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
			Employee e=(Employee) unmarshaller.unmarshal(inputFile);
			System.out.println(e.getId()+""+e.getName()+""+e.getEmail());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
