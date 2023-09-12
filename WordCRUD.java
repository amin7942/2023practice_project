import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD {
    private ArrayList <Word> list;
    Scanner sc = new Scanner(System.in);
    public WordCRUD() {
        list = new ArrayList<Word>();
    }
    public void addWord(){
        System.out.println("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = sc.nextInt();
        String word = sc.nextLine();
        System.out.println("뜻 입력 : ");
        String meaning = sc.nextLine();
        list.add(new Word(0, level, word, meaning));
        System.out.println("새 단어가 단어장에 추가되었습니다. ");
    }
    public void search_list(String search){
        System.out.println("----------------------------");
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getWord().contains(search)){
                System.out.print((i+1)+" ");
                System.out.println(list.get(i).toString());
            }
        }
        System.out.println("----------------------------");
    }
    public void update(){
        System.out.println("==> 수정 할 단어 검색 : ");
        String search = sc.nextLine();
        search_list(search);
        System.out.println("==> 수정 할 번호 선택 : ");
        int num = sc.nextInt() - 1;
        sc.nextLine();
        System.out.println("뜻 입력 : ");
        String str = sc.nextLine();
        list.get(num).setMeaning(str);
        System.out.println("단어가 수정 되었습니다.");
    }
    public void remove(){
        System.out.println("삭제할 단어 검색 : ");
        String search = sc.nextLine();
        search_list(search);
        System.out.println("삭제할 번호 선택 : ");
        int num = sc.nextInt() - 1;
        System.out.println("==> 정말로 삭제하실래요?(Y/n)");
        sc.nextLine();
        String check = sc.next();
        if(check.equalsIgnoreCase("y")){
            list.remove(num);
            System.out.println("단어가 삭제되었습니다.");
        }else{
            System.out.println("취소되었습니다.");
        }
    }
    public void listAll(){
        System.out.println("----------------------------");
        for(int i = 0; i < list.size(); i++){
            System.out.print((i+1)+" ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("----------------------------");
    }

}
