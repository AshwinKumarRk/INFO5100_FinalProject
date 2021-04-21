/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

//import Business.Role.Inspector;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author visha
 */
public class QualityAssuranceEnterprise extends Enterprise{
    public QualityAssuranceEnterprise(String name){
        super(name, Enterprise.EnterpriseType.QualityAssurance);
    }
    
    @Override
      public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
