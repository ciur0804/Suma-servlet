/**
 * MODELO
 * Alumno: López Esquivel Andrés
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 31/08/2017
 */
package Componentes;

/**
 * CLASS Model
 * Aquí se guardan los valores de los dos números a sumar.
 * También hay un método para realizar la suma de dichos números
 */
public class Model {
    private int NumeroUno;
    private int NumeroDos;

    public int getNumeroUno() {
        return NumeroUno;
    }

    public void setNumeroUno(int NumeroUno) {
        this.NumeroUno = NumeroUno;
    }

    public int getNumeroDos() {
        return NumeroDos;
    }

    public void setNumeroDos(int NumeroDos) {
        this.NumeroDos = NumeroDos;
    }

    public int SumaNumeros(){
        return NumeroUno + NumeroDos;
    }
    
}
