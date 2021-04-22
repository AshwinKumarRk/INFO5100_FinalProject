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
public class DonationManagerWorkRequest  extends WorkRequest {
     private String donationResult;

    public String getDonationResult() {
        return donationResult;
    }

    public void setDonationResult(String donationResult) {
        this.donationResult = donationResult;
    }

    

}
