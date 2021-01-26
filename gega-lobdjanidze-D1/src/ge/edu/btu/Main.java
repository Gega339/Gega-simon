package ge.edu.btu;

import java.io.File;
import java.io.FilenameFilter;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Desktop\\BTU_DOCUMENTS");

        int amountOfFiles = 0;

        String[] fileContent = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().startsWith("btu")) {
                    return true;
                }else {
                    return false;
                }
            }
        });

        if (fileContent != null) {
            for(String fileName: fileContent) {
                amountOfFiles++;
            }
            System.out.println("მოძებნილი ფაილების რაოდენობა: " + amountOfFiles);
        }else {
            System.out.println("No files found");
        }
    }
}
