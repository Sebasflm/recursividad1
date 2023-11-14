public class Arreglo {
    private Personaje[] listado;
    public Arreglo(){
        listado=new Personaje[6];
        ingresar();
    }
    public void ingresar(){
        listado[0]=new Personaje(0,"juan",300.21f);
        listado[1]=new Personaje(1,"pepe",30.61f);
        listado[2]=new Personaje(2,"sebas",3.11f);
        listado[3]=new Personaje(3,"maria",20.15f);
        listado[4]=new Personaje(4,"manuel",10.92f);
        listado[5]=new Personaje(5,"ewin",120.51f);
    }
    public void imprimir(int indice){
        if(indice<listado.length){
            imprimir(indice+1);
            System.out.println(listado[indice].toString());
        }
    }
    public float sumar(int indice){
        if(indice<listado.length){
            return listado[indice].getPrecio()+sumar(indice+1);
        }
        return 0;
    }
    public void imprimir(){
        imprimir(0);
    }
}
