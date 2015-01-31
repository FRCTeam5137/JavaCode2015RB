// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5137.JavaCode2015RB.subsystems;

import org.usfirst.frc5137.JavaCode2015RB.RobotMap;
import org.usfirst.frc5137.JavaCode2015RB.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class HorizontalArm extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DoubleSolenoid doubleSolenoid1 = RobotMap.horizontalArmDoubleSolenoid1;
    Compressor compressor = RobotMap.horizontalArmCompressor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    boolean enabled = compressor.enabled();
    boolean pressureSwitch = compressor.getPressureSwitchValue();
    float current = compressor.getCompressorCurrent();

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void armForward(){
    	doubleSolenoid1.set(DoubleSolenoid.Value.kForward);
    	
    }
    
    public void armReverse(){
    	doubleSolenoid1.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void stop(){
    	doubleSolenoid1.set(DoubleSolenoid.Value.kOff);
    }

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new Move());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
