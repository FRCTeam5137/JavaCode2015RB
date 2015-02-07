package org.usfirst.frc5137.JavaCode2015RB.subsystems;

import org.usfirst.frc5137.JavaCode2015RB.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;

/**
 *
 */
public class CAHB20 extends Subsystem {
	
    Relay linearActuator = RobotMap.cAHB20LinearActuator;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void extend(){
    	linearActuator.set(Relay.Value.kForward);
    }
    
    public void retract(){
    	linearActuator.set(Relay.Value.kReverse);
    }
    
    public void stop(){
    	linearActuator.set(Relay.Value.kOff);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

