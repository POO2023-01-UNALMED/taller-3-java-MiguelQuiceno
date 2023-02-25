package taller3.televisores;
public class TV{
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        TV.numTV++;
    }
    public Marca getMarca(){
        return marca;
    }
    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public Control getControl(){
        return control;
    }
    public void setControl(Control control){
        this.control = control;
    }

    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getVolumen(){
        return volumen;
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }

    public int getCanal(){
        return canal;
    }
    public void setCanal(int canal){
        if (canal > 120){
            this.canal = 120;
        }else{
            this.canal = canal;
        }
    }

    public static int getNumTV(){
        return numTV;
    }
    public static void setNumTV(int numTV){
        TV.numTV = numTV;
    }

    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }

    public boolean getEstado(){
        return estado;
    }

    public void canalUp(){
        if (this.estado == true && this.canal >=1 && this.canal < 120){
            this.canal+=1;
        }
        
    }
    public void canalDown(){
        if (this.estado == true && this.canal >1 && this.canal <= 120){
            this.canal-=1;
        }
        
    }

    public void volumenUp(){
        if (this.estado == true && this.volumen >=0 && this.volumen < 7){
            this.volumen+=1;
        }
        
    }
    public void volumenDown(){
        if (this.estado == true && this.volumen >0 && this.volumen <= 7){
            this.volumen-=1;
        }
        
    }

}