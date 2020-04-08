
package Objects;

import java.util.Objects;
import javafx.geometry.Point2D;


public class Photon {
    
     private Point2D position;
     
     private final static double SPEED = 299792458;
     
  

    public Photon(Point2D position) {
        this.position = position;
      
      
    }

    public Point2D getPosition() {
        return position;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public double getSpeed() {
        return SPEED;
    }

   

    @Override
    public String toString() {
        return "Photon{" + "position=" + position + ", speed=" + SPEED + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Photon other = (Photon) obj;
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
       
        return true;
    }

  
     
     
     
  
    
    
    
}
