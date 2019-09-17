/*Get the file from specific folder and verify the name and details*/
package task;
import java.io.File;
public class Test3_FewMoreTasks_2  
{ 
     static void RecursivePrint(File[] arr, int level)  
     { 
         // for-each loop for main directory files 
         for (File f : arr)  
         { 
             // tabs for internal levels 
             for (int i = 0; i < level; i++) 
                System.out.print("\t"); 
             if(f.isFile())  
             {
             System.out.println("File Name and Size\n"+f.getName()); 
             System.out.println(getFileSizeBytes(f));
             System.out.println(getFileSizeMegaBytes(f));
     		 System.out.println(getFileSizeKiloBytes(f));
     		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
             }
             else if(f.isDirectory())  
             {  
            	 System.out.println("Subfolder name:");
                 System.out.println("[" + f.getName() + "]");
                
                 // recursion for sub-directories 
                 RecursivePrint(f.listFiles(), level + 1);
             } 
         } 
    } 
     private static String getFileSizeMegaBytes(File file) {
 		return (double) file.length() / (1024 * 1024) + " mb";
 	}
 	private static String getFileSizeKiloBytes(File file) {
 		return (double) file.length() / 1024 + "  kb";
 	}
 	private static String getFileSizeBytes(File file) {
 		return file.length() + " bytes";
 	}
    // Driver Method 
    public static void main(String[] args) 
    { 
        // Provide full path for directory(change accordingly)   
        String maindirpath = "C://Users//bvpericherla//Desktop//Bhavani";  
        // File object 
        File maindir = new File(maindirpath); 
        if(maindir.exists() && maindir.isDirectory()) 
        { 
            // array for files and sub-directories  
            // of directory pointed by maindir 
            File arr[] = maindir.listFiles(); 
            System.out.println("**********************************************"); 
            System.out.println("Files from main directory : " + maindir); 
           
            System.out.println("**********************************************"); 
            // Calling recursive method 
            RecursivePrint(arr, 0);  
       }  
    } 	
} 