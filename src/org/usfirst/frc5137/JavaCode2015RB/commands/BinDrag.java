package org.usfirst.frc5137.JavaCode2015RB.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class BinDrag extends CommandGroup {
    
    public  BinDrag() {
    	addSequential(new PneumaticRetractAuto());
    	addSequential(new RaiseElevatorAuto(1));
    	addSequential(new DriveAuto(0.75, 0, 1.2));
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
