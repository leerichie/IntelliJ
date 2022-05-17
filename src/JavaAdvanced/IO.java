package JavaAdvanced;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class IO {
    public static void main(String[] args) throws IOException {

//        List<String> lines = Files.readAllLines(Paths.get("lorem ipsum.txt"));
//
//        try (BufferedReader br = Files.newBufferedReader(Paths.get("lorem ipsum.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        }

//        Files.lines(Paths.get("lorem ipsum.txt")).forEach(System.out::println);

//        Scanner fileScanner = new Scanner(Paths.get("lorem ipsum.txt"));
//        System.out.println(fileScanner.nextLine());
//        System.out.println((fileScanner.next()));

//        try(FileWriter fw = new FileWriter("lorem ipsum.txt", true);
//            BufferedWriter bw = new BufferedWriter(fw)){
//            fw.write('a');
//            fw.append('b').append('c');
//            int i =7;
//            bw.write(String.valueOf(i));
//        }

        FileWriter fw = new FileWriter("not closed.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("dfuasdbfpiadsubniasdbn");
    }
}
