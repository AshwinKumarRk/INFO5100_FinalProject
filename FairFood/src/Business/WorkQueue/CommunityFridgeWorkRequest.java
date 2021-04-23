/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author truptiraut
 */
public class CommunityFridgeWorkRequest extends WorkRequest {
    
    private String CFResult;

    public String getCFResult() {
        return CFResult;
    }

    public void setCFResult(String CFResult) {
        this.CFResult = CFResult;
    }
}
