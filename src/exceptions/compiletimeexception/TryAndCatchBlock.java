package exceptions.compiletimeexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryAndCatchBlock {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("/Users/nacer-zimu/IdeaProjects/eat-jan172022-project1/src/test");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            br = new BufferedReader(fr);
            String str = " ";

            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }


        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
