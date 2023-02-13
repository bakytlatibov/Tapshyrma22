import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("Alphabet");
        fileWriter.write("A a\nB b\nC c\nD d\nE e\nF f\nJ j\nH h\nI i\nJ j\nK k\nL l\nM m\nN n\nO o\nP p\nQ q\nR r\nS s\nT t\nU u\nV v\nW w\nX x\nY y\nZ z\n1\n2\n3\n4\n5\n6\n7\n8\n9\n0");
        fileWriter.close();
        FileReader fileReader=new FileReader("Alphabet");

        Scanner scanner=new Scanner(fileReader);
        StringBuilder stringBuilder=new StringBuilder();
        int a=0;
        while (scanner.hasNext()){
            if (a<36){
                a++;
            System.out.println(a+". "+scanner.nextLine());

    }
        fileReader.close();
} }}