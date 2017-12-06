package ejemplo_2;
/**
 * Autor: Andres Roman
 * Fecha: 06/12/2017                                       
 */
public class Asignacion {
    Estudiante [] lista_estudiante;
    double [] notas_matematicas;
    double [] notas_sociales;
    double [] promedio;

    public Asignacion(Estudiante[] lista_estudiante, double[] notas_matematicas, double[] notas_sociales) {
        this.lista_estudiante = lista_estudiante;
        this.notas_matematicas = notas_matematicas;
        this.notas_sociales = notas_sociales;
    }
    
    // get y set estudiantes
    public Estudiante[] getLista_estudiante() {
        return lista_estudiante;
    }
    public void setLista_estudiante(Estudiante[] lista_estudiante) {
        this.lista_estudiante = lista_estudiante;
    }
    // get y set notas_matematicas
    public double[] getNotas_matematicas() {
        return notas_matematicas;
    }
    public void setNotas_matematicas(double[] notas_matematicas) {
        this.notas_matematicas = notas_matematicas;
    }
    // get y set notas_sociales
    public double[] getNotas_sociales() {
        return notas_sociales;
    }
    public void setNotas_sociales(double[] notas_sociales) {
        this.notas_sociales = notas_sociales;
    }
    // Metodos promedios
    public double promedio_matematicas(){
        double prom=0;
        for(int i = 0; i < notas_matematicas.length; i++){
            prom += notas_matematicas[i];
        }
        prom =  prom / notas_matematicas.length;
        return prom;
    }
    public double promedio_sociales(){
        double prom=0;
        for(int i = 0; i < notas_sociales.length; i++){
            prom += notas_sociales[i];
        }
        prom =  prom / notas_sociales.length;
        return prom;
    }
    public double[] promedio_alumno(){
        this.promedio = new double [4];
        for (int i = 0; i < promedio.length; i++) {
            this.promedio[i] = (this.notas_matematicas[i] + this.notas_sociales[i]) / 2;
        }
        return promedio;
    }
    // Metodo toString
    public String cadena_1(){
        String cadena = "";
        for (int i = 0; i < lista_estudiante.length; i++) {
            cadena +=  String.format("%s\n"
                    + "\tMatematicas: %.1f\n"
                    + "\tSociales: %.1f\n"
                    + "\tPromedio: %.1f\n\n", 
                    getLista_estudiante()[i], 
                    getNotas_matematicas()[i], 
                    getNotas_sociales()[i], 
                    promedio_alumno()[i]);
            
        }
        return cadena;
    }
    @Override
    public String toString() {
        return String.format("Lista Estudiantes\n"
                + "%s\n"
                + "Promedios generales\n\n"
                + "Promedios de Matematicas: %.1f\n"
                + "Promedios de Sociales: %.1f\n", 
                cadena_1(), 
                promedio_matematicas(), 
                promedio_sociales());
        
    }
    
}
