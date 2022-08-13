/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Alumno {
    private String codigo;
    private String libro;
    private String pasta;
    private String editorial;
    private String publicacion;
    
    public Alumno(String codigo, String libro, String pasta, String editorial, String publicacion){
        this.codigo=codigo;
        this.libro=libro;
        this.pasta=pasta;
        this.editorial=editorial;     
        this.publicacion=publicacion;  
    }
    
    public Alumno(){
        this.libro="Alumno de ejemplo";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return libro;
    }

    public void setNombre(String libro) {
        this.libro = libro;
    }

    public String getCorreo() {
        return pasta;
    }

    public void setCorreo(String pasta) {
        this.pasta = pasta;
    }

    public String getDireccion() {
        return editorial;
    }

    public void setDireccion(String editorial) {
        this.editorial = editorial;
    }
    
    
        public String getPulicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String getPublicacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
