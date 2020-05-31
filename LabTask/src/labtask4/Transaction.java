
package labtask4;
public class Transaction
{
		String accSender;
		String accReceiver;
		int amount;
		String additionalInfo;

		Transaction(){}

		Transaction(String accSender, String accReceiver, String additionalInfo, int amount){
				this.accSender=accSender;
				this.accReceiver=accReceiver;
				this.additionalInfo=additionalInfo;
				this.amount=amount;
			}


		public void showInfo(){
				System.out.println(accSender+" "+additionalInfo+" "+accReceiver+"\namount: "+amount);
			}

                
                
}                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
          

		