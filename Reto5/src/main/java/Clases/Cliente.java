
package Clases;

public class Cliente {
    private int id_compra;
    private String Constructora;
    private String Banco;

    public Cliente() {
    }

    public Cliente(int id_compra, String Constructora, String Banco) {
        this.id_compra = id_compra;
        this.Constructora = Constructora;
        this.Banco = Banco;
    }
    
    
    /**
     * @return the id_compra
     */
    public int getId_compra() {
        return id_compra;
    }

    /**
     * @param id_compra the id_compra to set
     */
    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
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
     * @return the Banco
     */
    public String getBanco() {
        return Banco;
    }

    /**
     * @param Banco the Banco to set
     */
    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_compra=" + id_compra + ", Constructora=" + Constructora + ", Banco=" + Banco + '}';
    }
}
