package java20250514;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		// 2���߿����� �����̸� 29�ϱ���
		if(month == 2) {
			if(year % 4 == 0) {
				if(day<1 || day>29) {
					System.out.println("29�ϱ����� �Է°����մϴ�");
				} else {
					this.day = day;
				}
		// ���� �ƴ� 2���� 28�ϱ���
			} else {
				if(day<1 || day>28) {
					System.out.println("28�ϱ����� �Է°����մϴ�");
				} else {
					this.day = day;
				}
			}
		// 4,6,9,11���� 30�ϱ���
		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
			if(day<1 || day>30) {
				System.out.println("30�ϱ����� �Է°����մϴ�");
			} else {
				this.day = day;
			}
		// ���������� 31�ϱ���
		} else if(day<1 || day>31) {
			System.out.println("31�ϱ����� �Է°����մϴ�");
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<1 || month>12) {
			System.out.println("1������ 12������ �Է����ּ���");
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
