OdontologoDAOMemoria.java
package dao;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import model.Odontologo;

public class OdontologoDAOMemoria {
    private static final Logger logger = Logger.getLogger(OdontologoDAOMemoria.class);
    private List<Odontologo> odontologos = new ArrayList<>();

    public void guardar(Odontologo odontologo) {
        odontologos.add(odontologo);
        logger.info("Se ha guardado el odontólogo en la colección en memoria: " + odontologo);
    }

    public List<Odontologo> listarTodos() {
        logger.info("Se han listado todos los odontólogos de la colección en memoria");
        return odontologos;
    }
}