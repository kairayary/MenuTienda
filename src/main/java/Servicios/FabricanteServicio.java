package Servicios;

import Entidad.Fabricante;
import Entidad.Producto;
import Persistencia.FabricanteDao;

import java.util.List;

public class FabricanteServicio {
    private FabricanteDao fabricanteDAO = new FabricanteDao();

    public void verFabricantes() throws Exception{

        try {
            List<Fabricante> fabricante = fabricanteDAO.TenerFabricante();
            if (fabricante.isEmpty()){
                throw new Exception("No hay registros de fabrincantes");
            }else{
                System.out.println("Lista de fabricantes");
                System.out.printf("%-15s%-40\n", "CODIGO", "Nombre");
                for(Fabricante fabricantes : fabricante){
                    System.out.printf("%-15s%-40s\n", fabricantes.getCodigo(), fabricantes.getNombre());

                }
            }
        }catch (Exception e){
            throw e;

        }

    }


}
