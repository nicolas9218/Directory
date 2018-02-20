import java.io.*;
import java.util.*;
import java.nio.channels.*;


public class Prova {

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
			
			//CopiafileString(path_source1 ,path_destination1);
			
			long startTime = System.currentTimeMillis();
			
			//scorriDirectoryLast(path_source , path_destination);
			checkFile(path_source , path_destination);
		//	scorriDirectory(path_source);
			long endTime = System.currentTimeMillis();
			long seconds = (endTime - startTime) / 1000;	
			
			
			System.out.println("Programma eseguito in " + seconds + " secondi");
			
			
		//	Copiafile(path_source, path_destination);
			//copyFile(path_source, path_destination);
			
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
	
	
	private static void scorriDirectoryLast(File source , File destination) throws Exception {
		File [] lista = source.listFiles();
		File dir;
		for (int i=0; i<lista.length; i++) {
		if ( !lista[i].isDirectory() ) {
		System.out.println( lista[i].getPath() );
		//	checkFile(source, destination);
		} else {
			System.out.println("Path che sto passando a dir:" +destination.getPath() +  "/" + lista[i]);
			dir = new File (destination.getPath() + lista[i]);
			dir.mkdir();
			
		scorriDirectoryLast(source, destination );
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
	
	
	
	public static void copyFileString(String sourceFile, String destinationFile) throws Exception
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
	
	public static void checkFile(File source, File destination) throws Exception {
		
		File [] array_source = source.listFiles();
		File [] array_destination = destination.listFiles();
		
		
		
		
		String file_source[] = source.list(); 
		int length_array_source = file_source.length;

		String file_destination[] = new String [length_array_source];
		file_destination = destination.list(); 
		
		
		for (int i = 0; i< file_source.length; i++){
			System.out.println("");
			System.out.println("Array String sorgente:" + file_source[i]);
			System.out.println("Array File sorgente:" + array_source[i]);
			System.out.println("");
			
			if(array_source[i].isDirectory()){
				System.out.println("Questa è una cartella");
				System.out.println("");
			}
		}
	/*
		
		for (int i = 0; i< file_source.length; i++){
			File dir = new File (destination.getPath() + "/" +file_source[i]);
			dir.mkdir();
			System.out.println("path che sto passando:" + destination.getPath() + "/" +file_source[i]);
			System.out.println("Contenuto: " +  file_source[i]);
			*/
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
