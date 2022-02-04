package exceptions.compiletimeexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/nacer-zimu/IdeaProjects/eat-jan172022-project1/src/test");

        BufferedReader br = new BufferedReader(fr);

        String str = " ";

        while ((str = br.readLine()) != null){
            System.out.println(str);
        }

        br.close();

    }
}
