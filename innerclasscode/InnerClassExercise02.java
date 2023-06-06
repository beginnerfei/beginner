package com.hsp.innerclass;

public class InnerClassExercise02 {

	public static void main(String[] args) {

		CellPhone cellPhone = new CellPhone();

		cellPhone.alarmClock(new Bell() {
			@Override
			public void ring() {
				System.out.println("帅哥起床了");
			}
		});

		cellPhone.alarmClock(new Bell() {
			@Override
			public void ring() {
				System.out.println("兄弟们上课了");
			}
		});
	}
}

interface Bell {
	void ring();
}

class CellPhone {
	public void alarmClock(Bell bell) {
		System.out.println(bell.getClass());
		bell.ring();
	}
}
