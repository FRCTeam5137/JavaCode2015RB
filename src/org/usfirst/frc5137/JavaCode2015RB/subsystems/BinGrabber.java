package org.usfirst.frc5137.JavaCode2015RB.subsystems;

import org.usfirst.frc5137.JavaCode2015RB.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BinGrabber extends Subsystem {
    DoubleSolenoid doubleSolenoid = RobotMap.binGrabberDoubleSolenoid;
    Compressor compressor = RobotMap.grabberCompressor;
    
    boolean enabled = compressor.enabled();
    boolean pressureSwitch = compressor.getPressureSwitchValue();
    float current = compressor.getCompressorCurrent();

    public void grabberOn() {
    	doubleSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void grabberOff() {
    	doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

