/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaveterinaria;

/**
 *
 * @author Usuario
 */
public class Registro {
    private String nombredueño;
    private String nombremascota;
    private String dni;
    private String raza;
    private String sexo;
    private int edad;
    private String tratamiento;

    public Registro() {
    }

    public Registro(String nombredueño, String nombremascota, String dni, String raza, String sexo, int edad, String tratamiento) {
        this.nombredueño = nombredueño;
        this.nombremascota = nombremascota;
        this.dni = dni;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.tratamiento = tratamiento;
    }

    public String getNombredueño() {
        return nombredueño;
    }

    public void setNombredueño(String nombredueño) {
        this.nombredueño = nombredueño;
    }

    public String getNombremascota() {
        return nombremascota;
    }

    public void setNombremascota(String nombremascota) {
        this.nombremascota = nombremascota;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    
}
