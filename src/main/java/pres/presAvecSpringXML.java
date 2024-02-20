package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presAvecSpringXML {
    public static void main(String[] args) {
        // creation des objets => spirng
        // c - Version XML
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //IMetier metier = (IMetier) context.getBean("metier");
        IMetier metier = context.getBean(IMetier.class);// cherche-moi parmi les objets que tu as créé cherche-moi un objet qui implémente cette interface
        System.out.println("RES="+metier.calcul());
    }
}
