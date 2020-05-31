
package labtask3;

public class AddressBook {
    private String ownerName;
    private String info;
    Contact[] listOfContact;
    int totalContact;
    int maxNumOfContact=500;
    
    public AddressBook(){
        
    }
    
    public AddressBook(String owname,String inf){
        this.ownerName=owname;
        this.info=inf;
        listOfContact= new Contact[maxNumOfContact];
        this.totalContact=0;
    }
    
    public void showAllContactInfo(){
        System.out.println("Name of the phone owner: "+this.ownerName);
        System.out.println("Info: "+this.info);
        System.out.println("Current Total Contacts: "+this.totalContact);
        for(int i=0;i<this.totalContact;i++)
        {
           this.listOfContact[i].DisplayInfo();
        }
        
    }
    
    public void AddContact(Contact contact){
        this.listOfContact[this.totalContact]=contact;
        this.totalContact++;
    }
    
    public void deleteContact(Contact contact){
       this.totalContact--;
         
    }    
         
}    

    
    

