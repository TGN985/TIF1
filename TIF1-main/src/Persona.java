/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TGN
 */
public class Persona {
    
    private String nombre, apellido, edad, carrera, ciclo, sexo, correo, telefono, horaIngreso;

    public Persona(String nombre, String apellido, String edad, String carrera, String ciclo, String sexo, String correo, String telefono, String horaIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.ciclo = ciclo;
        this.sexo = sexo;
        this.correo = correo;
        this.telefono = telefono;
        this.horaIngreso = horaIngreso;
    }

    Persona(String text, String text0, String text1, String text2, String text3, String text4, String text5, String text6) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getEdad() { return edad; }
    public String getCarrera() { return carrera; }
    public String getCiclo() { return ciclo; }
    public String getSexo() { return sexo; }
    public String getCorreo() { return correo; }
    public String getTelefono() { return telefono; }
    public String getHoraIngreso() { return horaIngreso; }
    
}
