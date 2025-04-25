
import java.io.FileWriter;
import java.io.IOException;
public class filewrite {
    public static void main(String [] args){
       try{ 
        FileWriter fr=new FileWriter("gani.txt");
        fr.write("cpc poly technic");
        fr.close();
        System.out.println("file write succesfuully");
    }
    catch(IOException e){
        System.out.println("error accured ");
        e.getStackTrace();
    }
    
}
}
