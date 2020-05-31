
package labtask3;

public class testAddressBook {
    public static void main(String[] args) {
        AddressBook A1=new AddressBook("SM RAHID HAQUE","16/1-2 Segunbagicha");
        
        Contact c1=new Contact("RUBAYET HAQUE","1",32,"01732443666","M");
        Contact c2=new Contact("AMMU","2",56,"01795887464","F");
        
        A1.AddContact(c1);
        A1.AddContact(c2);
        A1.deleteContact(c2);
        A1.showAllContactInfo();
    }
}
