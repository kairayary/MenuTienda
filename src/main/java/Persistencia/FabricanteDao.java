package Persistencia;

import Entidad.Fabricante;

import java.util.ArrayList;
import java.util.List;

public class FabricanteDao extends DAO{
    public List<Fabricante> ObtenerFabricante() throws Exception{
        try{
            String sql = "Select * from fabricante;";

            ConsultarBD(sql);

            List<Fabricante>fabricantes = new ArrayList<>();
            Fabricante fabricante;
            while (resultset.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultset.getInt(1));
                fabricante.setNombre(resultset.getString(2));

                fabricantes.add(fabricante);

            }
            return fabricante;
        }catch (Exception e){
            System.out.println(e.getMessage());

            throw new Exception("Ha ocurrido un error al obtener fabricante!!!");

        }finally {
            DesconectarBD();
        }
    }
}
