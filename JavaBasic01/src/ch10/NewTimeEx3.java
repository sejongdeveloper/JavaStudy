package ch10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

class DayAfterTomorrow implements TemporalAdjuster {

	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(2, ChronoUnit.DAYS);
	}
	
}

public class NewTimeEx3 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate date = today.with(new DayAfterTomorrow());
		
		p(today); // System.out.println(today);
		p(date);
		
		p(today.with(TemporalAdjusters.firstDayOfNextMonth())); 				 // 다음 달의 첫날
		p(today.with(TemporalAdjusters.firstDayOfMonth()));     				 // 이 달의 첫 날
		p(today.with(TemporalAdjusters.lastDayOfMonth()));						 // 이 달의 마지막 날
		p(today.with(TemporalAdjusters.firstInMonth(DayOfWeek.TUESDAY))); 		 // 이 달의 첫번째 화요일
		p(today.with(TemporalAdjusters.lastInMonth(DayOfWeek.TUESDAY)));  		 // 이 달의 마지막 화요일
		p(today.with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY)));	    	 // 지난 주 수요일
		p(today.with(TemporalAdjusters.previousOrSame(DayOfWeek.WEDNESDAY))); 	 // 지난 주 수요일(오늘 포함)
		p(today.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY))); 			 // 다음 주 수요일
		p(today.with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY))); 		 // 다음 주 수요일(오늘 포함)
		p(today.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.TUESDAY))); // 이 달의 4번째 화요일
	}
	
	static void p(Object obj) { // 라인의 길이를 줄이기 위해 새로 정의한 메서드
		System.out.println(obj);
	}
}
