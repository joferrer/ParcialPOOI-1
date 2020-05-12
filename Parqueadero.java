/**
 * Clase Parqueadero, Método 1, declarando propiedades para maximoCupoCarros y carros y calculando cupoCarros
 * @author Equipo: Jeison Ferrer 1152004 y Andres Gayón (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co) 
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Parqueadero{
    
    /**Almacena la cantidad de carros que se pueden parquear, la capacidad del Parqueadero para carros*/
    protected int maximoCupoCarros;

    /**Almacena la cantidad de carros parqueados*/  
    protected int carros;    

    /**Almacena el valor a pagar por una hora de parqueadero de carros*/      
    protected int tarifaCarros;        

    /**Almacena el dinero recaudado por carros parqueados*/          
    protected int ingresosCarros;    

    /**Almacena la cantidad de motos que se pueden parquear, la capacidad del Parqueadero para motos*/    
    protected int maximoCupoMotos;    

    /**Almacena la cantidad de motos parqueados*/      
    protected int motos;    

    /**Almacena el valor a pagar por una hora de parqueadero de motos*/          
    protected int ingresosMotos;

    /**Almacena el dinero recaudado por motos parqueados*/              
    protected int tarifaMotos;  
    
    /**Cupo maximo por defecto para carros*/
    public static int DEFAULT_MAX_CARROS=10;
    
    /**Constante con el cupo maximo por defecto para motos*/
    public static int DEFAULT_MAX_MOTOS=10;
    
    /**Constante con la tarifa por defecto para carros*/
    public static int DEFAULT_TARIFA_CARROS=1000;
    
    /**Constante con la tarifa por defecto para motos*/
    public static int DEFAULT_TARIFA_MOTOS=500;
    
    /**
     * Default constructor
     */
    public Parqueadero(){
      /*COMPLETE*/
      this(DEFAULT_MAX_CARROS,DEFAULT_MAX_MOTOS,DEFAULT_TARIFA_CARROS,DEFAULT_TARIFA_MOTOS);
    
      
    }

    /**
     * Constructor que recibe unicamente las tarifas
     */
    public Parqueadero(int tarifaCarros, int tarifaMotos){
      /*COMPLETE*/
      this(DEFAULT_MAX_CARROS,DEFAULT_MAX_MOTOS,tarifaCarros,tarifaMotos);
    }
    
    /**
     * Constructor que recibe todos los parametros
     */
    public Parqueadero(int cupoCarros, int cupoMotos, int tarifaCarros, int tarifaMotos){
      /*COMPLETE*/
      this.maximoCupoCarros=cupoCarros;
      this.maximoCupoMotos=cupoMotos;
      this.tarifaCarros=tarifaCarros;
      this.tarifaMotos=tarifaMotos;
    }

    /*COMPLETE GET y SET solo si aplica segun el diagrama UML*/
    public void setTarifaCarros(int tarifa){
        this.tarifaCarros=tarifa;
    }
      public void setTarifaMotos(int tarifa){
        this.tarifaMotos=tarifa;
    }
      public void setMaximoCupoCarros(int cupo){
        if(this.carros<=cupo)this.maximoCupoCarros=cupo;
    }
        public void setMaximoCupoMotos(int cupo){
        if(this.motos<=cupo)this.maximoCupoMotos=cupo;
    }
    public int getTarifaCarros(){
        return this.tarifaCarros;
    }
    public int getTarifaMotos(){
        return this.tarifaMotos;
    }
     public int getMaximoCupoCarros(){
        return this.maximoCupoCarros;
    }
     public int getMaximoCupoMotos(){
        return this.maximoCupoMotos;
    }
      public int getCarros(){
        return this.carros;
    }
    public int getMotos(){
        return this.motos;
    }   
    public int getCupoCarros(){
        return this.maximoCupoCarros-this.carros;
    }
    public int getCupoMotos(){
        return this.maximoCupoMotos-this.motos;
    }
    public int getIngresosCarros(){
        return this.ingresosCarros;       
    }
    public int getIngresosMotos(){
        return this.ingresosMotos;
    }
    public int getGanancias(){
        return this.ingresosCarros+this.ingresosMotos-getImpuestos();
    } 
    public int getImpuestos(){
        double impuestos=(this.ingresosCarros + this.ingresosMotos)*0.19;
        return (int)impuestos;
    }
    /***Metodo para parquear un carrro (ingresa un carro al parqueadero)*/
    public boolean parquearCarro(){
       boolean pudo=false;
       if(this.carros>=0&&this.carros<this.maximoCupoCarros){
           this.carros++;           
           pudo=true;
       }
       return pudo;/*COMPLETE*/      
    }
    
    /***Metodo para parquear una moto (ingresa una moto al parqueadero)*/
    public boolean parquearMoto(){//Simétrico a carros
         boolean pudo=false;
       if(this.motos>=0&&this.motos<this.maximoCupoMotos){
           this.motos++;           
           pudo=true;
       }
       return pudo;/*COMPLETE*/      
    }    

    /***Metodo para retirar un carro del parqueadero*/
    public boolean retirarCarro(int horaEntrada, int horaSalida){
         boolean pudo=false;
       if(this.carros>0 && estaEntre(horaEntrada,0,23)&&estaEntre(horaSalida,0,23)&&horaSalida >= horaEntrada){
           this.carros--;
            if(horaSalida>horaEntrada)this.ingresosCarros+=this.tarifaCarros*(horaSalida-horaEntrada);
            else this.ingresosCarros+=this.tarifaCarros;
           pudo=true;
       }
       return pudo;     
    }    
    
    /***Metodo para retirar una moto del parqueadero*/
    public boolean retirarMoto(int horaEntrada, int horaSalida){//Simétrico a carros
         boolean pudo=false;
       if(this.motos>0 && estaEntre(horaEntrada,0,23)&&estaEntre(horaSalida,0,23)&&horaSalida >= horaEntrada){
           this.motos--;
           if(horaSalida>horaEntrada)this.ingresosMotos+=this.tarifaMotos*(horaSalida-horaEntrada);//Si es la misma corregir
           else  this.ingresosMotos+=this.tarifaMotos;
           pudo=true;
       }
       return pudo;  
    }  
    public static boolean estaEntre(int i, int minValueInclusive, int maxValueInclusive) {
    if (i >= minValueInclusive && i <= maxValueInclusive)
        return true;
    else
        return false;
}

}//end class Parqueadero