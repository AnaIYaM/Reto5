
package Clases;

public class Proyecto {
    private int id_proyecto;
    private String Constructora;
    private int numero_habitaciones;
    private String ciudad;

    public Proyecto() {
    }

    public Proyecto(int id_proyecto, String Constructora, int numero_habitaciones, String ciudad) {
        this.id_proyecto = id_proyecto;
        this.Constructora = Constructora;
        this.numero_habitaciones = numero_habitaciones;
        this.ciudad = ciudad;
    }
    
    
    /**
     * @return the id_proyecto
     */
    public int getId_proyecto() {
        return id_proyecto;
    }

    /**
     * @param id_proyecto the id_proyecto to set
     */
    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    /**
     * @return the Constructora
     */
    public String getConstructora() {
        return Constructora;
    }

    /**
     * @param Constructora the Constructora to set
     */
    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    /**
     * @return the numero_habitaciones
     */
    public int getNumero_habitaciones() {
        return numero_habitaciones;
    }

    /**
     * @param numero_habitaciones the numero_habitaciones to set
     */
    public void setNumero_habitaciones(int numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "id_proyecto=" + id_proyecto + ", Constructora=" + Constructora + ", numero_habitaciones=" + numero_habitaciones + ", ciudad=" + ciudad + '}';
    }
}
