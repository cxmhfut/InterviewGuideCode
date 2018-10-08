package chapter4;

import org.junit.Test;

public class Chapter4TestCase {

    @Test
    public void testPokerGame(){
        int arr[] = {1,2,100,4};
        System.out.println(PokerGame.win1(arr));
        System.out.println(PokerGame.win2(arr));
    }

    @Test
    public void testLongestConsecutive() {
        int arr[] = {100, 4, 200, 1, 3, 2};
        System.out.println(LogestConsecutive.longestConsecutive(arr));
    }

    @Test
    public void testJumpGame() {
        int arr[] = {3, 2, 3, 1, 1, 4};
        System.out.println(JumpGame.jump(arr));
    }

}
