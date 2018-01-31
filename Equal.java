import java.io.*;
import java.util.*;


public class Equal {

	public static void main(String[] args) {
		
		
// controllo sistema operativo in uso
		
		final String OS = System.getProperty("os.name");
		String root = "/tmp";

	if (OS.indexOf("Windows 7") >= 0) {
		    root="D:\\temp";
			System.out.println("Operating System: Windows 7");
		} else {
		    root="/";
		    System.out.println("Operating System: Ubuntu");
		}
	
		System.out.println("Root utilizzata " + root);
		
		
// Inizializzazione INPUT
		
		Scanner in = new Scanner(System.in);
		
// Inizializzazione PATH da controllare

		//PATH 1
		System.out.println("Inserisci PATH 1:");
		String path1 = in.nextLine();
		
		System.out.println("Inserisci PATH 2:");
		String path2 = in.nextLine();
		
		System.out.println(" PATH 1:" + path1);  //controllo PATH
		System.out.println(" PATH 1:" + path2);	 //controllo PATH
		
		
// Controllo PATH	
		 final  File folder_path1 = new File(path1);
		 final  File folder_path2 = new File(path2);
		 
		 System.out.println("Reading files under the folder "+ folder_path1.getAbsolutePath());
		 System.out.println("Reading files under the folder "+ folder_path2.getAbsolutePath());
		 
		 
//Controllo uguaglianza PATH
		 
		 if( folder_path1.equals(folder_path2)) {
			 System.out.println("Cartelle uguali");
			 
		 }
		 
		 else 
			 System.out.println("Cartelle diverse");
		 
	// controllo partizione /dev/sdb3	 
		 
	//	 System.out.println("Directory /dev TRUE or FALSE:" + folder_path1.isDirectory());
		 
		 
		 System.out.println("Scorro PATH1");
		 scorriDirectory(folder_path1);
		 
		 /*
		 
 //Costruisco struttura controllo
		 
		 File path1_array[];
		 File path2_array[];
		
		 
		path1_array =  folder_path1.listFiles();
		path2_array =  folder_path2.listFiles();
		
		
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("PATH cella 1");
		
			System.out.println(path1_array[1].getParent());
			System.out.println(path1_array[1].getPath());
			System.out.println(path1_array[1].getAbsolutePath());
			
			try {
				System.out.println(path1_array[1].getCanonicalPath());
				} catch (IOException e) {
				e.printStackTrace();
			}
		
			System.out.println(path1_array[1].getName());
			System.out.println(path1_array[1].toPath());
			System.out.println(path1_array[12].isDirectory());
		
		System.out.println("");
		System.out.println("");
		
	//scorriDirectory(folder_path1);
		
	System.out.println("Passato tutto il disco");
	
	int numero_celle = path1_array.length;
	
	System.out.println("numero celle array:" + numero_celle);
	
	
	
		

/*
		// initialize File object
				File file = new File("F:\\");

				// check if the specified pathname is directory first
				if(file.isDirectory()){
					//list all files on directory
					File[] files = file.listFiles();
					for(File f:files){
						
							System.out.println(f.toString());
						
						}
					}
				}
			}
	
		*/
		
}
	private static void scorriDirectory(File f) {
		File [] lista = f.listFiles();
		for (int i=0; i<lista.length; i++) {
		if ( !lista[i].isDirectory() ) {
		System.out.println( lista[i].getPath() );
		} else {
		scorriDirectory( lista[i] );
		}
		}
}
}
