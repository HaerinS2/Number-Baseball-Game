package NBG;

import javax.swing.text.Style;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Game_method{
    int[] nums = new int[3];
    String[] numsArray = new String[3];
    String yourNum = null;
    int opportunity=0;

    // 게임 시작 메소드
    public void startgame(){
        System.out.println("===== NUMBER BASEBALL GAME =====");
        System.out.println("원하는 만큼의 기회를 입력하십시오. (3회~15회)");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            while(true){
                opportunity=Integer.parseInt(br.readLine());

                if(opportunity<3 || 15<opportunity){
                    System.out.println("입력 오류입니다. 다시 입력해주십시오.");
                } else{
                    System.out.println("기회는 총 "+opportunity+"번, 3초 후 게임을 시작합니다.");
                    break;
                }
            }
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=(int)(Math.random()*10+3);
            for(int j=0; j<i; j++){
                if(nums[i]==nums[j]){
                    i--;
                    break;
                }}}
    }
    // 사용자 숫자 리스트 입력 메소드
    public void inputYourNumbers(){
            System.out.println("숫자 세개를 입력하세요.");
            try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
                yourNum = br.readLine();
            }
            catch (Exception ex) {
                System.out.println(ex);
            }
            for(int i=1; i<=opportunity; i++){
                for(int j=0; j<numsArray.length; j++){
                    numsArray = yourNum.split(" ");
                }
            }
    }
    // 난수와 사용자 숫자 비교 메소드
    public void compareNums(){
    }
}
