package logica;

public class Cliente {

    private int id;
    private String cedula;
    private String nombre;
    private String telefono;
    private String direccion;

    public Cliente(String cedula, String nombre, String telefono, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Obtiene el valor de direccion
     *
     * @return el valor de direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Coloca el valor de direccion
     *
     * @param direccion nuevo valor de direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el valor de telefono
     *
     * @return el valor de telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Coloca el valor de telefono
     *
     * @param telefono nuevo valor de telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el valor de nombre
     *
     * @return el valor de nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Coloca el valor de nombre
     *
     * @param nombre nuevo valor de nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el valor de cedula
     *
     * @return el valor de cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Coloca el valor de cedula
     *
     * @param cedula nuevo valor de cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
