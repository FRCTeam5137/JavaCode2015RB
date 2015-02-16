package org.usfirst.frc5137.JavaCode2015RB;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import org.usfirst.frc5137.JavaCode2015RB.Utils;

public class TwistSteerDrive extends RobotDrive {

	public TwistSteerDrive(SpeedController leftMotor, SpeedController rightMotor) {
		super(leftMotor, rightMotor);
		// TODO Auto-generated constructor stub
	}

	
    /**
     * Twist drive implements single stick driving.
     * Given a single Joystick, the class assumes the Y axis for the move value and the Z axis
     * for the rotate value.(Same as arcade drive, but uses Z axis/twist instead of x axis for rotation value.)
     * @param stick The joystick to use for Arcade single-stick driving. The Y-axis will be selected
     * for forwards/backwards and the Z-axis will be selected for rotation rate.
     * @param squaredInputs If true, the sensitivity will be decreased for small values
     */
    public void twistDrive(GenericHID stick, boolean squaredInputs) {
        // simply call the full-featured arcadeDrive with the appropriate values
        arcadeDrive(stick.getY(), Utils.rampSpeed3044(stick.getZ(), 0.1), squaredInputs);
    }
	

}
