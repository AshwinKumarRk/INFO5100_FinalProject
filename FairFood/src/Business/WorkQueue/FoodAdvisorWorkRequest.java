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
public class FoodAdvisorWorkRequest extends WorkRequest{
    private String foodadvresult;

    public String getFoodadvresult() {
        return foodadvresult;
    }

    public void setFoodadvresult(String foodadvresult) {
        this.foodadvresult = foodadvresult;
    }   
    
}
