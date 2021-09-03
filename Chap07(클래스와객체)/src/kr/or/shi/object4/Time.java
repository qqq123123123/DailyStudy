package kr.or.shi.object4;

public class Time {

    /*
        접근제어자
        private:    같은 클래스 내에서만 접근 가능
        protected:  같은 패키지, 자손 클래스에서만 접근 가능함.
        (default):  protected
        public:     누구나 다 접근 가능.
    */

    /*
        
    */
    private int hour;
    private int minute;
    private int second;


    /*
        getter():   멤버변수의 값을 읽어가는 메소드
        setter():   멤버변수의 값을 수정하는 메소드

        Source 메뉴 -> Generate getter and setter 이용하여 편리하게 사용 가능.
    */
    public int getHour()
    {
        return this.hour;
    }

    public int getMinute()
    {
        return this.minute;
    }

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
        if(hour > 23 || hour < 0)
        {
            return;
        }
        else
        {
            this.hour = hour;
        }
	}

	public void setMinute(int minute) {
		if(minute > 59 || minute < 0)
        {
            return;
        }
        else
        {
            this.minute = minute;
        }
	}

	public void setSecond(int second) {
		if(second > 59 || second < 0)
        {
            return;
        }
        else
        {
            this.second = second;
        }
	}

    @Override
    public String toString() {
        return this.getHour() + "시 " + this.getMinute() + "분 " + this.getSecond() + "초";
    }


}
