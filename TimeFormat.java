// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String day_time = "AM";
		String night_time = "PM";
		String result = "";
		if (hours < 12){
			result = day_time;
		}else if(hours >= 12){
			result = night_time;
		}
		if (hours > 12){
			hours = hours - 12;
		}
		System.out.print(hours + ":");

		if (minutes < 10){
			System.out.print("0" + minutes);
		}else{
			System.out.print(minutes);
		}

		System.out.print(" " + result);


	}
}