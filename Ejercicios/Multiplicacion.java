public class Multiplicacion {
    Usuario objUsuario=new Usuario();

    Public Multiplicacion ()
        System.out.println("Soy el constructor de Multiplicacion")

    
    public int multiplicar(){
        return objUsuario.pedirNumero()*objUsuario.pedirNumero();
    }
    
    public void mostrar (int x){
        System.out.println("La multiplicacion es "+ x);
    }
}

