/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author ashwin
 */
public class FoodSafetyOfficerWorkRequest extends WorkRequest{
    private String safetResult;

    public String getSafetResult() {
        return safetResult;
    }

    public void setSafetResult(String safetResult) {
        this.safetResult = safetResult;
    }
 
}
