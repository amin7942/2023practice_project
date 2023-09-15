import java.util.Scanner;

public class WordManager {
    WordCRUD wordCRUD;
    WordManager(){
        wordCRUD = new WordCRUD();
    }
    Scanner sc = new Scanner(System.in);
    public int selectMenu(){
        System.out.println("*** 영단어 마스터 ***\n"
                + "*******************\n"
                + "1. 모든 단어 보기\n"
                + "2. 수준별 단어 보기\n"
                + "3. 단어 검색\n"
                + "4. 단어 추가\n"
                + "5. 단어 수정\n"
                + "6. 단어 삭제\n"
                + "7. 파일 저장\n"
                + "0. 나가기\n"
                + "*******************\n"
                + "==> 원하는 메뉴는? ");
        return sc.nextInt();
    }
    public void start(){
        wordCRUD.loadFile();
        while(true){
            int menu = selectMenu();

            switch (menu) {
                case 1:
                    wordCRUD.listAll();
                    break;
                case 2:
                    wordCRUD.step_search();
                    break;
                case 3:
                    wordCRUD.search();
                    break;
                case 4:
                    wordCRUD.addWord();
                    break;
                case 5:
                    wordCRUD.update();
                    break;
                case 6:
                    wordCRUD.remove();
                    break;
                case 7:
                    wordCRUD.saveFile();
                    break;
                case 0:
                    System.out.println("종료 됨");
                    break;
            }
            if(menu == 0) break;
        }
    }

}
