import java.util.*;

public class todoList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Display the todo list");
            System.out.println("2. Insert a new task");
            System.out.println("3. Remove a task");
            System.out.println("4. Clear all tasks");
            System.out.println("5. Edit a task");
            System.out.println("0. Exit\n");

            
            int command = in.nextInt();

           switch (command) {
            case 1:
                if(list.isEmpty()){
                System.out.println("\nThere is no task in the list.\n");
                }
                else{
                System.out.println("\nTODO LIST: \n");
                for(int i = 0; i < list.size(); i++){

                    System.out.println((i + 1) + ". " + list.get(i));
                }
                }  
            
                break;
            
            case 2:
                in.nextLine();
                System.out.println("\nEnter the task to add: \n");
                String list_items = in.nextLine();
                list.add(list_items);
                System.out.println("Task added");

                break;
            
            case 3:
                in.nextLine();
                System.out.println("\nEnter the task you want to remove: \n");
                int remove_task = in.nextInt();
                
                list.remove(remove_task - 1);
                System.out.println("Task Removed!!!");
                
                break;
           
            case 4:
                list.clear();
                System.out.println("All tasks has been removed!!!\n");
                break;
           
            case 5:
                System.out.println("Enter the task you want to edit: \n");
                int edit_number = in.nextInt();
                in.nextLine();
                String edit_item = in.nextLine();
                


                list.set(edit_number - 1, edit_item);

                System.out.println("List item changed!!");

                
                break;
                
            case 0:
                System.out.println("Exiting the program. Goodbye!");
                in.close();
                return;
           
           
            default:
                System.out.println("Invalid command. Please try again.");
            
                break;
           }
        }
           

       
    }
}