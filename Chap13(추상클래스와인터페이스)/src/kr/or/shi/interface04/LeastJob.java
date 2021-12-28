package kr.or.shi.interface04;

public class LeastJob implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("대기가 적은 상담원 우선 연결합니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("곧 상담이 시작됩니다.");
    }
    
}
