package Servicios;

public class FabricanteServicio {
    private FabricanteDAO fabricanteDAO = new FabricanteDAO();

    public void verFabricantes() throws Exception{

        try {
            List<Fabricante> fabricante = fabricanteDAO.TenerFabricante();
            if (fabricante.isEmpty()){
                throw new Exception("No hay registros de fabrincantes");
            }else{
                System.out.println("Lista de fabricantes");
                System.out.printf("%-15s%-40\n", "CODIGO", "Nombre");
                for(Fabricante fabricante : fabricantes){
                    System.out.printf("%-15s%-40s\n", fabricante.getCodigo(), fabricante.getNombre());

                }
            }
        }catch (Exception e){
            throw e;

        }

    }
}
