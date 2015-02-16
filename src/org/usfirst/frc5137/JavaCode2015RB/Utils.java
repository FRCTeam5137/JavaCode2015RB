package org.usfirst.frc5137.JavaCode2015RB;
//test

public class Utils {

	//A method used for smooth driving
	public static double rampSpeed3528(double input) {
    	//auto set sensitivity to 1
    	return rampSpeed3528(input, 1);
	}	


	public static double rampSpeed3528(double input, double sensitivity) {

		double output;
    	if (IsInDeadband(input)) {
    		return 0;
    	}

    	//formula for ramping: f(x) = ax^3 + (1-a)x where a is the sensitivity and x is the input
    	output =  sensitivity * input * input * input + (1 - sensitivity) * input;
    	if (output > 0.8) {
    		output = 0.8;
    	}
    	else if (output < -0.8) {
    		output = -0.8;
    	}
    	return output;
	}


	private static boolean IsInDeadband(double input) {
		return input > -.1 && input < .1;
	}
	
	public static double rampSpeed3044(double JoystickValue, double DeadbandCutOff) {
		double deadbandreturn = 0;
		
		if (JoystickValue < DeadbandCutOff && JoystickValue > (DeadbandCutOff*(-1))) {
			deadbandreturn = 0;
		}
		else {
			deadbandreturn=(JoystickValue-(Math.abs(JoystickValue)/JoystickValue*DeadbandCutOff))/(1-DeadbandCutOff);
		}

		return deadbandreturn;
	}

}
