package org.usfirst.frc.team2642.robot.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import org.usfirst.frc.team2642.robot.RobotMap;
//import org.usfirst.frc.team2642.robot.commands.Aim;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Talon;

/**
 *
 */
public class Aimer extends PIDSubsystem {
	Talon aimmotor = new Talon(RobotMap.aimmotor);
	public AnalogPotentiometer aimpot = new AnalogPotentiometer(RobotMap.aimpot);
	double setpoint = 2;
    // Initialize your subsystem here
    public Aimer() {
    	super("Aimer", 1, 0, 0);
    	setSetpoint(setpoint);
    	enable();
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
    	return aimpot.get();
    }
    
    protected void usePIDOutput(double output) {
    	aimmotor.set(output);
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    }
}
