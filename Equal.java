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
			
			
		//	Copiafile(path_source, path_destination);
			
			//nuovo codice
			System.out.println("");
			
		
			
			
		
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
	
	public static void CopiafileString(String source, String destination) throws IOException{
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
		
	//	File [] array_source = source.listFiles();
		//File [] array_destination = destination.listFiles();
		
		String file_source[] = source.list(); 
		int length_array_source = file_source.length;

		String file_destination[] = new String [length_array_source];
		file_destination = destination.list(); 
		int length_array_destination = file_destination.length;
		
		
		boolean same = false;
		
		System.out.println("");
		System.out.println("Ordinamento avviato:");
		System.out.println("");
		
		System.out.println("Ordinamento primo path:");
		Arrays.sort(file_source);
		System.out.println("Done");
		System.out.println("");
		System.out.println("Ordinamento secondo path:");
		Arrays.sort(file_destination);
		System.out.println("Done");
		System.out.println("");
		
		System.out.println("Check dati ");
		for(int k=0; k< file_source.length; k++){				
			
			if(file_source[k].equals(file_destination[k])){
				same = true;
				
			} else 						
				same = false;
			
			
		}
		
		if (same == false){	
			int count = 1;
			for(int j=0; j< file_source.length; j++){
			
					CopiafileString(source.getPath() + "/"  + file_source[j] , destination.getPath() + "/" + file_source[j]);
						
			System.out.println("" );
			System.out.println( count + " Copy Done");
			count ++;
				
				
			}
		}
		
			
			System.out.println("");
			System.out.println("Stessi file:  " + same);
			
			}
	
	
	
	 public static void mergeSort(String[] names) {
	        if (names.length > 2) {
	            String[] left = new String[names.length / 2];
	            String[] right = new String[names.length - names.length / 2];

	            for (int i = 0; i < left.length; i++) {
	                left[i] = names[i];
	            }

	            for (int i = 0; i < right.length; i++) {
	                right[i] = names[i + names.length / 2];
	            }

	            mergeSort(left);
	            mergeSort(right);
	           
	        }
	    }
			
		
		
		
	}
