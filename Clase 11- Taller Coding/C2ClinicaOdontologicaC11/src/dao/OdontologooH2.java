OdontologoDAOH2.java
package dao;

import java.util.List;
import org.apache.log4j.Logger;
import model.Odontologo;

public class OdontologoDAOH2 {
    private static final Logger logger = Logger.getLogger(OdontologoDAOH2.class);

    public void guardar(Odontologo odontologo) {
        // Implementa el método para guardar un odontólogo en la base de datos H2
        logger.info("Se ha guardado el odontólogo en la base de datos H2: " + odontologo);
    }

    public List<Odontologo> listarTodos() {
        // Implementa el método para listar todos los odontólogos de la base de datos H2
        logger.info("Se han listado todos los odontólogos de la base de datos H2");
        return null; // Cambia esto para devolver la lista real de odontólogos
    }
}