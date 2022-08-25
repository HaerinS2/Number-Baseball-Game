package NBG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game_method extends IOException {
    int[] nums = new int[3];
    String[] yourNums = new String[3];
    String yourNum = null;

    // 게임 시작 메소드
    public void startgame(){
        System.out.println("게임을 시작합니다.");
        for(int i=0; i<nums.length; i++){
            nums[i]=(int)(Math.random()*10+3);
            for(int j=0; j<i; j++){
                if(nums[i]==nums[j]) {
                    i--;
                    break;
                }}}}
    //사용자 숫자 리스트 입력 메소드
    public void inputYourNumbers(){
            System.out.println("숫자 세개를 입력하세요.");
            try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
                yourNum = br.readLine();
            }
            catch (Exception ex){
                System.out.println(ex);
            }
            for(int i=0; i<yourNums.length){
                yourNums = yourNum.split(" ");
            }
    }
}
