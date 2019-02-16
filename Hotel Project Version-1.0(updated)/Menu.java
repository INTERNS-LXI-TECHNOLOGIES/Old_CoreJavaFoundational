package com.lxisoft.menu;
import com.lxisoft.admin.Admin;
import java.util.*;
public class Menu{

    int cbill;
    int ch;
    String hotelName = "Internationale";
    ArrayList mainMenu = new ArrayList();
    ArrayList items = new ArrayList();
    ArrayList prices = new ArrayList();

    public void setItems(ArrayList items) {
        this.items = items;
    }
    public ArrayList getItems() {
        return items;
    }
    public void setPrice(ArrayList prices) {
        this.prices = prices;
    }
    public ArrayList getPrice() {
        return prices;
    }
    Scanner sc = new Scanner(System.in);
    public Menu(){
        mainMenu.add("Items");
        mainMenu.add("Remove item");
        mainMenu.add("Exit");
        items.add("Chappati");
        prices.add(15);
        items.add("Porotta");
        prices.add(15);
        items.add("Dosa");
        prices.add(10);
        items.add("Meal");
        prices.add(50);
        items.add("Kuruma");
        prices.add(30);
        items.add("Biriyani");
        prices.add(100);

    }
    public boolean list(){
        System.out.println("\n\n<<<<<<<<<<<"+hotelName+">>>>>>>>>\n\n");

        do{
            Admin admin = new Admin();
            displayMainMenu(mainMenu);
            System.out.println("=Enter Your Choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                displayMenu(items,prices);
                break;
                case 2:
                removeitem();
                break;
                case 3:
                System.out.println("You were exited"); 
                break;
                case 4:
                System.out.println("Checking...");
                admin.adminmenu();
                return(true);
                default:
                System.out.println("Enter again");
                break;

            }
        }while(3!=ch);
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
                System.out.println("Bill:" + prices.get(ch-1));
                /*for(int k=0;k<6;k++){
                    //price.get(k);
                    System.out.println("Current bill : "+price.get(k-1));
                    //cbill = price.get(ch-1) + price.get(ch-1);
                }*/
                
                }
                   
                
                //cbill = cbill +price.get(ch-1); 
            
            else if(j>7){ 
                System.out.println("unavaible choice..........try again"); 
            }
        
              // System.out.println("Current bill : "+price.get(k));
               
        
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
    public void removeitem() { 
        Scanner sc = new Scanner(System.in); 
        boolean flag0,flag1; 
        String item; 
        int price =0; 
        int ch; 
        displayMainMenu(mainMenu);  
        System.out.print("Enter item to be remove:");
        ch=sc.nextInt(); 
        switch(ch) { 
            case 1: 
            int i,j; 
            boolean flag;  
            for(i=0;i<items.size();i++) {
            flag=items.get(i).equals(ch); 
            if(flag==true) { 
                items.remove(i);
                System.out.println("Removed item"+items.remove(i));
            }
        }
                for(j=0;j<prices.size();j++) {
                    flag=prices.get(j).equals(price); 
                    if(flag==true) { 
                    prices.remove(j); 
            }   
        } 
        
        break;
        default: System.out.println("_______Invalid choice_______"); 
        break;
    } 
    }

    public void editprofile(){ 
        Scanner sc = new Scanner(System.in); 
        System.out.println("_____________Edit profile_____________"); 
        System.out.println("1.change hotel name"); 
        System.out.print("Enter your choice : "); 
        ch=sc.nextInt(); 
        switch(ch) { 
            case 1: System.out.print("Enter new name of hotel : ");
            hotelName=sc.next(); 
        } 
    } 
   
    public void additem() {
        Scanner sc = new Scanner(System.in); 
        boolean flag; 
        String item; 
        int price; 
        int ch;
        System.out.print("Enter item name to be Add : "); 
        item=sc.next(); 
        System.out.print("Enter Price of Item : "); 
        price=sc.nextInt(); 
        System.out.print("Which catogeory : "); 
        ch=sc.nextInt(); 
        switch(ch) { 
            case 1: items.add(item);
            prices.add(price); 
            break; 
            default: System.out.println("_______Invalid choice1_______"); 
            break; 
        } 
    } 

}