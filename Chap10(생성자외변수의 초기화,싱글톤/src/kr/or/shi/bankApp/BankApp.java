package kr.or.shi.bankApp;

import java.util.*;

public class BankApp {
    
    //  배열 100개 정적멤버로 생성, 배열이므로 한계가 있음(메모리 낭비)
    private static Account[] accountArray = new Account[100];
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        boolean run = true;

        while(run)
        {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("1. 계좌 생성\t2. 계좌 목록\t3. 예금하기\t4. 출금하기\t5. 종료");
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("선택 > ");

            int choice = scan.nextInt();
            if(choice == 1)
            {
                createAccount();
            }
            else if(choice == 2)
            {
                accountList();
            }
            else if(choice == 3)
            {
                deposite();
            }
            else if(choice == 4)
            {
                withdraw();
            }
            else if(choice == 5)
            {
                System.out.println("종료");
                run = false;
            }
            else
            {
                System.out.println("잘못 입력하셨습니다.");
            }

        }
    }
    private static void withdraw() 
    {
        
    }

    public static Account findAccount(String ano)
    {
        Account account = null;
        for(int i = 0; i < accountArray.length; i++)
        {
            if(accountArray[i] != null)
            {
                if(accountArray[i].getAno().equals(ano))
                {
                    account = accountArray[i];
                }
            }
        }
        return account;


    }


    private static void deposite() 
    {
        System.err.println("===============");
        System.out.println("예금합니다.");
        System.out.println("===============");

        System.out.print("계좌번호 입력 > ");
        String ano = scan.next();
        System.out.print("예금액: ");
        int money = scan.nextInt();

        Account account = findAccount(ano);

        if(account == null)
        {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        else
        {
            System.out.println("입금할 가격 입력");

        }

        account.setBalance(account.getBalance() + money);
        System.out.println("예금이 성공했습니다. 현재 잔액: " + account.getBalance());

    }
    private static void accountList() 
    {
        System.out.println("계좌목록 출력");
        System.out.println("계좌번호\t소유자\t금액");

        for(int i = 0; i < accountArray.length; i++)
        {
            if(accountArray[i] == null)
            {
                break;
            }
            System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
        }
    }
    public static void createAccount() 
    {
        System.out.println("==================");
        System.out.println("계좌를 생성합니다.");
        System.out.println("==================");

        System.out.print("계좌 번호 >" );
        String ano = scan.next();
        
        System.out.print("계좌주: ");
        String owner = scan.next();

        System.out.print("초기 입금액: ");
        int balance = scan.nextInt();

        Account newAccount = new Account(ano, owner, balance);
        for(int i = 0; i<accountArray.length; i++)
        {
            if(accountArray[i] == null)
            {
                accountArray[i] = newAccount;
                System.out.println("계좌가 생성 되었습니다.");
                System.out.println(accountArray[i].getAno() + accountArray[i].getBalance() + accountArray[i].getOwner());
                break;
            }
        }
    }
}
