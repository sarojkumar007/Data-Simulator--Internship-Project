import java.io.*;

class  File
{
    public static void main(String[] args)
    {
          FileInputStream fis = null;
          FileOutputStream fos = null;

          try{
               fis = new  FileInputStream("input.txt");
               fos = new FileOutputStream("output.txt");

               int ch,count = 0;
                while((ch=fis.read())!=-1){
		            count++;
                // System.out.println(count);
                fos.write(ch);
                }
                System.out.println("File Write success.\n");
          }
          catch(IOException e){
                  System.out.println(e);
                  System.exit(-1);
          }
          finally{
                 try{
                       fos.close();
                       fis.close();
                 }
                 catch(IOException e){}
            }

    }
}
