
package JAXB;


import java.io.FileWriter;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.sql.Date;

public class JaxbMain {
    public static void main(String[] args) throws JAXBException, IOException {
        // Creating a sample Projet object
        Projet projet;
        projet = new Projet();

        // Marshalling the Projet object to XML
        JAXBContext context = JAXBContext.newInstance(Projet.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(projet, new FileWriter("C:\\Users\\Users\\Desktop\\xml_docs\\projet.xml"));
        System.out.println("Marshalling done");
    }
}


