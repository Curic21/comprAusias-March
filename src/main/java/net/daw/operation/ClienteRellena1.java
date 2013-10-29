package net.daw.operation;

import java.util.ArrayList;
import java.util.Random;

import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.daw.bean.ClienteBean;

import net.daw.dao.ClienteDao;
import net.daw.helper.Contexto;

public class ClienteRellena1 extends Operation {

    @Override
    public Object execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Contexto oContexto = (Contexto) request.getAttribute("contexto");
        oContexto.setVista("jsp/mensaje.jsp"); 
        ClienteBean oClienteBean = new ClienteBean();
        ClienteDao oClienteDao = new ClienteDao(oContexto.getEnumTipoConexion());

        ArrayList<String> aps = new ArrayList<>();
        ArrayList<String> nom = new ArrayList<>();
        aps.add("García");
        aps.add("Sancho");
        aps.add("Sanchís");
        aps.add("Gómez");
        aps.add("Giménez");
        aps.add("Montoya");
        aps.add("López");
        aps.add("Domínguez");
        aps.add("González");
        aps.add("Fernández");
        aps.add("Rodríguez");
        aps.add("Martínez");
        aps.add("Pérez");
        aps.add("Hernández");
        aps.add("Alvarez");
        aps.add("Gutierrez");
        aps.add("Belmonte");
        aps.add("Palomino");
        aps.add("Casanova");

        nom.add("Santiago");
        nom.add("Sebastián");
        nom.add("Matías");
        nom.add("Mateo");
        nom.add("Nicolás");
        nom.add("Alejandro");
        nom.add("Diego");
        nom.add("Samuel");
        nom.add("Benjamín");
        nom.add("Daniel");
        nom.add("Joaquín");
        nom.add("Lucas");
        nom.add("Tomas");
        nom.add("Gabriel");
        nom.add("Martín");
        nom.add("David");
        nom.add("Emiliano");
        nom.add("Jerónimo");
        nom.add("Emmanuel");
        nom.add("Agustín");
        nom.add("Juan Pablo");
        nom.add("Juan José");
        nom.add("Andrés");
        nom.add("Thiago");
        nom.add("Leonardo");
        nom.add("Felipe");
        nom.add("Ángel");
        nom.add("Maximiliano");
        nom.add("Christopher");
        nom.add("Juan Diego");
        nom.add("Adrián");
        nom.add("Pablo");
        nom.add("Miguel Ángel");
        nom.add("Rodrigo");
        nom.add("Alexander");
        nom.add("Ignacio");
        nom.add("Emilio");
        nom.add("Dylan");
        nom.add("Bruno");
        nom.add("Carlos");
        nom.add("Vicente");
        nom.add("Valentino");
        nom.add("Santino");
        nom.add("Julián");
        nom.add("Juan Sebastián");
        nom.add("Aarón");
        nom.add("Lautaro");
        nom.add("Axel");
        nom.add("Fernando");
        nom.add("Ian");
        nom.add("Christian");
        nom.add("Javier");
        nom.add("Manuel");
        nom.add("Luciano");
        nom.add("Francisco");
        nom.add("Juan David");
        nom.add("Iker");
        nom.add("Facundo");
        nom.add("Rafael");
        nom.add("Alex");
        nom.add("Franco");
        nom.add("Antonio");
        nom.add("Luis");
        nom.add("Isaac");
        nom.add("Máximo");
        nom.add("Pedro");
        nom.add("Ricardo");
        nom.add("Sergio");
        nom.add("Eduardo");
        nom.add("Bautista");
        nom.add("Miguel");
        nom.add("Cristóbal");
        nom.add("Kevin");
        nom.add("Jorge");
        nom.add("Alonso");
        nom.add("Anthony");
        nom.add("Simón");
        nom.add("Juan");
        nom.add("Joshua");
        nom.add("Diego Alejandro");
        nom.add("Juan Manuel");
        nom.add("Mario");
        nom.add("Alan");
        nom.add("Josué");
        nom.add("Gael");
        nom.add("Hugo");
        nom.add("Matthew");
        nom.add("Ivan");
        nom.add("Damián");
        nom.add("Lorenzo");
        nom.add("Juan Martín");
        nom.add("Esteban");
        nom.add("Álvaro");
        nom.add("Valentín");
        nom.add("Dante");
        nom.add("Jacobo");
        nom.add("Jesús");
        nom.add("Camilo");
        nom.add("Juan Esteban");
        nom.add("Elías");
        nom.add("Sofía");
        nom.add("Isabella");
        nom.add("Camila");
        nom.add("Valentina");
        nom.add("Valeria");
        nom.add("Mariana");
        nom.add("Luciana");
        nom.add("Daniela");
        nom.add("Gabriela");
        nom.add("Victoria");
        nom.add("Martina");
        nom.add("Lucía");
        nom.add("Jimena");
        nom.add("Sara");
        nom.add("Samantha");
        nom.add("María José");
        nom.add("Emma");
        nom.add("Catalina");
        nom.add("Julieta");
        nom.add("Mía");
        nom.add("Antonella");
        nom.add("Renata");
        nom.add("Emilia");
        nom.add("Natalia");
        nom.add("Zoe");
        nom.add("Nicole");
        nom.add("Paula");
        nom.add("Amanda");
        nom.add("María Fernanda");
        nom.add("Emily");
        nom.add("Antonia");
        nom.add("Alejandra");
        nom.add("Juana");
        nom.add("Andrea");
        nom.add("Manuela");
        nom.add("Ana Sofía");
        nom.add("Guadalupe");
        nom.add("Agustina");
        nom.add("Elena");
        nom.add("María");
        nom.add("Bianca");
        nom.add("Ariana");
        nom.add("Ivanna");
        nom.add("Abril");
        nom.add("Florencia");
        nom.add("Carolina");
        nom.add("Maite");
        nom.add("Rafaela");
        nom.add("Regina");
        nom.add("Adriana");
        nom.add("Michelle");
        nom.add("Alma");
        nom.add("Violeta");
        nom.add("Salomé");
        nom.add("Abigail");
        nom.add("Juliana");
        nom.add("Valery");
        nom.add("Isabel");
        nom.add("Montserrat");
        nom.add("Allison");
        nom.add("Jazmín");
        nom.add("Julia");
        nom.add("Lola");
        nom.add("Luna");
        nom.add("Ana");
        nom.add("Delfina");
        nom.add("Alessandra");
        nom.add("Ashley");
        nom.add("Olivia");
        nom.add("Constanza");
        nom.add("Paulina");
        nom.add("Rebeca");
        nom.add("Carla");
        nom.add("María Paula");
        nom.add("Micaela");
        nom.add("Fabiana");
        nom.add("Miranda");
        nom.add("Josefina");
        nom.add("Laura");
        nom.add("Alexa");
        nom.add("María Alejandra");
        nom.add("Luana");
        nom.add("Fátima");
        nom.add("Sara Sofía");
        nom.add("Isidora");
        nom.add("Malena");
        nom.add("Romina");
        nom.add("Ana Paula");
        nom.add("Mariangel");
        nom.add("Amelia");
        nom.add("Elizabeth");
        nom.add("Aitana");
        nom.add("Ariadna");
        nom.add("María Camila");
        nom.add("Irene");
        nom.add("Silvana");
        nom.add("Clara");
        nom.add("Magdalena");
        nom.add("Sophie");
        nom.add("Josefa");

        int index;
        String nombre;
        Iterator<String> iterador = nom.listIterator();
        Random generator;
        while (iterador.hasNext()) {
            nombre = iterador.next();
            generator = new Random();
            index = generator.nextInt(aps.size());
            String randomAP1 = aps.get(index);
            generator = new Random();
            index = generator.nextInt(aps.size());
            String randomAP2 = aps.get(index);
            oClienteBean.setId(0);
            oClienteBean.setNombre(nombre);
            oClienteBean.setApe1(randomAP1);
            oClienteBean.setApe2(randomAP2);
            oClienteBean.setEmail(randomAP1 + randomAP2 + "@" + "emailito.com");
            try {
                oClienteDao.set(oClienteBean);

            } catch (Exception e) {
                throw new ServletException("ClienteController: Update Error: Phase 2: " + e.getMessage());
            }
        }

        return "OK- información generada.";
    }
}