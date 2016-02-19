package org.usfirst.frc.team2642.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2642.robot.commands.Aim;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick xboxStick = new Joystick(0);
	public Joystick getxbox(){
		return xboxStick;
	}
	public Button xboxIntake = new JoystickButton(xboxStick, 1);
	public Button xboxRelease = new JoystickButton(xboxStick, 2);
	public Button xboxSpinUp = new JoystickButton(xboxStick, 3);
	public Button xboxY = new JoystickButton(xboxStick, 4);
	public Button xboxToggleAim = new JoystickButton(xboxStick, 5);
	public Button xboxRB= new JoystickButton(xboxStick, 6);
	public Button xboxBack = new JoystickButton(xboxStick, 7);
	public Button xboxStart = new JoystickButton(xboxStick, 8);
	public Button xboxLeftClick = new JoystickButton(xboxStick, 9);
	public Button xboxRightClick = new JoystickButton(xboxStick, 10);
	
	Joystick armStick = new Joystick(1);
	public Joystick getarm(){
			 return armStick;
	}
	public Button armIntake = new JoystickButton(armStick, 1);
	public Button armRetract = new JoystickButton(armStick, 2);
	public Button armExtend = new JoystickButton(armStick, 3);
	
	
	public Joystick auxillary = new Joystick(2);
	public Button auxFire = new JoystickButton(auxillary, 1);
	public Button auxSlow = new JoystickButton(auxillary, 2);
	public Button auxSpinUp = new JoystickButton(auxillary, 3);
	public Button auxDeployIn = new JoystickButton(auxillary, 4);
	public Button auxDeployOut = new JoystickButton(auxillary, 5);


		
	public OI() {
		xboxToggleAim.whileHeld(new Aim());
		
	}
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

