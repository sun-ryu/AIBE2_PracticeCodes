package java20250514;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		// 2월중에서도 윤년이면 29일까지
		if(month == 2) {
			if(year % 4 == 0) {
				if(day<1 || day>29) {
					System.out.println("29일까지만 입력가능합니다");
				} else {
					this.day = day;
				}
		// 윤년 아닌 2월은 28일까지
			} else {
				if(day<1 || day>28) {
					System.out.println("28일까지만 입력가능합니다");
				} else {
					this.day = day;
				}
			}
		// 4,6,9,11월은 30일까지
		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
			if(day<1 || day>30) {
				System.out.println("30일까지만 입력가능합니다");
			} else {
				this.day = day;
			}
		// 나머지달은 31일까지
		} else if(day<1 || day>31) {
			System.out.println("31일까지만 입력가능합니다");
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<1 || month>12) {
			System.out.println("1월에서 12월까지 입력해주세요");
		}
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
}
