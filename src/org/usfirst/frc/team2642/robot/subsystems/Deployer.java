package org.usfirst.frc.team2642.robot.subsystems;

import org.usfirst.frc.team2642.robot.RobotMap;
import org.usfirst.frc.team2642.robot.commands.DeployBallArm;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class Deployer extends PIDSubsystem {
	Talon deploymotor = new Talon(RobotMap.deploymotor);
	public AnalogPotentiometer deploypot = new AnalogPotentiometer(RobotMap.deploypot);
	public double setpoint = .5;
    // Initialize your subsystem here
    public Deployer() {
    	super("Deployer", 1, 0 , 0);
    	setSetpoint(setpoint);
    	enable();
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new DeployBallArm());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
    	return deploypot.get();
    }
    
    protected void usePIDOutput(double output) {
    	deploymotor.set(output);
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    }
}
