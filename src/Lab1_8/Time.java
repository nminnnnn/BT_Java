package Lab1_8;

public class Time {
	private int hour;
	private int minute;
	private int second;
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);

	}
	  public Time nextSecond() {
	        second++;  // Increase second by 1

	        if (second == 60) { // If second reaches 60, reset to 0 and increase minute
	            second = 0;
	            minute++;
	            if (minute == 60) { // If minute reaches 60, reset to 0 and increase hour
	                minute = 0;
	                if (++hour == 24) { // If hour reaches 24, reset to 0
	                    hour = 0;
	                }
	            }
	        }
	        return this; // Return this instance
	    }
		  
	  public Time previousSecond() {
	        second--;  
	        if (second < 0) { // If second goes below 0, set to 59 and decrease minute
	            second = 59;
	            minute--;
	            if (minute < 0) { // If minute goes below 0, set to 59 and decrease hour
	                minute = 59;
	                if (--hour < 0) { // If hour goes below 0, reset to 23
	                    hour = 23;
	                }
	            }
	        }
	        return this;
	    }	
}
