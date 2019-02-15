package com.lxisoft.menu;
import com.lxisoft.admin.Admin;
import java.util.*;
public class Menu{

    int cbill;
    int ch;
    String hotelName = "Internationale";
    ArrayList mainMenu = new ArrayList();
    ArrayList items = new ArrayList();
    ArrayList price = new ArrayList();

    public void setItems(ArrayList items) {
        this.items = items;
    }
    public ArrayList getItems() {
        return items;
    }
    public void setPrice(ArrayList price) {
        this.price = price;
    }
    public ArrayList getPrice() {
        return price;
    }
    Scanner sc = new Scanner(System.in);
    public Menu(){
        mainMenu.add("1.Items");
        mainMenu.add("2.Exit");
        items.add("Chappati");
        price.add(15);
        items.add("Porotta");
        price.add(15);
        items.add("Dosa");
        price.add(10);
        items.add("Meal");
        price.add(50);
        items.add("Kuruma");
        price.add(30);

    }
    public boolean list(){
        System.out.println("\n\n<<<<<<<<<<<"+hotelName+">>>>>>>>>\n\n");

        do{
            displayMainMenu(mainMenu);
            System.out.println("^Enter Your Choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                displayMenu(items,price);
                break;
                case 2:
                System.out.println("You were exited");
                break;
                case 3:
                System.out.println("Checking...");
                return(true);
                default:
                System.out.println("Enter again");
                break;

            }
        }while(2!=ch);
        return(false);
    }

    public void displayMenu(ArrayList list,ArrayList price) {
        int i=1; 
        boolean flag=true; 
        Scanner sc = new Scanner(System.in); 
        Iterator itr=list.iterator(); 
        Iterator itr1=price.iterator(); 
        int j; 
        do{ 
            while(itr.hasNext()) { 
                System.out.println(" "+i+" "+itr.next()+"............................."+itr1.next()+"/-"+"..."); 
                i++; 
            } 
            j=i; 
            if(flag=true){ 
                System.out.println(" "+j+". back<<"); 
                flag=false; 
            } 
            System.out.print("Enter choice : "); 
            ch=sc.nextInt();
            if(ch<j){
                System.out.println("Bill:" +price.get(ch-1)); 
                }   
                
                //cbill = cbill +price.get(ch-1); 
            
            else { 
                System.out.println("unavaible choice..........try again"); 
            }
        
               //System.out.println("Current bill : "+price.get(k));
        
        }while(ch!=j); 
    }
    
    public void displayMainMenu(ArrayList list) { 
        int i=1; 
        Iterator itr1=list.iterator(); 
        while(itr1.hasNext()) { 
            System.out.println(" "+i+"."+itr1.next()); 
            i++; 
        } 
    }


}