
import java.util.logging.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class functionsFile {
    public static int scanNumber() {
        Scanner sc = new Scanner(System.in, "Cp866");
        System.out.print("Введите число - размер массива: ");
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    public static int[] fillArray(int value) {
        int a = 1;
        int b = 100;

        int[] arr = new int[value];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * (b - a)) + a);
        }
        return arr;
    }

    public static int[] printArray(int[] arr) {
        System.out.print("Исходный не отсортированный массив: " + Arrays.toString(arr) + "\n");
        return arr;
    }


    public static int[] sortingFunction(int[] arr) throws IOException
    {
        Logger logger = Logger.getLogger(functionsFile.class.getName());
        /*ConsoleHandler ch = new ConsoleHandler();*/
        FileHandler fh = new FileHandler("logger.txt", true);
        /*logger.addHandler(ch);*/
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        /*ch.setFormatter(sFormat);*/
        fh.setFormatter(sFormat);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++)
             {
                if (arr[j] > arr[j + 1]) 
                {
                    String s = Arrays.toString(arr);
                    logger.info(s);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
             String s = Arrays.toString(arr); 

              try
              {
              FileWriter fw = new FileWriter("logFile.txt", true);
              fw.write("Сортировка №" + (i+1) +": " + s + "\n");
              fw.append("\n");
              fw.flush();
              fw.close();
              }
              catch(IOException ex)
              {
              System.out.println(ex.getMessage());
              }
             

        }

        System.out.print("Конечный, отсортированный массив " + Arrays.toString(arr));
        return arr;
    }
}
