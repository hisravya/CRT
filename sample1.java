import java.io.File;
FileWriter writer = new FileWriter("output.txt");
Writer.write("hello,java FileWriter!");
Writer.close();
FileReader reader = new FileReader("output.txt");
int ch;
while((ch=reader.read())!=-1){
    System.out.print((char)ch);
}
reader.close();