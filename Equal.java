import java.io.*;
import java.util.*;
import java.nio.channels.*;


public class Equal {

	public static void main(String[] args) throws Exception {
		
		
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
	//	 scorriDirectory(folder_path1);
		 
		 /*
		  */
		 
		 
		 
 //Costruisco struttura controllo
		 
		 
		 System.out.println("path source");
		 String path_source1 = in.nextLine();
		   File path_source = new File(path_source1);
	

		 System.out.println("path  destination");
		 String path_destination1 = in.nextLine();
		  File path_destination = new File(path_destination1);
		 
		// copyFile(path_source,path_destination);
		  
		//  Copiafile(path_source, path_destination);
			 
			System.out.println("Copy done");
			
			
			// memoria totale disponibile
			long num;
			num = path_source.getTotalSpace();
			System.out.print("Total space: " + num );
			System.out.print(" byte");
			System.out.println("");
			
			//check uguaglianza file
			
			checkFile(path_source , path_destination);
			
		
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
	
	public static void copyFile(File sourceFile, File destinationFile) throws Exception
	{
	FileChannel source = new FileInputStream(sourceFile).getChannel();
	FileChannel dest = new FileOutputStream(destinationFile).getChannel();
	source.transferTo(0, source.size(), dest);
	source.close();
	dest.close();
	}
	
	public static void Copiafile(File source, File destination) throws IOException{
		 FileInputStream input = new FileInputStream(source);
		 FileOutputStream output = new FileOutputStream(destination);
		 
		    int counter;

		    while ((counter = input.read()) != -1){
		    	 output.write(counter);
		    }
		     

		    input.close();		    
		    output.close();
		    

		}
	
	public static void checkFile(File source, File destination) throws IOException {
		
		File [] array_source = source.listFiles();
		File [] array_destination = destination.listFiles();
		
		
		
		int length_array_source = array_source.length;
		int length_array_destination = array_destination.length;
		
		if (length_array_source != length_array_destination){
			
			System.out.println("Strutture dati diverse, avvio copia");
		} else 
		{
			System.out.println("Stesso numero di dati");
			for(int i = 0;  i < array_source.length; i++ ){
				if (array_source[i].getName() != array_destination[i].getName()){
				//	Copiafile(source, destination);
					System.out.println("Dati diversi");
				}
			}
		}
			
		
		
		
	}
}
