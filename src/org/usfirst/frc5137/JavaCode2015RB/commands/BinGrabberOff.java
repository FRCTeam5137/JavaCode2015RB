package org.usfirst.frc5137.JavaCode2015RB.commands;

import org.usfirst.frc5137.JavaCode2015RB.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class BinGrabberOff extends Command {

    public BinGrabberOff() {
    	requires(Robot.binGrabber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.binGrabber.grabberOff();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
