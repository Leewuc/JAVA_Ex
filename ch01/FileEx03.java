package ch01.file;

import java.io.File;

public class FileEx03 {
    public static void main(String[] args) {
        // 파일 경로 : 윈도우는 \, Mac은 / 사용
        String separator = File.separator;
        File targetFile = new File(separator + "Users" + separator + "jongkwonkim" + separator
                + "Documents" + separator + "streamtest");
        //File targetFile = new File("/Users/jongkwonkim/Documents/streamtest");
        File[] files = targetFile.listFiles();

        for(int i=0; i<files.length; i++){
            File f = files[i];
            String attribute = "";
            attribute = f.getName();
            if(files[i].isDirectory()) {
                attribute += " / Directory";
            }else{
                attribute += " / size : " + f.length() +
                        " / canRead : " + f.canRead() +
                        " / canWrite : " + f.canWrite() +
                        " / isHidden : " + f.isHidden();
            }
            System.out.println(attribute);
        }
    }
}
