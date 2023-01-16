package edu.java.file10;

import java.io.File;
import java.util.ArrayList;

public class FileMain10 {

    public static void main(String[] args) {
        // 파일, 폴더(디렉토리) 생성, 삭제, 관리

        // System.getProperty(key) : Java Runtime이 실행중인 컴퓨터의 여러가지 시스템 정보들을 리턴.
        // user.dir : 현재 작업중인 디렉토리 = 프로그램이 실행중인 위치 (Current Working Directory).
        String cwd = System.getProperty("user.dir");
        System.out.println(cwd);

        // 절대경로 (Absolute Path) : System의 root( C:\ , D:\ )부터 시작해서 파일(폴더)가 있는 위치를 찾아가는
        // 경로.
        // ex) D:\study\lab-java\lab13_file

        // 2) 상대경로 (relative path) : 현재 작업 디렉토리를 기준으로 파일(폴더)가 있는 위치를 찾아가는 경로. (슬레시 '/'
        // 사용)
        // ex) src/edu/java/file01 .

        // 파일 구분자 (File Separator)

        // 상위 폴더와 하위 폴더, 폴더와 파일을 구분하는 문자.
        // MS Windows : \
        // MS Windows를 제외한 다른 OS : /
        String path = "data"/* 상위 폴더 이름 */ + File.separator + "test.txt"/* 하위 폴더 이름 */;
        System.out.println(path);

        // File 클래스 : 파일(txt, pptx, mp3 ...)과 폴더와 관련된 메서드(기능)을 갖고 있는 클래스

        File abFile = new File("D:\\study\\lab-java\\lab13_file"); // 절대경로의 File 타입 객체 생성.

        File reFile = new File(path); // 상대경로의 File 타입 객체 생성.

        System.out.println("절대경로.getPath : " + abFile.getPath());
        System.out.println("상대경로.getPath : " + reFile.getPath());
        System.out.println("절대경로 : " + abFile.getAbsolutePath());
        System.out.println("절대경로 : " + reFile.getAbsolutePath());
        System.out.println("폴더의 이름 : " + abFile.getName());
        System.out.println("파일의 이름 : " + reFile.getName());
        System.out.println("존재하나요 ? " + abFile.exists());
        System.out.println("파일인가요 ? " + abFile.isFile());
        System.out.println("폴더인가요 ? " + abFile.isDirectory());
        System.out.println("크기는요 ? " + abFile.length());

        System.out.println("====================================");
        // data 폴더의 내용(하위 폴더, 파일들)을 출력
        File dataDir = new File("data"); // 상대 경로로 객체 생성
        File[] files = dataDir.listFiles(); // 파일 객체들의 배열
        System.out.println(files);
        for (File f : files) {
            String fileName = f.getName();
            String info = null;
            if (f.isFile()) {
                info = fileName + "\t" + f.length() + "bytes";
            } else {
                info = fileName + "\t" + "<DIR>";
            }
            
            System.out.println(info);
        }

        
        // 폴더(디렉토리) 생성
        
        File newFolder = new File("data", "temp");
        
        if (newFolder.exists()) {
            System.out.println("폴더가 이미 존재합니다.");
        } else {
            newFolder.mkdir();
            System.out.println("생성");
        }
        
        
        // 폴더(디렉토리) 삭제
        
        if (newFolder.exists()) {
            
            newFolder.delete();

            System.out.println("삭제");
        } else {
            
        }
    }

}
