
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rasmus
 */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.get(plate) == null) {
            owners.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return null;
        }

        return owners.get(plate);

    }

    public boolean delete(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return false;
        }

        owners.remove(plate);
        return true;

    }
    
    public void printRegistrationPlates(){
          for (RegistrationPlate key : owners.keySet()) {
            System.out.println(key);
        }
    }
    
    public void printOwners(){
        String ownername = "";
        ArrayList<String> plateList = new ArrayList<String>(); 
        for (RegistrationPlate owner : owners.keySet()) {
           ownername = owners.get(owner);
           if (!plateList.contains(ownername)){
               plateList.add(ownername); 
           }
           
            
           
        }
        for (String name : plateList) {
            System.out.println(name);
        }
        
        
    }
  
  
    
    
    
 
    
    
    

    @Override
    public int hashCode() {
        int hash = 8;
        hash = 97 * hash + (this.owners != null ? this.owners.hashCode() : 0);
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
        final VehicleRegister other = (VehicleRegister) obj;
        if (this.owners != other.owners && (this.owners == null || !this.owners.equals(other.owners))) {
            return false;
        }
        return true;
    }

}
