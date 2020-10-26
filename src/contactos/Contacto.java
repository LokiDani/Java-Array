package contactos;

public class Contacto {

    private String nombre, telefono, mail;

    public Contacto(String nombre, String telefono, String mail) {
        this.mail = mail;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre = " + nombre + ", telefono = " + telefono + ", mail = " + mail + '}';
    }
}
