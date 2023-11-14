public class Arreglo {

    private Personaje[] listado;

    public Arreglo() {
        listado = new Personaje[6];
        ingresar();

    }
    private void ingresar(){
        listado[0]=new Personaje(1, "batman1", 1f);
        listado[1]=new Personaje(2, "oliver2", 1f);
        listado[2]=new Personaje(3, "marco3", 1f);
        listado[3]=new Personaje(4, "palmer4", 1f);
        listado[4]=new Personaje(5, "caicedo5", 1f);
        listado[5]=new Personaje(6, "juanito6", 1f);
    }
    private void imprimir(int indice){
        if(indice<listado.length){
            imprimir(indice +1);
            System.out.println(listado[indice].toString());

        }
    }
    public void imprimir (){
        imprimir(0);
    }
    public float sumar(int indice){
        if(indice<listado.length){
            return listado[indice].getPrecio()+sumar(indice+1);
        }
        return 0;
    }


}
