
package testeelis;


 public class Futebol{
     private String nomeTime;
     
     public void setTime(String meuTime)
     {
         nomeTime = meuTime;
     }
     
     public String getTime()
     {
     return nomeTime;
     }
     
     public void mostraTime()
     {
     System.out.println("Seu time do coracao is: " + getTime());
     }
 }
