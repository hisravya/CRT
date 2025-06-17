import java.io.*;
FileWriter write=new FileWriter("output.txt");
Writer.write("Hello,JavaFileWriter!");
Writer.close();
FileReader reader=new FileReader("output.txt");
int ch;
while((ch=reader.read())!=-1){
Syatem.out.print((char)ch);
reader.close();