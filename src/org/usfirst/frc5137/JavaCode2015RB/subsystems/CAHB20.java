package org.usfirst.frc5137.JavaCode2015RB.subsystems;

import org.usfirst.frc5137.JavaCode2015RB.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;

/**
 *
 */
public class CAHB20 extends Subsystem {
	
    SpeedController linearActuator = RobotMap.cAHB20linearActuator;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void extend(){
    	linearActuator.set(1);
    }
    
    public void retract(){
    	linearActuator.set(-1);
    }
    
    public void stop(){
    	linearActuator.set(0);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

