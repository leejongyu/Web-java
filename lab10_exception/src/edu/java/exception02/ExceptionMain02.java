package edu.java.exception02;

import java.util.Scanner;

/*
 * try-catch 문장을 사용한 예외처리 :
 * 
 * try {
 *  
 *      정상적인 상황에서 실행 할 코드들
 * 
 * } catch (exception 타입 + 변수선언) {
 *   
 *      예외가 발생 했을 때 실행할 코드들
 * 
 * } finally(생략 가능) {
 *  
 *      예외 발생 여부와 상관 없이 항상 실행할 코드들
 *      (try 블록이 모두 끝났을 때 또는 catch 블록이 끝났을 때 실행할 코드들)
 * 
 * }
 * 
 *   
1) 예외가 발생하지 않으면
 try > finally

2) 예외가 발생하면
 try(예외 발생하면 try 종료 후 catch로 이동) > catch(발생한 예외에 맞는) > finally
 
3) 발생한 예외를 catch할 수 있는 catch블록이 없으면
 프로그램 비정상 종료.

4) catch 블록은 발생할 수 있는 예외 종류에 따라서 여러개를 복수작성 할 수 있음
    catch (Exception1 a){}
    catch (Exception2 b){}
    catch (Exception3 c){} ....
 * 
 * 
 * 다형성 : Supertype var = new Subtype();
 * 
 * 
 * 예외 클래스의 상속 관계
 * 
 * Object
 * |__ Throwable
 *     |__ Exception
 *         |__ RuntimeException
 *             |__ 각종 exception .....
 * 
 * catch 블록이 여러개일 때에는 하위 타입의 예외들을 언저 catch하고, 마지막에 상위타입 예외를 catch 해야함.
 */

public class ExceptionMain02 {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        
        try {
            System.out.print(" x = ");
            int x = Integer.parseInt(sc.nextLine());
        
            System.out.print(" y = ");
            int y = Integer.parseInt(sc.nextLine());
            
            int result = x/y;
            System.out.println(" 몫 : "+ result);
            
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } 
        System.out.println("end");
    }

}
