package com.ojas.JaxB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class javatoXml {

	public static void main(String[] args) {
		try {
			JAXBContext jaxbContext=JAXBContext.newInstance(Products.class);
			Marshaller marshallerobj=jaxbContext.createMarshaller();
			Products p=new Products();
			p.setId(102);
			p.setProductName("Mobile");
			p.setProductPrice(10000);
			marshallerobj.marshal(p, new File("D:\\Javaneonworkspace\\DomParser\\src\\main\\resources\\input1.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
