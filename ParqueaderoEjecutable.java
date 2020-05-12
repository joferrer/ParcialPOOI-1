import javax.swing.JOptionPane;

/**
 * Main Ejecutable
 * 
 * @author (Milton Jesus Vera Contreras - mjvera@bari.ufps.edu.co) 
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) Enero 2008
 */
public class ParqueaderoEjecutable
{
  public static void main(String [] args)
  {
    Parqueadero parqueadero = new Parqueadero();
    VistaParqueadero vistaParqueadero = new VistaParqueadero(parqueadero);
  }//fin main
}//fin class ParqueaderoEjecutable
