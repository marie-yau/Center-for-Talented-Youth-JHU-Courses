import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Marie Dohnalová
 * This program program that reads a text file and counts the number of characters, words, sentences, and paragraphs.
 * 
 */

public class Unit7Lab1 {
	
	static boolean characters=	false;
	static boolean words=		false;
	static boolean sentences=	false;
	static boolean paragraphs=	false;
	
	static int chCount=0;
	static int woCount=0;
	static int seCount=0;
	static int paCount=0;

	public static void main(String[] args) {
		//parse args
		String opt=args[0];
		for(int i=1;i<opt.length();i++){
			switch(opt.charAt(i)){
			case 'c':
				characters=true;
				break;
			case 'w':
				words=true;
				break;
			case 's':
				sentences=true;
				break;
			case 'p':
				paragraphs=true;
				break;
			}
		}
		
		File file=new File(args[1]);
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String line;
		while(sc.hasNextLine()){
			line=sc.nextLine();
			paCount++;
			//count newline
			chCount++;
			for(int i=0;i<line.length();i++){
				chCount++;
				char ch=line.charAt(i);
				if(ch==' '||ch=='\t') woCount++;
				if(ch=='.') seCount++;
			}
		}
		//Count last word
		woCount++;
		
		if(characters) System.out.println("Characters:\t"+chCount);
		if(words) System.out.println("Words:\t\t"+woCount);
		if(sentences) System.out.println("Sentences:\t"+seCount);
		if(paragraphs) System.out.println("Paragraphs:\t"+paCount);
	}

}